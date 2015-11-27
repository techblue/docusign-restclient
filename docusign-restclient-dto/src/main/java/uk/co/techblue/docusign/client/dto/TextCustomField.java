package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Class TextCustomField.
 */
public class TextCustomField extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6779255231434337221L;

    /** The name. */
    @JsonProperty("name")
    private String name;

    /** The value. */
    @JsonProperty("value")
    private String value;

    /** The required. */
    @JsonProperty("required")
    private String required;

    /** The show. */
    @JsonProperty("show")
    private Boolean show;

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the value to set
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * Gets the required.
     *
     * @return the required
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the required.
     *
     * @param required the required to set
     */
    public void setRequired(final String required) {
        this.required = required;
    }

    /**
     * Gets the show.
     *
     * @return the show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * Sets the show.
     *
     * @param show the show to set
     */
    public void setShow(final Boolean show) {
        this.show = show;
    }

}
