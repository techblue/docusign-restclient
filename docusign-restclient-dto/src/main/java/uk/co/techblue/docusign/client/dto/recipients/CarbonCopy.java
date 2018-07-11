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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Use this action if the recipient should get a copy of the envelope, but the
 * recipient does not need to sign, initial, date or add information to any of
 * the documents. This type of recipient can be placed in any order in the
 * recipient list. The recipient receives a copy of the envelope when the
 * envelope reaches the recipient’s order in the process flow and when the
 * envelope is completed.
 * 
 * @author Ajay
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class CarbonCopy extends Recipient {

	/** The email. */
	@JsonProperty
	private String email;

	/** The name. */
	@JsonProperty
	private String name;

	/** Excluded documents. */
	@JsonProperty
	private List<String> excludedDocuments;

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
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the recipient. Notification will be sent to this email
	 * id
	 * 
	 * 
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the full legal name of the recipient.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
