package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag on the document where you want the recipient to enter a
 * number. It uses the same parameters as a Text tab, with the validation
 * message and pattern set for number information.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class NumberTab extends AbstractTextTab {
	
}
