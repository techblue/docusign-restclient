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


import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.envelope.attributes.CustomFieldType;

public class CustomField extends BaseDto{
    

	/**
	 * 
	 */
	private static final long serialVersionUID = -3282799554508340487L;

	@JsonProperty("customFieldType")
	private CustomFieldType customFieldType;

	@JsonProperty("name")
	private String name;

	@JsonProperty("listItems")
	private String listItems;
	
	@JsonProperty("value")
	private String value;

	@JsonProperty("required")
	private String required;

	@JsonProperty("show")
	private Boolean show;

	public CustomFieldType getCustomFieldType() {
		return customFieldType;
	}

	public void setCustomFieldType(CustomFieldType customFieldType) {
		this.customFieldType = customFieldType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getListItems() {
		return listItems;
	}

	public void setListItems(String listItems) {
		this.listItems = listItems;
	}
    
	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
