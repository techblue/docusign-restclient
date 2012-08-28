package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class DocumentInfo extends Document {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("fileExtension")
	private String fileExtension;
	
	@JsonProperty("matchBoxes")
	private String matchBoxes;
	
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("remoteUrl")
	private String remoteUrl;
	
	@JsonProperty("uri")
	private String uri;

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getMatchBoxes() {
		return matchBoxes;
	}

	public void setMatchBoxes(String matchBoxes) {
		this.matchBoxes = matchBoxes;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemoteUrl() {
		return remoteUrl;
	}

	public void setRemoteUrl(String remoteUrl) {
		this.remoteUrl = remoteUrl;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
