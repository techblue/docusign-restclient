/*******************************************************************************
 * Copyright 2014, Techblue. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto.account;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class BrandDeleteRequest.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class BrandDeleteRequest extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7183004048231476762L;

    /** The brands. */
    @JsonProperty
    private List<Brand> brands;

    /**
     * Gets the brands.
     * 
     * @return the brands
     */
    public List<Brand> getBrands() {
        return brands;
    }

    /**
     * Sets the brands.
     * 
     * @param brands the new brands
     */
    public void setBrands(final List<Brand> brands) {
        this.brands = brands;
    }

}
