package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

/**
 * The Class EnvelopeNotificationInfo.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeNotificationInfo extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5805391762394797959L;

	/** The expirations. */
	@JsonProperty
	private EnvelopeExpiration expirations;

	/** The reminders. */
	@JsonProperty
	private EnvelopeReminder reminders;

	/**
	 * Gets the expirations.
	 * 
	 * @return the expirations
	 */
	public EnvelopeExpiration getExpirations() {
		return expirations;
	}

	/**
	 * Sets the expirations.
	 * 
	 * @param expirations
	 *            the new expirations
	 */
	public void setExpirations(EnvelopeExpiration expirations) {
		this.expirations = expirations;
	}

	/**
	 * Gets the reminders.
	 * 
	 * @return the reminders
	 */
	public EnvelopeReminder getReminders() {
		return reminders;
	}

	/**
	 * Sets the reminders.
	 * 
	 * @param reminders
	 *            the new reminders
	 */
	public void setReminders(EnvelopeReminder reminders) {
		this.reminders = reminders;
	}
}
