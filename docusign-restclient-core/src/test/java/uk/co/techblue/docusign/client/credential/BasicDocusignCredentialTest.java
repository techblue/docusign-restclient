package uk.co.techblue.docusign.client.credential;

import org.apache.commons.lang3.StringUtils;
import org.jboss.resteasy.client.ClientRequest;
import org.junit.Assert;
import org.junit.Test;

import uk.co.techblue.docusign.client.utils.DocuSignConstants;

public class BasicDocusignCredentialTest {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String INTERGRATION_KEY = "intKey";
    private static final String SEND_ON_BEHALF_OF = "otherUsername";

    @Test
    public void testSendOnBehalfOf() {
        BasicDocusignCredential credential = new BasicDocusignCredential(USERNAME, PASSWORD, INTERGRATION_KEY, SEND_ON_BEHALF_OF);
        Assert.assertEquals(getCredentialString(true), BasicDocusignCredential.valueOf(credential));
    }

    @Test
    public void testValueOf() {
        BasicDocusignCredential credential = new BasicDocusignCredential(USERNAME, PASSWORD, INTERGRATION_KEY);
        Assert.assertEquals(getCredentialString(), BasicDocusignCredential.valueOf(credential));
    }

    @Test
    public void testSetHeader() {
        BasicDocusignCredential credential = new BasicDocusignCredential(USERNAME, PASSWORD, INTERGRATION_KEY);
        ClientRequest request = new ClientRequest("uriTemplate");
        // make sure auth header is not set
        Assert.assertNull(request.getHeaders().getFirst(DocuSignConstants.HEADER_PARAM_AUTHENTICATION));
        credential.setHeader(request);
        // verify auth header was set
        Assert.assertEquals(getCredentialString(), request.getHeaders().getFirst(DocuSignConstants.HEADER_PARAM_AUTHENTICATION));
    }

    private String getCredentialString() {
        return getCredentialString(false);
    }

    private String getCredentialString(boolean includeSendOnBehalfOf) {
        String expected = "<DocuSignCredentials>"
                        + "<Username>" + USERNAME + "</Username>"
                        + "<Password>" + PASSWORD + "</Password>"
                        + "<IntegratorKey>" + INTERGRATION_KEY + "</IntegratorKey>";
        if(includeSendOnBehalfOf) {
                expected += "<SendOnBehalfOf>" + SEND_ON_BEHALF_OF + "</SendOnBehalfOf>";
        }
        expected += "</DocuSignCredentials>";
        return expected;
    }

}
