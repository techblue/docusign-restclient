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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

/**
 * The Class EnvelopeInfo.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class EnvelopeInfo extends BaseDto{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3185383754308889035L;

	/** The certificate uri. */
	@JsonProperty
	private String certificateUri;

	/** The custom fields uri. */
	@JsonProperty
	private String customFieldsUri;

	/** The documents combined uri. */
	@JsonProperty
	private String documentsCombinedUri;

	/** The documents uri. */
	@JsonProperty
	private String documentsUri;

	/** The envelope id. */
	@JsonProperty
	private String envelopeId;

	/** The envelope uri. */
	@JsonProperty
	private String envelopeUri;

	/** The notification uri. */
	@JsonProperty
	private String notificationUri;

	/** The recipients uri. */
	@JsonProperty
	private String recipientsUri;

	/** The status. */
	@JsonProperty
	private Status status;

	/** The status changed date time. */
	@JsonProperty
	private Date statusChangedDateTime;

	/** The templates uri. */
	@JsonProperty
	private String templatesUri;
	
	/**
	 * Gets the certificate uri.
	 * 
	 * @return the certificate uri
	 */
	public String getCertificateUri() {
		return certificateUri;
	}

	/**
	 * Sets the certificate uri.
	 * 
	 * @param certificateUri
	 *            the new certificate uri
	 */
	public void setCertificateUri(String certificateUri) {
		this.certificateUri = certificateUri;
	}

	/**
	 * Gets the custom fields uri.
	 * 
	 * @return the custom fields uri
	 */
	public String getCustomFieldsUri() {
		return customFieldsUri;
	}

	/**
	 * Sets the custom fields uri.
	 * 
	 * @param customFieldsUri
	 *            the new custom fields uri
	 */
	public void setCustomFieldsUri(String customFieldsUri) {
		this.customFieldsUri = customFieldsUri;
	}

	/**
	 * Gets the documents combined uri.
	 * 
	 * @return the documents combined uri
	 */
	public String getDocumentsCombinedUri() {
		return documentsCombinedUri;
	}

	/**
	 * Sets the documents combined uri.
	 * 
	 * @param documentsCombinedUri
	 *            the new documents combined uri
	 */
	public void setDocumentsCombinedUri(String documentsCombinedUri) {
		this.documentsCombinedUri = documentsCombinedUri;
	}

	/**
	 * Gets the documents uri.
	 * 
	 * @return the documents uri
	 */
	public String getDocumentsUri() {
		return documentsUri;
	}

	/**
	 * Sets the documents uri.
	 * 
	 * @param documentsUri
	 *            the new documents uri
	 */
	public void setDocumentsUri(String documentsUri) {
		this.documentsUri = documentsUri;
	}

	/**
	 * Gets the envelope id.
	 * 
	 * @return the envelope id
	 */
	public String getEnvelopeId() {
		return envelopeId;
	}

	/**
	 * Sets the envelope id.
	 * 
	 * @param envelopeId
	 *            the new envelope id
	 */
	public void setEnvelopeId(String envelopeId) {
		this.envelopeId = envelopeId;
	}

	/**
	 * Gets the envelope uri.
	 * 
	 * @return the envelope uri
	 */
	public String getEnvelopeUri() {
		return envelopeUri;
	}

	/**
	 * Sets the envelope uri.
	 * 
	 * @param envelopeUri
	 *            the new envelope uri
	 */
	public void setEnvelopeUri(String envelopeUri) {
		this.envelopeUri = envelopeUri;
	}

	/**
	 * Gets the notification uri.
	 * 
	 * @return the notification uri
	 */
	public String getNotificationUri() {
		return notificationUri;
	}

	/**
	 * Sets the notification uri.
	 * 
	 * @param notificationUri
	 *            the new notification uri
	 */
	public void setNotificationUri(String notificationUri) {
		this.notificationUri = notificationUri;
	}

	/**
	 * Gets the recipients uri.
	 * 
	 * @return the recipients uri
	 */
	public String getRecipientsUri() {
		return recipientsUri;
	}

	/**
	 * Sets the recipients uri.
	 * 
	 * @param recipientsUri
	 *            the new recipients uri
	 */
	public void setRecipientsUri(String recipientsUri) {
		this.recipientsUri = recipientsUri;
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

	/**
	 * Gets the status changed date time.
	 * 
	 * @return the status changed date time
	 */
	public Date getStatusChangedDateTime() {
		return statusChangedDateTime;
	}

	/**
	 * Sets the status changed date time.
	 * 
	 * @param statusChangedDateTime
	 *            the new status changed date time
	 */
	@JsonDeserialize(using = ISO8601DateDeserializer.class)
	public void setStatusChangedDateTime(Date statusChangedDateTime) {
		this.statusChangedDateTime = statusChangedDateTime;
	}
	

	/**
	 * Gets the templates uri.
	 *
	 * @return the templates uri
	 */
	public String getTemplatesUri() {
		return templatesUri;
	}

	/**
	 * Sets the templates uri.
	 *
	 * @param templatesUri the new templates uri
	 */
	public void setTemplatesUri(String templatesUri) {
		this.templatesUri = templatesUri;
	}

}
