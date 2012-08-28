package uk.co.techblue.docusign.resteasy;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.providers.multipart.OutputPart;

public class MultipartFormDataCustomOutput extends MultipartFormDataOutput {

    public OutputPart addFormData(String key, Object entity, MediaType mediaType) {
        return super.addFormData(key, entity, mediaType);
    }
}
