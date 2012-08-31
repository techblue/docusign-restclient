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

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Document extends BaseDto{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4024112171517870250L;

	@JsonProperty
    private String documentId;

    @JsonProperty
    private String name;

    @JsonIgnore
    private String path;

    @JsonIgnore
    private String data;
    
   public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPath() {
        return path;
    }

    @JsonIgnore
    public void setPath(String path) {
        this.path = path;
    }
    
    @JsonIgnore   
    public String getData() {
		return data;
	}
    
    @JsonIgnore
	public void setData(String data) {
		this.data = data;
	}

}
