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

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Class RadioButton.
 */
public class RadioButton extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1684081071296746812L;

    /** The anchor tab string. */
    @JsonProperty
    private String anchorString;

    /** The anchor x offset. */
    @JsonProperty
    private String anchorXOffset;

    /** The anchor y offset. */
    @JsonProperty
    private String anchorYOffset;

    /** The anchor ignore if not present. */
    @JsonProperty
    private boolean anchorIgnoreIfNotPresent;

    /** The anchor units. */
    @JsonProperty
    private String anchorUnits;

    /** The locked. */
    @JsonProperty
    private boolean locked;

    /** The page number. */
    @JsonProperty
    private Integer pageNumber;

    /** The required. */
    @JsonProperty
    private boolean required;

    /** The selected. */
    @JsonProperty
    private boolean selected;

    /** The value. */
    @JsonProperty
    private String value;

    /** The x position. */
    @JsonProperty
    private Integer xPosition;

    /** The y position. */
    @JsonProperty
    private Integer yPosition;

    /**
     * Gets the anchor string.
     *
     * @return the anchor string
     */
    public String getAnchorString() {
        return anchorString;
    }

    /**
     * Sets the anchor text information for the radio button.
     *
     *
     * @param anchorString the new anchor string
     */
    public void setAnchorString(final String anchorString) {
        this.anchorString = anchorString;
    }

    /**
     * Gets the anchor x offset.
     *
     * @return the anchor x offset
     */
    public String getAnchorXOffset() {
        return anchorXOffset;
    }

    /**
     * Sets the anchor x offset.
     *
     * @param anchorXOffset the new anchor x offset
     */
    public void setAnchorXOffset(final String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }

    /**
     * Gets the anchor y offset.
     *
     * @return the anchor y offset
     */
    public String getAnchorYOffset() {
        return anchorYOffset;
    }

    /**
     * Sets the anchor y offset.
     *
     * @param anchorYOffset the new anchor y offset
     */
    public void setAnchorYOffset(final String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
    }

    /**
     * Checks if is anchor ignore if not present.
     *
     * @return true, if is anchor ignore if not present
     */
    public boolean isAnchorIgnoreIfNotPresent() {
        return anchorIgnoreIfNotPresent;
    }

    /**
     * Sets the anchor ignore if not present.
     *
     * @param anchorIgnoreIfNotPresent the new anchor ignore if not present
     */
    public void setAnchorIgnoreIfNotPresent(final boolean anchorIgnoreIfNotPresent) {
        this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    }

    /**
     * Gets the anchor units.
     *
     * @return the anchor units
     */
    public String getAnchorUnits() {
        return anchorUnits;
    }

    /**
     * Sets the anchor units.
     *
     * @param anchorUnits the new anchor units
     */
    public void setAnchorUnits(final String anchorUnits) {
        this.anchorUnits = anchorUnits;
    }

    /**
     * Checks if is locked.
     *
     * @return true, if is locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the locked.
     *
     * @param locked the new locked
     */
    public void setLocked(final boolean locked) {
        this.locked = locked;
    }

    /**
     * Gets the page number.
     *
     * @return the page number
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the page number the radio button is located on.
     *
     *
     * @param pageNumber the new page number
     */
    public void setPageNumber(final Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Checks if is required.
     *
     * @return true, if is required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the required.
     *
     * @param required the new required
     */
    public void setRequired(final boolean required) {
        this.required = required;
    }

    /**
     * Checks if is selected.
     *
     * @return true, if is selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets if this radio button is selected. Use true/false to show the value is selected or not. Only one radio button can be
     * true.
     *
     *
     * @param selected the new selected
     */
    public void setSelected(final boolean selected) {
        this.selected = selected;
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
     * Sets the value. if an X, this is the selected radio button. Only one radio button in a group can be selected.
     *
     *
     * @param value the new value
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * Gets the x position.
     *
     * @return the x position
     */
    public Integer getxPosition() {
        return xPosition;
    }

    /**
     * Sets the x position. This indicates the horizontal offset of the radio button on the page.
     *
     *
     * @param xPosition the new x position
     */
    public void setxPosition(final Integer xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Gets the y position.
     *
     * @return the y position
     */
    public Integer getyPosition() {
        return yPosition;
    }

    /**
     * Sets the y position. This indicates the vertical offset of the radio button on the page.
     *
     *
     * @param yPosition the new y position
     */
    public void setyPosition(final Integer yPosition) {
        this.yPosition = yPosition;
    }
}
