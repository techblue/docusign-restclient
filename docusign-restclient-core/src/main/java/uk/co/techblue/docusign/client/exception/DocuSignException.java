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

import uk.co.techblue.docusign.client.dto.ErrorResponse;

/**
 * The Class DocuSignException.
 */
public class DocuSignException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8769609130061943584L;
    /** The error response. */
    private ErrorResponse errorResponse;

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param message
     *            the message
     */
    public DocuSignException(String message) {
        super(message);
    }

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param throwable
     *            the throwable
     */
    public DocuSignException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public DocuSignException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * Gets the error response.
     * 
     * @return the error response
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the error response.
     * 
     * @param errorResponse
     *            the new error response
     */
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

}
