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
package uk.co.techblue.docusign.client.envelope.attributes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FontColor {
	Black("black"),
	BrightBlue("brightblue"),
	BrightRed("brightred"),
	DarkGreen("darkgreen"),
	DarkRed("darkred"),
	Gold("gold"),
	Green("green"),
	NavyBlue("navyblue"),
	Purple("purple"),
	White("white");

	private String key;

	FontColor(String key) {
		this.key = key.toLowerCase();
	}

	@JsonCreator
	public static FontColor newInstance(String key) {
		for (FontColor f : values()) {
			if (key.toLowerCase().equals(f.getFontColor())) {
				return f;
			}
		}
		return null;
	}

	@JsonValue
	public String getFontColor() {
		return key;
	}
}
