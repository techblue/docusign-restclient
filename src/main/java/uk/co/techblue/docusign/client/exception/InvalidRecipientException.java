package uk.co.techblue.docusign.client.exception;

/**
 * The Class InvalidRecipientException.
 *
 * @author user
 */

public class InvalidRecipientException extends DocuSignException {
	
	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6592921747454748094L;

	
	/**
	 * Instantiates a new invalid recipient exception.
	 *
	 * @param message the message
	 */
	public InvalidRecipientException(String message) {
		super(message);
	}

	
	/**
	 * Instantiates a new invalid recipient exception.
	 *
	 * @param throwable the throwable
	 */
	public InvalidRecipientException(Throwable throwable){
		 super(throwable);
	}
	
	
	/**
	 * Instantiates a new invalid recipient exception.
	 *
	 * @param message the message
	 * @param throwable the throwable
	 */
	public InvalidRecipientException(String message, Throwable throwable){
		super(message, throwable);
	} 
	
	
}
