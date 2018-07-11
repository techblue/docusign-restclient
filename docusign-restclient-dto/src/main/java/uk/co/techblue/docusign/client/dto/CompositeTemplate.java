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


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class CompositeTemplate extends BaseDto {

    @JsonProperty("compositeTemplateId")
    private String compositeTemplateId;

    @JsonProperty("serverTemplates")
    private List<ServerTemplate> serverTemplates;

    @JsonProperty("inlineTemplates")
    private List<InlineTemplate> inlineTemplates;

    @JsonProperty("pdfMetaDataTemplateSequence")
    private String pdfMetaDataTemplateSequence;

    public String getCompositeTemplateId() {
        return compositeTemplateId;
    }

    public void setCompositeTemplateId(String compositeTemplateId) {
        this.compositeTemplateId = compositeTemplateId;
    }

    public List<ServerTemplate> getServerTemplates() {
        return serverTemplates;
    }

    public void setServerTemplates(List<ServerTemplate> serverTemplates) {
        this.serverTemplates = serverTemplates;
    }

    public List<InlineTemplate> getInlineTemplates() {
        return inlineTemplates;
    }

    public void setInlineTemplates(List<InlineTemplate> inlineTemplates) {
        this.inlineTemplates = inlineTemplates;
    }

    public String getPdfMetaDataTemplateSequence() {
        return pdfMetaDataTemplateSequence;
    }

    public void setPdfMetaDataTemplateSequence(String pdfMetaDataTemplateSequence) {
        this.pdfMetaDataTemplateSequence = pdfMetaDataTemplateSequence;
    }
}
