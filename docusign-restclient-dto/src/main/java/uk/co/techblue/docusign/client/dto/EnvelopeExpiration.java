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

/**
 * The Class EnvelopeExpiration.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class EnvelopeExpiration extends BaseDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8327517580674914390L;

	/** The expire after. */
	@JsonProperty
	private Integer expireAfter;

	/** The expire enabled. */
	@JsonProperty
	private boolean expireEnabled;

	/** The expire warn. */
	@JsonProperty
	private Integer expireWarn;

	/**
	 * Gets the expire after.
	 * 
	 * @return the expire after
	 */
	public Integer getExpireAfter() {
		return expireAfter;
	}

	/**
	 * Sets the expire after.
	 * 
	 * @param expireAfter
	 *            the new expire after
	 */
	public void setExpireAfter(Integer expireAfter) {
		this.expireAfter = expireAfter;
	}

	/**
	 * Gets the expire enabled.
	 * 
	 * @return the expire enabled
	 */
	public boolean getExpireEnabled() {
		return expireEnabled;
	}

	/**
	 * Sets the expire enabled.
	 * 
	 * @param expireEnabled
	 *            the new expire enabled
	 */
	public void setExpireEnabled(boolean expireEnabled) {
		this.expireEnabled = expireEnabled;
	}

	/**
	 * Gets the expire warn.
	 * 
	 * @return the expire warn
	 */
	public Integer getExpireWarn() {
		return expireWarn;
	}

	/**
	 * Sets the expire warn.
	 * 
	 * @param expireWarn
	 *            the new expire warn
	 */
	public void setExpireWarn(Integer expireWarn) {
		this.expireWarn = expireWarn;
	}
}
