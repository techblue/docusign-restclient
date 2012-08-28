package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * It represents the possible selections for a dropdown list. Used to specify
 * dropdown option elements in
 * {@link uk.co.techblue.docusign.client.dto.tabs.ListTab}
 */
@JsonSerialize(include = Inclusion.NON_NULL)
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
