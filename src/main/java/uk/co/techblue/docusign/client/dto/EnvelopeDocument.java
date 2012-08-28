package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;


/**
 * The Class EnvelopeDocument.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeDocument extends Document {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The type. */
	@JsonProperty
	private String type;
	
	/** The uri. */
	@JsonProperty
	private String uri;

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
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the uri.
	 *
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the uri.
	 *
	 * @param uri the new uri
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

}
