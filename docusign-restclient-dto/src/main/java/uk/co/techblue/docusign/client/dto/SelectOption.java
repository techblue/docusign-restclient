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

/**
 * It represents the possible selections for a dropdown list. Used to specify
 * dropdown option elements in
 * {@link uk.co.techblue.docusign.client.dto.tabs.ListTab}
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class SelectOption extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4901335134617049839L;

	/** The text. */
	@JsonProperty
	private String text;

	/** The value. */
	@JsonProperty
	private String value;

	/** The selected. */
	@JsonProperty
	private boolean selected;

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text shown in the dropdown list.
	 * 
	 * 
	 * @param text
	 *            the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value used when option selected.
	 * 
	 * 
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Checks if is selected.
	 * 
	 * @return true, if is selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * Sets the selected. Sets if this is the default selection shown to a
	 * signer. Use true/false to show the value is selected or not. Only one
	 * selection can be true.
	 * 
	 * 
	 * @param selected
	 *            the new selected
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
