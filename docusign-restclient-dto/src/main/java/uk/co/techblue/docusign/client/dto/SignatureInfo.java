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
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

// TODO: Auto-generated Javadoc
//FIXME  Call docusign to check actual parameter names. Their API documentations doesn't talks much about it.
/**
 * The Class SignatureInfo.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class SignatureInfo extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1375681134360675849L;

	/** The name. */
	@JsonProperty("name")
	private String name;

	/** The initials. */
	@JsonProperty("initials")
	private String initials;

	/** The font. */
	@JsonProperty("font")
	private String font;

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the initials.
	 * 
	 * @return the initials
	 */
	public String getInitials() {
		return initials;
	}

	/**
	 * Sets the initials.
	 * 
	 * @param initials
	 *            the new initials
	 */
	public void setInitials(String initials) {
		this.initials = initials;
	}

	/**
	 * Gets the font.
	 * 
	 * @return the font
	 */
	public String getFont() {
		return font;
	}

	/**
	 * Sets the font.
	 * 
	 * @param font
	 *            the new font
	 */
	public void setFont(String font) {
		this.font = font;
	}

}
