package uk.co.techblue.docusign.client.dto;

import java.io.File;

public class DocumentFile extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File docFile;

	public File getDocFile() {
		return docFile;
	}

	public void setDocFile(File docFile) {
		this.docFile = docFile;
	}
}
