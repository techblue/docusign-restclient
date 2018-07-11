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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
/**
 * The Class EnvelopeNotificationInfo.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
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
