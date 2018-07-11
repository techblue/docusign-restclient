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

import com.fasterxml.jackson.annotation.JsonProperty;

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
