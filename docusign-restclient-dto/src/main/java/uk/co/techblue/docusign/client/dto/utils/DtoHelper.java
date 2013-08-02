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
package uk.co.techblue.docusign.client.dto.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * The Class DocuSignUtils.
 */
public class DtoHelper {

	private static final String ISO8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSz";

	/**
	 * Parses the ISO8601 date string.
	 * 
	 * @param dateString
	 *            the date string
	 * @return the date
	 * @throws ParseException
	 *             the parse exception
	 */
	public static Date parseISO8601Date(String dateString)
			throws ParseException {
	    if(!dateString.endsWith("Z")) {
            dateString+="Z";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(ISO8601_PATTERN);
        dateString = dateString.replaceAll("(\\.[0-9]{3})[0-9]*(Z)", "$1$2");
        if (dateString.endsWith("Z")) {
            dateString = dateString.substring(0, dateString.length() - 1) + "GMT-00:00";
        } else {
            int inset = 6;
            String strPrefix = dateString.substring(0, dateString.length() - inset);
            String strSuffix = dateString.substring(dateString.length() - inset, dateString.length());
            dateString = strPrefix + "GMT" + strSuffix;
        }
        return sdf.parse(dateString);
	}

	/**
	 * Format is o8601 date.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String formatISO8601Date(Date date) throws ParseException {
		return formatDate(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'0000Z'", true);
	}

	/**
	 * Format date to string using specified pattern.
	 * 
	 * @param date
	 *            the date
	 * @param pattern
	 *            the pattern
	 * @param toUTC
	 *            the to utc
	 * @return the string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String formatDate(Date date, String pattern, boolean toUTC)
			throws ParseException {
		DateFormat df = new SimpleDateFormat(pattern);
		if (toUTC) {
			TimeZone tz = TimeZone.getTimeZone("UTC");
			df.setTimeZone(tz);
		}
		return df.format(date);
	}


	/**
	 * Gets the comma separated value.
	 * 
	 * @param enumList
	 *            the enum list
	 * @return the comma separated value
	 */
	public static String getCommaSeparatedValue(List<? extends Enum<?>> enumList) {
		StringBuffer stringBuffer = new StringBuffer();
		for (Enum<?> element : enumList) {
			if (stringBuffer.length() != 0) {
				stringBuffer.append(",");
			}
			stringBuffer.append(element.name());
		}
		return stringBuffer.toString();
	}


}
