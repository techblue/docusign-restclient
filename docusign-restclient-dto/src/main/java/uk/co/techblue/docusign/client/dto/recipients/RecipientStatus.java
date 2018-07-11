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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.dto.DocumentTabCollection;
import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

/**
 * The Class RecipientStatus.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class RecipientStatus extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8882916248510163970L;

	/** The delivered date time. */
	@JsonProperty
	private Date deliveredDateTime;

	/** The recipient id. */
	@JsonProperty
	private String recipientId;

	/** The require id lookup. */
	@JsonProperty
	private boolean requireIdLookup;

	/** The routing order. */
	@JsonProperty
	private int routingOrder;

	/** The signed date time. */
	@JsonProperty
	private Date signedDateTime;

	/** The status. */
	@JsonProperty
	private Status status;

	/** The email. */
	@JsonProperty
	private String email;

	/** The name. */
	@JsonProperty
	private String name;

	/** The note. */
	@JsonProperty
	private String note;

	/** The role name. */
	@JsonProperty
	private String roleName;

	/** The tabs. */
	@JsonProperty
	private DocumentTabCollection tabs;

	
	/** The declined reason. */
	@JsonProperty
	private String declinedReason;
	
	
	/** The declined date time. */
	@JsonProperty
	private Date declinedDateTime;
	
	/**
	 * Gets the delivered date time.
	 * 
	 * @return the delivered date time
	 */
	public Date getDeliveredDateTime() {
		return deliveredDateTime;
	}

	/**
	 * Sets the delivered date time.
	 * 
	 * @param deliveredDateTime
	 *            the new delivered date time
	 */
	@JsonDeserialize(using = ISO8601DateDeserializer.class)
	public void setDeliveredDateTime(Date deliveredDateTime) {
		this.deliveredDateTime = deliveredDateTime;
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
	 * Sets the recipient id.
	 * 
	 * @param recipientId
	 *            the new recipient id
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	/**
	 * Gets the require id lookup.
	 * 
	 * @return the require id lookup
	 */
	public boolean getRequireIdLookup() {
		return requireIdLookup;
	}

	/**
	 * Sets the require id lookup.
	 * 
	 * @param requireIdLookup
	 *            the new require id lookup
	 */
	public void setRequireIdLookup(boolean requireIdLookup) {
		this.requireIdLookup = requireIdLookup;
	}

	/**
	 * Gets the routing order.
	 * 
	 * @return the routing order
	 */
	public int getRoutingOrder() {
		return routingOrder;
	}

	/**
	 * Sets the routing order.
	 * 
	 * @param routingOrder
	 *            the new routing order
	 */
	public void setRoutingOrder(int routingOrder) {
		this.routingOrder = routingOrder;
	}

	/**
	 * Gets the signed date time.
	 * 
	 * @return the signed date time
	 */
	public Date getSignedDateTime() {
		return signedDateTime;
	}

	/**
	 * Sets the signed date time.
	 * 
	 * @param signedDateTime
	 *            the new signed date time
	 */
	@JsonDeserialize(using = ISO8601DateDeserializer.class)
	public void setSignedDateTime(Date signedDateTime) {
		this.signedDateTime = signedDateTime;
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
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 * 
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * Sets the note.
	 * 
	 * @param note
	 *            the new note
	 */
	public void setNote(String note) {
		this.note = note;
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
	 * Sets the role name.
	 * 
	 * @param roleName
	 *            the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Gets the tabs.
	 * 
	 * @return the tabs
	 */
	public DocumentTabCollection getTabs() {
		return tabs;
	}

	/**
	 * Sets the tabs.
	 * 
	 * @param tabs
	 *            the new tabs
	 */
	public void setTabs(DocumentTabCollection tabs) {
		this.tabs = tabs;
	}

	/**
	 * Gets the declined reason.
	 *
	 * @return the declined reason
	 */
	public String getDeclinedReason() {
		return declinedReason;
	}

	/**
	 * Sets the declined reason.
	 *
	 * @param declinedReason the new declined reason
	 */
	public void setDeclinedReason(String declinedReason) {
		this.declinedReason = declinedReason;
	}

	/**
	 * Gets the declined date time.
	 *
	 * @return the declined date time
	 */
	public Date getDeclinedDateTime() {
		return declinedDateTime;
	}

	/**
	 * Sets the declined date time.
	 *
	 * @param declinedDateTime the new declined date time
	 */
	@JsonDeserialize(using = ISO8601DateDeserializer.class)
	public void setDeclinedDateTime(Date declinedDateTime) {
		this.declinedDateTime = declinedDateTime;
	}
	
	
	
}
