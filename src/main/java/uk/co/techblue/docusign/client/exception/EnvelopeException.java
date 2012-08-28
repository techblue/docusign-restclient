package uk.co.techblue.docusign.client.exception;

/**
 * The Class EnvelopeException.
 */
public class EnvelopeException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2855659560862235139L;

    /**
     * Instantiates a new envelope exception.
     * 
     * @param message
     *            the message
     */
    public EnvelopeException(String message) {
        super(message);
    }

    /**
     * Instantiates a new envelope exception.
     * 
     * @param throwable
     *            the throwable
     */
    public EnvelopeException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new envelope exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public EnvelopeException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
