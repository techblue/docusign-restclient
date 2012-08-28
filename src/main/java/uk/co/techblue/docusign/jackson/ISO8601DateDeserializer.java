package uk.co.techblue.docusign.jackson;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.jboss.resteasy.logging.Logger;

import uk.co.techblue.docusign.client.DocuSignClient;
import uk.co.techblue.docusign.client.utils.DocuSignUtils;

public class ISO8601DateDeserializer extends JsonDeserializer<Date> {
    private final static Logger logger = Logger.getLogger(DocuSignClient.class);

    @Override
    public Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException {
        String dateString = jsonparser.getText();
        try {
            return DocuSignUtils.parseISO8601Date(dateString);
        } catch (ParseException pe) {
            logger.error("Error occurred while parsing date '" + dateString + "'", pe);
        }
        return null;
    }
}
