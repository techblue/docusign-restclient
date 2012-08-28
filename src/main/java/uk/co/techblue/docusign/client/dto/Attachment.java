package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

// FIXME - Ask docusign of the structure if this entity
/**
 * The Class Attachment.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
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
