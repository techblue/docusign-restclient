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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This recipient can add name and email information for recipients that appear
 * after the recipient in routing order. This recipient type can only be used if
 * enabled for your account.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class Agent extends Recipient {

	/** The email. */
	@JsonProperty
	private String email;

	/** The name. */
	@JsonProperty
	private String name;

	/** Can edit recipient emails. */
	@JsonProperty
	private Boolean canEditRecipientEmails;

	/** Can edit recipient names. */
	@JsonProperty
	private Boolean canEditRecipientNames;

	/**
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the recipient. Notification will be sent to this email
	 * id
	 * 
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
	 * Sets the full legal name of the recipient.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the can edit recipient emails.
	 * 
	 * @return the can edit recipient emails
	 */
	public Boolean getCanEditRecipientEmails() {
		return canEditRecipientEmails;
	}

	/**
	 * <b>Optional</b><br/>
	 * Only used with recipient types Agents and Editors. If true, the Agent or
	 * Editor Recipient associated with this Recipient can change the
	 * Recipient’s pre-populated Email address. This element is only active if
	 * enabled for the account.
	 * 
	 * 
	 * @param canEditRecipientEmails
	 *            the new can edit recipient emails
	 */
	public void setCanEditRecipientEmails(Boolean canEditRecipientEmails) {
		this.canEditRecipientEmails = canEditRecipientEmails;
	}

	/**
	 * Gets the can edit recipient names.
	 * 
	 * @return the can edit recipient names
	 */
	public Boolean getCanEditRecipientNames() {
		return canEditRecipientNames;
	}

	/**
	 * <b>Optional</b><br/>
	 * Only used with recipient types Agents and Editors. If true, the Agent or
	 * Editor Recipient associated with this recipient can change the
	 * recipient’s pre-populated name (UserName). This element is only active if
	 * enabled for the account.
	 * 
	 * 
	 * @param canEditRecipientNames
	 *            the new can edit recipient names
	 */
	public void setCanEditRecipientNames(Boolean canEditRecipientNames) {
		this.canEditRecipientNames = canEditRecipientNames;
	}

}
