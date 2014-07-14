package uk.co.techblue.docusign.client;

import org.jboss.resteasy.client.ClientRequest;

public interface DocuSignCredentials {
	public void setHeader(ClientRequest request);
	public String getUsername();
}
