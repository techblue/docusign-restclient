/*******************************************************************************
 * Copyright 2015 Technology Blueprint Ltd
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
package uk.co.techblue.docusign.client.dto.recipients;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.docusign.client.dto.BaseDto;

public class RecipientUpdateDetails extends BaseDto {

    private static final long serialVersionUID = 3932739876992196019L;

    @JsonProperty
    private String email;

    @JsonProperty
    private String name;

    @JsonProperty
    private int recipientId;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the recipientId
     */
    public int getRecipientId() {
        return recipientId;
    }

    /**
     * @param recipientId the recipientId to set
     */
    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

}
