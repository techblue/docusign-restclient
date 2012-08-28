package uk.co.techblue.docusign.client.services;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Service;
import uk.co.techblue.docusign.client.dto.user.ChangePasswordRequest;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.exception.LoginException;
import uk.co.techblue.docusign.client.exception.UserAccountException;
import uk.co.techblue.docusign.client.resources.LoginResource;

/**
 * The service class containing methods to communicate with DocuSign login
 * resource.
 * 
 * @author Ajay
 */
public class LoginService extends Service<LoginResource> {

	/**
	 * Instantiates a new login service.
	 * 
	 * @param serverUri
	 *            the server uri
	 */
	public LoginService(final String serverUri) {
		super(serverUri);
	}

	/**
	 * Gets the login information.
	 * 
	 * @param credentials
	 *            the credentials
	 * @return the login information
	 * @throws LoginException
	 *             the login exception
	 */
	public ClientInfo getLoginInformation(DocuSignCredentials credentials)
			throws LoginException {
		ClientResponse<ClientInfo> clientResponse = resourceProxy
				.getLoginInformation(credentials);
		return parseEntityFromResponse(clientResponse, LoginException.class);
	}

	/**
	 * Change password.
	 * 
	 * @param credentials
	 *            the credentials
	 * @param changePasswordRequest
	 *            the change password request
	 * @throws UserAccountException
	 */
	public void changePassword(DocuSignCredentials credentials,
			ChangePasswordRequest changePasswordRequest)
			throws UserAccountException {
		ClientResponse<?> clientResponse = resourceProxy.changePassword(
				credentials, changePasswordRequest);
		validateResponseSuccess(clientResponse, UserAccountException.class);
	}

	@Override
	protected Class<LoginResource> getResourceClass() {
		return LoginResource.class;
	}
}
