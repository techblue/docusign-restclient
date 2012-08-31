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
