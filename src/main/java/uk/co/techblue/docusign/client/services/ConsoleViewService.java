package uk.co.techblue.docusign.client.services;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.BaseService;
import uk.co.techblue.docusign.client.dto.CorrectionViewRequest;
import uk.co.techblue.docusign.client.dto.UrlResponse;
import uk.co.techblue.docusign.client.dto.recipients.RecipientViewRequest;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.ConsoleViewException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.resources.ConsoleViewResource;

/**
 * The Class ConsoleViewService.
 */
public class ConsoleViewService extends BaseService<ConsoleViewResource> {

	/**
	 * Instantiates a new console view service.
	 * 
	 * @param serverUri
	 *            the server uri
	 * @param credentials
	 *            the credentials
	 * @throws ServiceInitException
	 *             the service init exception
	 */
	public ConsoleViewService(String serverUri, DocuSignCredentials credentials)
			throws ServiceInitException {
		super(serverUri, credentials);
	}

	/**
	 * Instantiates a new console view service.
	 * 
	 * @param credentials
	 *            the credentials
	 * @param loginAccount
	 *            the login account
	 * @throws ServiceInitException
	 *             the service init exception
	 */
	public ConsoleViewService(DocuSignCredentials credentials,
			LoginAccount loginAccount) throws ServiceInitException {
		super(loginAccount, credentials);
	}

	/**
	 * Gets the authentication view.
	 * 
	 * @return the envelope sender view
	 * @throws ConsoleViewException
	 *             the console view exception
	 */
	public UrlResponse getAuthenticationView() throws ConsoleViewException {
		ClientResponse<UrlResponse> clientResponse = resourceProxy
				.getAuthenticationView(credentials);
		return parseEntityFromResponse(clientResponse,
				ConsoleViewException.class);
	}

	/**
	 * Gets the envelope sender view.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the envelope sender view
	 * @throws ConsoleViewException
	 *             the console view exception
	 */
	public UrlResponse getEnvelopeSenderView(String envelopeId)
			throws ConsoleViewException {
		ClientResponse<UrlResponse> clientResponse = resourceProxy
				.getEnvelopeSenderView(credentials, envelopeId);
		return parseEntityFromResponse(clientResponse,
				ConsoleViewException.class);
	}

	/**
	 * Gets the envelope recipient view.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param recipientViewRequest
	 *            the recipient view request
	 * @return the envelope recipient view
	 * @throws ConsoleViewException
	 *             the console view exception
	 */
	public UrlResponse getEnvelopeRecipientView(String envelopeId,
			RecipientViewRequest recipientViewRequest)
			throws ConsoleViewException {
		ClientResponse<UrlResponse> clientResponse = resourceProxy
				.getEnvelopeRecipientView(credentials, envelopeId,
						recipientViewRequest);
		return parseEntityFromResponse(clientResponse,
				ConsoleViewException.class);
	}

	/**
	 * Gets the envelope correction view.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param correctionViewRequest
	 *            the correction view request
	 * @return the envelope correction view
	 * @throws ConsoleViewException
	 *             the console view exception
	 */
	public UrlResponse getEnvelopeCorrectionView(String envelopeId,
			CorrectionViewRequest correctionViewRequest)
			throws ConsoleViewException {
		ClientResponse<UrlResponse> clientResponse = resourceProxy
				.getEnvelopeCorrectionView(credentials, envelopeId,
						correctionViewRequest);
		return parseEntityFromResponse(clientResponse,
				ConsoleViewException.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uk.co.techblue.docusign.client.Service#getResourceClass()
	 */
	@Override
	protected Class<ConsoleViewResource> getResourceClass() {
		return ConsoleViewResource.class;
	}

}
