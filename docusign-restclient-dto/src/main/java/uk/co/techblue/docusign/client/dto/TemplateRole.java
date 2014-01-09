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

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The class to represent Template Role.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class TemplateRole extends BaseDto {

	private static final long serialVersionUID = -8106974901588913285L;

	/** The client user id. */
    @JsonProperty("clientUserId")
    private String clientUserId;

    /** The email. */
    @JsonProperty("email")
    private String email;

    /** The name. */
    @JsonProperty("name")
    private String name;

    /** The role name. */
    @JsonProperty("roleName")
    private String roleName;
    
    /** The tabs. */
    @JsonProperty
    private DocumentTabCollection tabs;

    /**
     * Gets the client user id.
     * 
     * @return the client user id
     */
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * Sets the client user id.
     * 
     * @param clientUserId
     *            the new client user id
     */
    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email
     *            the new email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Gets the role name.
     * 
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the role name.
     * 
     * @param roleName
     *            the new role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets the tabs.
     * 
     * @return the tabs
     */
    public DocumentTabCollection getTabs() {
        return tabs;
    }

    /**
     * Sets the tabs.
     * 
     * @param tabs the new tabs
     */
    public void setTabs(DocumentTabCollection tabs) {
        this.tabs = tabs;
    }
    
    
}
