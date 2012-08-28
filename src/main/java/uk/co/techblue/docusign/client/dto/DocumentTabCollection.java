package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.dto.tabs.ApproveTab;
import uk.co.techblue.docusign.client.dto.tabs.CheckboxTab;
import uk.co.techblue.docusign.client.dto.tabs.CompanyTab;
import uk.co.techblue.docusign.client.dto.tabs.DateSignedTab;
import uk.co.techblue.docusign.client.dto.tabs.DateTab;
import uk.co.techblue.docusign.client.dto.tabs.DeclineTab;
import uk.co.techblue.docusign.client.dto.tabs.EmailTab;
import uk.co.techblue.docusign.client.dto.tabs.EnvelopeIdTab;
import uk.co.techblue.docusign.client.dto.tabs.FullNameTab;
import uk.co.techblue.docusign.client.dto.tabs.InitialHereTab;
import uk.co.techblue.docusign.client.dto.tabs.ListTab;
import uk.co.techblue.docusign.client.dto.tabs.NoteTab;
import uk.co.techblue.docusign.client.dto.tabs.NumberTab;
import uk.co.techblue.docusign.client.dto.tabs.RadioGroupTab;
import uk.co.techblue.docusign.client.dto.tabs.SSNTab;
import uk.co.techblue.docusign.client.dto.tabs.SignHereTab;
import uk.co.techblue.docusign.client.dto.tabs.SignerAttachmentTab;
import uk.co.techblue.docusign.client.dto.tabs.TextTab;
import uk.co.techblue.docusign.client.dto.tabs.TitleTab;
import uk.co.techblue.docusign.client.dto.tabs.ZipTab;

/**
 * This class encapsulates all types of tabs that can be configured in a
 * document
 * 
 * @author Ajay
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class DocumentTabCollection extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6622570686367909403L;

	/** The initial here tabs. */
	@JsonProperty("initialHereTabs")
	private List<InitialHereTab> initialHereTabs;

	/** The email tabs. */
	@JsonProperty("emailTabs")
	private List<EmailTab> emailTabs;

	/** The full name tabs. */
	@JsonProperty("fullNameTabs")
	private List<FullNameTab> fullNameTabs;

	/** The approve tabs. */
	@JsonProperty("approveTabs")
	private List<ApproveTab> approveTabs;

	/** The checkbox tabs. */
	@JsonProperty("checkboxTabs")
	private List<CheckboxTab> checkboxTabs;

	/** The company tabs. */
	@JsonProperty("companyTabs")
	private List<CompanyTab> companyTabs;

	/** The date signed tabs. */
	@JsonProperty("dateSignedTabs")
	private List<DateSignedTab> dateSignedTabs;

	/** The date tabs. */
	@JsonProperty("dateTabs")
	private List<DateTab> dateTabs;

	/** The decline tabs. */
	@JsonProperty("declineTabs")
	private List<DeclineTab> declineTabs;

	/** The envelope id tabs. */
	@JsonProperty("envelopeIdTabs")
	private List<EnvelopeIdTab> envelopeIdTabs;

	/** The list tabs. */
	@JsonProperty("listTabs")
	private List<ListTab> listTabs;

	/** The note tabs. */
	@JsonProperty("noteTabs")
	private List<NoteTab> noteTabs;

	/** The number tabs. */
	@JsonProperty("numberTabs")
	private List<NumberTab> numberTabs;

	/** The radio group tabs. */
	@JsonProperty("radioGroupTabs")
	private List<RadioGroupTab> radioGroupTabs;

	/** The sign here tabs. */
	@JsonProperty("signHereTabs")
	private List<SignHereTab> signHereTabs;

	/** The signer attachment tabs. */
	@JsonProperty("signerAttachmentTabs")
	private List<SignerAttachmentTab> signerAttachmentTabs;

	/** The ssn tabs. */
	@JsonProperty("ssnTabs")
	private List<SSNTab> ssnTabs;

	/** The text tabs. */
	@JsonProperty("textTabs")
	private List<TextTab> textTabs;

	/** The title tabs. */
	@JsonProperty("titleTabs")
	private List<TitleTab> titleTabs;

	/** The zip tabs. */
	@JsonProperty("zipTabs")
	private List<ZipTab> zipTabs;

	/**
	 * Gets the initial here tabs.
	 * 
	 * @return the initial here tabs
	 */
	public List<InitialHereTab> getInitialHereTabs() {
		return initialHereTabs;
	}

	/**
	 * Sets the initial here tabs.
	 * 
	 * @param initialHereTabs
	 *            the new initial here tabs
	 */
	public void setInitialHereTabs(List<InitialHereTab> initialHereTabs) {
		this.initialHereTabs = initialHereTabs;
	}

	/**
	 * Gets the email tabs.
	 * 
	 * @return the email tabs
	 */
	public List<EmailTab> getEmailTabs() {
		return emailTabs;
	}

	/**
	 * Sets the email tabs.
	 * 
	 * @param emailTabs
	 *            the new email tabs
	 */
	public void setEmailTabs(List<EmailTab> emailTabs) {
		this.emailTabs = emailTabs;
	}

	/**
	 * Gets the full name tabs.
	 * 
	 * @return the full name tabs
	 */
	public List<FullNameTab> getFullNameTabs() {
		return fullNameTabs;
	}

	/**
	 * Sets the full name tabs.
	 * 
	 * @param fullNameTabs
	 *            the new full name tabs
	 */
	public void setFullNameTabs(List<FullNameTab> fullNameTabs) {
		this.fullNameTabs = fullNameTabs;
	}

	/**
	 * Gets the approve tabs.
	 * 
	 * @return the approve tabs
	 */
	public List<ApproveTab> getApproveTabs() {
		return approveTabs;
	}

	/**
	 * Sets the approve tabs.
	 * 
	 * @param approveTabs
	 *            the new approve tabs
	 */
	public void setApproveTabs(List<ApproveTab> approveTabs) {
		this.approveTabs = approveTabs;
	}

	/**
	 * Gets the checkbox tabs.
	 * 
	 * @return the checkbox tabs
	 */
	public List<CheckboxTab> getCheckboxTabs() {
		return checkboxTabs;
	}

	/**
	 * Sets the checkbox tabs.
	 * 
	 * @param checkboxTabs
	 *            the new checkbox tabs
	 */
	public void setCheckboxTabs(List<CheckboxTab> checkboxTabs) {
		this.checkboxTabs = checkboxTabs;
	}

	/**
	 * Gets the company tabs.
	 * 
	 * @return the company tabs
	 */
	public List<CompanyTab> getCompanyTabs() {
		return companyTabs;
	}

	/**
	 * Sets the company tabs.
	 * 
	 * @param companyTabs
	 *            the new company tabs
	 */
	public void setCompanyTabs(List<CompanyTab> companyTabs) {
		this.companyTabs = companyTabs;
	}

	/**
	 * Gets the date signed tabs.
	 * 
	 * @return the date signed tabs
	 */
	public List<DateSignedTab> getDateSignedTabs() {
		return dateSignedTabs;
	}

	/**
	 * Sets the date signed tabs.
	 * 
	 * @param dateSignedTabs
	 *            the new date signed tabs
	 */
	public void setDateSignedTabs(List<DateSignedTab> dateSignedTabs) {
		this.dateSignedTabs = dateSignedTabs;
	}

	/**
	 * Gets the date tabs.
	 * 
	 * @return the date tabs
	 */
	public List<DateTab> getDateTabs() {
		return dateTabs;
	}

	/**
	 * Sets the date tabs.
	 * 
	 * @param dateTabs
	 *            the new date tabs
	 */
	public void setDateTabs(List<DateTab> dateTabs) {
		this.dateTabs = dateTabs;
	}

	/**
	 * Gets the decline tabs.
	 * 
	 * @return the decline tabs
	 */
	public List<DeclineTab> getDeclineTabs() {
		return declineTabs;
	}

	/**
	 * Sets the decline tabs.
	 * 
	 * @param declineTabs
	 *            the new decline tabs
	 */
	public void setDeclineTabs(List<DeclineTab> declineTabs) {
		this.declineTabs = declineTabs;
	}

	/**
	 * Gets the envelope id tabs.
	 * 
	 * @return the envelope id tabs
	 */
	public List<EnvelopeIdTab> getEnvelopeIdTabs() {
		return envelopeIdTabs;
	}

	/**
	 * Sets the envelope id tabs.
	 * 
	 * @param envelopeIdTabs
	 *            the new envelope id tabs
	 */
	public void setEnvelopeIdTabs(List<EnvelopeIdTab> envelopeIdTabs) {
		this.envelopeIdTabs = envelopeIdTabs;
	}

	/**
	 * Gets the list tabs.
	 * 
	 * @return the list tabs
	 */
	public List<ListTab> getListTabs() {
		return listTabs;
	}

	/**
	 * Sets the list tabs.
	 * 
	 * @param listTabs
	 *            the new list tabs
	 */
	public void setListTabs(List<ListTab> listTabs) {
		this.listTabs = listTabs;
	}

	/**
	 * Gets the note tabs.
	 * 
	 * @return the note tabs
	 */
	public List<NoteTab> getNoteTabs() {
		return noteTabs;
	}

	/**
	 * Sets the note tabs.
	 * 
	 * @param noteTabs
	 *            the new note tabs
	 */
	public void setNoteTabs(List<NoteTab> noteTabs) {
		this.noteTabs = noteTabs;
	}

	/**
	 * Gets the number tabs.
	 * 
	 * @return the number tabs
	 */
	public List<NumberTab> getNumberTabs() {
		return numberTabs;
	}

	/**
	 * Sets the number tabs.
	 * 
	 * @param numberTabs
	 *            the new number tabs
	 */
	public void setNumberTabs(List<NumberTab> numberTabs) {
		this.numberTabs = numberTabs;
	}

	/**
	 * Gets the radio group tabs.
	 * 
	 * @return the radio group tabs
	 */
	public List<RadioGroupTab> getRadioGroupTabs() {
		return radioGroupTabs;
	}

	/**
	 * Sets the radio group tabs.
	 * 
	 * @param radioGroupTabs
	 *            the new radio group tabs
	 */
	public void setRadioGroupTabs(List<RadioGroupTab> radioGroupTabs) {
		this.radioGroupTabs = radioGroupTabs;
	}

	/**
	 * Gets the sign here tabs.
	 * 
	 * @return the sign here tabs
	 */
	public List<SignHereTab> getSignHereTabs() {
		return signHereTabs;
	}

	/**
	 * Sets the sign here tabs.
	 * 
	 * @param signHereTabs
	 *            the new sign here tabs
	 */
	public void setSignHereTabs(List<SignHereTab> signHereTabs) {
		this.signHereTabs = signHereTabs;
	}

	/**
	 * Gets the signer attachment tabs.
	 * 
	 * @return the signer attachment tabs
	 */
	public List<SignerAttachmentTab> getSignerAttachmentTabs() {
		return signerAttachmentTabs;
	}

	/**
	 * Sets the signer attachment tabs.
	 * 
	 * @param signerAttachmentTabs
	 *            the new signer attachment tabs
	 */
	public void setSignerAttachmentTabs(
			List<SignerAttachmentTab> signerAttachmentTabs) {
		this.signerAttachmentTabs = signerAttachmentTabs;
	}

	/**
	 * Gets the ssn tabs.
	 * 
	 * @return the ssn tabs
	 */
	public List<SSNTab> getSsnTabs() {
		return ssnTabs;
	}

	/**
	 * Sets the ssn tabs.
	 * 
	 * @param ssnTabs
	 *            the new ssn tabs
	 */
	public void setSsnTabs(List<SSNTab> ssnTabs) {
		this.ssnTabs = ssnTabs;
	}

	/**
	 * Gets the text tabs.
	 * 
	 * @return the text tabs
	 */
	public List<TextTab> getTextTabs() {
		return textTabs;
	}

	/**
	 * Sets the text tabs.
	 * 
	 * @param textTabs
	 *            the new text tabs
	 */
	public void setTextTabs(List<TextTab> textTabs) {
		this.textTabs = textTabs;
	}

	/**
	 * Gets the title tabs.
	 * 
	 * @return the title tabs
	 */
	public List<TitleTab> getTitleTabs() {
		return titleTabs;
	}

	/**
	 * Sets the title tabs.
	 * 
	 * @param titleTabs
	 *            the new title tabs
	 */
	public void setTitleTabs(List<TitleTab> titleTabs) {
		this.titleTabs = titleTabs;
	}

	/**
	 * Gets the zip tabs.
	 * 
	 * @return the zip tabs
	 */
	public List<ZipTab> getZipTabs() {
		return zipTabs;
	}

	/**
	 * Sets the zip tabs.
	 * 
	 * @param zipTabs
	 *            the new zip tabs
	 */
	public void setZipTabs(List<ZipTab> zipTabs) {
		this.zipTabs = zipTabs;
	}

}
