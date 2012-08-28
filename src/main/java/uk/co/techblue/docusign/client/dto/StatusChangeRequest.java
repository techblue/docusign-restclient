package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The Status Change Request dto.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class StatusChangeRequest extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6777526898091923906L;

	/** The status. */
    @JsonProperty("status")
    private Status status;

    /** The status reason. */
    @JsonProperty("statusReason")
    private String statusReason;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the status reason.
     * 
     * @return the status reason
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the status reason.
     * 
     * @param statusReason
     *            the new status reason
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }
}
