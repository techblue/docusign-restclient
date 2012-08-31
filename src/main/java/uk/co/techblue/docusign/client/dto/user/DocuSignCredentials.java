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

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class DocuSignCredentials.
 */
public class DocuSignCredentials extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4482376291980213269L;

	/** The Constant TAG_USERNAME. */
    private static final String TAG_USERNAME = "Username";

    /** The Constant TAG_PASSWORD. */
    private static final String TAG_PASSWORD = "Password";

    /** The Constant TAG_INTEGRATOR_KEY. */
    private static final String TAG_INTEGRATOR_KEY = "IntegratorKey";

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /** The integrator key. */
    private String integratorKey;

    /**
     * Instantiates a new docu sign credentials.
     * 
     * @param username
     *            the username
     * @param password
     *            the password
     * @param integratorKey
     *            the integrator key
     */
    public DocuSignCredentials(String username, String password, String integratorKey) {
        this.username = username;
        this.password = password;
        this.integratorKey = integratorKey;
    }

    /**
     * Returns representation of credentials that is accepted by docusign
     * restful services.
     * 
     * @param credentials
     *            the DocuSign credentials
     * @return the string representation of credentials
     */
    public static String valueOf(DocuSignCredentials credentials) {
        String rootElement = DocuSignCredentials.class.getSimpleName();
        StringBuffer buffer = new StringBuffer();
        buffer.append(wrapInAngularBrackets(rootElement, false));

        buffer.append(wrapInAngularBrackets(TAG_USERNAME, false));
        buffer.append(String.valueOf(credentials.getUsername()));
        buffer.append(wrapInAngularBrackets(TAG_USERNAME, true));

        buffer.append(wrapInAngularBrackets(TAG_PASSWORD, false));
        buffer.append(String.valueOf(credentials.getPassword()));
        buffer.append(wrapInAngularBrackets(TAG_PASSWORD, true));

        buffer.append(wrapInAngularBrackets(TAG_INTEGRATOR_KEY, false));
        buffer.append(String.valueOf(credentials.getIntegratorKey()));
        buffer.append(wrapInAngularBrackets(TAG_INTEGRATOR_KEY, true));

        buffer.append(wrapInAngularBrackets(rootElement, true));
        return buffer.toString();
    }

    /**
     * Wrap in angular brackets.
     * 
     * @param tagName
     *            the tag name
     * @param isClosing
     *            the is closing
     * @return the string
     */
    private static String wrapInAngularBrackets(String tagName, boolean isClosing) {
        String wrapped = "<";
        if (isClosing) {
            wrapped += "/";
        }
        wrapped += tagName + ">";
        return wrapped;
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
     * Sets the username.
     * 
     * @param username
     *            the new username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * Sets the password.
     * 
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the integrator key.
     * 
     * @return the integrator key
     */
    public String getIntegratorKey() {
        return integratorKey;
    }

    /**
     * Sets the integrator key.
     * 
     * @param integratorKey
     *            the new integrator key
     */
    public void setIntegratorKey(String integratorKey) {
        this.integratorKey = integratorKey;
    }
    
    @Override
    public String toString() {
    	return valueOf(this);
    }
}
