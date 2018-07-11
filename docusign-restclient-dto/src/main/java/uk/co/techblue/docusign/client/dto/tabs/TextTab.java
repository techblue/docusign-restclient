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
package uk.co.techblue.docusign.client.dto.tabs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This tag is an adaptable field that allows the recipient to enter different
 * text information.
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class TextTab extends AbstractTextTab {
	/** The validation message. */
	@JsonProperty
	private String validationMessage;

	/** The validation pattern. */
	@JsonProperty
	private String validationPattern;

	/** The formula. */
	@JsonProperty
	private String formula;

	/** The is payment amount. */
	@JsonProperty
	private Boolean isPaymentAmount;

	/**
	 * Gets the validation message.
	 * 
	 * @return the validation message
	 */
	public String getValidationMessage() {
		return validationMessage;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the message to be displayed to the signer if the validation rule
	 * from validationPattern fails. This is optional and if not provided the
	 * default DocuSign message will be displayed.
	 * 
	 * 
	 * @param validationMessage
	 *            the new validation message
	 */
	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	/**
	 * Gets the validation pattern.
	 * 
	 * @return the validation pattern
	 */
	public String getValidationPattern() {
		return validationPattern;
	}

	/**
	 * <b>Optional element.</b><br/>
	 * Sets the validation pattern. A regular expression that will be validated
	 * when data is entered in the field. This is optional and if not provided
	 * the default DocuSign validation rules will apply. Javascript RegEx object
	 * is used for regular expression validation. Regular expressions must be
	 * supported by this object to resolve.
	 * 
	 * 
	 * @param validationPattern
	 *            the new validation pattern
	 */
	public void setValidationPattern(String validationPattern) {
		this.validationPattern = validationPattern;
	}

	/**
	 * Gets the formula.
	 * 
	 * @return the formula
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * Sets the formula. The Formula string contains the TabLabel for the
	 * reference tabs used in the formula and calculation operators. Each
	 * TabLabel must be contained in brackets. Example: Three tabs (TabLabels:
	 * Line1, Line2, and Tax) need to be added together. The formula string
	 * would be: <Formula>[Line1]+[Line2]+[Tax]</Formula>
	 * 
	 * 
	 * @param formula
	 *            the new formula
	 */
	public void setFormula(String formula) {
		this.formula = formula;
	}

	/**
	 * Gets the checks if is payment amount.
	 * 
	 * @return the checks if is payment amount
	 */
	public Boolean getIsPaymentAmount() {
		return isPaymentAmount;
	}

	/**
	 * When true, sets this as a payment tab. Can only be used with Text,
	 * Number, or List tabs. The value of the tab must be a number.
	 * 
	 * 
	 * @param isPaymentAmount
	 *            the new checks if is payment amount
	 */
	public void setIsPaymentAmount(Boolean isPaymentAmount) {
		this.isPaymentAmount = isPaymentAmount;
	}
}
