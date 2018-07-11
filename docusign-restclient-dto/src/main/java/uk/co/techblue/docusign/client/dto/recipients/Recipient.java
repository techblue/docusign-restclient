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
package uk.co.techblue.docusign.client.dto.recipients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.Attachment;
import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.dto.CaptiveInfo;
import uk.co.techblue.docusign.client.dto.IDCheckInformationInput;

/**
 * This class comprise of common recipient attributes and is solely for the
 * purpose of extending. There are seven possible recipient types: Agents,
 * Carbon Copies, Certified Deliveries, Editors, In Person Signers,
 * Intermediaries, and Signers. Recipient types share some common parameters,
 * but the exact parameters associated with a recipient depend on the recipient
 * type.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public abstract class Recipient extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7067002029262803545L;

	/** The access code. */
	@JsonProperty
	private String accessCode;

	/** The add access code to email. */
	@JsonProperty
	private Boolean addAccessCodeToEmail;

	/** The custom fields. */
	@JsonProperty
	private List<String> customFields;

	/** The email notification. */
	@JsonProperty
	private RecipientEmailNotification emailNotification;

	/** The id check configuration name. */
	@JsonProperty
	private String idCheckConfigurationName;

	/** The recipient id. */
	@JsonProperty
	private String recipientId;

	/** The id check information input. */
	@JsonProperty
	private IDCheckInformationInput idCheckInformationInput;

	/** The inherit email notification configuration. */
	@JsonProperty
	private Boolean inheritEmailNotificationConfiguration;

	/** The note. */
	@JsonProperty
	private String note;

	/** The phone authentication. */
	@JsonProperty
	private RecipientPhoneAuthentication phoneAuthentication;

	/** The recipient attachments. */
	@JsonProperty
	private List<Attachment> recipientAttachment;

	/** The recipient captive info. */
	@JsonProperty
	private CaptiveInfo recipientCaptiveInfo;

	/** The require id lookup. */
	@JsonProperty
	private Boolean requireIdLookup;

	/** The role name. */
	@JsonProperty
	private String roleName;

	/** The routing order. */
	@JsonProperty
	private String routingOrder;

	/** The social authentications. */
	@JsonProperty
	private Boolean socialAuthentications;

	/** The template access code required. */
	@JsonProperty
	private Boolean templateAccessCodeRequired;

	/** The template locked. */
	@JsonProperty
	private Boolean templateLocked;

	/** The template required. */
	@JsonProperty
	private Boolean templateRequired;

	/**
	 * Gets the access code.
	 * 
	 * @return the access code
	 */
	public String getAccessCode() {
		return accessCode;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the access code. This optional element specifies the access code a
	 * recipient has to enter to validate the identity.
	 * 
	 * 
	 * @param accessCode
	 *            the new access code
	 */
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	/**
	 * Gets the adds the access code to email.
	 * 
	 * @return the adds the access code to email
	 */
	public Boolean getAddAccessCodeToEmail() {
		return addAccessCodeToEmail;
	}

	/**
	 * 
	 * <b>Optional</b><br/>
	 * This optional attribute indicates that the access code will be added to
	 * the email sent to the recipient; this nullifies the Security measure of
	 * Access Code on the recipient.
	 * 
	 * 
	 * @param addAccessCodeToEmail
	 *            the new adds the access code to email
	 */
	public void setAddAccessCodeToEmail(Boolean addAccessCodeToEmail) {
		this.addAccessCodeToEmail = addAccessCodeToEmail;
	}

	/**
	 * Gets the custom fields.
	 * 
	 * @return the custom fields
	 */
	public List<String> getCustomFields() {
		return customFields;
	}

	/**
	 * <b>Optional</b><br/>
	 * Allows the sender to send custom data about the recipient. This
	 * information is returned in the envelope status but otherwise not used by
	 * DocuSign.
	 * 
	 * 
	 * @param customFields
	 *            the new custom fields
	 */
	public void setCustomFields(List<String> customFields) {
		this.customFields = customFields;
	}

	/**
	 * Gets the email notification.
	 * 
	 * @return the email notification
	 */
	public RecipientEmailNotification getEmailNotification() {
		return emailNotification;
	}

	/**
	 * 
	 * <b>Optional</b><br/>
	 * An optional complex type that has information for setting the language
	 * for the recipient’s email information. It is composed of three elements:
	 * <ul>
	 * <li><b>Subject:</b> a long string with the subject of the email sent to
	 * the recipient.</li>
	 * <li><b>EmailBlurb:</b> a string with the email message sent to the
	 * recipient.</li>
	 * <li><b>Language:</b> the simple type SupportedLanguage enumerating the
	 * language used.</li>
	 * </ul>
	 * 
	 * @param emailNotification
	 *            the new email notification
	 */
	public void setEmailNotification(
			RecipientEmailNotification emailNotification) {
		this.emailNotification = emailNotification;
	}

	/**
	 * Gets the id check configuration name.
	 * 
	 * @return the id check configuration name
	 */
	public String getIdCheckConfigurationName() {
		return idCheckConfigurationName;
	}

	/**
	 * <b>Optional</b><br/>
	 * Specifies ID check configuration by name. Overrides the default.
	 * 
	 * 
	 * @param idCheckConfigurationName
	 *            the new id check configuration name
	 */
	public void setIdCheckConfigurationName(String idCheckConfigurationName) {
		this.idCheckConfigurationName = idCheckConfigurationName;
	}

	/**
	 * Gets the recipient id.
	 * 
	 * @return the recipient id
	 */
	public String getRecipientId() {
		return recipientId;
	}

	/**
	 * Sets the recipient id unique for the recipient. It is used by the tab
	 * element to indicate which recipient is to sign the Document.
	 * 
	 * 
	 * @param recipientId
	 *            the new recipient id
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	/**
	 * Gets the id check information input.
	 * 
	 * @return the id check information input
	 */
	public IDCheckInformationInput getIdCheckInformationInput() {
		return idCheckInformationInput;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the id check information input.
	 * 
	 * @param idCheckInformationInput
	 *            the new id check information input
	 */
	public void setIdCheckInformationInput(
			IDCheckInformationInput idCheckInformationInput) {
		this.idCheckInformationInput = idCheckInformationInput;
	}

	/**
	 * Gets the inherit email notification configuration.
	 * 
	 * @return the inherit email notification configuration
	 */
	public Boolean getInheritEmailNotificationConfiguration() {
		return inheritEmailNotificationConfiguration;
	}

	/**
	 * <b>Optional</b><br/>
	 * If true and the recipient creates a DocuSign account after signing, the
	 * Manage Account Email Notification settings are used as the default
	 * settings for the recipient's account.
	 * 
	 * @param inheritEmailNotificationConfiguration
	 *            the new inherit email notification configuration
	 */
	public void setInheritEmailNotificationConfiguration(
			Boolean inheritEmailNotificationConfiguration) {
		this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
	}

	/**
	 * Gets the note.
	 * 
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the note that will be unique to this recipient. This note will be
	 * sent to the recipient via the signing email. This note will display in
	 * the signing UI near the upper left corner of the document on the signing
	 * screen.
	 * 
	 * 
	 * @param note
	 *            the new note
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * Gets the phone authentication.
	 * 
	 * @return the phone authentication
	 */
	public RecipientPhoneAuthentication getPhoneAuthentication() {
		return phoneAuthentication;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the phone authentication.
	 * 
	 * @param phoneAuthentication
	 *            the new phone authentication
	 */
	public void setPhoneAuthentication(
			RecipientPhoneAuthentication phoneAuthentication) {
		this.phoneAuthentication = phoneAuthentication;
	}

	/**
	 * Gets the recipient attachments.
	 * 
	 * @return the recipient attachments
	 */
	public List<Attachment> getRecipientAttachment() {
		return recipientAttachment;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the recipient attachments. It would be possible to send attachments
	 * with recipients. This complex element contains data in base64Binary. It
	 * also contains label and type for the attachment
	 * 
	 * 
	 * @param recipientAttachments
	 *            the new recipient attachments
	 */
	public void setRecipientAttachment(List<Attachment> recipientAttachment) {
		this.recipientAttachment = recipientAttachment;
	}

	/**
	 * Gets the recipient captive info.
	 * 
	 * @return the recipient captive info
	 */
	public CaptiveInfo getRecipientCaptiveInfo() {
		return recipientCaptiveInfo;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the recipient captive info. This specifies if the recipient is
	 * embedded or remote. If the ClientUserId is not null then the recipient is
	 * embedded.
	 * 
	 * 
	 * @param recipientCaptiveInfo
	 *            the new recipient captive info
	 */
	public void setRecipientCaptiveInfo(CaptiveInfo recipientCaptiveInfo) {
		this.recipientCaptiveInfo = recipientCaptiveInfo;
	}

	/**
	 * Gets the require id lookup.
	 * 
	 * @return the require id lookup
	 */
	public Boolean getRequireIdLookup() {
		return requireIdLookup;
	}

	/**
	 * <b>Optional</b><br/>
	 * If set to true then recipients will require to answer questionnaire to
	 * validate their identity
	 * 
	 * 
	 * @param requireIdLookup
	 *            the new require id lookup
	 */
	public void setRequireIdLookup(Boolean requireIdLookup) {
		this.requireIdLookup = requireIdLookup;
	}

	/**
	 * Gets the role name.
	 * 
	 * @return the role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <b>Optional</b><br/>
	 * This is the role name associated with the recipient. - It is required
	 * when working with template recipients.
	 * 
	 * 
	 * @param roleName
	 *            the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Gets the routing order.
	 * 
	 * @return the routing order
	 */
	public String getRoutingOrder() {
		return routingOrder;
	}

	/**
	 * Sets the routing order of the recipient in the envelope
	 * 
	 * 
	 * @param routingOrder
	 *            the new routing order
	 */
	public void setRoutingOrder(String routingOrder) {
		this.routingOrder = routingOrder;
	}

	/**
	 * Gets the social authentications.
	 * 
	 * @return the social authentications
	 */
	public Boolean getSocialAuthentications() {
		return socialAuthentications;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the social authentications. Lists the social ID type that can be
	 * used for recipient authentication.
	 * 
	 * 
	 * @param socialAuthentications
	 *            the new social authentications
	 */
	public void setSocialAuthentications(Boolean socialAuthentications) {
		this.socialAuthentications = socialAuthentications;
	}

	/**
	 * Gets the template access code required.
	 * 
	 * @return the template access code required
	 */
	public Boolean getTemplateAccessCodeRequired() {
		return templateAccessCodeRequired;
	}

	/**
	 * <b>Optional</b><br/>
	 * Used only when working with template recipients. If true and
	 * TemplateLocked = true, the sender must enter an access code.
	 * 
	 * 
	 * @param templateAccessCodeRequired
	 *            the new template access code required
	 */
	public void setTemplateAccessCodeRequired(Boolean templateAccessCodeRequired) {
		this.templateAccessCodeRequired = templateAccessCodeRequired;
	}

	/**
	 * Gets the template locked.
	 * 
	 * @return the template locked
	 */
	public Boolean getTemplateLocked() {
		return templateLocked;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the template locked. Used only when working with template
	 * recipients. If true, the sender cannot change any attributes of the
	 * recipient.
	 * 
	 * 
	 * @param templateLocked
	 *            the new template locked
	 */
	public void setTemplateLocked(Boolean templateLocked) {
		this.templateLocked = templateLocked;
	}

	/**
	 * Gets the template required.
	 * 
	 * @return the template required
	 */
	public Boolean getTemplateRequired() {
		return templateRequired;
	}

	/**
	 * <b>Optional</b><br/>
	 * Used only when working with template recipients. If true, the sender may
	 * not remove the recipient.
	 * 
	 * 
	 * @param templateRequired
	 *            the new template required
	 */
	public void setTemplateRequired(Boolean templateRequired) {
		this.templateRequired = templateRequired;
	}

}
