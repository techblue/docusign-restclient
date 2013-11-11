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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
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
	/**
	 * Generates multipart form data output.
	 * 
	 * @param signatureRequest
	 *            the signature request
	 * @return the multipart form data output
	 */
	public static MultipartFormDataOutput generateMultipartFormDataOutput(
	        final DocumentSignatureRequest signatureRequest) {
		final MultipartFormDataOutput dataOut = new MultipartFormDataOutput();
//		dataOut.addFormData("request-type", "[\"send document for signature\"]",
//				MediaType.APPLICATION_JSON_TYPE);
		@SuppressWarnings("unused")
		final OutputPart metadataPart = dataOut.addFormData("envelope_definition",
				signatureRequest, MediaType.APPLICATION_JSON_TYPE);
		// metadataPart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
		// "form-data");
		for (final Document document : signatureRequest.getDocuments()) {
		    final FileDataSource dataSource = new FileDataSource(document.getPath());
		    final OutputPart filePart = dataOut.addFormData(document.getName(),
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
	public static String getCommaSeparatedValue(final List<? extends Enum<?>> enumList) {
		final StringBuffer stringBuffer = new StringBuffer();
		for (final Enum<?> element : enumList) {
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
	public static Iterable<Class<?>> getClasses(final String packageName)
			throws ClassNotFoundException, IOException {
		final ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		final String path = packageName.replace('.', '/');
		final Enumeration<URL> resources = classLoader.getResources(path);
		final List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			final URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		final List<Class<?>> classes = new ArrayList<Class<?>>();
		for (final File directory : dirs) {
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
	public static List<Class<?>> findClasses(final File directory, final String packageName)
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
	private static List<Class<?>> findClassesInDirectory(final File directory,
	        final String packageName) throws ClassNotFoundException {
	    final List<Class<?>> classes = new ArrayList<Class<?>>();
	    final File[] files = directory.listFiles();
		for (final File file : files) {
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
	private static List<Class<?>> findClassesInJar(final String absolutePath,
	        final String packageName) throws ClassNotFoundException {
	    final List<Class<?>> classes = new ArrayList<Class<?>>();
		try {
		    final String jarPath = absolutePath.replaceFirst("[.]jar[!].*", ".jar")
					.replaceFirst("file:", "");
		    final String relPath = packageName.replace('.', '/');
		    final JarFile jarFile = new JarFile(jarPath);
		    final Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements()) {
			    final JarEntry entry = entries.nextElement();
			    final String entryName = entry.getName();
				if (entryName.startsWith(relPath)
						&& entryName.length() > (relPath.length() + "/"
								.length())) {
				    final String className = entryName.replace('/', '.')
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
