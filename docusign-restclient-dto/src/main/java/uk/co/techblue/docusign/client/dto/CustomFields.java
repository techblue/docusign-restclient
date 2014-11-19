package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * @author jnovotny
 * @version $Id$
 */
public class CustomFields extends BaseDto {

    /** The custom fields. */
    @JsonProperty
    private List<CustomField> customFields;

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }
}
