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
package uk.co.techblue.docusign.client.dto.user;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class DocuSignCredentials.
 */
public class DocuSignCredentials extends BaseDto {

	private static final long serialVersionUID = -4482376291980213269L;
	
    /** OAuth2 token */
    private String token;
    
    /** username */
    private String username;
    
    public DocuSignCredentials(String token, String username) {
        this.token = token;
        this.username = username;
    }
    
    public String getUsername() {
		return username;
	}

	@Override
    public String toString() {
    	return "bearer " + token;
    }
}

