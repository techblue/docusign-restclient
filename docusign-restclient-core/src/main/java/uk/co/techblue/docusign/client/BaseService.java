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

import org.apache.commons.lang3.StringUtils;

import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.LoginException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.services.LoginService;

/**
 * The Base Service class that needs to be extended by all Service classes to
 * parse desired entity from response.
 * 
 * @param <RT>
 *            the resource type
 * @author Ajay
 */
public abstract class BaseService<RT extends Resource> extends Service<RT> {

    /** The credentials. */
    protected final DocuSignCredentials credentials;

    /**
     * Instantiates a new base service. Uses the default login account to
     * determine the base endpoint URL to connect to.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @throws ServiceInitException
     *             the service init exception
     */
    public BaseService(String serverUri, DocuSignCredentials credentials) throws ServiceInitException {
        super(getRestBaseUri(serverUri, credentials));
        this.credentials = credentials;

    }

    /**
     * Instantiates a new base service.
     * 
     * @param loginAccount
     *            the login account
     * @param credentials
     *            the credentials
     * @throws ServiceInitException
     *             the service init exception
     */
    public BaseService(LoginAccount loginAccount, DocuSignCredentials credentials)
            throws ServiceInitException {
        super(loginAccount.getBaseUrl());
        this.credentials = credentials;
    }

    /**
     * Gets the rest base uri.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @return the rest base uri
     * @throws ServiceInitException
     *             the service init exception
     */
    private static String getRestBaseUri(String serverUri, DocuSignCredentials credentials)
            throws ServiceInitException {
        LoginAccount defaultAccount = getDefaultAccount(serverUri, credentials);
        if (defaultAccount == null) {
            throw new ServiceInitException("Default account not found for docusign user '"
                    + credentials.getUsername() + "'");
        }
        String baseUrl = defaultAccount.getBaseUrl();
        if (StringUtils.isBlank(baseUrl)) {
            throw new ServiceInitException("Base REST URL not found for the default account: \n"
                    + defaultAccount + "'");
        }
        return baseUrl;
    }

    /**
     * Gets the default account.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @return the default account
     * @throws ServiceInitException
     *             the service init exception
     */
    private static LoginAccount getDefaultAccount(String serverUri, DocuSignCredentials credentials)
            throws ServiceInitException {
        LoginService loginService = new LoginService(serverUri);
        ClientInfo clientInfo = null;
        try {
            clientInfo = loginService.getLoginInformation(credentials);
        } catch (LoginException le) {
            throw new ServiceInitException(
                    "Error occurred while getting login information during initialization of DocuSign Service.",
                    le);
        }
        if (clientInfo == null) {
            throw new ServiceInitException("Failed to retrieve client info against credentials.\n"
                    + credentials);
        }
        if (clientInfo.getLoginAccounts() == null || clientInfo.getLoginAccounts().size() == 0) {
            throw new ServiceInitException(
                    "Login accounts not found in client info retrirved against specified credentials.\n "
                            + credentials + "\n" + clientInfo);
        }
        for (LoginAccount loginAccount : clientInfo.getLoginAccounts()) {
            if (loginAccount.isDefault()) {
                return loginAccount;
            }
        }
        throw new ServiceInitException("Default account not found against specified credentials.\n "
                + credentials + "\n" + clientInfo);
    }

}
