package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class BlindCopyEmailAddress.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class BlindCopyEmailAddress extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7568024643872377290L;

    /** The email. */
    @JsonProperty
    private String email;

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}