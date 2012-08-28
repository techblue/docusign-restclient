package uk.co.techblue.docusign.client.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeTemplateDefinition extends BaseDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2896528839725287251L;

	@JsonProperty
	private String description;
	
	@JsonProperty
	private Date lastModified;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private Integer pageCount;
	
	@JsonProperty
	private String password;
	
	@JsonProperty
	private boolean shared;
	
	@JsonProperty
	private String templateId;
	
	@JsonProperty
	private String uri;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
