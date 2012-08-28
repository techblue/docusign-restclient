package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface TemplateResource extends Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("templates")
    public ClientResponse<TemplateInfo> retrieveTemplates(
            @HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials);
}
