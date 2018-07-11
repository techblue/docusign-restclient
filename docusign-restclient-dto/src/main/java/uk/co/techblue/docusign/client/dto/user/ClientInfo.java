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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;


public class ClientInfo  extends BaseDto{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5249900304157767099L;

	@JsonProperty("apiPassword")
    private String apiPassword;

    @JsonProperty("loginAccounts")
    private List<LoginAccount> loginAccounts;

    @JsonProperty("preferredAPIVersion")
    private String preferredAPIVersion;

    @JsonProperty("supportedAPIVersions")
    private List<String> supportedAPIVersions;

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public List<LoginAccount> getLoginAccounts() {
        return loginAccounts;
    }

    public void setLoginAccounts(List<LoginAccount> loginAccounts) {
        this.loginAccounts = loginAccounts;
    }

    public String getPreferredAPIVersion() {
        return preferredAPIVersion;
    }

    public void setPreferredAPIVersion(String preferredAPIVersion) {
        this.preferredAPIVersion = preferredAPIVersion;
    }

    public List<String> getSupportedAPIVersions() {
        return supportedAPIVersions;
    }

    public void setSupportedAPIVersions(List<String> supportedAPIVersions) {
        this.supportedAPIVersions = supportedAPIVersions;
    }

}
