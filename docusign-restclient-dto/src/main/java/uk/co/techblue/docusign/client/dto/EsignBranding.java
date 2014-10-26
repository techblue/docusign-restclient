package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class EsignBranding.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EsignBranding extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1754432120650147035L;
    
    /** The default recipient brand id. */
    @JsonProperty(value="recipientBrandIdDefault")
    private String defaultRecipientBrandId;
    
    /** The default sender brand id. */
    @JsonProperty(value="senderBrandIdDefault")
    private String defaultSenderBrandId;

    /** The brand infos. */
    @JsonProperty(value="brands")
    private List<BrandInfo> brandInfos;

    /**
     * Gets the brand infos.
     * 
     * @return the brand infos
     */
    public List<BrandInfo> getBrandInfos() {
        return brandInfos;
    }

    /**
     * Sets the brand infos.
     * 
     * @param brandInfos the new brand infos
     */
    public void setBrandInfos(List<BrandInfo> brandInfos) {
        this.brandInfos = brandInfos;
    }

    /**
     * Gets the default recipient brand id.
     *
     * @return the default recipient brand id
     */
    public String getDefaultRecipientBrandId() {
        return defaultRecipientBrandId;
    }

    /**
     * Sets the default recipient brand id.
     *
     * @param defaultRecipientBrandId the new default recipient brand id
     */
    public void setDefaultRecipientBrandId(String defaultRecipientBrandId) {
        this.defaultRecipientBrandId = defaultRecipientBrandId;
    }

    /**
     * Gets the default sender brand id.
     *
     * @return the default sender brand id
     */
    public String getDefaultSenderBrandId() {
        return defaultSenderBrandId;
    }

    /**
     * Sets the default sender brand id.
     *
     * @param defaultSenderBrandId the new default sender brand id
     */
    public void setDefaultSenderBrandId(String defaultSenderBrandId) {
        this.defaultSenderBrandId = defaultSenderBrandId;
    }

}
