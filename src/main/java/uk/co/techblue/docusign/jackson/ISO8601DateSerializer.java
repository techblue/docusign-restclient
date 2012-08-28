package uk.co.techblue.docusign.jackson;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.jboss.resteasy.logging.Logger;

import uk.co.techblue.docusign.client.utils.DocuSignUtils;

public class ISO8601DateSerializer extends JsonSerializer<Date> {
	private final static Logger logger = Logger
			.getLogger(ISO8601DateSerializer.class);

	@Override
	public void serialize(Date value, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		try {
			String dateString = DocuSignUtils.formatISO8601Date(value);
			jgen.writeString(dateString);
		} catch (ParseException pe) {
			logger.error(
					"Error occurred while formatting date to ISO8601 format",
					pe);
		}
	}

}
