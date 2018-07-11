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
package uk.co.techblue.docusign.client.dto.recipients;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.dto.BaseDto;
import uk.co.techblue.docusign.client.envelope.attributes.SupportedLanguage;

/**
 * The Class RecipientEmailNotification.
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class RecipientEmailNotification extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1202148581038428107L;

	/** The subject. */
	@JsonProperty("subject")
	private String subject;

	/** The email blurb. */
	@JsonProperty("emailBlurb")
	private String emailBlurb;

	/** The language. */
	@JsonProperty("language")
	private SupportedLanguage language;

	/**
	 * Gets the subject.
	 * 
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 * 
	 * @param subject
	 *            the new subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Gets the email blurb.
	 * 
	 * @return the email blurb
	 */
	public String getEmailBlurb() {
		return emailBlurb;
	}

	/**
	 * Sets the email blurb.
	 * 
	 * @param emailBlurb
	 *            the new email blurb
	 */
	public void setEmailBlurb(String emailBlurb) {
		this.emailBlurb = emailBlurb;
	}

	/**
	 * Gets the language.
	 * 
	 * @return the language
	 */
	public SupportedLanguage getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 * 
	 * @param language
	 *            the new language
	 */
	public void setLanguage(SupportedLanguage language) {
		this.language = language;
	}
}
