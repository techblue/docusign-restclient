package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;

public class UrlResponse extends BaseDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2584288652212351927L;
	@JsonProperty("url")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
