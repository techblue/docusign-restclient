package uk.co.techblue.docusign.client.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.activation.FileDataSource;
import javax.ws.rs.core.MediaType;

import org.apache.james.mime4j.field.FieldName;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.providers.multipart.OutputPart;

import uk.co.techblue.docusign.client.BaseService;
import uk.co.techblue.docusign.client.dto.CustomField;
import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentFile;
import uk.co.techblue.docusign.client.dto.DocumentInfo;
import uk.co.techblue.docusign.client.dto.Envelope;
import uk.co.techblue.docusign.client.dto.EnvelopeDetailInfo;
import uk.co.techblue.docusign.client.dto.EnvelopeDocumentInfo;
import uk.co.techblue.docusign.client.dto.EnvelopeInfo;
import uk.co.techblue.docusign.client.dto.EnvelopeNotificationInfo;
import uk.co.techblue.docusign.client.dto.EnvelopeStatusQueryForm;
import uk.co.techblue.docusign.client.dto.EnvelopeStatusResponse;
import uk.co.techblue.docusign.client.dto.StatusChangeRequest;
import uk.co.techblue.docusign.client.dto.recipients.RecipientStatusCollection;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.client.exception.EnvelopeException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.exception.SignatureRequestException;
import uk.co.techblue.docusign.client.resources.EnvelopeResource;
import uk.co.techblue.docusign.client.utils.DocuSignUtils;

/**
 * The Class Envelope Service.
 */
public class EnvelopeService extends BaseService<EnvelopeResource> {

	/**
	 * Instantiates a new envelope service.
	 * 
	 * @param serverUri
	 *            the server uri
	 * @param credentials
	 *            the credentials
	 * @throws ServiceInitException
	 *             the service init exception
	 */
	public EnvelopeService(String serverUri, DocuSignCredentials credentials)
			throws ServiceInitException {
		super(serverUri, credentials);
	}

	/**
	 * Instantiates a new envelope service.
	 * 
	 * @param credentials
	 *            the credentials
	 * @param loginAccount
	 *            the login account
	 * @throws ServiceInitException
	 *             the service init exception
	 */
	public EnvelopeService(DocuSignCredentials credentials,
			LoginAccount loginAccount) throws ServiceInitException {
		super(loginAccount, credentials);
	}

	/**
	 * Send from drafts.
	 * 
	 * @param credentials
	 *            the credentials
	 * @param accountId
	 *            the account id
	 * @param envelopeId
	 *            the envelope id
	 * @param statusChangeReason
	 *            the status change reason
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public void sendFromDrafts(String envelopeId, String statusChangeReason)
			throws EnvelopeException {
		StatusChangeRequest statusChangeRequest = new StatusChangeRequest();
		statusChangeRequest.setStatus(Status.sent);
		statusChangeRequest.setStatusReason(statusChangeReason);
		ClientResponse<?> clientResponse = resourceProxy.changeStatus(
				credentials, envelopeId, statusChangeRequest);
		validateResponseSuccess(clientResponse, EnvelopeException.class);
	}

	/**
	 * Change envelope status.
	 * 
	 * @param credentials
	 *            the credentials
	 * @param accountId
	 *            the account id
	 * @param envelopeId
	 *            the envelope id
	 * @param statusChangeRequest
	 *            the status change request
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public void changeStatus(String envelopeId,
			StatusChangeRequest statusChangeRequest) throws EnvelopeException {
		ClientResponse<?> clientResponse = resourceProxy.changeStatus(
				credentials, envelopeId, statusChangeRequest);
		validateResponseSuccess(clientResponse, EnvelopeException.class);
	}

	/**
	 * Adds a document to an existing envelope.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param document
	 *            the document
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public void addDocumentToDraftEnvelope(String envelopeId, Document document)
			throws EnvelopeException {
		FileDataSource fileDataSource = new FileDataSource(document.getPath());
		String contentDisposition = DocuSignUtils
				.getContentDispositionHeader(document);
		ClientResponse<String> clientResponse;
		clientResponse = resourceProxy.addDocumentToDraftEnvelope(credentials,
				contentDisposition, envelopeId, document.getDocumentId()
						.toString(), fileDataSource.getFile());
		validateResponseSuccess(clientResponse, EnvelopeException.class);
	}

	/**
	 * Gets the envelope.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the envelope
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public EnvelopeDetailInfo getEnvelope(String envelopeId) throws EnvelopeException {
		ClientResponse<EnvelopeDetailInfo> clientResponse = resourceProxy.getEnvelope(
				credentials, envelopeId);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}

	/**
	 * Save to drafts.
	 * 
	 * @param envelope
	 *            the envelope
	 * @return the string
	 * @throws SignatureRequestException
	 *             the signature request exception
	 */
	public String saveToDrafts(Envelope envelope)
			throws SignatureRequestException {
		MultipartFormDataOutput dataOut = generateMultipartFormDataOutput(envelope);
		ClientResponse<Map<String, String>> clientResponse = resourceProxy
				.saveToDrafts(credentials, dataOut);
		return parseEntityFromResponse(clientResponse,
				SignatureRequestException.class).get("envelopeId");
	}

	/**
	 * Generates multipart form data output.
	 * 
	 * @param envelope
	 *            the envelope
	 * @return the multipart form data output
	 */
	private MultipartFormDataOutput generateMultipartFormDataOutput(
			Envelope envelope) {
		MultipartFormDataOutput dataOut = new MultipartFormDataOutput();
		dataOut.addFormData("request-type", "Save envelope as draft",
				MediaType.APPLICATION_JSON_TYPE);
		@SuppressWarnings("unused")
		OutputPart metadataPart = dataOut.addFormData("envelope_definition",
				envelope, MediaType.APPLICATION_JSON_TYPE);
		// metadataPart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
		// "form-data");
		for (DocumentInfo document : envelope.getDocuments()) {
			FileDataSource dataSource = new FileDataSource(document.getPath());
			OutputPart filePart = dataOut.addFormData(document.getName(),
					dataSource, MediaType.valueOf(dataSource.getContentType()));
			filePart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
					DocuSignUtils.getContentDispositionHeader(document));
		}
		return dataOut;
	}

	/**
	 * Gets the envelope status changes.
	 * 
	 * @param statusQueryForm
	 *            the status query form
	 * @return the envelope status changes
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public EnvelopeStatusResponse getEnvelopeStatus(
			EnvelopeStatusQueryForm statusQueryForm) throws EnvelopeException {
		ClientResponse<EnvelopeStatusResponse> clientResponse = resourceProxy
				.getEnvelopeStatus(credentials, statusQueryForm);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}
	
	
	/**
	 * Gets the envelope status changes.
	 * 
	 * @param statusQueryForm
	 *            the status query form
	 * @return the envelope status changes
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public EnvelopeInfo getEnvelopeStatus(String envelopeId)
			throws EnvelopeException {
		List<String> envelopeIds = new ArrayList<String>();
		envelopeIds.add(envelopeId);
		EnvelopeStatusQueryForm statusQueryForm = new EnvelopeStatusQueryForm();
		statusQueryForm.setEnvelopeIds(envelopeIds);
		ClientResponse<EnvelopeStatusResponse> clientResponse = resourceProxy
				.getEnvelopeStatus(credentials, statusQueryForm);
		EnvelopeStatusResponse statusResponse = parseEntityFromResponse(
				clientResponse, EnvelopeException.class);
		if (statusResponse != null && statusResponse.getEnvelopes() != null
				&& statusResponse.getEnvelopes().size() > 0) {
			return statusResponse.getEnvelopes().get(0);
		}
		return null;
	}
	
	/**
	 * This retrieves a PDF containing the combined content of all documents and
	 * the certificate.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the certificate
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public DocumentFile getCertificate(String envelopeId)
			throws EnvelopeException {
		ClientResponse<DocumentFile> clientResponse = resourceProxy
				.getCertificate(credentials, envelopeId, null, null);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}
	
	/**
	 * This retrieves a PDF containing the combined content of all documents and
	 * the certificate.
	 * 
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param watermark
	 *            the watermark. If the account has the watermark feature
	 *            enabled and the envelope is not complete, the watermark for
	 *            the account is added to the PDF documents. This option can
	 *            remove the watermark.
	 * 
	 * @param certificate
	 *            the certificate. This option can remove the envelope signing
	 *            certificate from the download.
	 * 
	 * @return the certificate
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public DocumentFile getCertificate(String envelopeId, Boolean watermark,
			Boolean certificate) throws EnvelopeException {
		ClientResponse<DocumentFile> clientResponse = resourceProxy
				.getCertificate(credentials, envelopeId, watermark, certificate);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}

	/**
	 * Gets the documents combined.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the documents combined
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public DocumentFile getDocumentsCombined(String envelopeId)
			throws EnvelopeException {
		ClientResponse<DocumentFile> clientResponse = resourceProxy
				.getDocumentsCombined(credentials, envelopeId);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}

	/**
	 * Gets the documents info.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the documents info
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public EnvelopeDocumentInfo getDocumentsInfo(String envelopeId)
			throws EnvelopeException {
		ClientResponse<EnvelopeDocumentInfo> clientResponse = resourceProxy
				.getDocumentsInfo(credentials, envelopeId);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}

	/**
	 * Gets the document.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param documentId
	 *            the document id
	 * @return the document
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public DocumentFile getDocument(String envelopeId, String documentId)
			throws EnvelopeException {
		ClientResponse<DocumentFile> clientResponse = resourceProxy
				.getDocument(credentials, envelopeId, documentId);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}
	
	/**
	 * Gets information about the custom fields included in the envelope.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the custom fields
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public List<CustomField> getCustomFields(String envelopeId)
			throws EnvelopeException {
		ClientResponse<Map<String, List<CustomField>>> clientResponse = resourceProxy
				.getCustomFields(credentials, envelopeId);
		Map<String, List<CustomField>> customFieldResponse = parseEntityFromResponse(
				clientResponse, EnvelopeException.class);
		if (customFieldResponse != null) {
			return customFieldResponse.get("customFields");
		}
		return null;
	}
	
	/**
	 * Gets the the reminder and expiration information for the envelope.
	 * 
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the notification info
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public EnvelopeNotificationInfo getNotificationInfo(String envelopeId)
			throws EnvelopeException {
		ClientResponse<EnvelopeNotificationInfo> clientResponse = resourceProxy
				.getNotificationInfo(credentials, envelopeId);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}
	
	/**
	 * Gets the status for all recipients of a single envelope.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @return the recipient status
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public RecipientStatusCollection getRecipientStatus(String envelopeId)
			throws EnvelopeException {
		ClientResponse<RecipientStatusCollection> clientResponse = resourceProxy
				.getRecipientStatus(credentials, envelopeId, null, null);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}
	
	/**
	 * Gets the he status for all recipients of a single envelope.
	 * 
	 * @param envelopeId
	 *            the envelope id
	 * @param includeTabs
	 *            If set to true, the tabs associated with the recipient are
	 *            returned.
	 * @param includeExtended
	 *            If set to true, the extended properties are returned
	 * 
	 * @return the recipient status
	 * @throws EnvelopeException
	 *             the envelope exception
	 */
	public RecipientStatusCollection getRecipientStatus(String envelopeId,
			Boolean includeTabs, Boolean includeExtended)
			throws EnvelopeException {
		ClientResponse<RecipientStatusCollection> clientResponse = resourceProxy
				.getRecipientStatus(credentials, envelopeId, includeTabs,
						includeExtended);
		return parseEntityFromResponse(clientResponse, EnvelopeException.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * uk.co.techblue.docusign.client.services.BaseService#getResourceClass()
	 */
	@Override
	protected Class<EnvelopeResource> getResourceClass() {
		return EnvelopeResource.class;
	}
}
