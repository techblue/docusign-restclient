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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//FIXME  Call docusign to check actual parameter names. Their API documentations doesn't talks much about it.
/**
 * This Complex element contains information related to recipient ID check.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class IDCheckInformationInput extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3369521744658409223L;

	/** The address. */
	@JsonProperty("address")
	private String address;

	/** The dob. */
	@JsonProperty("dob")
	private Date dob;

	/** The S s4. */
	@JsonProperty("SS4")
	private String SS4;

	/** The S s9. */
	@JsonProperty("SS9")
	private String SS9;

	/**
	 * Gets the address.
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 * 
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the dob.
	 * 
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 * 
	 * @param dob
	 *            the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Gets the s s4.
	 * 
	 * @return the s s4
	 */
	public String getSS4() {
		return SS4;
	}

	/**
	 * Sets the s s4.
	 * 
	 * @param sS4
	 *            the new s s4
	 */
	public void setSS4(String sS4) {
		SS4 = sS4;
	}

	/**
	 * Gets the s s9.
	 * 
	 * @return the s s9
	 */
	public String getSS9() {
		return SS9;
	}

	/**
	 * Sets the s s9.
	 * 
	 * @param sS9
	 *            the new s s9
	 */
	public void setSS9(String sS9) {
		SS9 = sS9;
	}

}
