package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag on the document where you want the recipient to enter a ZIP
 * code. The ZIP code can be a five numbers or the ZIP+4 format with nine
 * numbers. The zip code can be typed with or without dashes. It uses the same
 * parameters as a Text tab, with the validation message and pattern set for ZIP
 * code information.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class ZipTab extends AbstractTextTab {
	
}
