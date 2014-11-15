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
package uk.co.techblue.docusign.client.services;

import org.apache.james.mime4j.field.FieldName;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.client.ClientResponse;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.providers.multipart.OutputPart;
import uk.co.techblue.docusign.client.BaseService;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentInfo;
import uk.co.techblue.docusign.client.dto.Envelope;
import uk.co.techblue.docusign.client.dto.PostedTemplate;
import uk.co.techblue.docusign.client.dto.Template;
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.exception.TemplateException;
import uk.co.techblue.docusign.client.resources.TemplateResource;
import uk.co.techblue.docusign.client.utils.DocuSignUtils;

import javax.activation.FileDataSource;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * The Class TemplateService.
 */
public class TemplateService extends BaseService<TemplateResource> {

    /**
     * Instantiates a new template service.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @throws ServiceInitException
     *             the service init exception
     */
    public TemplateService(String serverUri, DocuSignCredentials credentials) throws ServiceInitException {
        super(serverUri, credentials);
    }

    /**
     * Instantiates a new template service.
     * 
     * @param serverUri
     *            the server uri
     * @param credentials
     *            the credentials
     * @param loginAccount
     *            the login account
     * @throws ServiceInitException
     *             the service init exception
     */
    public TemplateService(String serverUri, DocuSignCredentials credentials, LoginAccount loginAccount)
            throws ServiceInitException {
        super(loginAccount, credentials);
    }

    /**
     * Retrieve templates.
     *
     * @return the template
     * @throws TemplateException
     *             the template exception
     */
    public TemplateInfo retrieveTemplates() throws TemplateException {
        ClientResponse<TemplateInfo> clientResponse = resourceProxy.retrieveTemplates();
        return parseEntityFromResponse(clientResponse, TemplateException.class);
    }

    public Template retrieveTemplate(String templateId) throws TemplateException {
        ClientResponse<Template> clientResponse = resourceProxy.retrieveTemplate(templateId);
        return parseEntityFromResponse(clientResponse, TemplateException.class);
    }

    public PostedTemplate postTemplate(Template template) throws TemplateException {
        //final MultipartFormDataOutput dataOut = generateMultipartFormDataOutput(documents);

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(template));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClientResponse<PostedTemplate> clientResponse = resourceProxy.postTemplate(template);
        return parseEntityFromResponse(clientResponse, TemplateException.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.Service#getResourceClass()
     */
    @Override
    protected Class<TemplateResource> getResourceClass() {
        return TemplateResource.class;
    }

    /**
     * Generates multipart form data output.
     *
     * @param documents the document
     * @return the multipart form data output
     */
    private MultipartFormDataOutput generateMultipartFormDataOutput(
        final List<Document> documents) {
        final MultipartFormDataOutput dataOut = new MultipartFormDataOutput();
        dataOut.addFormData("request-type", "template",
            MediaType.APPLICATION_JSON_TYPE);
        dataOut.addFormData("envelope_definition",
            documents, MediaType.APPLICATION_JSON_TYPE);
        // metadataPart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
        // "form-data");
        for (final Document document : documents) {
            final FileDataSource dataSource = new FileDataSource(document.getPath());
            final OutputPart filePart = dataOut.addFormData(document.getName(),
                dataSource, MediaType.valueOf(dataSource.getContentType()));
            filePart.getHeaders().putSingle(FieldName.CONTENT_DISPOSITION,
                DocuSignUtils.getContentDispositionHeader(document));
        }
        return dataOut;
    }

}
