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
package uk.co.techblue.docusign.client.dto.recipients;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class RecipientViewRequest.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class RecipientViewRequest extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6184218644834156231L;

    /** The authentication method. */
    @JsonProperty("authenticationMethod")
    private String authenticationMethod;

    /** The email. */
    @JsonProperty("email")
    private String email;

    /** The return url. */
    @JsonProperty("returnUrl")
    private String returnUrl;

    /** The user name. */
    @JsonProperty("userName")
    private String userName;

    /** The client user id. */
    @JsonProperty("clientUserId")
    private String clientUserId;

    /**
     * Gets the authentication method.
     * 
     * @return the authentication method
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the authentication method. The convention used to authenticate the end-user. For example email.
     * 
     * 
     * @param authenticationMethod the new authentication method
     */
    public void setAuthenticationMethod(final String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
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
     * Sets the email. Specifies the Email of the recipient.
     * 
     * 
     * @param email the new email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Gets the return url.
     * 
     * @return the return url
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the return url. The URL the recipient is directed to on certain events. DocuSign sends returns to the URL and
     * includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters
     * returned are:
     * <ul>
     * <li>cancel (recipient cancels signing)</li>
     * <li>decline (recipient declines signing)</li>
     * <li>exception (exception occurs)</li>
     * <li>fax_pending (recipient has fax pending)</li>
     * <li>id_check_faild (recipient failed an ID check)</li>
     * <li>session_timeout (session times out)</li>
     * <li>signing_complete (recipient completes signing)</li>
     * <li>ttl_complete (the TTL expires)</li>
     * <li>viewing_complete (recipient completes viewing the envelope)</li>
     * </ul>
     * 
     * @param returnUrl the return url
     */
    public void setReturnUrl(final String returnUrl) {
        this.returnUrl = returnUrl;
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
     * Sets the user name. Specifies the username of the recipient.
     * 
     * @param userName the new user name
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * Gets the client user id.
     * 
     * @return the client user id
     */
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * Sets the client user id.
     * 
     * @param clientUserId the new client user id
     */
    public void setClientUserId(final String clientUserId) {
        this.clientUserId = clientUserId;
    }

}
