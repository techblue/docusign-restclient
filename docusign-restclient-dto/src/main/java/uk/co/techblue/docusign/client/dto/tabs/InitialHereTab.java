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
package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag to have a recipient place their initials in the document. The
 * “optional” property sets if the initials are required or optional.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class InitialHereTab extends AbstractRecipientTab {
	/** The conditional parent label. */
	@JsonProperty
	private String conditionalParentLabel;

	/** The conditional parent value. */
	@JsonProperty
	private String conditionalParentValue;

	/** The recipient id. */
	@JsonProperty
	private String recipientId;

	/** The template locked. */
	@JsonProperty
	private Boolean templateLocked;

	/** The template required. */
	@JsonProperty
	private Boolean templateRequired;

	/** The recipient id. */
	@JsonProperty
	private String name;

	/** The optional. */
	@JsonProperty
	private Boolean optional;

	/** The scale value. */
	@JsonProperty
	private Double scaleValue;

	/**
	 * Gets the conditional parent label.
	 * 
	 * @return the conditional parent label
	 */
	public String getConditionalParentLabel() {
		return conditionalParentLabel;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the conditional parent label. For conditional fields this is the
	 * TabLabel of the parent tab that controls this tab’s visibility.
	 * 
	 * 
	 * @param conditionalParentLabel
	 *            the new conditional parent label
	 */
	public void setConditionalParentLabel(String conditionalParentLabel) {
		this.conditionalParentLabel = conditionalParentLabel;
	}

	/**
	 * Gets the conditional parent value.
	 * 
	 * @return the conditional parent value
	 */
	public String getConditionalParentValue() {
		return conditionalParentValue;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the conditional parent value. For conditional fields this is the
	 * Value of the parent tab that controls this tab’s visibility.
	 * 
	 * 
	 * @param conditionalParentValue
	 *            the new conditional parent value
	 */
	public void setConditionalParentValue(String conditionalParentValue) {
		this.conditionalParentValue = conditionalParentValue;
	}

	/**
	 * Gets the recipient id.
	 * 
	 * @return the recipient id
	 */
	public String getRecipientId() {
		return recipientId;
	}

	/**
	 * Sets the recipient id. This specifies the recipient associated with the
	 * tab. Must refer to an existing recipient’s ID attribute.
	 * 
	 * 
	 * @param recipientId
	 *            the new recipient id
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	/**
	 * Gets the template locked.
	 * 
	 * @return the template locked
	 */
	public Boolean getTemplateLocked() {
		return templateLocked;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the template locked. Used only when working with template tabs. If
	 * true, the attributes of the tab cannot be changed by the sender.
	 * 
	 * 
	 * @param templateLocked
	 *            the new template locked
	 */
	public void setTemplateLocked(Boolean templateLocked) {
		this.templateLocked = templateLocked;
	}

	/**
	 * Gets the template required.
	 * 
	 * @return the template required
	 */
	public Boolean getTemplateRequired() {
		return templateRequired;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the template required. Used only when working with template tabs. If
	 * true, the tab cannot be removed by the sender.
	 * 
	 * 
	 * @param templateRequired
	 *            the new template required
	 */
	public void setTemplateRequired(Boolean templateRequired) {
		this.templateRequired = templateRequired;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the names associated with the tab type.
	 * 
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the optional.
	 * 
	 * @return the optional
	 */
	public Boolean getOptional() {
		return optional;
	}

	/**
	 * Sets the optional. When true, the Initial Here tab is optional and the
	 * recipient is not required to add initials to complete an envelope.
	 * 
	 * 
	 * @param optional
	 *            the new optional
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Gets the scale value.
	 * 
	 * @return the scale value
	 */
	public Double getScaleValue() {
		return scaleValue;
	}

	/**
	 * Sets the size for Initial Here tab. It can be value from 0.5 to 1.0,
	 * where 1.0 represents full size and 0.5 is 50% size.
	 * 
	 * 
	 * @param scaleValue
	 *            the new scale value
	 */
	public void setScaleValue(Double scaleValue) {
		this.scaleValue = scaleValue;
	}
}
