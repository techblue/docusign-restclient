package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class EnvelopeStatusResponse.
 */
public class EnvelopeStatusResponse  extends BaseDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1141049276330062890L;

	/** The envelopes. */
	@JsonProperty
	private List<EnvelopeInfo> envelopes;

	/** The result set size. */
	@JsonProperty
	private int resultSetSize;

	/**
	 * Gets the envelopes.
	 * 
	 * @return the envelopes
	 */
	public List<EnvelopeInfo> getEnvelopes() {
		return envelopes;
	}

	/**
	 * Sets the envelopes.
	 * 
	 * @param envelopes
	 *            the new envelopes
	 */
	public void setEnvelopes(List<EnvelopeInfo> envelopes) {
		this.envelopes = envelopes;
	}

	/**
	 * Gets the result set size.
	 * 
	 * @return the result set size
	 */
	public int getResultSetSize() {
		return resultSetSize;
	}

	/**
	 * Sets the result set size.
	 * 
	 * @param resultSetSize
	 *            the new result set size
	 */
	public void setResultSetSize(int resultSetSize) {
		this.resultSetSize = resultSetSize;
	}
}
