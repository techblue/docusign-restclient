package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag on the document where you want the recipient to enter an
 * email. Email tags are single-line fields that accept any characters. The
 * system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the
 * tag. It uses the same parameters as a Text tab, with the validation message
 * and pattern set for email information.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class EmailTab extends AbstractTextTab {

}
