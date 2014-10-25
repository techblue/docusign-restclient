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
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

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
    private List<Map<String, String>> brands;

    /**
     * Gets the brands.
     * 
     * @return the brands
     */
    public List<Map<String, String>> getBrands() {
        return brands;
    }

    /**
     * Sets the brands.
     * 
     * @param brands the brands
     */
    public void setBrands(final List<Map<String, String>> brands) {
        this.brands = brands;
    }

}
