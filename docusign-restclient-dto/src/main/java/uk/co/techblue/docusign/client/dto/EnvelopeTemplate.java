/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

/**
 * The Envelope Template.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class EnvelopeTemplate extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4244209247836449865L;

	/** The template id. */
    @JsonProperty("templateId")
    private String templateId;

    /** The name. */
    @JsonProperty("name")
    private String name;

    /** The description. */
    @JsonProperty("description")
    private String description;

    /** The last modified. */
    @JsonProperty("lastModified")
    private Date lastModified;

    /** The page count. */
    @JsonProperty("pageCount")
    private int pageCount;

    /** The password. */
    @JsonProperty("password")
    private String password;

    /** The shared. */
    @JsonProperty("shared")
    private boolean shared;

    /** The template uri. */
    @JsonProperty("uri")
    private String templateUri;

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

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param description
     *            the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the last modified.
     * 
     * @return the last modified
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * Sets the last modified.
     * 
     * @param lastModified
     *            the new last modified
     */
    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Gets the page count.
     * 
     * @return the page count
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Sets the page count.
     * 
     * @param pageCount
     *            the new page count
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Checks if is shared.
     * 
     * @return true, if is shared
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the shared.
     * 
     * @param shared
     *            the new shared
     */
    public void setShared(boolean shared) {
        this.shared = shared;
    }

    /**
     * Gets the template uri.
     * 
     * @return the template uri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    /**
     * Sets the template uri.
     * 
     * @param templateUri
     *            the new template uri
     */
    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

}
