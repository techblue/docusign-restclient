package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class EnvelopeDocumentInfo.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeDocumentInfo extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1717401378166965662L;

	/** The envelope id. */
	@JsonProperty
	private String envelopeId;

	/** The envelope documents. */
	@JsonProperty
	private List<EnvelopeDocument> envelopeDocuments;

	/**
	 * Gets the envelope id.
	 *
	 * @return the envelope id
	 */
	public String getEnvelopeId() {
		return envelopeId;
	}

	/**
	 * Sets the envelope id.
	 *
	 * @param envelopeId the new envelope id
	 */
	public void setEnvelopeId(String envelopeId) {
		this.envelopeId = envelopeId;
	}

	/**
	 * Gets the envelope documents.
	 *
	 * @return the envelope documents
	 */
	public List<EnvelopeDocument> getEnvelopeDocuments() {
		return envelopeDocuments;
	}

	/**
	 * Sets the envelope documents.
	 *
	 * @param envelopeDocuments the new envelope documents
	 */
	public void setEnvelopeDocuments(List<EnvelopeDocument> envelopeDocuments) {
		this.envelopeDocuments = envelopeDocuments;
	}
}
