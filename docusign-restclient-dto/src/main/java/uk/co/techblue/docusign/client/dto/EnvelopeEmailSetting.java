package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class EnvelopeEmailSetting.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeEmailSetting extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4018511245527085865L;

    /** The reply email address override. */
    @JsonProperty(value = "replyEmailAddressOverride")
    private String replyEmailAddressOverride;

    /** The reply email name override. */
    @JsonProperty(value = "replyEmailNameOverride")
    private String replyEmailNameOverride;

    /** The bcc email addresses. */
    @JsonProperty(value = "bccEmailAddresses")
    private List<BlindCopyEmailAddress> bccEmailAddresses;

    /**
     * Gets the reply email address override.
     * 
     * @return the reply email address override
     */
    public String getReplyEmailAddressOverride() {
        return replyEmailAddressOverride;
    }

    /**
     * Sets the reply email address override.
     * 
     * @param replyEmailAddressOverride the new reply email address override
     */
    public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
        this.replyEmailAddressOverride = replyEmailAddressOverride;
    }

    /**
     * Gets the reply email name override.
     * 
     * @return the reply email name override
     */
    public String getReplyEmailNameOverride() {
        return replyEmailNameOverride;
    }

    /**
     * Sets the reply email name override.
     * 
     * @param replyEmailNameOverride the new reply email name override
     */
    public void setReplyEmailNameOverride(String replyEmailNameOverride) {
        this.replyEmailNameOverride = replyEmailNameOverride;
    }

    /**
     * Gets the bcc email addresses.
     * 
     * @return the bcc email addresses
     */
    public List<BlindCopyEmailAddress> getBccEmailAddresses() {
        return bccEmailAddresses;
    }

    /**
     * Sets the bcc email addresses.
     * 
     * @param bccEmailAddresses the new bcc email addresses
     */
    public void setBccEmailAddresses(List<BlindCopyEmailAddress> bccEmailAddresses) {
        this.bccEmailAddresses = bccEmailAddresses;
    }

}