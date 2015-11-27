package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Class CustomFields.
 *
 * @author jnovotny
 * @version $Id$
 */
public class CustomFields extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3714392529457783679L;

    /** The custom fields. */
    @JsonProperty
    private List<ListCustomField> listCustomFields;

    /** The text custom fields. */
    @JsonProperty
    private List<TextCustomField> textCustomFields;

    /**
     * Gets the list custom fields.
     *
     * @return the listCustomFields
     */
    public List<ListCustomField> getListCustomFields() {
        return listCustomFields;
    }

    /**
     * Sets the list custom fields.
     *
     * @param listCustomFields the listCustomFields to set
     */
    public void setListCustomFields(final List<ListCustomField> listCustomFields) {
        this.listCustomFields = listCustomFields;
    }

    /**
     * Gets the text custom fields.
     *
     * @return the textCustomFields
     */
    public List<TextCustomField> getTextCustomFields() {
        return textCustomFields;
    }

    /**
     * Sets the text custom fields.
     *
     * @param textCustomFields the textCustomFields to set
     */
    public void setTextCustomFields(final List<TextCustomField> textCustomFields) {
        this.textCustomFields = textCustomFields;
    }

}
