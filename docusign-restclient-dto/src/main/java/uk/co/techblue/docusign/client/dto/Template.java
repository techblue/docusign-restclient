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

import uk.co.techblue.docusign.client.envelope.attributes.Status;

@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class Template extends Envelope {

	@JsonProperty
	private EnvelopeTemplateDefinition envelopeTemplateDefinition;

	@JsonProperty("notification")
	private EnvelopeNotificationInfo notificationTemplate;
	
	public EnvelopeTemplateDefinition getEnvelopeTemplateDefinition() {
		return envelopeTemplateDefinition;
	}

	public void setEnvelopeTemplateDefinition(
			EnvelopeTemplateDefinition envelopeTemplateDefinition) {
		this.envelopeTemplateDefinition = envelopeTemplateDefinition;
	}

	@Override
	public void setStatus(Status status) {
		throw new IllegalAccessError(
				"Setting status is not allowed on a template");
	}

	public EnvelopeNotificationInfo getNotificationTemplate() {
		return notificationTemplate;
	}

	public void setNotificationTemplate(
			EnvelopeNotificationInfo notificationTemplate) {
		this.notificationTemplate = notificationTemplate;
	}
}
