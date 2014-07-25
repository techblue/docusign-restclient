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
package uk.co.techblue.docusign.client.credential;

import org.jboss.resteasy.client.ClientRequest;

import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Class TokenDocuSignCredential.
 */
public class TokenDocuSignCredential extends BaseDto implements DocuSignCredentials {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4482376291980213269L;

    /** OAuth2 token. */
    private final String token;

    /** username. */
    private final String username;

    /** X-DocuSign-Act-As-User. */
    private final String xDocuSignActAsUser;

    /**
     * Instantiates a new token docu sign credential.
     * 
     * @param token the token
     * @param username the username
     * @param xDocuSignActAsUser the x docu sign act as user
     */
    public TokenDocuSignCredential(final String token, final String username, final String xDocuSignActAsUser) {
        this.token = token;
        this.username = username;
        this.xDocuSignActAsUser = xDocuSignActAsUser;
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.credential.DocuSignCredentials#getUsername()
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Gets the x docu sign act as user.
     * 
     * @return the x docu sign act as user
     */
    public String getXDocuSignActAsUser() {
        return xDocuSignActAsUser;
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.credential.DocuSignCredentials#setHeader(org.jboss.resteasy.client.ClientRequest)
     */
    @Override
    public void setHeader(final ClientRequest request) {
        request.header(DocuSignConstants.HEADER_PARAM_AUTHORIZATION, "bearer " + token);
        if (xDocuSignActAsUser != null && !xDocuSignActAsUser.equals("")) {
        	request.header(DocuSignConstants.HEADER_PARAM_ACT_AS_USER, xDocuSignActAsUser);
        }
    }
}
