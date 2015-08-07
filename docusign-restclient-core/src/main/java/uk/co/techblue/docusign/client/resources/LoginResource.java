/*******************************************************************************
 * Copyright 2015 Technology Blueprint Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.Oauth2TokenRequest;
import uk.co.techblue.docusign.client.dto.Oauth2TokenResponse;
import uk.co.techblue.docusign.client.dto.UrlResponse;
import uk.co.techblue.docusign.client.dto.user.ChangePasswordRequest;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Interface LoginResource.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface LoginResource extends Resource {

    /**
     * Gets the login information.
     *
     * @return the login information
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("login_information")
    ClientResponse<ClientInfo> getLoginInformation();

    /**
     * Gets the authentication view.
     *
     * @return the authentication view
     */
    @GET
    @Path("views/authentication")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<UrlResponse> getAuthenticationView();

    /**
     * Gets the o auth2 token.
     *
     * @return the o auth2 token
     */
    @POST
    @Path("oauth2/token")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<Oauth2TokenResponse> getOAuth2Token(@Form final Oauth2TokenRequest oauth2TokenRequest);

    /**
     * Change password.
     *
     * @param changePasswordRequest the change password request
     * @return the client response
     */
    @PUT
    @Path("login_information/password")
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<Object> changePassword(
        ChangePasswordRequest changePasswordRequest);

}
