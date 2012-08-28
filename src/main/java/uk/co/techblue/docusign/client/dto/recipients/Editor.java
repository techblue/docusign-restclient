package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * This recipient has the same management and access rights for the envelope as
 * the sender and can make changes to the envelope as if they were using the
 * Advanced Correct feature. This recipient can add name and email information,
 * add or change the routing order and set authentication options for the
 * remaining recipients. Additionally, this recipient can edit signature/initial
 * tabs and data fields for the remaining recipients. The recipient must have a
 * DocuSign account to be an editor. This recipient type can only be used if
 * enabled for your account.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class Editor extends Recipient {

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
