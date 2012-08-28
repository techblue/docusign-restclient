package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Use this action if the recipient must receive the completed documents for the
 * envelope to be completed, but the recipient does not need to sign, initial,
 * date or add information to any of the documents. This recipient type can only
 * be used if enabled for your account.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CertifiedDelivery extends Recipient {
	/** The email. */
	@JsonProperty
	private String email;

	/** The name. */
	@JsonProperty
	private String name;

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
}
