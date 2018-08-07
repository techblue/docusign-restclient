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
 * Place this tag on the document in a location where the recipient can select
 * an option.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CheckboxTab extends AbstractRecipientTab {

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

	/** The merge field xml. */
	@JsonProperty
	private String mergeFieldXml;

	/** The require initial on shared change. */
	@JsonProperty
	private Boolean requireInitialOnSharedChange;

	/** The selected. */
	@JsonProperty
	private Boolean selected;

	/** The shared. */
	@JsonProperty
	private Boolean shared;

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
	 * Gets the merge field xml.
	 * 
	 * @return the merge field xml
	 */
	public String getMergeFieldXml() {
		return mergeFieldXml;
	}

	/**
	 * Sets the merge field xml. <b>Reserved for future use</b>
	 * 
	 * @param mergeFieldXml
	 *            the new merge field xml
	 */
	public void setMergeFieldXml(String mergeFieldXml) {
		this.mergeFieldXml = mergeFieldXml;
	}

	/**
	 * Gets the require initial on shared change.
	 * 
	 * @return the require initial on shared change
	 */
	public Boolean getRequireInitialOnSharedChange() {
		return requireInitialOnSharedChange;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the require initial on shared change. Optional element for field
	 * markup. When set to true it requires the signer to initial when they
	 * modify a shared field.
	 * 
	 * 
	 * @param requireInitialOnSharedChange
	 *            the new require initial on shared change
	 */
	public void setRequireInitialOnSharedChange(
			Boolean requireInitialOnSharedChange) {
		this.requireInitialOnSharedChange = requireInitialOnSharedChange;
	}

	/**
	 * Gets the selected.
	 * 
	 * @return the selected
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * If set to true, the checkbox is selected.
	 * 
	 * 
	 * @param selected
	 *            the new selected
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/**
	 * Gets the shared.
	 * 
	 * @return the shared
	 */
	public Boolean getShared() {
		return shared;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Element for field markup. When set to true, enables field markup for the
	 * field.
	 * 
	 * 
	 * @param shared
	 *            the new shared
	 */
	public void setShared(Boolean shared) {
		this.shared = shared;
	}

}
