package uk.co.techblue.docusign.client.dto.tabs;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Place this tag to have a recipient place their signature in the document. The
 * “optional” parameter sets if the signature is required or optional.
 */
@SuppressWarnings("serial")
@JsonSerialize(include = Inclusion.NON_NULL)
public class SignHereTab extends InitialHereTab {
	
}
