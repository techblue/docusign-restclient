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

import org.jboss.resteasy.client.ClientRequest;

import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Class DocuSignCredentials.
 */
public class TokenDocuSignCredentials implements DocuSignCredentials {

	private static final long serialVersionUID = -4482376291980213269L;
	
    /** OAuth2 token */
    private String token;
    
    /** username */
    private String username;
    
    /** X-DocuSign-Act-As-User */
    private String xDocuSignActAsUser;
    
    public TokenDocuSignCredentials(String token, String username, String xDocuSignActAsUser) {
        this.token = token;
        this.username = username;
        this.xDocuSignActAsUser = xDocuSignActAsUser;
    }
    
    public String getUsername() {
		return username;
	}

    public String getXDocuSignActAsUser() {
    	return xDocuSignActAsUser;
    }
    
    public void setHeader(ClientRequest request) {
    	request.header(DocuSignConstants.HEADER_PARAM_AUTHENTICATION, "bearer " + token);
    	request.header(DocuSignConstants.HEADER_PARAM_ACT_AS_USER, xDocuSignActAsUser);
    }
}

