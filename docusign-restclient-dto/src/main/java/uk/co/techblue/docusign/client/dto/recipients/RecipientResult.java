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
import uk.co.techblue.docusign.client.dto.ErrorResponse;

public class RecipientResult extends BaseDto {
    
    private static final long serialVersionUID = -226030221608014937L;
    
    @JsonProperty("errorDetails")
    private ErrorResponse errorResponse;
    
    @JsonProperty
    private int recipientId;

    
    /**
     * @return the errorResponse
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * @param errorResponse the errorResponse to set
     */
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
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
