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
package uk.co.techblue.docusign.client.exception;

/**
 * The Class AccountException.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class AccountException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2032583430211475621L;

    /**
     * Instantiates a new account exception.
     * 
     * @param message the message
     */
    public AccountException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new account exception.
     * 
     * @param throwable the throwable
     */
    public AccountException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new account exception.
     * 
     * @param message the message
     * @param throwable the throwable
     */
    public AccountException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

}
