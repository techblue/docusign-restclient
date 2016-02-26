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

import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ClientResponseFailure;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.ErrorResponse;
import uk.co.techblue.docusign.client.exception.DocuSignException;

import javax.ws.rs.core.Response.Status.Family;
import java.lang.reflect.InvocationTargetException;

public abstract class Service<RT extends Resource> {
    /** The rest base uri. */
    private final String restBaseUri;

    /** The resource proxy. */
    protected final RT resourceProxy;

    public Service(final String restBaseUri, final DocuSignCredentials credentials) {
        this.restBaseUri = restBaseUri;
        this.resourceProxy = getResourceProxy(getResourceClass(), restBaseUri, credentials);
    }

    /**
     * Gets the rest base uri.
     * 
     * @return the rest base uri
     */
    public String getRestBaseUri() {
        return restBaseUri;
    }

    /**
     * Gets the resource class.
     * 
     * @return the resource class
     */
    protected abstract Class<RT> getResourceClass();

    /**
     * Gets the entity from response.
     * 
     * @param <T> the Entity type
     * @param <EX> the Exception type to throw if parsing fails
     * @param clientResponse the client response
     * @param exceptionClazz the exception class to throw if parsing fails
     * @return the entity
     * @throws EX a subclass of docusign exception
     */
    protected <T, EX extends DocuSignException> T parseEntityFromResponse(final ClientResponse<T> clientResponse,
        final Class<EX> exceptionClazz) throws EX {
        T entity = null;
        try {
            validateResponseSuccess(clientResponse, exceptionClazz);
            entity = clientResponse.getEntity();
        } finally {
            clientResponse.releaseConnection();
        }
        return entity;
    }

    /**
     * Validate response success.
     * 
     * @param <EX> the generic type
     * @param clientResponse the client response
     * @param exceptionClazz the exception clazz
     * @throws EX the eX
     */
    protected <EX extends DocuSignException> void validateResponseSuccess(final ClientResponse<?> clientResponse,
        final Class<EX> exceptionClazz) throws EX {
        if (clientResponse.getResponseStatus().getFamily() != Family.SUCCESSFUL) {
            ErrorResponse errorResponse = null;
            Exception cause = null;
            try {
                errorResponse = clientResponse.getEntity(ErrorResponse.class);
            } catch (final ClientResponseFailure responseFailure) {
                cause = responseFailure;
            }
            EX exception = null;
            final String genericErrorMsg = "Error occurred while creating new instance of exception class of type "
                + exceptionClazz.getCanonicalName() + " to throw the following error:\n" + errorResponse;
            try {
                if (cause != null) {
                    exception = exceptionClazz.getConstructor(String.class, Throwable.class).newInstance(cause.getMessage(), cause);
                } else {
                    exception = exceptionClazz.getConstructor(String.class).newInstance(
                        "Request processing failed. HTTP Status: " + clientResponse.getStatus() + "\n Error:"
                            + errorResponse);
                }
            } catch (final IllegalArgumentException iae) {
                throw new IllegalStateException(genericErrorMsg, iae);
            } catch (final SecurityException se) {
                throw new IllegalStateException(genericErrorMsg, se);
            } catch (final InstantiationException ie) {
                throw new IllegalStateException(genericErrorMsg, ie);
            } catch (final IllegalAccessException iacce) {
                throw new IllegalStateException(genericErrorMsg, iacce);
            } catch (final InvocationTargetException ite) {
                throw new IllegalStateException(genericErrorMsg, ite);
            } catch (final NoSuchMethodException nsme) {
                throw new IllegalStateException(genericErrorMsg, nsme);
            }
            exception.setErrorResponse(errorResponse);
            throw exception;
        }
    }

    /**
     * Gets the resource proxy.
     * 
     * @param <T> the generic resource type
     * @param clazz the resource class
     * @param serverUri the server uri
     * @return the resource proxy
     */
    protected <T> T getResourceProxy(final Class<T> clazz, final String serverUri, final DocuSignCredentials credentials) {
        return DocuSignClient.getClientService(clazz, serverUri, credentials);
    }

    public <EX extends DocuSignException> void validateResponseAndReleaseConnection(ClientResponse<?> clientResponse,
        final Class<EX>  exceptionClazz) throws EX {
        try {
            validateResponseSuccess(clientResponse, exceptionClazz);
        } finally {
            clientResponse.releaseConnection();
        }
    }
}
