package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag on the document where you want the envelope ID for to appear.
 * Recipients cannot enter or change the information in this tab, it is for
 * informational purposes only.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class EnvelopeIdTab extends Tab {

}
