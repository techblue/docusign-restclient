/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.TimeZone;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.activation.FileDataSource;
import javax.ws.rs.core.MediaType;

import org.apache.james.mime4j.field.FieldName;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.providers.multipart.OutputPart;

import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentSignatureRequest;

/**
 * The Class DocuSignUtils.
 */
public class DocuSignUtils {

	private static final String ISO8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSz";

	/**
	 * Parses the ISO8601 date string.
	 * 
	 * @param dateString
	 *            the date string
	 * @return the date
	 * @throws ParseException
	 *             the parse exception
	 */
	public static Date parseISO8601Date(String dateString)
			throws ParseException {
		// NOTE: SimpleDateFormat uses GMT[-+]hh:mm for the TZ which breaks
		// things a bit. Before we parse we have to repair this.
		SimpleDateFormat sdf = new SimpleDateFormat(ISO8601_PATTERN);
		// this is zero time so we need to add TZ indicator
		if (dateString.endsWith("0000Z")) {
			dateString = dateString.substring(0, dateString.indexOf("0000Z"))
					+ "GMT-00:00";
		} else if (dateString.endsWith("Z")) {
			dateString = dateString.substring(0, dateString.length() - 1)
					+ "GMT-00:00";
		} else {
			int inset = 6;
			String strPrefix = dateString.substring(0, dateString.length()
					- inset);
			String strSuffix = dateString.substring(
					dateString.length() - inset, dateString.length());
			dateString = strPrefix + "GMT" + strSuffix;
		}
		return sdf.parse(dateString);
	}

	/**
	 * Format is o8601 date.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String formatISO8601Date(Date date) throws ParseException {
		return formatDate(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'0000Z'", true);
	}

	/**
	 * Format date to string using specified pattern.
	 * 
	 * @param date
	 *            the date
	 * @param pattern
	 *            the pattern
	 * @param toUTC
	 *            the to utc
	 * @return the string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String formatDate(Date date, String pattern, boolean toUTC)
			throws ParseException {
		DateFormat df = new SimpleDateFormat(pattern);
		if (toUTC) {
			TimeZone tz = TimeZone.getTimeZone("UTC");
			df.setTimeZone(tz);
		}
		return df.format(date);
	}

	/**
	 * Generates multipart form data output.
	 * 
	 * @param signatureRequest
	 *            the signature request
	 * @return the multipart form data output
	 */
	public static MultipartFormDataOutput generateMultipartFormDataOutput(
			DocumentSignatureRequest signatureRequest) {
		MultipartFormDataOutput dataOut = new MultipartFormDataOutput();
		dataOut.addFormData("request-type", "send document for signature",
				MediaType.APPLICATION_JSON_TYPE);
		@SuppressWarnings("unused")
		OutputPart metadataPart = dataOut.addFormData("envelope_definition",
				signatureRequest, MediaType.APPLICATION_JSON_TYPE);
		// metadataPart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
		// "form-data");
		for (Document document : signatureRequest.getDocuments()) {
			FileDataSource dataSource = new FileDataSource(document.getPath());
			OutputPart filePart = dataOut.addFormData(document.getName(),
					dataSource, MediaType.valueOf(dataSource.getContentType()));
			filePart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
					getContentDispositionHeader(document));
		}
		return dataOut;
	}

	/**
	 * Gets the comma separated value.
	 * 
	 * @param enumList
	 *            the enum list
	 * @return the comma separated value
	 */
	public static String getCommaSeparatedValue(List<? extends Enum<?>> enumList) {
		StringBuffer stringBuffer = new StringBuffer();
		for (Enum<?> element : enumList) {
			if (stringBuffer.length() != 0) {
				stringBuffer.append(",");
			}
			stringBuffer.append(element.name());
		}
		return stringBuffer.toString();
	}

	/**
	 * Gets the content disposition header.
	 * 
	 * @param document
	 *            the document
	 * @return the content disposition header
	 */
	public static String getContentDispositionHeader(Document document) {
		return "file; filename=\"" + document.getName() + "\"; documentId="
				+ document.getDocumentId();
	}

	/**
	 * Scans all classes accessible from the context class loader which belong
	 * to the given package and subpackages.
	 * 
	 * @param packageName
	 *            The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static Iterable<Class<?>> getClasses(String packageName)
			throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		List<Class<?>> classes = new ArrayList<Class<?>>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}

		return classes;
	}
	
	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs.
	 * 
	 * @param directory
	 *            The base directory
	 * @param packageName
	 *            The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	public static List<Class<?>> findClasses(File directory, String packageName)
			throws ClassNotFoundException {
		List<Class<?>> classes = null;
		if (directory.exists()) {
			classes = findClassesInDirectory(directory, packageName);
		} else {
			classes = findClassesInJar(directory.getPath(), packageName);
		}
		return classes;
	}

	/**
	 * Find classes in directory.
	 * 
	 * @param directory
	 *            the directory
	 * @param packageName
	 *            the package name
	 * @return the list
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	private static List<Class<?>> findClassesInDirectory(File directory,
			String packageName) throws ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				classes.addAll(findClasses(file,
						packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6)));
			}
		}
		return classes;
	}
	
	public static void main(String[] args) {
		try {
			System.err
					.println(findClassesInJar(
							"file:/home/dheeraj/Desktop/PropCoWorkspace/2_88/PropcoServer/Library/docusign-restclient-0.0.1-SNAPSHOT.jar!/uk/co/techblue/docusign/resteasy/providers",
							"uk.co.techblue.docusign.resteasy.providers"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Find classes in jar.
	 * 
	 * @param absolutePath
	 *            the absolute path
	 * @param packageName
	 *            the package name
	 * @return the list
	 * @throws ClassNotFoundException 
	 */
	private static List<Class<?>> findClassesInJar(String absolutePath,
			String packageName) throws ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		try {
			String jarPath = absolutePath.replaceFirst("[.]jar[!].*", ".jar")
					.replaceFirst("file:", "");
			String relPath = packageName.replace('.', '/');
			JarFile jarFile = new JarFile(jarPath);
			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				String entryName = entry.getName();
				if (entryName.startsWith(relPath)
						&& entryName.length() > (relPath.length() + "/"
								.length())) {
					String className = entryName.replace('/', '.')
							.replace('\\', '.').replace(".class", "");
					classes.add(Class.forName(className));
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(packageName + " (" + absolutePath
					+ ") does not appear to be a valid package", e);
		}
		return classes;
	}

}
