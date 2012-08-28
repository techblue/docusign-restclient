package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.CustomFieldType;

public class CustomField extends BaseDto{
    

	/**
	 * 
	 */
	private static final long serialVersionUID = -3282799554508340487L;

	@JsonProperty("customFieldType")
	private CustomFieldType customFieldType;

	@JsonProperty("name")
	private String name;

	@JsonProperty("listItems")
	private String listItems;
	
	@JsonProperty("value")
	private String value;

	@JsonProperty("required")
	private String required;

	@JsonProperty("show")
	private Boolean show;

	public CustomFieldType getCustomFieldType() {
		return customFieldType;
	}

	public void setCustomFieldType(CustomFieldType customFieldType) {
		this.customFieldType = customFieldType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getListItems() {
		return listItems;
	}

	public void setListItems(String listItems) {
		this.listItems = listItems;
	}
    
	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
