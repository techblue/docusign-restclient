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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The Status Change Request dto.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class StatusChangeRequest extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6777526898091923906L;

	/** The status. */
    @JsonProperty("status")
    private Status status;

    /** The status reason. */
    @JsonProperty("statusReason")
    private String statusReason;

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the status reason.
     * 
     * @return the status reason
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the status reason.
     * 
     * @param statusReason
     *            the new status reason
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }
}
