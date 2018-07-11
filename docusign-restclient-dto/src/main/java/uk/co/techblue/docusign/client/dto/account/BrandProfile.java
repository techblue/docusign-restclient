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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class BrandInfo.
 * 
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class BrandProfile extends Brand {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5497225665411881579L;

    /** The brand company. */
    @JsonProperty
    private String brandCompany;

    /** The brand name. */
    @JsonProperty
    private String brandName;

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
    public void setBrandCompany(final String brandCompany) {
        this.brandCompany = brandCompany;
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
    public void setBrandName(final String brandName) {
        this.brandName = brandName;
    }

}
