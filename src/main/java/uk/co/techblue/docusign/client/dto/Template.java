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

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.jboss.resteasy.spi.MethodNotAllowedException;

import uk.co.techblue.docusign.client.envelope.attributes.Status;

@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class Template extends Envelope {

	@JsonProperty
	private EnvelopeTemplateDefinition envelopeTemplateDefinition;

	public EnvelopeTemplateDefinition getEnvelopeTemplateDefinition() {
		return envelopeTemplateDefinition;
	}

	public void setEnvelopeTemplateDefinition(
			EnvelopeTemplateDefinition envelopeTemplateDefinition) {
		this.envelopeTemplateDefinition = envelopeTemplateDefinition;
	}

	@Override
	public void setStatus(Status status) {
		throw new MethodNotAllowedException(
				"Setting status is not allowed on a template");
	}
}
