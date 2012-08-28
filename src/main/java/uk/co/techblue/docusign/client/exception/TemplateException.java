package uk.co.techblue.docusign.client.exception;

/**
 * The TemplateException Class.
 */
public class TemplateException extends DocuSignException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7751447074676142674L;

    /**
     * Instantiates a new template exception.
     * 
     * @param message
     *            the message
     */
    public TemplateException(String message) {
        super(message);
    }

    /**
     * Instantiates a new template exception.
     * 
     * @param throwable
     *            the throwable
     */
    public TemplateException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Instantiates a new template exception.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public TemplateException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
