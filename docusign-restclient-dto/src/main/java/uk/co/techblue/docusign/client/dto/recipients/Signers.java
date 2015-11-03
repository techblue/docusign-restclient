package uk.co.techblue.docusign.client.dto.recipients;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.dto.BaseDto;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Signers extends BaseDto {

    /**
     * 
     */
    private static final long serialVersionUID = 5490448065061151375L;
    
    @JsonProperty
    private List<RecipientUpdateDetails> signers;

    /**
     * @return the signers
     */
    public List<RecipientUpdateDetails> getSigners() {
        return signers;
    }

    /**
     * @param signers the signers to set
     */
    public void setSigners(List<RecipientUpdateDetails> signers) {
        this.signers = signers;
    }

}
