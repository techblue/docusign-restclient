package uk.co.techblue.docusign.client.dto;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Document extends BaseDto{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4024112171517870250L;

	@JsonProperty
    private String documentId;

    @JsonProperty
    private String name;

    @JsonIgnore
    private String path;

    @JsonIgnore
    private String data;
    
   public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPath() {
        return path;
    }

    @JsonIgnore
    public void setPath(String path) {
        this.path = path;
    }
    
    @JsonIgnore   
    public String getData() {
		return data;
	}
    
    @JsonIgnore
	public void setData(String data) {
		this.data = data;
	}

}
