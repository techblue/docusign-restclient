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

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.apache.commons.lang3.StringUtils;

import uk.co.techblue.docusign.client.dto.utils.DtoHelper;
import uk.co.techblue.docusign.client.envelope.attributes.AuthoritativeCopyStatus;
import uk.co.techblue.docusign.client.envelope.attributes.Status;

/**
 * The Form class encapsulating the parameters to query envelope status.
 */
public class EnvelopeStatusQueryForm extends BaseDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6701012111155170795L;

	/** The from date. */
	private Date fromDate;

	/** The to date. */
	private Date toDate;

	/** The status. */
	private List<Status> statuses;

	@QueryParam("from_to_status")
	private Status statusChangedTo;

	/** The envelope id. */
	private List<String> envelopeIds;

	@QueryParam("ac_status")
	private AuthoritativeCopyStatus authoritativeCopyStatus;

	/**
	 * Gets the from date.
	 * 
	 * @return the from date
	 * @throws ParseException
	 */
	@QueryParam("from_date")
	public String getFromDate() throws ParseException {
		if (fromDate != null) {
			return DtoHelper.formatISO8601Date(fromDate);
		}
		return null;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the date/time that specifies the date/time when the request begins
	 * checking for status changes for envelopes in the account.
	 * 
	 * 
	 * @param fromDate
	 *            the from date
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * Gets the to date.
	 * 
	 * @return the to date
	 * @throws ParseException
	 */
	@QueryParam("to_date")
	public String getToDate() throws ParseException {
		if (toDate != null) {
			return DtoHelper.formatISO8601Date(toDate);
		}
		return null;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the date/time setting that specifies the date/time when the request
	 * stops for status changes for envelopes in the account. If not set, the
	 * system uses the time of the call as the to_date.
	 * 
	 * 
	 * @param toDate
	 *            the to date
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	@QueryParam("status")
	public String getStatuses() {
		if (statuses != null) {
			return DtoHelper.getCommaSeparatedValue(statuses);
		}
		return null;

	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the envelope status code changes being requested.
	 * 
	 * 
	 * @param status
	 *            the new status
	 */
	public void setStatuses(List<Status> statuses) {
		this.statuses = statuses;
	}

	/**
	 * Gets the envelope id.
	 * 
	 * @return the envelope id
	 */
	@QueryParam("envelope_ids")
	public String getEnvelopeIds() {
		if (envelopeIds != null) {
			return StringUtils.join(envelopeIds, ",");
		}
		return null;
	}

	/**
	 * <b>Optional</b><br/>
	 * Sets the envelope id for the envelope.
	 * 
	 * @param envelopeId
	 *            the new envelope id
	 */
	public void setEnvelopeIds(List<String> envelopeIds) {
		this.envelopeIds = envelopeIds;
	}

	/**
	 * Gets the status changed to.
	 * 
	 * @return the status changed to
	 */
	public Status getStatusChangedTo() {
		return statusChangedTo;
	}

	/**
	 * Sets the status changed to. This is the status type checked for in the
	 * from_date/to_date period. If "changed" is specified, then envelopes that
	 * changed status during the period are found. If for example, "created" is
	 * specified, then envelopes created during the period are found. Default is
	 * “changed”.
	 * 
	 * 
	 * @param statusChangedTo
	 *            the new status changed to
	 */
	public void setStatusChangedTo(Status statusChangedTo) {
		this.statusChangedTo = statusChangedTo;
	}

	/**
	 * Gets the authoritative copy status.
	 * 
	 * @return the authoritative copy status
	 */
	public AuthoritativeCopyStatus getAuthoritativeCopyStatus() {
		return authoritativeCopyStatus;
	}

	/**
	 * Sets the authoritative copy status for the envelopes.
	 * 
	 * @param authoritativeCopyStatus
	 *            the new authoritative copy status
	 */
	public void setAuthoritativeCopyStatus(
			AuthoritativeCopyStatus authoritativeCopyStatus) {
		this.authoritativeCopyStatus = authoritativeCopyStatus;
	}

}
