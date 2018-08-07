package uk.co.techblue.docusign.client.dto.tabs;

public abstract class AbstractRecipientTab extends Tab {
	private static final long serialVersionUID = -526444511551408649L;

	public enum TabTypes {ApproveTab, CheckboxTab, CompanyTab, 
		DateSignedTab, DateTab, DeclineTab, EmailTab, FullNameTab,
		InitialHereTab, NoteTab, NumberTab, SignHereTab, SSNTab, 
		TextTab, TitleTab, ZipTab};
	
	/** The recipient id. */
	public abstract String getRecipientId();
	public abstract void setRecipientId(String recipientId);
}
