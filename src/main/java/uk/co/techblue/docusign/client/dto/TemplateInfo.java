package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class TemplateInfo extends BaseDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9192342237712095435L;
	@JsonProperty("envelopeTemplates")
	private List<EnvelopeTemplate> envelopeTemplates;

	public List<EnvelopeTemplate> getEnvelopeTemplates() {
		return envelopeTemplates;
	}

	public void setEnvelopeTemplates(List<EnvelopeTemplate> envelopeTemplates) {
		this.envelopeTemplates = envelopeTemplates;
	}
}
