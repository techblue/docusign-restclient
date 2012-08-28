package uk.co.techblue.docusign.client.envelope.attributes;

/**
 * The Enum SearchStatus. Used while querying envelope statuses.
 */
public enum SearchStatus {

	/**
	 * For any status changes during the time period.
	 */
	changed,

	/** Or all envelopes in the period. */
	any
}
