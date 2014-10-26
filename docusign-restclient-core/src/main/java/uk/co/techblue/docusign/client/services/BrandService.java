package uk.co.techblue.docusign.client.services;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.docusign.client.BaseService;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.EsignBranding;
import uk.co.techblue.docusign.client.dto.user.LoginAccount;
import uk.co.techblue.docusign.client.exception.EnvelopeException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.resources.BrandResource;

/**
 * The Class BrandService.
 */
public class BrandService extends BaseService<BrandResource> {

    /**
     * Instantiates a new brand service.
     * 
     * @param loginAccount the login account
     * @param credentials the credentials
     * @throws ServiceInitException the service init exception
     */
    public BrandService(LoginAccount loginAccount, DocuSignCredentials credentials) throws ServiceInitException {
        super(loginAccount, credentials);
    }

    /**
     * Instantiates a new brand service.
     * 
     * @param serverUri the server uri
     * @param credentials the credentials
     * @throws ServiceInitException the service init exception
     */
    public BrandService(final String serverUri, final DocuSignCredentials credentials) throws ServiceInitException {
        super(serverUri, credentials);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.docusign.client.Service#getResourceClass()
     */
    @Override
    protected Class<BrandResource> getResourceClass() {
        return BrandResource.class;
    }

    /**
     * Gets the all esign brandings.
     * 
     * @return the all esign brandings
     * @throws EnvelopeException the envelope exception
     */
    public EsignBranding getAllEsignBrandings() throws EnvelopeException {
        final ClientResponse<EsignBranding> esignBrandingResponse = resourceProxy.getEsignBrandings();
        return parseEntityFromResponse(esignBrandingResponse, EnvelopeException.class);
    }
}
