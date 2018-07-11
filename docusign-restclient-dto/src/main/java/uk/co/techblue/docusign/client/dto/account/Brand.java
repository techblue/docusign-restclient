/*******************************************************************************
 * Copyright 2014, Techblue. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class Brand.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class Brand extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2434241719811096047L;

    /** The brand id. */
    @JsonProperty
    private String brandId;

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
    public void setBrandId(final String brandId) {
        this.brandId = brandId;
    }

}
