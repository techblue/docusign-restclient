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
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.exception.TemplateException;
import uk.co.techblue.docusign.client.resources.TemplateResource;

/**
 * The Class TemplateService.
 */
public class TemplateService extends BaseService<TemplateResource> {

    /**
     * Instantiates a new template service.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @throws ServiceInitException
     *             the service init exception
     */
    public TemplateService(String serverUri, DocuSignCredentials credentials) throws ServiceInitException {
        super(serverUri, credentials);
    }

    /**
     * Instantiates a new template service.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @param loginAccount
     *            the login account
     * @throws ServiceInitException
     *             the service init exception
     */
    public TemplateService(String serverUri, DocuSignCredentials credentials, LoginAccount loginAccount)
            throws ServiceInitException {
        super(loginAccount, credentials);
    }

    /**
     * Retrieve templates.
     * 
     * @param credentials
     *            the credentials
     * @param accountId
     *            the account id
     * @return the template
     * @throws TemplateException
     *             the template exception
     */
    public TemplateInfo retrieveTemplates() throws TemplateException {
        ClientResponse<TemplateInfo> clientResponse = resourceProxy.retrieveTemplates(credentials);
        return parseEntityFromResponse(clientResponse, TemplateException.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.Service#getResourceClass()
     */
    @Override
    protected Class<TemplateResource> getResourceClass() {
        return TemplateResource.class;
    }

}
