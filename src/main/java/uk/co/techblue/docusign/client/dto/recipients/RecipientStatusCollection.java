package uk.co.techblue.docusign.client.dto.recipients;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

// TODO: Auto-generated Javadoc
/**
 * The Class RecipientStatusCollection.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class RecipientStatusCollection extends BaseDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5875317120902456481L;

	/** The signers. */
	@JsonProperty
	private List<RecipientStatus> signers;

	/** The agents. */
	@JsonProperty
	private List<RecipientStatus> agents;

	/** The editors. */
	@JsonProperty
	private List<RecipientStatus> editors;

	/** The in person signers. */
	@JsonProperty
	private List<RecipientStatus> inPersonSigners;

	/** The intermediaries. */
	@JsonProperty
	private List<RecipientStatus> intermediaries;

	/** The carbon copies. */
	@JsonProperty
	private List<RecipientStatus> carbonCopies;

	/** The certified deliveries. */
	@JsonProperty
	private List<RecipientStatus> certifiedDeliveries;
	
	/** The recipient count. */
	@JsonProperty
	private int recipientCount;

	/**
	 * Gets the signers.
	 *
	 * @return the signers
	 */
	public List<RecipientStatus> getSigners() {
		return signers;
	}

	/**
	 * Sets the signers.
	 *
	 * @param signers the new signers
	 */
	public void setSigners(List<RecipientStatus> signers) {
		this.signers = signers;
	}

	/**
	 * Gets the agents.
	 *
	 * @return the agents
	 */
	public List<RecipientStatus> getAgents() {
		return agents;
	}

	/**
	 * Sets the agents.
	 *
	 * @param agents the new agents
	 */
	public void setAgents(List<RecipientStatus> agents) {
		this.agents = agents;
	}

	/**
	 * Gets the editors.
	 *
	 * @return the editors
	 */
	public List<RecipientStatus> getEditors() {
		return editors;
	}

	/**
	 * Sets the editors.
	 *
	 * @param editors the new editors
	 */
	public void setEditors(List<RecipientStatus> editors) {
		this.editors = editors;
	}

	/**
	 * Gets the in person signers.
	 *
	 * @return the in person signers
	 */
	public List<RecipientStatus> getInPersonSigners() {
		return inPersonSigners;
	}

	/**
	 * Sets the in person signers.
	 *
	 * @param inPersonSigners the new in person signers
	 */
	public void setInPersonSigners(List<RecipientStatus> inPersonSigners) {
		this.inPersonSigners = inPersonSigners;
	}

	/**
	 * Gets the intermediaries.
	 *
	 * @return the intermediaries
	 */
	public List<RecipientStatus> getIntermediaries() {
		return intermediaries;
	}

	/**
	 * Sets the intermediaries.
	 *
	 * @param intermediaries the new intermediaries
	 */
	public void setIntermediaries(List<RecipientStatus> intermediaries) {
		this.intermediaries = intermediaries;
	}

	/**
	 * Gets the carbon copies.
	 *
	 * @return the carbon copies
	 */
	public List<RecipientStatus> getCarbonCopies() {
		return carbonCopies;
	}

	/**
	 * Sets the carbon copies.
	 *
	 * @param carbonCopies the new carbon copies
	 */
	public void setCarbonCopies(List<RecipientStatus> carbonCopies) {
		this.carbonCopies = carbonCopies;
	}

	/**
	 * Gets the certified deliveries.
	 *
	 * @return the certified deliveries
	 */
	public List<RecipientStatus> getCertifiedDeliveries() {
		return certifiedDeliveries;
	}

	/**
	 * Sets the certified deliveries.
	 *
	 * @param certifiedDeliveries the new certified deliveries
	 */
	public void setCertifiedDeliveries(List<RecipientStatus> certifiedDeliveries) {
		this.certifiedDeliveries = certifiedDeliveries;
	}

	/**
	 * Gets the recipient count.
	 *
	 * @return the recipient count
	 */
	public int getRecipientCount() {
		return recipientCount;
	}

	/**
	 * Sets the recipient count.
	 *
	 * @param recipientCount the new recipient count
	 */
	public void setRecipientCount(int recipientCount) {
		this.recipientCount = recipientCount;
	}

}
