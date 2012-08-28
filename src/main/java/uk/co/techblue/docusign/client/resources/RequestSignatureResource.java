package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.SignatureResponse;
import uk.co.techblue.docusign.client.dto.TemplateSignatureRequest;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface RequestSignatureResource extends Resource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("envelopes")
    @Consumes(MediaType.APPLICATION_JSON)
    ClientResponse<SignatureResponse> sendFromTemplate(
            @HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
            TemplateSignatureRequest signatureRequest);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("envelopes")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    ClientResponse<SignatureResponse> sendDocument(
            @HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
            MultipartFormDataOutput formDataOutput);

}
