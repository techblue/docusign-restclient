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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

// FIXME - Ask docusign of the structure if this entity
/**
 * The Class Attachment.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class Attachment extends BaseDto{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4146964483079044825L;

	/** The base64 binary. */
	@JsonProperty("base64Binary")
	private String base64Binary;

	/** The label. */
	@JsonProperty("label")
	private String label;

	/** The type. */
	@JsonProperty("type")
	private String type;

	/**
	 * Gets the base64 binary.
	 * 
	 * @return the base64 binary
	 */
	public String getBase64Binary() {
		return base64Binary;
	}

	/**
	 * Sets the base64 binary.
	 * 
	 * @param base64Binary
	 *            the new base64 binary
	 */
	public void setBase64Binary(String base64Binary) {
		this.base64Binary = base64Binary;
	}

	/**
	 * Gets the label.
	 * 
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 * 
	 * @param label
	 *            the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
