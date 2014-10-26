package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The Class BrandInfo.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class BrandProfile extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3881131715091661108L;

    /** The brand id. */
    @JsonProperty
    private String brandId;

    /** The brand name. */
    @JsonProperty
    private String brandName;

    /** The brand company. */
    @JsonProperty
    private String brandCompany;

    /** The error response. */
    @JsonProperty(value="errorDetails")
    private ErrorResponse errorResponse;

    /**
     * Gets the brand id.
     * 
     * @return the brand id
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the brand id.
     * 
     * @param brandId the new brand id
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Gets the brand name.
     * 
     * @return the brand name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the brand name.
     * 
     * @param brandName the new brand name
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Gets the error response.
     * 
     * @return the error response
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the error response.
     * 
     * @param errorResponse the new error response
     */
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    /**
     * Gets the brand company.
     * 
     * @return the brand company
     */
    public String getBrandCompany() {
        return brandCompany;
    }

    /**
     * Sets the brand company.
     * 
     * @param brandCompany the new brand company
     */
    public void setBrandCompany(String brandCompany) {
        this.brandCompany = brandCompany;
    }

}
