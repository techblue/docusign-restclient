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

import org.apache.commons.lang3.StringUtils;
import org.jboss.resteasy.client.ClientRequest;

import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Class BasicDocusignCredential.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class BasicDocusignCredential extends BaseDto implements DocuSignCredentials {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1488586910913230749L;

    /** The Constant TAG_USERNAME. */
    private static final String TAG_USERNAME = "Username";

    /** The Constant TAG_PASSWORD. */
    private static final String TAG_PASSWORD = "Password";

    /** The Constant TAG_INTEGRATOR_KEY. */
    private static final String TAG_INTEGRATOR_KEY = "IntegratorKey";

    /** The Constant SEND_ON_BEHALF_OF. */
    private static final String SEND_ON_BEHALF_OF = "SendOnBehalfOf";

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /** The integrator key. */
    private String integratorKey;

    /** The send on behalf of. */
    private String sendOnBehalfOf;

    /**
     * Instantiates a new docu sign credentials.
     * 
     * @param username the username
     * @param password the password
     * @param integratorKey the integrator key
     */
    public BasicDocusignCredential(final String username, final String password, final String integratorKey) {
        this.username = username;
        this.password = password;
        this.integratorKey = integratorKey;
    }

    /**
     * Instantiates a new docu sign credentials.
     *
     * @param username the username
     * @param password the password
     * @param integratorKey the integrator key
     * @param sendOnBehalfOf the user to send on behalf of
     */
    public BasicDocusignCredential(final String username, final String password, final String integratorKey, final String sendOnBehalfOf) {
        this(username, password, integratorKey);
        this.sendOnBehalfOf = sendOnBehalfOf;
    }

    /**
     * Returns representation of credentials that is accepted by docusign restful services.
     * 
     * @param credentials the DocuSign credentials
     * @return the string representation of credentials
     */
    public static String valueOf(final BasicDocusignCredential credentials) {
        final String rootElement = DocuSignCredentials.class.getSimpleName();
        final StringBuffer buffer = new StringBuffer();
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

        if(StringUtils.isBlank(credentials.getSendOnBehalfOf())) {
            buffer.append(wrapInAngularBrackets(SEND_ON_BEHALF_OF, false));
            buffer.append(String.valueOf(credentials.getSendOnBehalfOf()));
            buffer.append(wrapInAngularBrackets(SEND_ON_BEHALF_OF, true));
        }

        buffer.append(wrapInAngularBrackets(rootElement, true));
        return buffer.toString();
    }

    /**
     * Wrap in angular brackets.
     * 
     * @param tagName the tag name
     * @param isClosing the is closing
     * @return the string
     */
    private static String wrapInAngularBrackets(final String tagName, final boolean isClosing) {
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
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * 
     * @param username the new username
     */
    public void setUsername(final String username) {
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
     * @param password the new password
     */
    public void setPassword(final String password) {
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
     * @param integratorKey the new integrator key
     */
    public void setIntegratorKey(final String integratorKey) {
        this.integratorKey = integratorKey;
    }

    /**
     * Gets the send on behalf of value.
     *
     * @return the send on behalf of value
     */
    public String getSendOnBehalfOf() {
        return sendOnBehalfOf;
    }

    /**
     * Sets the send on behalf of value.
     *
     * @param sendOnBehalfOf the new send on behalf of value
     */
    public void setSendOnBehalfOf(final String sendOnBehalfOf) {
        this.sendOnBehalfOf = sendOnBehalfOf;
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.dto.BaseDto#toString()
     */
    @Override
    public String toString() {
        return valueOf(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.credential.DocuSignCredentials#setHeader(org.jboss.resteasy.client.ClientRequest)
     */
    @Override
    public void setHeader(final ClientRequest request) {
        request.header(DocuSignConstants.HEADER_PARAM_AUTHENTICATION, this);
    }
}
