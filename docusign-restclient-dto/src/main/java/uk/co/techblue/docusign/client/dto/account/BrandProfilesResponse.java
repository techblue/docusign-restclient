/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto.account;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class AccountBandingResponse.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class BrandProfilesResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6049906735972853153L;

    /** The brands. */
    @JsonProperty
    private List<BrandProfile> brands;

    /** The recipient brand id default. */
    @JsonProperty
    private String recipientBrandIdDefault;

    /** The sender brand id default. */
    @JsonProperty
    private String senderBrandIdDefault;

    /**
     * Gets the brands.
     * 
     * @return the brands
     */
    public List<BrandProfile> getBrands() {
        return brands;
    }

    /**
     * Sets the brands.
     * 
     * @param brands the new brands
     */
    public void setBrands(final List<BrandProfile> brands) {
        this.brands = brands;
    }

    /**
     * Gets the recipient brand id default.
     * 
     * @return the recipient brand id default
     */
    public String getRecipientBrandIdDefault() {
        return recipientBrandIdDefault;
    }

    /**
     * Sets the recipient brand id default.
     * 
     * @param recipientBrandIdDefault the new recipient brand id default
     */
    public void setRecipientBrandIdDefault(final String recipientBrandIdDefault) {
        this.recipientBrandIdDefault = recipientBrandIdDefault;
    }

    /**
     * Gets the sender brand id default.
     * 
     * @return the sender brand id default
     */
    public String getSenderBrandIdDefault() {
        return senderBrandIdDefault;
    }

    /**
     * Sets the sender brand id default.
     * 
     * @param senderBrandIdDefault the new sender brand id default
     */
    public void setSenderBrandIdDefault(final String senderBrandIdDefault) {
        this.senderBrandIdDefault = senderBrandIdDefault;
    }

}
