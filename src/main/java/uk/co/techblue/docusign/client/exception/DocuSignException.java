package uk.co.techblue.docusign.client.exception;

import uk.co.techblue.docusign.client.dto.ErrorResponse;

/**
 * The Class DocuSignException.
 */
public class DocuSignException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8769609130061943584L;
    /** The error response. */
    private ErrorResponse errorResponse;

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param message
     *            the message
     */
    public DocuSignException(String message) {
        super(message);
    }

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param throwable
     *            the throwable
     */
    public DocuSignException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new docu sign exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public DocuSignException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * Gets the error response.
     * 
     * @return the error response
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the error response.
     * 
     * @param errorResponse
     *            the new error response
     */
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

}
