package uk.co.techblue.docusign.client.exception;

/**
 * The Class ServiceInitException.
 */
public class ServiceInitException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4361409894420782726L;

    /**
     * Instantiates a new service init exception.
     * 
     * @param message
     *            the message
     */
    public ServiceInitException(String message) {
        super(message);
    }

    /**
     * Instantiates a new service init exception.
     * 
     * @param throwable
     *            the throwable
     */
    public ServiceInitException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new service init exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public ServiceInitException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
