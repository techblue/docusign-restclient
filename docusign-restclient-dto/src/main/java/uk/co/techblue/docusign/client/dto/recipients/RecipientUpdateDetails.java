package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

public class RecipientUpdateDetails extends BaseDto {

    private static final long serialVersionUID = 3932739876992196019L;

    @JsonProperty
    private String email;

    @JsonProperty
    private String name;

    @JsonProperty
    private int recipientId;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the recipientId
     */
    public int getRecipientId() {
        return recipientId;
    }

    /**
     * @param recipientId the recipientId to set
     */
    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

}
