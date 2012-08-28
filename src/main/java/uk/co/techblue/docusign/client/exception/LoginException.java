package uk.co.techblue.docusign.client.exception;


/**
 * The Class LoginException.
 */
public class LoginException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2316023832223708241L;

    /**
     * Instantiates a new login exception.
     * 
     * @param message
     *            the message
     */
    public LoginException(String message) {
        super(message);
    }

    /**
     * Instantiates a new login exception.
     * 
     * @param throwable
     *            the throwable
     */
    public LoginException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new login exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public LoginException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
