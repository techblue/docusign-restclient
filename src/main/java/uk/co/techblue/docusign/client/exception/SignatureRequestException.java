package uk.co.techblue.docusign.client.exception;

/**
 * The Signature Request Exception Class.
 */
public class SignatureRequestException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2440368342901069386L;

    /**
     * Instantiates a new signature request exception.
     * 
     * @param message
     *            the message
     */
    public SignatureRequestException(String message) {
        super(message);
    }

    /**
     * Instantiates a new signature request exception.
     * 
     * @param throwable
     *            the throwable
     */
    public SignatureRequestException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new signature request exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public SignatureRequestException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
