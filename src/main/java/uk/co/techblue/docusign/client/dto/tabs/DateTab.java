package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag on the document where you want the recipient to enter a date.
 * A date can be entered in any format and the date will be reformatted to
 * MM/DD/YYYY. It uses the same parameters as a Text tab, with the validation
 * message and pattern set for date information.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class DateTab extends AbstractTextTab {
	
}
