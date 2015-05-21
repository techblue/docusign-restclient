package uk.co.techblue.docusign.client.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.activation.FileDataSource;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.james.mime4j.field.FieldName;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;
import org.jboss.resteasy.plugins.providers.multipart.OutputPart;
import org.junit.Assert;
import org.junit.Test;

import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentSignatureRequest;

public class DocuSignUtilsTest {

    private static final String DOC_NAME = "doc1.txt";
    private static final String DOC_PATH = File.separator + DOC_NAME;
    private static final String DOC_ID = "test-id";

    @Test
    public void testGenerateMultipartFormDataOutput() {
        Document doc = new Document();
        doc.setName(DOC_NAME);
        doc.setPath(DOC_PATH);
        doc.setDocumentId(DOC_ID);

        List<Document> documents = new ArrayList<Document>();
        documents.add(doc);

        DocumentSignatureRequest request = new DocumentSignatureRequest();
        request.setDocuments(documents);

        MultipartFormDataOutput output = DocuSignUtils.generateMultipartFormDataOutput(request);
        Assert.assertNotNull(output);

        Map<String, OutputPart> formData = output.getFormData();
        Assert.assertNotNull(formData);

        OutputPart envDef = formData.get(DocuSignUtils.ENVELOPE_DEFINITION);
        Assert.assertNotNull(envDef);
        Assert.assertEquals(request, envDef.getEntity());
        Assert.assertEquals(MediaType.APPLICATION_JSON_TYPE, envDef.getMediaType());

        OutputPart doc1 = formData.get("doc1.txt");
        Assert.assertNotNull(doc1);
        MultivaluedMap<String, Object> headers = doc1.getHeaders();
        Assert.assertNotNull(headers);
        List<Object> contentDisposition = headers.get(FieldName.CONTENT_DISPOSITION);
        Assert.assertNotNull(contentDisposition);
        Assert.assertEquals("file; filename=\"" + DOC_NAME + "\"; documentId=" + DOC_ID + "", contentDisposition.get(0));

        FileDataSource file1 = (FileDataSource) doc1.getEntity();
        Assert.assertNotNull(file1);
        Assert.assertEquals(DOC_PATH, file1.getFile().getPath());
    }

    @Test
    public void testGetContentDispositionHeader() {
        Document document = new Document();
        document.setName("Cod");
        document.setDocumentId("one");
        String actual = DocuSignUtils.getContentDispositionHeader(document);
        Assert.assertEquals("file; filename=\"Cod\"; documentId=one", actual);
    }

}
