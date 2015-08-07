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
package uk.co.techblue.docusign.client.dto;

import javax.ws.rs.Encoded;
import javax.ws.rs.FormParam;

import uk.co.techblue.docusign.client.constant.GrantType;
import uk.co.techblue.docusign.client.constant.Scope;

/**
 * The Class Oauth2TokenRequest.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
@Encoded
public class Oauth2TokenRequest extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3671623571112392075L;

    /** The grant type. */
    @FormParam("grant_type")
    private final GrantType grantType;

    /** The client id. */
    @FormParam("client_id")
    private final String clientId;

    /** The username. */
    @FormParam("username")
    private final String username;

    /** The password. */
    @FormParam("password")
    private final String password;

    /** The scope. */
    @FormParam("scope")
    private final Scope scope;

    /**
     * Instantiates a new token request.
     *
     * @param grantType the grant type
     * @param clientId the client id
     * @param username the username
     * @param password the password
     * @param api the scope
     */
    public Oauth2TokenRequest(final GrantType grantType, final String clientId, final String username, final String password,
        final Scope api) {
        super();
        this.grantType = grantType;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        this.scope = api;
    }

    /**
     * Gets the grant type.
     *
     * @return the grant type
     */
    public GrantType getGrantType() {
        return grantType;
    }

    /**
     * Gets the client id.
     *
     * @return the client id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets the scope.
     *
     * @return the scope
     */
    public Scope getScope() {
        return scope;
    }

}
