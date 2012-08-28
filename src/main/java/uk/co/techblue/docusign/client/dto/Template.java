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
