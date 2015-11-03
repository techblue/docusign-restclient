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

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.dto.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Signers extends BaseDto {

    /**
     * 
     */
    private static final long serialVersionUID = 5490448065061151375L;
    
    @JsonProperty
    private List<RecipientUpdateDetails> signers;

    /**
     * @return the signers
     */
    public List<RecipientUpdateDetails> getSigners() {
        return signers;
    }

    /**
     * @param signers the signers to set
     */
    public void setSigners(List<RecipientUpdateDetails> signers) {
        this.signers = signers;
    }

}
