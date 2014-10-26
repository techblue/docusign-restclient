package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.EsignBranding;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Interface BrandResource.
 */
@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface BrandResource extends Resource{
    
    /**
     * Gets the esign brandings.
     *
     * @return the esign brandings
     */
    @GET
    @Path("/brands")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<EsignBranding> getEsignBrandings();
}
