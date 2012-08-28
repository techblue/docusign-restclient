package uk.co.techblue.docusign.client.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The class to send data for signature request via template.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class TemplateSignatureRequest extends SignatureRequest {
    
    /** The template id. */
    @JsonProperty("templateId")
    private String templateId;

    /** The template roles. */
    @JsonProperty("templateRoles")
    private List<TemplateRole> templateRoles;


    /**
     * Gets the template roles.
     * 
     * @return the template roles
     */
    public List<TemplateRole> getTemplateRoles() {
        return templateRoles;
    }

    /**
     * Sets the template roles.
     * 
     * @param templateRoles
     *            the new template roles
     */
    public void setTemplateRoles(List<TemplateRole> templateRoles) {
        this.templateRoles = templateRoles;
    }

    /**
     * Gets the template id.
     * 
     * @return the template id
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the template id.
     * 
     * @param templateId
     *            the new template id
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
