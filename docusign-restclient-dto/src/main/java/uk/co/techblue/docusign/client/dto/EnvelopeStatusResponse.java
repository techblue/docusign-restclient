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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
