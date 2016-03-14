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
package uk.co.techblue.docusign.client.services;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.BaseService;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.account.BrandDeleteRequest;
import uk.co.techblue.docusign.client.dto.account.BrandProfilesResponse;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.AccountException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.resources.AccountResource;

/**
 * The Class AccountService.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class AccountService extends BaseService<AccountResource> {

    /**
     * Instantiates a new account service.
     * 
     * @param serverUri the server uri
     * @param credentials the credentials
     * @throws ServiceInitException the service init exception
     */
    public AccountService(final String serverUri, final DocuSignCredentials credentials)
        throws ServiceInitException {
        super(serverUri, credentials);
    }

    /**
     * Instantiates a new account service.
     * 
     * @param credentials the credentials
     * @param loginAccount the login account
     * @throws ServiceInitException the service init exception
     */
    public AccountService(final DocuSignCredentials credentials,
        final LoginAccount loginAccount) throws ServiceInitException {
        super(loginAccount, credentials);
    }

    /**
     * Gets the account branding profiles.
     * 
     * @return the account branding profiles
     * @throws AccountException the account exception
     */
    public BrandProfilesResponse getBrandProfiles() throws AccountException {
        final ClientResponse<BrandProfilesResponse> clientResponse = resourceProxy.getBrandProfiles();
        return parseEntityFromResponse(clientResponse,
            AccountException.class);
    }

    /**
     * Delete brand profiles.
     * 
     * @param brandDeleteRequest the brand delete request
     * @throws AccountException the account exception
     */
    public void deleteBrandProfiles(final BrandDeleteRequest brandDeleteRequest) throws AccountException {
        final ClientResponse<String> clientResponse = resourceProxy.deleteBrandingProfiles(brandDeleteRequest);
        validateResponseAndReleaseConnection(clientResponse, AccountException.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.Service#getResourceClass()
     */
    @Override
    protected Class<AccountResource> getResourceClass() {
        return AccountResource.class;
    }

}
