package uk.co.techblue.docusign.client.dto.recipients;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Use this action if the signer is in the same physical location as a DocuSign
 * user who will act as a Signing Host for the transaction. The recipient added
 * is the Signing Host and new separate Signer Name field appears after Sign in
 * person is selected. This recipient type can only be used if enabled for your
 * account.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class InPersonSigner extends Signer {

	/** The signer name. */
	@JsonProperty
	private String signerName;

	/**
	 * Gets the signer name.
	 * 
	 * @return the signer name
	 */
	public String getSignerName() {
		return signerName;
	}

	/**
	 * Sets the full legal name of a signer for an InPersonSigner recipient
	 * Type.
	 * 
	 * 
	 * @param signerName
	 *            the new signer name
	 */
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}

}
