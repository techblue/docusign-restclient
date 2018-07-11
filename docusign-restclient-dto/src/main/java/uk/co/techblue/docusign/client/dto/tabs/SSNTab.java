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
package uk.co.techblue.docusign.client.dto.tabs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Place this tag on the document where you want the recipient to enter a Social
 * Security Number (SSN). A SSN can be typed with or without dashes. It uses the
 * same parameters as a Text tab, with the validation message and pattern set
 * for SSN information.
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class SSNTab extends AbstractTextTab {

}
