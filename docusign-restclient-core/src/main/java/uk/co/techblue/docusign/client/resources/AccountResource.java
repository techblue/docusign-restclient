/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
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
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.account.BrandDeleteRequest;
import uk.co.techblue.docusign.client.dto.account.BrandProfilesResponse;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

/**
 * The Interface AccountResource.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface AccountResource extends Resource {

    /**
     * Gets the brand profiles.
     * 
     * @return the account branding profiles
     */
    @GET
    @Path("brands")
    @Produces(MediaType.APPLICATION_JSON)
    public ClientResponse<BrandProfilesResponse> getBrandProfiles();

    /**
     * Delete branding profiles.
     * 
     * @param brandDeleteRequest the brand delete request
     * @return the client response
     */
    @DELETE
    @Path("brands")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ClientResponse<String> deleteBrandingProfiles(final BrandDeleteRequest brandDeleteRequest);
}
