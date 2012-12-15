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
 * The Class CorrectionViewRequest.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class CorrectionViewRequest extends BaseDto {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2037369395946374334L;

	/** The return url. */
	@JsonProperty("returnUrl")
	private String returnUrl;

	/** The suppress navigation. */
	@JsonProperty("suppressNavigation")
	private Boolean suppressNavigation;

	/**
	 * Gets the return url.
	 * 
	 * @return the return url
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * Sets the return url. Identifies the return point after correcting the
	 * envelope. The URL will have an event passed to it as a query parameter.
	 * The parameter will be named â€œeventâ€�, see â€œIn-session sending eventsâ€�
	 * below for description of the valid events. The DocuSign Envelope Id will
	 * also be returned in the â€œenvelopeIdâ€� parameter.
	 * 
	 * 
	 * @param returnUrl
	 *            the new return url
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * Gets the suppress navigation.
	 * 
	 * @return the suppress navigation
	 */
	public Boolean getSuppressNavigation() {
		return suppressNavigation;
	}

	/**
	 * Sets the suppress navigation. Sets whether the window is displayed with
	 * or without dressing
	 * 
	 * @param suppressNavigation
	 *            the new suppress navigation
	 */
	public void setSuppressNavigation(Boolean suppressNavigation) {
		this.suppressNavigation = suppressNavigation;
	}
}
