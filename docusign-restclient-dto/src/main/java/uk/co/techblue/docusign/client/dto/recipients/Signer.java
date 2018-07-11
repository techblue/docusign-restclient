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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.DocumentTabCollection;
import uk.co.techblue.docusign.client.dto.SignatureInfo;

/**
 * Use this action if your recipient must sign, initial, date or add data to
 * form fields on the documents in the envelope.
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class Signer extends Recipient {
	/** The host email. */
	@JsonProperty
	private String email;

	/** The host name. */
	@JsonProperty
	private String name;

	/** The auto navigation. */
	@JsonProperty
	private Boolean autoNavigation;

	/** The default recipient. */
	@JsonProperty
	private Boolean defaultRecipient;

	/** The signature info. */
	@JsonProperty
	private SignatureInfo signatureInfo;

	/** The tabs. */
	@JsonProperty
	private DocumentTabCollection tabs;

	/** Excluded documents. */
	@JsonProperty
	private List<String> excludedDocuments;

    @JsonIgnore
    private List<Long> letterIds;

	/** 
	 * Gets the list of excluded documents (list of IDs)
	 * @return List of IDs of excluded documents
	 */
	public List<String> getExcludedDocuments() {
		return excludedDocuments;
	}

	/** 
	 * Sets the list of excluded documents (list of IDs)
	 * @param excludedDocuments the list of IDs of the excluded documents
	 */
	public void setExcludedDocuments(List<String> excludedDocuments) {
		this.excludedDocuments = excludedDocuments;
	}

	/**
	 * Gets the host email.
	 * 
	 * @return the host email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Specifies the email for the signing host. Required element for In Person
	 * Signers recipient Type.
	 * 
	 * @param hostEmail
	 *            the new host email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the host name.
	 * 
	 * @return the host name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Specifies the name of the signing host. Required element for In Person
	 * Signers recipient Type.
	 * 
	 * 
	 * @param hostName
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the auto navigation.
	 * 
	 * @return the auto navigation
	 */
	public Boolean getAutoNavigation() {
		return autoNavigation;
	}

	/**
	 * Specifies if the auto navigation setting is on or off for recipient.
	 * 
	 * 
	 * @param autoNavigation
	 *            the new auto navigation
	 */
	public void setAutoNavigation(Boolean autoNavigation) {
		this.autoNavigation = autoNavigation;
	}

	/**
	 * Gets the default recipient.
	 * 
	 * @return the default recipient
	 */
	public Boolean getDefaultRecipient() {
		return defaultRecipient;
	}

	/**
	 * If true, this is the default recipient for the envelope. This option is
	 * used with the CreateEnvelopeFromTemplatesAnd Forms method.
	 * 
	 * 
	 * @param defaultRecipient
	 *            the new default recipient
	 */
	public void setDefaultRecipient(Boolean defaultRecipient) {
		this.defaultRecipient = defaultRecipient;
	}

	/**
	 * Gets the signature info.
	 * 
	 * @return the signature info
	 */
	public SignatureInfo getSignatureInfo() {
		return signatureInfo;
	}

	/**
	 * Allows the sender to pre-specify the signature name, signature initials
	 * and signature font used in the signature stamp for the recipient.
	 * 
	 * 
	 * @param signatureInfo
	 *            the new signature info
	 */
	public void setSignatureInfo(SignatureInfo signatureInfo) {
		this.signatureInfo = signatureInfo;
	}

	/**
	 * Gets the tabs.
	 * 
	 * @return the tabs
	 */
	public DocumentTabCollection getTabs() {
		return tabs;
	}

	/**
	 * Only used with recipient types In Person Signers and Signers. Specifies
	 * the Tabs associated with the recipient.
	 * 
	 * @param tabs
	 *            the new tabs
	 */
	public void setTabs(DocumentTabCollection tabs) {
		this.tabs = tabs;
	}
	
	public List<Long> getLetterIds() {
        return letterIds;
    }

    public void setLetterIds(final List<Long> letterIds) {
        this.letterIds = letterIds;
    }
}
