/*******************************************************************************
 * Copyright 2015 Technology Blueprint Ltd
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
package uk.co.techblue.docusign.client.dto.recipients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

public class RecipientUpdateResults extends BaseDto {

    private static final long serialVersionUID = 6697836644932062658L;
    
    @JsonProperty
    private List<RecipientResult> recipientUpdateResults;

    /**
     * @return the recipientUpdateResults
     */
    public List<RecipientResult> getRecipientUpdateResults() {
        return recipientUpdateResults;
    }

    /**
     * @param recipientUpdateResults the recipientUpdateResults to set
     */
    public void setRecipientUpdateResults(List<RecipientResult> recipientUpdateResults) {
        this.recipientUpdateResults = recipientUpdateResults;
    }

}
