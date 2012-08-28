package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class RecipientViewRequest.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class RecipientViewRequest extends BaseDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6184218644834156231L;

	/** The authentication method. */
	@JsonProperty("authenticationMethod")
	private String authenticationMethod;

	/** The email. */
	@JsonProperty("email")
	private String email;

	/** The return url. */
	@JsonProperty("returnUrl")
	private String returnUrl;

	/** The user name. */
	@JsonProperty("userName")
	private String userName;

	/**
	 * Gets the authentication method.
	 * 
	 * @return the authentication method
	 */
	public String getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * Sets the authentication method. The convention used to authenticate the
	 * end-user. For example email.
	 * 
	 * 
	 * @param authenticationMethod
	 *            the new authentication method
	 */
	public void setAuthenticationMethod(String authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
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
	 * Sets the email. Specifies the Email of the recipient.
	 * 
	 * 
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the return url.
	 * 
	 * @return the return url
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * Sets the return url. The URL the recipient is directed to on certain
	 * events. DocuSign sends returns to the URL and includes an event parameter
	 * that can be used to redirect the recipient to another location. The
	 * possible event parameters returned are:
	 * <ul>
	 * <li>cancel (recipient cancels signing)</li>
	 * <li>decline (recipient declines signing)</li>
	 * <li>exception (exception occurs)</li>
	 * <li>fax_pending (recipient has fax pending)</li>
	 * <li>id_check_faild (recipient failed an ID check)</li>
	 * <li>session_timeout (session times out)</li>
	 * <li>signing_complete (recipient completes signing)</li>
	 * <li>ttl_complete (the TTL expires)</li>
	 * <li>viewing_complete (recipient completes viewing the envelope)</li>
	 * </ul>
	 * 
	 * @param returnUrl
	 *            the return url
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * Gets the user name.
	 * 
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name. Specifies the username of the recipient.
	 * 
	 * @param userName
	 *            the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
