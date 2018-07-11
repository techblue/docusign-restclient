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

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.constant.Scope;

/**
 * The Class Oauth2TokenResponse.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class Oauth2TokenResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -644400661616501192L;

    /** The access token. */
    @JsonProperty("access_token")
    private String accessToken;

    /** The token type. */
    @JsonProperty("token_type")
    private String tokenType;

    /** The scope. */
    private Scope scope;

    /**
     * Gets the access token.
     *
     * @return the access token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the access token.
     *
     * @param accessToken the new access token
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Gets the token type.
     *
     * @return the token type
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Sets the token type.
     *
     * @param tokenType the new token type
     */
    public void setTokenType(final String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Gets the scope.
     *
     * @return the scope
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * Sets the scope.
     *
     * @param scope the new scope
     */
    public void setScope(final Scope scope) {
        this.scope = scope;
    }

}
