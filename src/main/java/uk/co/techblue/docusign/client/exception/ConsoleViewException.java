package uk.co.techblue.docusign.client.exception;

/**
 * The Class ConsoleViewException.
 */
public class ConsoleViewException extends DocuSignException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2855659560862235139L;

	/**
	 * Instantiates a new console view exception.
	 * 
	 * @param message
	 *            the message
	 */
	public ConsoleViewException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new console view exception.
	 * 
	 * @param throwable
	 *            the throwable
	 */
	public ConsoleViewException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Instantiates a new console view exception.
	 * 
	 * @param message
	 *            the message
	 * @param throwable
	 *            the throwable
	 */
	public ConsoleViewException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
