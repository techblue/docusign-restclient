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
package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.dto.recipients.RecipientCollection;

/**
 * The Class DocumentSignatureRequest.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class DocumentSignatureRequest extends SignatureRequest {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /** The recipients. */
    @JsonProperty("recipients")
    private RecipientCollection recipients;

    /** The documents. */
    @JsonProperty("documents")
    private List<Document> documents;
    
    /** The custom fields. */
    @JsonProperty
    private List<CustomField> customFields;

    /**
     * Gets the documents.
     * 
     * @return the documents
     */
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * Sets the documents.
     * 
     * @param documents the new documents
     */
    public void setDocuments(final List<Document> documents) {
        this.documents = documents;
    }

    /**
     * Gets the recipients.
     * 
     * @return the recipients
     */
    public RecipientCollection getRecipients() {
        return recipients;
    }

    /**
     * Sets the recipients.
     * 
     * @param recipients the new recipients
     */
    public void setRecipients(final RecipientCollection recipients) {
        this.recipients = recipients;
    }

    /**
     * Gets the custom fields.
     * 
     * @return the custom fields
     */
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    /**
     * <b>Optional</b><br/>
     * Allows the sender to send custom data about the recipient. This
     * information is returned in the envelope status but otherwise not used by
     * DocuSign.
     * 
     * 
     * @param customFields
     *            the new custom fields
     */
    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }
    
}
