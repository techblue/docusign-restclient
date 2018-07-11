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

public enum Font {

	Arial("arial"),
	ArialNarrow("arialnarrow"),
	Calibri("calibri"),
	CourierNew("couriernew"),
	Garamond("garamond"),
	Georgia("georgia"),
	Helvetica("helvetica"),
	LucidaConsole("lucidaconsole"),
	Tahoma("tahoma"),
	TimesNewRoman("timesnewroman"),
	Trebuchet("trebuchet"),
	Verdana("verdana");

	private String key;

	Font(String key) {
		this.key = key.toLowerCase();
	}

	@JsonCreator
	public static Font newInstance(String key) {
		for (Font f : values()) {
			if (key.toLowerCase().equals(f.getFont())) {
				return f;
			}
		}
		return null;
	}

	@JsonValue
	public String getFont() {
		return key;
	}
}
