/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto.recipients;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Use this action if the signer is in the same physical location as a DocuSign
 * user who will act as a Signing Host for the transaction. The recipient added
 * is the Signing Host and new separate Signer Name field appears after Sign in
 * person is selected. This recipient type can only be used if enabled for your
 * account.
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
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
