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

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The Class for Recipient Phone Authentication data.
 * 
 * @author Ajay
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class RecipientPhoneAuthentication extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6294419922168679474L;

	/** The recip may provide numbers. */
	@JsonProperty("recipMayProvideNumbers")
	private boolean recipMayProvideNumbers;

	/** The sender provide numbers. */
	@JsonProperty("senderProvideNumbers")
	private List<String> senderProvideNumbers;

	/** The record void print. */
	@JsonProperty("recordVoidPrint")
	private boolean recordVoidPrint;

	/** The validate recip provide number. */
	@JsonProperty("validateRecipProvideNumber")
	private boolean validateRecipProvideNumber;

	/**
	 * if true then recipient can use whatever phone number they want.
	 * 
	 * @return true, if is recip may provide numbers
	 */
	public boolean isRecipMayProvideNumbers() {
		return recipMayProvideNumbers;
	}

	/**
	 * if true then recipient can use whatever phone number they want.
	 * 
	 * @param recipMayProvideNumbers
	 *            the new recip may provide numbers
	 */
	public void setRecipMayProvideNumbers(boolean recipMayProvideNumbers) {
		this.recipMayProvideNumbers = recipMayProvideNumbers;
	}

	/**
	 * a list of phone numbers the recipient may use.
	 * 
	 * @return the sender provide numbers
	 */
	public List<String> getSenderProvideNumbers() {
		return senderProvideNumbers;
	}

	/**
	 * a list of phone numbers the recipient may use.
	 * 
	 * @param senderProvideNumbers
	 *            the new sender provide numbers
	 */
	public void setSenderProvideNumbers(List<String> senderProvideNumbers) {
		this.senderProvideNumbers = senderProvideNumbers;
	}

	/**
	 * Checks if is record void print.
	 * 
	 * @return true, if is record void print
	 */
	public boolean isRecordVoidPrint() {
		return recordVoidPrint;
	}

	/**
	 * Sets the record void print.
	 * 
	 * @param recordVoidPrint
	 *            the new record void print
	 */
	public void setRecordVoidPrint(boolean recordVoidPrint) {
		this.recordVoidPrint = recordVoidPrint;
	}

	/**
	 * Checks if is validate recip provide number.
	 * 
	 * @return true, if is validate recip provide number
	 */
	public boolean isValidateRecipProvideNumber() {
		return validateRecipProvideNumber;
	}

	/**
	 * Sets the validate recip provide number.
	 * 
	 * @param validateRecipProvideNumber
	 *            the new validate recip provide number
	 */
	public void setValidateRecipProvideNumber(boolean validateRecipProvideNumber) {
		this.validateRecipProvideNumber = validateRecipProvideNumber;
	}
}
