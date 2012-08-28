package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.CorrectionViewRequest;
import uk.co.techblue.docusign.client.dto.UrlResponse;
import uk.co.techblue.docusign.client.dto.recipients.RecipientViewRequest;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface ConsoleViewResource extends Resource{

	@POST
	@Path("envelopes/{envelopeId}/views/sender")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes()
	public ClientResponse<UrlResponse> getEnvelopeSenderView(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
			@PathParam("envelopeId") String envelopeId);

	@POST
	@Path("envelopes/{envelopeId}/views/recipient")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ClientResponse<UrlResponse> getEnvelopeRecipientView(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
			@PathParam("envelopeId") String envelopeId,
			RecipientViewRequest recipientViewRequest);

	@POST
	@Path("envelopes/{envelopeId}/views/correct")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ClientResponse<UrlResponse> getEnvelopeCorrectionView(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
			@PathParam("envelopeId") String envelopeId,
			CorrectionViewRequest correctionViewRequest);

	@GET
	@Path("views/authentication")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes()
	public ClientResponse<UrlResponse> getAuthenticationView(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials);

}
