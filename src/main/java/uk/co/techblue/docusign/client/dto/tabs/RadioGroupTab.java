package uk.co.techblue.docusign.client.dto.tabs;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.dto.RadioButton;

/**
 * Place this tag on the document in a location where the recipient can select
 * one option from a group of options using a radio button. The radio buttons do
 * not have to be on the same page in a document.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class RadioGroupTab extends Tab {

	/** The conditional parent label. */
	@JsonProperty
	private String conditionalParentLabel;

	/** The conditional parent value. */
	@JsonProperty
	private String conditionalParentValue;

	/** The group name. */
	@JsonProperty
	private String groupName;

	/** The radios. */
	@JsonProperty
	private List<RadioButton> radios;

	/** The recipient id. */
	@JsonProperty
	private String recipientId;

	/** The require initial on shared change. */
	@JsonProperty
	private Boolean requireInitialOnSharedChange;

	/** The shared. */
	@JsonProperty
	private Boolean shared;

	/** The template locked. */
	@JsonProperty
	private Boolean templateLocked;

	/** The template required. */
	@JsonProperty
	private Boolean templateRequired;

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
	 * Gets the group name.
	 * 
	 * @return the group name
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Sets the group name for radio buttons that are grouped together. This
	 * works in conjunction with the radios parameter.
	 * 
	 * 
	 * @param groupName
	 *            the new group name
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * Gets the radios.
	 * 
	 * @return the radios
	 */
	public List<RadioButton> getRadios() {
		return radios;
	}

	/**
	 * Sets the radios. This sets the locations and status for radio buttons
	 * that are grouped together.
	 * 
	 * 
	 * @param radios
	 *            the new radios
	 */
	public void setRadios(List<RadioButton> radios) {
		this.radios = radios;
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
}
