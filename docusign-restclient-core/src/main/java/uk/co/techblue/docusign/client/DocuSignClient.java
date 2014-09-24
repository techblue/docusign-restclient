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
package uk.co.techblue.docusign.client;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.ext.Provider;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.jboss.resteasy.logging.Logger;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.utils.DocuSignUtils;
import uk.co.techblue.docusign.resteasy.providers.DocumentFileProvider;
/**
 * The HTTP client can be configured adding in the classpath the following properties file:
 * uk.co.techblue.docusign.client.DocuSignClient.properties
 * The configuration allows to set the timeout and the maximum number of connections per route:
 *     docusign.connection.timeout=20000
 *     docusign.max.per.route=50
 * It can also configure a proxy:
 *    docusign.https.proxyHost=<IP address or hostname of the proxy>
 *    docusign.https.proxyPort=listening port of the proxy
 */
public class DocuSignClient {
	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		ThreadSafeClientConnManager cm = new ThreadSafeClientConnManager();
		int maxPerRoute = 50;
		cm.setDefaultMaxPerRoute(maxPerRoute);
		cm.setMaxTotal(maxPerRoute);

		HttpClient client = new DefaultHttpClient(cm);
		HttpParams params = client.getParams();
		// Allowable time between packets
		HttpConnectionParams.setSoTimeout(params, 6000);
		// Allowable time to get a connection
		HttpConnectionParams.setConnectionTimeout(params, 6000);

		HttpGet request = new HttpGet(
				"https://demo.docusign.net/restapi/v2/accounts/672084/envelopes/e266ddb9-b293-4013-98fd-c121b7832d4a/audit_events");
		request.setHeader("Authorization",
				"bearer D/rZd4fBhOpg2r0VTipQC105ARE=");
		HttpResponse response = client.execute(request);

		System.out.println(response);
	}

	private final static Logger logger = Logger.getLogger(DocuSignClient.class);
	private final static String PROXY_HOST_PROPERTY = "docusign.https.proxyHost";
	private final static String PROXY_PORT_PROPERTY = "docusign.https.proxyPort";
	private final static String CONNECTION_TIMEOUT = "docusign.connection.timeout";
	private static final String CONNECTION_DEFAULT_MAX_PER_ROUTE = "docusign.max.per.route";
	private final static String CONNECTION_URL = "docusign.connection.port.redirect";
	private static HttpClientConfiguration httpClientConfiguration;
	
	private static HttpClient client = null;

	static {
		initializeProviderFactory();
		httpClientConfiguration = new HttpClientConfiguration();
	}

	private static void initializeProviderFactory() {
		try {
			final ResteasyProviderFactory providerFactory = ResteasyProviderFactory
					.getInstance();
			registerResteasyProvider(providerFactory,
					DocumentFileProvider.class);
			RegisterBuiltin.register(providerFactory);
		} catch (Exception e) {
			logger.error(
					"Error occurred while registering custom resteasy providers",
					e);
		}
	}

	private static void registerResteasyProvider(
			final ResteasyProviderFactory providerFactory,
			Class<?> providerClass) {
		boolean registered = false; // EXARI: providerFactory.getClasses()
									// .getInstance(providerClass) != null;
		if (!registered) {
			providerFactory.registerProvider(providerClass);
			logger.info("Registered custom Provider with Resteasy:"
					+ providerClass.getName());
		} else {
			logger.info("Provider is already registered with Resteasy. Ignoring registration request:"
					+ providerClass.getName());
		}
	}

	@SuppressWarnings("unused")
	private static void initializeAutoScanProviderFactory() {
		try {
			final ResteasyProviderFactory providerFactory = ResteasyProviderFactory
					.getInstance();
			final Iterable<Class<?>> providerClasses = DocuSignUtils
					.getClasses("uk.co.techblue.docusign.resteasy.providers");
			for (final Class<?> provider : providerClasses) {
				if (provider.isAnnotationPresent(Provider.class)) {
					providerFactory.registerProvider(provider);
				}
			}
			RegisterBuiltin.register(providerFactory);
		} catch (ClassNotFoundException cnfe) {
			logger.error(
					"Error occurred while registering custom resteasy providers",
					cnfe);
		} catch (IOException ioe) {
			logger.error(
					"Error occurred while registering custom resteasy providers",
					ioe);
		} catch (Exception e) {
			logger.error(
					"Error occurred while registering custom resteasy providers",
					e);
		}
	}

	private static class HttpClientConfiguration {
		private ResourceBundle docusignClientBundle = null;
		private HttpClientConfiguration () {
			try {
				docusignClientBundle = ResourceBundle.getBundle(DocuSignClient.class.getCanonicalName());
			}
			catch(MissingResourceException mre) {
				/* Ignore */
			}
		}
		
		private String getString(String key, String defaultValue) {
			String value = defaultValue;
			try {
				if (docusignClientBundle != null) {
					value = docusignClientBundle.getString(key);
				}
			}
			catch(MissingResourceException mre) {
				/* Ignore */
			}
			
			return value;
		}

		private int getInteger(String key, int defaultValue) {
			int value = defaultValue;
			try {
				if (docusignClientBundle != null) {
					String valueString = docusignClientBundle.getString(key);
					value = Integer.parseInt(valueString);
				}
			}
			catch(MissingResourceException mre) {
				/* Ignore */
			}
			catch (NumberFormatException nfe) {
				/* Ignore */
				if (nfe.getMessage() != null) {
					logger.debug(nfe.getMessage());
				}
			}
			
			return value;
		}
		
		private int getDefaultMaxPerRoute() {
			return getInteger(CONNECTION_DEFAULT_MAX_PER_ROUTE, 50);
		}

		private int getTimeout() {
			return getInteger(CONNECTION_TIMEOUT, 20000);
		}

		private int getProxyPort() {
			return getInteger(PROXY_PORT_PROPERTY, 0);
		}
	
		private String getProxyHost() {
			return getString(PROXY_HOST_PROPERTY, null);
		}

		private String getConnectionPortRedirect() {
			return getString(CONNECTION_URL, null);
		}
	}
	
	private static HttpClient getHttpClient() {
		if (client == null) {
			synchronized (DocuSignClient.class) {
				if (client == null) {
					ThreadSafeClientConnManager cm = new ThreadSafeClientConnManager();
					
					int maxPerRoute = httpClientConfiguration.getDefaultMaxPerRoute();
					cm.setDefaultMaxPerRoute(maxPerRoute);
					cm.setMaxTotal(maxPerRoute);
					client = new DefaultHttpClient(cm);

					int timeout = httpClientConfiguration.getTimeout();
					String proxyHost = httpClientConfiguration.getProxyHost();

					HttpParams params = client.getParams();
					// Allowable time between packets
					HttpConnectionParams.setSoTimeout(params, timeout);
					// Allowable time to get a connection
					HttpConnectionParams.setConnectionTimeout(params, timeout);

					// Configure proxy info if necessary and defined
					if (proxyHost != null && !proxyHost.equals("")) {
						// Configure the host and port
						int port = httpClientConfiguration.getProxyPort();
						HttpHost proxy = new HttpHost(proxyHost, port);

						params.setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
					}
				}
			}
		}

		if (logger.isDebugEnabled()) {
			logger.info("connections: " + ((ThreadSafeClientConnManager) client.getConnectionManager()).getConnectionsInPool());
		}

		return client;
	}

	/**
	 * Gets the client service.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param clazz
	 *            the clazz
	 * @param serverUri
	 *            the server uri
	 * @return the client service
	 */
	public static <T> T getClientService(final Class<T> clazz,
			final String serverUri, final DocuSignCredentials credentials) {

		logger.info("Generating REST resource proxy for: " + clazz.getName());

		HttpClient httpClient = getHttpClient();

		ApacheHttpClient4Executor executor = new ApacheHttpClient4Executor(
				httpClient) {
			@SuppressWarnings("rawtypes")
			@Override
			public ClientResponse execute(ClientRequest request)
					throws Exception {
				credentials.setHeader(request);
				return super.execute(request);
			}
		};

		String connectionPortRedirect = httpClientConfiguration.getConnectionPortRedirect();
		String reqServerUri = serverUri;
		if (connectionPortRedirect != null && "true".equals(connectionPortRedirect)) {
			Matcher m = Pattern.compile("(.*)://([^/]*)(/.*)+").matcher(serverUri);
			if (m.matches()) {
				String protocol = m.group(1);
				String host = m.group(2);
				String path = m.group(3);
				if (host.indexOf(":") > 0) {
					host = host.substring(0, host.indexOf(":"));
				}
				String key = CONNECTION_URL + "." + host;
				String redirectPort = httpClientConfiguration.getString(key, null);
				if (redirectPort != null) {
					reqServerUri = protocol + "://" + host + ":" + redirectPort + path;
				}
			}
		}
		
		return ProxyFactory.create(clazz, reqServerUri, executor);
	}
}
