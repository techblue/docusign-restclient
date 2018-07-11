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
package uk.co.techblue.docusign.client.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * The Class EnvelopeEmailSetting.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class EnvelopeEmailSetting extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4018511245527085865L;

    /** The reply email address override. */
    @JsonProperty(value = "replyEmailAddressOverride")
    private String replyEmailAddressOverride;

    /** The reply email name override. */
    @JsonProperty(value = "replyEmailNameOverride")
    private String replyEmailNameOverride;

    /** The bcc email addresses. */
    @JsonProperty(value = "bccEmailAddresses")
    private List<BlindCopyEmailAddress> bccEmailAddresses;

    /**
     * Gets the reply email address override.
     * 
     * @return the reply email address override
     */
    public String getReplyEmailAddressOverride() {
        return replyEmailAddressOverride;
    }

    /**
     * Sets the reply email address override.
     * 
     * @param replyEmailAddressOverride the new reply email address override
     */
    public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
        this.replyEmailAddressOverride = replyEmailAddressOverride;
    }

    /**
     * Gets the reply email name override.
     * 
     * @return the reply email name override
     */
    public String getReplyEmailNameOverride() {
        return replyEmailNameOverride;
    }

    /**
     * Sets the reply email name override.
     * 
     * @param replyEmailNameOverride the new reply email name override
     */
    public void setReplyEmailNameOverride(String replyEmailNameOverride) {
        this.replyEmailNameOverride = replyEmailNameOverride;
    }

    /**
     * Gets the bcc email addresses.
     * 
     * @return the bcc email addresses
     */
    public List<BlindCopyEmailAddress> getBccEmailAddresses() {
        return bccEmailAddresses;
    }

    /**
     * Sets the bcc email addresses.
     * 
     * @param bccEmailAddresses the new bcc email addresses
     */
    public void setBccEmailAddresses(List<BlindCopyEmailAddress> bccEmailAddresses) {
        this.bccEmailAddresses = bccEmailAddresses;
    }

}