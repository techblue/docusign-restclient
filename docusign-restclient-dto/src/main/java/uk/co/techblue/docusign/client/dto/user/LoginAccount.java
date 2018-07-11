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

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class LoginAccount.
 */
public class LoginAccount extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3342182577694376526L;

	/** The account id. */
    @JsonProperty("accountId")
    private String accountId;

    /** The base url. */
    @JsonProperty("baseUrl")
    private String baseUrl;

    /** The email. */
    @JsonProperty("email")
    private String email;

    /** The is default. */
    @JsonProperty("isDefault")
    private boolean isDefault;

    /** The name. */
    @JsonProperty("name")
    private String name;

    /** The site description. */
    @JsonProperty("siteDescription")
    private String siteDescription;

    /** The user id. */
    @JsonProperty("userId")
    private String userId;

    /** The user name. */
    @JsonProperty("userName")
    private String userName;

    /**
     * Gets the account id.
     * 
     * @return the account id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the account id.
     * 
     * @param accountId
     *            the new account id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the base url.
     * 
     * @return the base url
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the base url.
     * 
     * @param baseUrl
     *            the new base url
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email
     *            the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Checks if is default.
     * 
     * @return true, if is default
     */
    public boolean isDefault() {
        return isDefault;
    }

    /**
     * Sets the default.
     * 
     * @param isDefault
     *            the new default
     */
    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the site description.
     * 
     * @return the site description
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the site description.
     * 
     * @param siteDescription
     *            the new site description
     */
    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     * 
     * @param userId
     *            the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the user name.
     * 
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name.
     * 
     * @param userName
     *            the new user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
