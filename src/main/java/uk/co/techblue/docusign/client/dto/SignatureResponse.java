package uk.co.techblue.docusign.client.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

public class SignatureResponse extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4495501113950394429L;

	@JsonProperty("envelopeId")
    private String envelopeId;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("statusDateTime")
    private Date statusDateTime;

    @JsonProperty("uri")
    private String uri;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getStatusDateTime() {
        return statusDateTime;
    }

    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setStatusDateTime(Date statusDateTime) {
        this.statusDateTime = statusDateTime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
