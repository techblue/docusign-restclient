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
package uk.co.techblue.docusign.client.dto.recipients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Recipient collection class that encapsulates all types of signers for a
 * document.
 * 
 * @author Ajay
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class RecipientCollection extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9170214083757865189L;

	/** The signers. */
	@JsonProperty
	private List<Signer> signers;

	/** The agents. */
	@JsonProperty
	private List<Agent> agents;

	/** The editors. */
	@JsonProperty
	private List<Editor> editors;

	/** The in person signers. */
	@JsonProperty
	private List<InPersonSigner> inPersonSigners;

	/** The intermediaries. */
	@JsonProperty
	private List<Intermediary> intermediaries;

	/** The carbon copies. */
	@JsonProperty
	private List<CarbonCopy> carbonCopies;

	/** The certified deliveries. */
	@JsonProperty
	private List<CertifiedDelivery> certifiedDeliveries;

	/**
	 * Gets the signers.
	 * 
	 * @return the signers
	 */
	public List<Signer> getSigners() {
		return signers;
	}

	/**
	 * Sets the signers.
	 * 
	 * @param signers
	 *            the new signers
	 */
	public void setSigners(List<Signer> signers) {
		this.signers = signers;
	}

	/**
	 * Gets the agents.
	 * 
	 * @return the agents
	 */
	public List<Agent> getAgents() {
		return agents;
	}

	/**
	 * Sets the agents.
	 * 
	 * @param agents
	 *            the new agents
	 */
	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}

	/**
	 * Gets the editors.
	 * 
	 * @return the editors
	 */
	public List<Editor> getEditors() {
		return editors;
	}

	/**
	 * Sets the editors.
	 * 
	 * @param editors
	 *            the new editors
	 */
	public void setEditors(List<Editor> editors) {
		this.editors = editors;
	}

	/**
	 * Gets the in person signers.
	 * 
	 * @return the in person signers
	 */
	public List<InPersonSigner> getInPersonSigners() {
		return inPersonSigners;
	}

	/**
	 * Sets the in person signers.
	 * 
	 * @param inPersonSigners
	 *            the new in person signers
	 */
	public void setInPersonSigners(List<InPersonSigner> inPersonSigners) {
		this.inPersonSigners = inPersonSigners;
	}

	/**
	 * Gets the intermediaries.
	 * 
	 * @return the intermediaries
	 */
	public List<Intermediary> getIntermediaries() {
		return intermediaries;
	}

	/**
	 * Sets the intermediaries.
	 * 
	 * @param intermediaries
	 *            the new intermediaries
	 */
	public void setIntermediaries(List<Intermediary> intermediaries) {
		this.intermediaries = intermediaries;
	}

	/**
	 * Gets the carbon copies.
	 * 
	 * @return the carbon copies
	 */
	public List<CarbonCopy> getCarbonCopies() {
		return carbonCopies;
	}

	/**
	 * Sets the carbon copies.
	 * 
	 * @param carbonCopies
	 *            the new carbon copies
	 */
	public void setCarbonCopies(List<CarbonCopy> carbonCopies) {
		this.carbonCopies = carbonCopies;
	}

	/**
	 * Gets the certified deliveries.
	 * 
	 * @return the certified deliveries
	 */
	public List<CertifiedDelivery> getCertifiedDeliveries() {
		return certifiedDeliveries;
	}

	/**
	 * Sets the certified deliveries.
	 * 
	 * @param certifiedDeliveries
	 *            the new certified deliveries
	 */
	public void setCertifiedDeliveries(
			List<CertifiedDelivery> certifiedDeliveries) {
		this.certifiedDeliveries = certifiedDeliveries;
	}

}
