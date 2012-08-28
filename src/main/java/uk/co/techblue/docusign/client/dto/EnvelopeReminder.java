package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class EnvelopeReminder.
 */
public class EnvelopeReminder  extends BaseDto{

	private static final long serialVersionUID = -6156505785594276706L;

	/** The reminder delay. */
	@JsonProperty
	private Integer reminderDelay;

	/** The reminder enabled. */
	@JsonProperty
	private boolean reminderEnabled;

	/** The reminder frequency. */
	@JsonProperty
	private Integer reminderFrequency;

	/**
	 * Gets the reminder delay.
	 * 
	 * @return the reminder delay
	 */
	public Integer getReminderDelay() {
		return reminderDelay;
	}

	/**
	 * Sets the reminder delay.
	 * 
	 * @param reminderDelay
	 *            the new reminder delay
	 */
	public void setReminderDelay(Integer reminderDelay) {
		this.reminderDelay = reminderDelay;
	}

	/**
	 * Gets the reminder enabled.
	 * 
	 * @return the reminder enabled
	 */
	public boolean getReminderEnabled() {
		return reminderEnabled;
	}

	/**
	 * Sets the reminder enabled.
	 * 
	 * @param reminderEnabled
	 *            the new reminder enabled
	 */
	public void setReminderEnabled(boolean reminderEnabled) {
		this.reminderEnabled = reminderEnabled;
	}

	/**
	 * Gets the reminder frequency.
	 * 
	 * @return the reminder frequency
	 */
	public Integer getReminderFrequency() {
		return reminderFrequency;
	}

	/**
	 * Sets the reminder frequency.
	 * 
	 * @param reminderFrequency
	 *            the new reminder frequency
	 */
	public void setReminderFrequency(Integer reminderFrequency) {
		this.reminderFrequency = reminderFrequency;
	}
}
