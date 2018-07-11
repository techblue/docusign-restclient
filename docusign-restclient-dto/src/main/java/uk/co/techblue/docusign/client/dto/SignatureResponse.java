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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.jackson.ISO8601DateDeserializer;

public class SignatureResponse extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4495501113950394429L;

	@JsonProperty("envelopeId")
    private String envelopeId;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("statusDateTime")
    private Date statusDateTime;

    @JsonProperty("uri")
    private String uri;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getStatusDateTime() {
        return statusDateTime;
    }

    @JsonDeserialize(using = ISO8601DateDeserializer.class)
    public void setStatusDateTime(Date statusDateTime) {
        this.statusDateTime = statusDateTime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
