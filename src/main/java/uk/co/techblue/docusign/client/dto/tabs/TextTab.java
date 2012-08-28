package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * This tag is an adaptable field that allows the recipient to enter different
 * text information.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
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
