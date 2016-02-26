/*******************************************************************************
 * Copyright 2015 Technology Blueprint Ltd
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
package uk.co.techblue.docusign.client.services;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Service;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.Oauth2TokenRequest;
import uk.co.techblue.docusign.client.dto.Oauth2TokenResponse;
import uk.co.techblue.docusign.client.dto.user.ChangePasswordRequest;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.exception.LoginException;
import uk.co.techblue.docusign.client.exception.UserAccountException;
import uk.co.techblue.docusign.client.resources.LoginResource;

/**
 * The service class containing methods to communicate with DocuSign login resource.
 *
 * @author Ajay
 */
public class LoginService extends Service<LoginResource> {

    /**
     * Instantiates a new login service.
     *
     * @param serverUri the server uri
     */
    public LoginService(final String serverUri, final DocuSignCredentials credentials) {
        super(serverUri, credentials);
    }

    /**
     * Gets the login information.
     *
     * @param credentials the credentials
     * @return the login information
     * @throws LoginException the login exception
     */
    public ClientInfo getLoginInformation()
        throws LoginException {
        final ClientResponse<ClientInfo> clientResponse = resourceProxy
            .getLoginInformation();
        return parseEntityFromResponse(clientResponse, LoginException.class);
    }

    /**
     * Gets the o auth2 token.
     *
     * @return the o auth2 token
     * @throws LoginException the login exception
     */
    public Oauth2TokenResponse getOAuth2Token(final Oauth2TokenRequest oauth2TokenRequest) throws LoginException {
        final ClientResponse<Oauth2TokenResponse> clientResponse = resourceProxy.getOAuth2Token(oauth2TokenRequest);
        return parseEntityFromResponse(clientResponse, LoginException.class);
    }

    /**
     * Change password.
     *
     * @param credentials the credentials
     * @param changePasswordRequest the change password request
     * @throws UserAccountException
     */
    public void changePassword(final ChangePasswordRequest changePasswordRequest)
        throws UserAccountException {
        final ClientResponse<?> clientResponse = resourceProxy.changePassword(changePasswordRequest);
        validateResponseAndReleaseConnection(clientResponse, UserAccountException.class);
    }

    /*
     * (non-Javadoc)
     *
     * @see uk.co.techblue.docusign.client.Service#getResourceClass()
     */
    @Override
    protected Class<LoginResource> getResourceClass() {
        return LoginResource.class;
    }
}
