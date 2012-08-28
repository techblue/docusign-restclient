package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;


public class ErrorResponse  extends BaseDto{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3933902588570110391L;

	@JsonProperty("errorCode")
    private String errorCode;

    @JsonProperty("message")
    private String message;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
