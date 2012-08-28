package uk.co.techblue.docusign.client.exception;

/**
 * The exception class for categorising user account operations related
 * exception.
 * 
 * @author Aay
 */
public class UserAccountException extends DocuSignException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8473237336320465748L;

	/**
	 * Instantiates a new template exception.
	 * 
	 * @param message
	 *            the message
	 */
	public UserAccountException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new template exception.
	 * 
	 * @param throwable
	 *            the throwable
	 */
	public UserAccountException(Throwable throwable) {
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
	public UserAccountException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
