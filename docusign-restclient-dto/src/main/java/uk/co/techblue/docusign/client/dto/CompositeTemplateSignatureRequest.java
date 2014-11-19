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
package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import java.util.List;

/**
 * The class to send data for signature request via template.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CompositeTemplateSignatureRequest extends TemplateSignatureRequest {

    @JsonProperty("compositeTemplates")
    private List<CompositeTemplate> compositeTemplates;

    public List<CompositeTemplate> getCompositeTemplates() {
        return compositeTemplates;
    }

    public void setCompositeTemplates(List<CompositeTemplate> compositeTemplates) {
        this.compositeTemplates = compositeTemplates;
    }
}
