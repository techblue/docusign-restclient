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
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.client.ClientResponse;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import uk.co.techblue.docusign.client.Resource;
import uk.co.techblue.docusign.client.dto.PostedTemplate;
import uk.co.techblue.docusign.client.dto.Template;
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.utils.DocuSignConstants;

@Path(DocuSignConstants.RESOURCE_CONTEXT_PATH)
public interface TemplateResource extends Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("templates")
    public ClientResponse<TemplateInfo> retrieveTemplates();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("templates")
    public ClientResponse<PostedTemplate> postTemplate(Template template);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("templates/{templateId}")
    public ClientResponse<Template> retrieveTemplate (
    		@PathParam("templateId") String templateId);
}
