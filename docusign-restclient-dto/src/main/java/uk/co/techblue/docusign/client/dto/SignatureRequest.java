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
package uk.co.techblue.docusign.client.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The base class for all kinds of signature requests.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public abstract class SignatureRequest extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1000127674564831038L;

    /** The email blurb. */
    @JsonProperty("emailBlurb")
    private String emailBlurb;

    /** The email subject. */
    @JsonProperty("emailSubject")
    private String emailSubject;

    /** The status. */
    @JsonProperty("status")
    private Status status;

    /** The enforce signer visibility. */
    @JsonProperty
    private Boolean enforceSignerVisibility;

    /**
     * Gets the email blurb.
     * 
     * @return the email blurb
     */
    public String getEmailBlurb() {
        return emailBlurb;
    }

    /**
     * Sets the email blurb.
     * 
     * @param emailBlurb the new email blurb
     */
    public void setEmailBlurb(final String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    /**
     * Gets the email subject.
     * 
     * @return the email subject
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the email subject.
     * 
     * @param emailSubject the new email subject
     */
    public void setEmailSubject(final String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status the new status
     */
    public void setStatus(final Status status) {
        this.status = status;
    }

    /**
     * Gets the enforce signer visibility.
     * 
     * @return the enforce signer visibility
     */
    public Boolean getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }

    /**
     * Sets the enforce signer visibility. It true, the signer is required to have a signature or initial tab on the document or
     * that the document has no signers in order to view it. Account must have Document Visibility enabled to use this.
     * 
     * @param enforceSignerVisibility the new enforce signer visibility
     */
    public void setEnforceSignerVisibility(final Boolean enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }

}
