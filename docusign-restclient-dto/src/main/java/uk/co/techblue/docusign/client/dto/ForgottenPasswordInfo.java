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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * The Forgotten Password Info primarily sent in change password request.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class ForgottenPasswordInfo extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4365766537398551315L;

	/** The forgotten password question1. */
	private String forgottenPasswordQuestion1;

	/** The forgotten password question2. */
	private String forgottenPasswordQuestion2;

	/** The forgotten password question3. */
	private String forgottenPasswordQuestion3;

	/** The forgotten password question4. */
	private String forgottenPasswordQuestion4;

	/** The forgotten password answer1. */
	private String forgottenPasswordAnswer1;

	/** The forgotten password answer2. */
	private String forgottenPasswordAnswer2;

	/** The forgotten password answer3. */
	private String forgottenPasswordAnswer3;

	/** The forgotten password answer4. */
	private String forgottenPasswordAnswer4;

	/**
	 * Gets the forgotten password question1.
	 * 
	 * @return the forgotten password question1
	 */
	public String getForgottenPasswordQuestion1() {
		return forgottenPasswordQuestion1;
	}

	/**
	 * Sets the forgotten password question1.
	 * 
	 * @param forgottenPasswordQuestion1
	 *            the new forgotten password question1
	 */
	public void setForgottenPasswordQuestion1(String forgottenPasswordQuestion1) {
		this.forgottenPasswordQuestion1 = forgottenPasswordQuestion1;
	}

	/**
	 * Gets the forgotten password question2.
	 * 
	 * @return the forgotten password question2
	 */
	public String getForgottenPasswordQuestion2() {
		return forgottenPasswordQuestion2;
	}

	/**
	 * Sets the forgotten password question2.
	 * 
	 * @param forgottenPasswordQuestion2
	 *            the new forgotten password question2
	 */
	public void setForgottenPasswordQuestion2(String forgottenPasswordQuestion2) {
		this.forgottenPasswordQuestion2 = forgottenPasswordQuestion2;
	}

	/**
	 * Gets the forgotten password question3.
	 * 
	 * @return the forgotten password question3
	 */
	public String getForgottenPasswordQuestion3() {
		return forgottenPasswordQuestion3;
	}

	/**
	 * Sets the forgotten password question3.
	 * 
	 * @param forgottenPasswordQuestion3
	 *            the new forgotten password question3
	 */
	public void setForgottenPasswordQuestion3(String forgottenPasswordQuestion3) {
		this.forgottenPasswordQuestion3 = forgottenPasswordQuestion3;
	}

	/**
	 * Gets the forgotten password question4.
	 * 
	 * @return the forgotten password question4
	 */
	public String getForgottenPasswordQuestion4() {
		return forgottenPasswordQuestion4;
	}

	/**
	 * Sets the forgotten password question4.
	 * 
	 * @param forgottenPasswordQuestion4
	 *            the new forgotten password question4
	 */
	public void setForgottenPasswordQuestion4(String forgottenPasswordQuestion4) {
		this.forgottenPasswordQuestion4 = forgottenPasswordQuestion4;
	}

	/**
	 * Gets the forgotten password answer1.
	 * 
	 * @return the forgotten password answer1
	 */
	public String getForgottenPasswordAnswer1() {
		return forgottenPasswordAnswer1;
	}

	/**
	 * Sets the forgotten password answer1.
	 * 
	 * @param forgottenPasswordAnswer1
	 *            the new forgotten password answer1
	 */
	public void setForgottenPasswordAnswer1(String forgottenPasswordAnswer1) {
		this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
	}

	/**
	 * Gets the forgotten password answer2.
	 * 
	 * @return the forgotten password answer2
	 */
	public String getForgottenPasswordAnswer2() {
		return forgottenPasswordAnswer2;
	}

	/**
	 * Sets the forgotten password answer2.
	 * 
	 * @param forgottenPasswordAnswer2
	 *            the new forgotten password answer2
	 */
	public void setForgottenPasswordAnswer2(String forgottenPasswordAnswer2) {
		this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
	}

	/**
	 * Gets the forgotten password answer3.
	 * 
	 * @return the forgotten password answer3
	 */
	public String getForgottenPasswordAnswer3() {
		return forgottenPasswordAnswer3;
	}

	/**
	 * Sets the forgotten password answer3.
	 * 
	 * @param forgottenPasswordAnswer3
	 *            the new forgotten password answer3
	 */
	public void setForgottenPasswordAnswer3(String forgottenPasswordAnswer3) {
		this.forgottenPasswordAnswer3 = forgottenPasswordAnswer3;
	}

	/**
	 * Gets the forgotten password answer4.
	 * 
	 * @return the forgotten password answer4
	 */
	public String getForgottenPasswordAnswer4() {
		return forgottenPasswordAnswer4;
	}

	/**
	 * Sets the forgotten password answer4.
	 * 
	 * @param forgottenPasswordAnswer4
	 *            the new forgotten password answer4
	 */
	public void setForgottenPasswordAnswer4(String forgottenPasswordAnswer4) {
		this.forgottenPasswordAnswer4 = forgottenPasswordAnswer4;
	}

}
