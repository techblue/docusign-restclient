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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import uk.co.techblue.docusign.client.envelope.attributes.Font;
import uk.co.techblue.docusign.client.envelope.attributes.FontColor;
import uk.co.techblue.docusign.client.envelope.attributes.FontSize;

/**
 * Place this tag on the document where you want the recipient’s title to appear.
 */
@SuppressWarnings("serial")
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public class TitleTab extends Tab {
    /** The conditional parent label. */
    @JsonProperty
    private String conditionalParentLabel;

    /** The conditional parent value. */
    @JsonProperty
    private String conditionalParentValue;

    /** The recipient id. */
    @JsonProperty
    private String recipientId;

    /** The template locked. */
    @JsonProperty
    private Boolean templateLocked;

    /** The template required. */
    @JsonProperty
    private Boolean templateRequired;

    /** The bold. */
    @JsonProperty
    private Boolean bold;

    /** The font. */
    @JsonProperty
    private Font font;

    /** The font color. */
    @JsonProperty
    private FontColor fontColor;

    /** The font size. */
    @JsonProperty
    private FontSize fontSize;

    /** The italic. */
    @JsonProperty
    private Boolean italic;

    /** The underline. */
    @JsonProperty
    private Boolean underline;

    /** The conceal value on document. */
    @JsonProperty
    private Boolean concealValueOnDocument;

    /** The disable auto size. */
    @JsonProperty
    private Boolean disableAutoSize;

    /** The locked. */
    @JsonProperty
    private Boolean locked;

    /** The name. */
    @JsonProperty
    private String name;

    /** The required. */
    @JsonProperty
    private Boolean required;

    /** The value. */
    @JsonProperty
    private String value;

    /** The width. */
    @JsonProperty
    private Integer width;

    /**
     * Gets the conditional parent label.
     * 
     * @return the conditional parent label
     */
    public String getConditionalParentLabel() {
        return conditionalParentLabel;
    }

    /**
     * <b>Optional element.</b><br/>
     * Sets the conditional parent label. For conditional fields this is the TabLabel of the parent tab that controls this tab’s
     * visibility.
     * 
     * 
     * @param conditionalParentLabel the new conditional parent label
     */
    public void setConditionalParentLabel(final String conditionalParentLabel) {
        this.conditionalParentLabel = conditionalParentLabel;
    }

    /**
     * Gets the conditional parent value.
     * 
     * @return the conditional parent value
     */
    public String getConditionalParentValue() {
        return conditionalParentValue;
    }

    /**
     * <b>Optional element.</b><br/>
     * Sets the conditional parent value. For conditional fields this is the Value of the parent tab that controls this tab’s
     * visibility.
     * 
     * 
     * @param conditionalParentValue the new conditional parent value
     */
    public void setConditionalParentValue(final String conditionalParentValue) {
        this.conditionalParentValue = conditionalParentValue;
    }

    /**
     * Gets the recipient id.
     * 
     * @return the recipient id
     */
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the recipient id. This specifies the recipient associated with the tab. Must refer to an existing recipient’s ID
     * attribute.
     * 
     * 
     * @param recipientId the new recipient id
     */
    public void setRecipientId(final String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * Gets the template locked.
     * 
     * @return the template locked
     */
    public Boolean getTemplateLocked() {
        return templateLocked;
    }

    /**
     * <b>Optional element.</b><br/>
     * Sets the template locked. Used only when working with template tabs. If true, the attributes of the tab cannot be changed
     * by the sender.
     * 
     * 
     * @param templateLocked the new template locked
     */
    public void setTemplateLocked(final Boolean templateLocked) {
        this.templateLocked = templateLocked;
    }

    /**
     * Gets the template required.
     * 
     * @return the template required
     */
    public Boolean getTemplateRequired() {
        return templateRequired;
    }

    /**
     * <b>Optional element.</b><br/>
     * Sets the template required. Used only when working with template tabs. If true, the tab cannot be removed by the sender.
     * 
     * 
     * @param templateRequired the new template required
     */
    public void setTemplateRequired(final Boolean templateRequired) {
        this.templateRequired = templateRequired;
    }

    /**
     * Gets the bold.
     * 
     * @return the bold
     */
    public Boolean getBold() {
        return bold;
    }

    /**
     * If true, the information in the tab is bold.
     * 
     * @param bold the new bold
     */
    public void setBold(final Boolean bold) {
        this.bold = bold;
    }

    /**
     * Gets the font.
     * 
     * @return the font
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the font type used for the information in the tab.
     * 
     * 
     * @param font the font
     */
    public void setFont(final Font font) {
        this.font = font;
    }

    /**
     * Gets the font color.
     * 
     * @return the font color
     */
    public FontColor getFontColor() {
        return fontColor;
    }

    /**
     * Sets the font color used for the information in the tab .
     * 
     * @param fontColor the new font color
     */
    public void setFontColor(final FontColor fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Gets the font size.
     * 
     * @return the font size
     */
    public FontSize getFontSize() {
        return fontSize;
    }

    /**
     * Sets the font size used for the information in the tab.
     * 
     * 
     * @param fontSize the new font size
     */
    public void setFontSize(final FontSize fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Gets the italic.
     * 
     * @return the italic
     */
    public Boolean getItalic() {
        return italic;
    }

    /**
     * If true, the information in the tab is italic.
     * 
     * 
     * @param italic the new italic
     */
    public void setItalic(final Boolean italic) {
        this.italic = italic;
    }

    /**
     * Gets the underline.
     * 
     * @return the underline
     */
    public Boolean getUnderline() {
        return underline;
    }

    /**
     * If true, the information in the tab is underlined.
     * 
     * 
     * @param underline the new underline
     */
    public void setUnderline(final Boolean underline) {
        this.underline = underline;
    }

    /**
     * Gets the conceal value on document.
     * 
     * @return the conceal value on document
     */
    public Boolean getConcealValueOnDocument() {
        return concealValueOnDocument;
    }

    /**
     * <b>Optional element.</b><br/>
     * If true the field appears normally while the recipient is adding or modifying the information in the field, but the data
     * is not visible (the characters are hidden by asterisks) to any other signer or the sender. When an envelope is completed
     * the information is available to the sender through the Form Data link in the DocuSign Console. This setting applies only
     * to text boxes and does not affect list boxes, radio buttons, or check boxes.
     * 
     * @param concealValueOnDocument the new conceal value on document
     */
    public void setConcealValueOnDocument(final Boolean concealValueOnDocument) {
        this.concealValueOnDocument = concealValueOnDocument;
    }

    /**
     * Gets the disable auto size.
     * 
     * @return the disable auto size
     */
    public Boolean getDisableAutoSize() {
        return disableAutoSize;
    }

    /**
     * Disables the auto sizing of single line text boxes in the signing screen when the signer.
     * 
     * @param disableAutoSize the new disable auto size
     */
    public void setDisableAutoSize(final Boolean disableAutoSize) {
        this.disableAutoSize = disableAutoSize;
    }

    /**
     * Gets the locked.
     * 
     * @return the locked
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * If true, the Signer cannot change the data in the tab.
     * 
     * 
     * @param locked the new locked
     */
    public void setLocked(final Boolean locked) {
        this.locked = locked;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the names associated with the tab type.
     * 
     * 
     * @param name the new name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the required.
     * 
     * @return the required
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * If true, the signer is required to fill out this tab.
     * 
     * @param required the new required
     */
    public void setRequired(final Boolean required) {
        this.required = required;
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value. This element specifies the value of the tab.
     * 
     * 
     * @param value the new value
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * Gets the width.
     * 
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the width of the tab.
     * 
     * @param width the new width
     */
    public void setWidth(final Integer width) {
        this.width = width;
    }

}
