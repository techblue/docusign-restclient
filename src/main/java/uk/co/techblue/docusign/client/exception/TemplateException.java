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
 * The TemplateException Class.
 */
public class TemplateException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7751447074676142674L;

    /**
     * Instantiates a new template exception.
     * 
     * @param message
     *            the message
     */
    public TemplateException(String message) {
        super(message);
    }

    /**
     * Instantiates a new template exception.
     * 
     * @param throwable
     *            the throwable
     */
    public TemplateException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new template exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public TemplateException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
