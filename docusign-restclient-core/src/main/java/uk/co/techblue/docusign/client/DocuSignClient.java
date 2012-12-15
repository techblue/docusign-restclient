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

import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.logging.Logger;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import uk.co.techblue.docusign.client.utils.DocuSignUtils;

public class DocuSignClient {

	private final static Logger logger = Logger.getLogger(DocuSignClient.class);

	@SuppressWarnings("unused")
	private static void initializeProviderFactory() {
		try {
			ResteasyProviderFactory providerFactory = ResteasyProviderFactory
					.getInstance();
			Iterable<Class<?>> providerClasses = DocuSignUtils
					.getClasses("uk.co.techblue.docusign.resteasy.providers");
			for (Class<?> provider : providerClasses) {
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
			final String serverUri) {
		logger.info("Generating REST resource proxy for: " + clazz.getName());
		return ProxyFactory.create(clazz, serverUri);
	}
}
