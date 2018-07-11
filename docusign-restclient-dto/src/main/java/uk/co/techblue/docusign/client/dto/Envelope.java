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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.recipients.RecipientCollection;
import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The Class Envelope.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class Envelope extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 270038458648257356L;

	/** The allow reassign. */
	@JsonProperty
	private Boolean allowReassign;

	/** The authoritative copy. */
	@JsonProperty
	private Boolean authoritativeCopy;

	/** The asynchronous. */
	@JsonProperty
	private Boolean asynchronous;

	/** The custom fields. */
	@JsonProperty
	private CustomFields customFields;

	/** The documents. */
	@JsonProperty
	private List<DocumentInfo> documents;

	/** The recipients. */
	@JsonProperty("recipients")
	private RecipientCollection recipients;

	/** The email blurb. */
	@JsonProperty
	private String emailBlurb;

	/** The email subject. */
	@JsonProperty
	private String emailSubject;

	/** The enable wet sign. */
	@JsonProperty
	private Boolean enableWetSign;

	/** The enforce signer visibility. */
	@JsonProperty
	private Boolean enforceSignerVisibility;

	/** The event notification. */
	@JsonProperty
	private String eventNotification;

	/** The notification. */
	@JsonProperty
	private String notification;

	/** The signing location. */
	@JsonProperty
	private String signingLocation;

	/** The status. */
	@JsonProperty
	private Status status;

	/**
	 * Gets the allow reassign.
	 * 
	 * @return the allow reassign
	 */
	public Boolean getAllowReassign() {
		return allowReassign;
	}

	/**
	 * Sets the allow reassign.
	 * 
	 * @param allowReassign
	 *            the new allow reassign
	 */
	public void setAllowReassign(Boolean allowReassign) {
		this.allowReassign = allowReassign;
	}

	/**
	 * Gets the authoritative copy.
	 * 
	 * @return the authoritative copy
	 */
	public Boolean getAuthoritativeCopy() {
		return authoritativeCopy;
	}

	/**
	 * Sets the authoritative copy.
	 * 
	 * @param authoritativeCopy
	 *            the new authoritative copy
	 */
	public void setAuthoritativeCopy(Boolean authoritativeCopy) {
		this.authoritativeCopy = authoritativeCopy;
	}

	/**
	 * Gets the asynchronous.
	 * 
	 * @return the asynchronous
	 */
	public Boolean getAsynchronous() {
		return asynchronous;
	}

	/**
	 * Sets the asynchronous.
	 * 
	 * @param asynchronous
	 *            the new asynchronous
	 */
	public void setAsynchronous(Boolean asynchronous) {
		this.asynchronous = asynchronous;
	}

	/**
	 * Gets the custom fields.
	 * 
	 * @return the custom fields
	 */
	public CustomFields getCustomFields() {
		return customFields;
	}

	/**
	 * Sets the custom fields.
	 * 
	 * @param customFields
	 *            the new custom fields
	 */
	public void setCustomFields(CustomFields customFields) {
		this.customFields = customFields;
	}

	/**
	 * Gets the documents.
	 * 
	 * @return the documents
	 */
	public List<DocumentInfo> getDocuments() {
		return documents;
	}

	/**
	 * Sets the documents.
	 * 
	 * @param documents
	 *            the new documents
	 */
	public void setDocuments(List<DocumentInfo> documents) {
		this.documents = documents;
	}

	/**
	 * Gets the recipients.
	 * 
	 * @return the recipients
	 */
	public RecipientCollection getRecipients() {
		return recipients;
	}

	/**
	 * Sets the recipients.
	 * 
	 * @param recipients
	 *            the new recipients
	 */
	public void setRecipients(RecipientCollection recipients) {
		this.recipients = recipients;
	}

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
	 * @param emailBlurb
	 *            the new email blurb
	 */
	public void setEmailBlurb(String emailBlurb) {
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
	 * @param emailSubject
	 *            the new email subject
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	/**
	 * Gets the enable wet sign.
	 * 
	 * @return the enable wet sign
	 */
	public Boolean getEnableWetSign() {
		return enableWetSign;
	}

	/**
	 * Sets the enable wet sign.
	 * 
	 * @param enableWetSign
	 *            the new enable wet sign
	 */
	public void setEnableWetSign(Boolean enableWetSign) {
		this.enableWetSign = enableWetSign;
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
	 * Sets the enforce signer visibility. It true, the signer is required to
	 * have a signature or initial tab on the document or that the document has
	 * no signers in order to view it. Account must have Document Visibility
	 * enabled to use this.
	 * 
	 * @param enforceSignerVisibility
	 *            the new enforce signer visibility
	 */
	public void setEnforceSignerVisibility(Boolean enforceSignerVisibility) {
		this.enforceSignerVisibility = enforceSignerVisibility;
	}

	/**
	 * Gets the event notification.
	 * 
	 * @return the event notification
	 */
	public String getEventNotification() {
		return eventNotification;
	}

	/**
	 * Sets the event notification.
	 * 
	 * @param eventNotification
	 *            the new event notification
	 */
	public void setEventNotification(String eventNotification) {
		this.eventNotification = eventNotification;
	}

	/**
	 * Gets the notification.
	 * 
	 * @return the notification
	 */
	public String getNotification() {
		return notification;
	}

	/**
	 * Sets the notification.
	 * 
	 * @param notification
	 *            the new notification
	 */
	public void setNotification(String notification) {
		this.notification = notification;
	}

	/**
	 * Gets the signing location.
	 * 
	 * @return the signing location
	 */
	public String getSigningLocation() {
		return signingLocation;
	}

	/**
	 * Sets the signing location.
	 * 
	 * @param signingLocation
	 *            the new signing location
	 */
	public void setSigningLocation(String signingLocation) {
		this.signingLocation = signingLocation;
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
	 * @param status
	 *            the new status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

}
