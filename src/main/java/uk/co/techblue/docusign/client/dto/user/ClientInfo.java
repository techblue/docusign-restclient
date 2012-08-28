package uk.co.techblue.docusign.client.dto.user;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.docusign.client.BaseDto;


public class ClientInfo  extends BaseDto{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5249900304157767099L;

	@JsonProperty("apiPassword")
    private String apiPassword;

    @JsonProperty("loginAccounts")
    private List<LoginAccount> loginAccounts;

    @JsonProperty("preferredAPIVersion")
    private String preferredAPIVersion;

    @JsonProperty("supportedAPIVersions")
    private List<String> supportedAPIVersions;

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public List<LoginAccount> getLoginAccounts() {
        return loginAccounts;
    }

    public void setLoginAccounts(List<LoginAccount> loginAccounts) {
        this.loginAccounts = loginAccounts;
    }

    public String getPreferredAPIVersion() {
        return preferredAPIVersion;
    }

    public void setPreferredAPIVersion(String preferredAPIVersion) {
        this.preferredAPIVersion = preferredAPIVersion;
    }

    public List<String> getSupportedAPIVersions() {
        return supportedAPIVersions;
    }

    public void setSupportedAPIVersions(List<String> supportedAPIVersions) {
        this.supportedAPIVersions = supportedAPIVersions;
    }

}
