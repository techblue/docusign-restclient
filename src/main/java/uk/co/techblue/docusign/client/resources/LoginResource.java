package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.UrlResponse;
import uk.co.techblue.docusign.client.dto.user.ChangePasswordRequest;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface LoginResource extends Resource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("login_information")
	ClientResponse<ClientInfo> getLoginInformation(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials);

	@GET
	@Path("views/authentication")
	@Produces(MediaType.APPLICATION_JSON)
	public ClientResponse<UrlResponse> getAuthenticationView(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials);

	@PUT
	@Path("login_information/password")
	@Consumes(MediaType.APPLICATION_JSON)
	public ClientResponse<Object> changePassword(
			@HeaderParam(DocuSignConstants.HEADER_PARAM_AUTHENTICATION) DocuSignCredentials credentials,
			ChangePasswordRequest changePasswordRequest);

}
