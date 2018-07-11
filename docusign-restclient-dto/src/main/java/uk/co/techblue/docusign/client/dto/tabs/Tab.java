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

import uk.co.techblue.docusign.client.dto.BaseDto;

/**
 * The entity to set tab location in document and other info.
 * 
 * Tabs are used to indicate locations in a document where the recipient should
 * take some action. Tabs are associated with a specific recipient and are only
 * used by the recipient types In Person Signers and Signers. There are 20
 * different tab types. Tab types share some common parameters, but the exact
 * parameters associated with a tab depend on the tab type. Tabs are associated
 * with a specific recipient and are only used by the recipient types In Person
 * Signers and Signers
 */
@JsonSerialize
@JsonInclude(value = Include.NON_NULL)
public abstract class Tab extends BaseDto {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7036184884043049630L;

	/** The anchor string. */
    @JsonProperty
    private String anchorString;

    /** The anchor x offset. */
    @JsonProperty
    private Integer anchorXOffset;

    /** The anchor y offset. */
    @JsonProperty
    private Integer anchorYOffset;

    /** The anchor ignore if not present. */
    @JsonProperty
    private Boolean anchorIgnoreIfNotPresent;

    /** The anchor units. */
    @JsonProperty
    private AnchorUnit anchorUnits;

    /** The document id. */
    @JsonProperty
    private String documentId;

    /** The x position. */
    @JsonProperty("xPosition")
    private Integer xPosition;

    /** The y position. */
    @JsonProperty("yPosition")
    private Integer yPosition;

    /** The page number. */
    @JsonProperty("pageNumber")
    private Integer pageNumber;

    /** The tab label. */
    @JsonProperty
    private String tabLabel;

    /**
     * Gets the x position.
     * 
     * @return the x position
     */
    public Integer getxPosition() {
        return xPosition;
    }

    /**
     * Sets the x position. This indicates the horizontal offset of the tab on
     * the page, in a coordinate space that has left top corner of the document
     * as origin.
     * 
     * 
     * @param xPosition
     *            the new x position
     */
    public void setxPosition(Integer xPosition) {
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
     * Sets the y position. This indicates the vertical offset of the tab on the
     * page, in a coordinate space that has left top corner of the document as
     * origin.
     * 
     * 
     * @param yPosition
     *            the new y position
     */
    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Gets the document id.
     * 
     * @return the document id
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the document id. This is the document ID number that the tab is
     * placed on. This must refer to an existing Document���s ID attribute.
     * 
     * 
     * @param documentId
     *            the new document id
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
     * Sets the page number.
     * 
     * @param pageNumber
     *            the new page number
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Gets the anchor string.
     * 
     * @return the anchor string
     */
    public String getAnchorString() {
        return anchorString;
    }

    /**
     * Specifies string searched for to place the tab in the document.
     * 
     * 
     * @param anchorString
     *            the new anchor string
     */
    public void setAnchorString(String anchorString) {
        this.anchorString = anchorString;
    }

    /**
     * Gets the anchor x offset.
     * 
     * @return the anchor x offset
     */
    public Integer getAnchorXOffset() {
        return anchorXOffset;
    }

    /**
     * Sets the anchor x offset. This specifies tab location as X Offset
     * position, using the anchorUnits, from the anchorString.
     * 
     * 
     * @param anchorXOffset
     *            the new anchor x offset
     */
    public void setAnchorXOffset(Integer anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }

    /**
     * Gets the anchor y offset.
     * 
     * @return the anchor y offset
     */
    public Integer getAnchorYOffset() {
        return anchorYOffset;
    }

    /**
     * Sets the anchor y offset. This specifies tab location as Y Offset
     * position, using the anchorUnits, from the anchorString.
     * 
     * 
     * @param anchorYOffset
     *            the new anchor y offset
     */
    public void setAnchorYOffset(Integer anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
    }

    /**
     * Gets the anchor ignore if not present.
     * 
     * @return the anchor ignore if not present
     */
    public Boolean getAnchorIgnoreIfNotPresent() {
        return anchorIgnoreIfNotPresent;
    }

    /**
     * If true, this tab is ignored if anchorString is not found in the document
     * else an exception is thrown by docusign.
     * 
     * 
     * @param anchorIgnoreIfNotPresent
     *            the new anchor ignore if not present
     */
    public void setAnchorIgnoreIfNotPresent(Boolean anchorIgnoreIfNotPresent) {
        this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    }

    /**
     * Gets the anchor units.
     * 
     * @return the anchor units
     */
    public AnchorUnit getAnchorUnits() {
        return anchorUnits;
    }

    /**
     * Specifies units of the anchor X and Y offset.
     * 
     * 
     * @param anchorUnits
     *            the new anchor units
     */
    public void setAnchorUnits(AnchorUnit anchorUnits) {
        this.anchorUnits = anchorUnits;
    }

    /**
     * Gets the tab label.
     * 
     * @return the tab label
     */
    public String getTabLabel() {
        return tabLabel;
    }

    /**
     * Sets the label used with the tab.
     * <p>
     * <b>Notes: Making a tab's TabLabel the same will cause the all like
     * fields to update when the user enters data.</b>
     * </p>
     * 
     * 
     * @param tabLabel
     *            the new tab label
     */
    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }

}
