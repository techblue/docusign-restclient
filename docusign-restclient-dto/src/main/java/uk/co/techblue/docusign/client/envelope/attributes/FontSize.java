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

public enum FontSize {

	Size7("size7"),
	Size8("size8"),
	Size9("size9"),
	Size10("size10"),
	Size11("size11"),
	Size12("size12"),
	Size14("size14"),
	Size16("size16"),
	Size18("size18"),
	Size20("size20"),
	Size22("size22"),
	Size24("size24"),
	Size26("size26"),
	Size28("size28"),
	Size36("size36"),
	Size48("size48"),
	Size72("size72");

	private String key;

	FontSize(String key) {
		this.key = key.toLowerCase();
	}

	@JsonCreator
	public static FontSize newInstance(String key) {
		for (FontSize f : values()) {
			if (key.toLowerCase().equals(f.getFontSize())) {
				return f;
			}
		}
		return null;
	}

	@JsonValue
	public String getFontSize() {
		return key;
	}
}
