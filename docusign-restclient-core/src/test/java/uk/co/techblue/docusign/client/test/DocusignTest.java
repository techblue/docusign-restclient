/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import uk.co.techblue.docusign.client.dto.CorrectionViewRequest;
import uk.co.techblue.docusign.client.dto.CustomField;
import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentInfo;
import uk.co.techblue.docusign.client.dto.DocumentSignatureRequest;
import uk.co.techblue.docusign.client.dto.DocumentTabCollection;
import uk.co.techblue.docusign.client.dto.Envelope;
import uk.co.techblue.docusign.client.dto.EnvelopeStatusQueryForm;
import uk.co.techblue.docusign.client.dto.SignatureResponse;
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.dto.TemplateRole;
import uk.co.techblue.docusign.client.dto.TemplateSignatureRequest;
import uk.co.techblue.docusign.client.dto.recipients.RecipientCollection;
import uk.co.techblue.docusign.client.dto.recipients.RecipientViewRequest;
import uk.co.techblue.docusign.client.dto.recipients.Signer;
import uk.co.techblue.docusign.client.dto.tabs.SignHereTab;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
import uk.co.techblue.docusign.client.dto.user.DocuSignCredentials;
import uk.co.techblue.docusign.client.envelope.attributes.Status;
import uk.co.techblue.docusign.client.exception.ConsoleViewException;
import uk.co.techblue.docusign.client.exception.EnvelopeException;
import uk.co.techblue.docusign.client.exception.LoginException;
import uk.co.techblue.docusign.client.exception.ServiceInitException;
import uk.co.techblue.docusign.client.exception.SignatureRequestException;
import uk.co.techblue.docusign.client.exception.TemplateException;
import uk.co.techblue.docusign.client.services.ConsoleViewService;
import uk.co.techblue.docusign.client.services.EnvelopeService;
import uk.co.techblue.docusign.client.services.LoginService;
import uk.co.techblue.docusign.client.services.RequestSignatureService;
import uk.co.techblue.docusign.client.services.TemplateService;

public class DocusignTest {
	private static final String SERVER_URI = "https://demo.docusign.net/restapi/v1";

	public static void main(String[] args) {
		DocuSignCredentials credentials = getDocuSignCredentials();
		try {
			// testLoginService(credentials);
			// testEnvelopeStatusChange(credentials);
			// testTemplateService(credentials);
			 testSendingDoucmentSignRequest(credentials);
//			testSignatureService(credentials);
//			 testSendingDocument(credentials);
//			 testGetEnvelope(credentials);
//		    testGetRecipient(credentials);
			// testGetEnvelope(credentials);
//			 testGetDocument(credentials);
			// testGettingConsoleViews(credentials);
			// testSavingEnvelopeToDrafts(credentials);
//			 testGettingEnvelopeStatus(credentials);
//			testGettingCustomFields(credentials);
//			testGettingCertificate(credentials);
//			testGettingNotificationInfo(credentials);
//			testGettingRecipientStatus(credentials);
		} catch (ServiceInitException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
    private static void testGettingRecipientStatus(DocuSignCredentials credentials) throws ServiceInitException {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		try {
			System.err.println(envelopeService.getRecipientStatus("<Envelope Id>",true,true));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static void testGettingNotificationInfo(DocuSignCredentials credentials) throws ServiceInitException {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		try {
			System.err.println(envelopeService.getNotificationInfo("<Envelope Id>"));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void testGettingCertificate(DocuSignCredentials credentials) throws ServiceInitException {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		try {
			System.err.println(envelopeService.getCertificate("<Envelope Id>",true,false));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void testGettingCustomFields(DocuSignCredentials credentials) throws ServiceInitException {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		try {
			System.err.println(envelopeService.getCustomFields("<Envelope Id>"));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unused")
	private static void testGettingEnvelopeStatus(
			DocuSignCredentials credentials) throws ServiceInitException {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		EnvelopeStatusQueryForm statusQueryForm = new EnvelopeStatusQueryForm();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2012);
		cal.set(Calendar.DATE, 25);
		cal.set(Calendar.MONTH, Calendar.JUNE);
		statusQueryForm.setFromDate(cal.getTime());
		List<Status> statuses = new ArrayList<Status>();
		statuses.add(Status.completed);
		statusQueryForm.setStatuses(statuses);
//		List<String> envelopeIds = new ArrayList<String>();
//		envelopeIds.add("a0feee1e-ba6b-4440-9ba3-f6ac51bf6ab7");
//		statusQueryForm.setEnvelopeIds(envelopeIds);
//		statusQueryForm.setEnvelopeId("db903aac-ac16-4662-88ee-d1e07d1624a4");
		try {
//			System.err.println(envelopeService.getEnvelopeStatus("db903aac-ac16-4662-88ee-d1e07d1624a4"));
			System.err.println(envelopeService.getEnvelopeStatus(statusQueryForm));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unused")
	private static void testSavingEnvelopeToDrafts (
			DocuSignCredentials credentials) throws ServiceInitException  {
		EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
		try {
			envelopeService.saveToDrafts(getEnvelope());
		} catch (SignatureRequestException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unused")
	private static void testGettingConsoleViews(DocuSignCredentials credentials)
			throws ServiceInitException {
		ConsoleViewService cvService = new ConsoleViewService(SERVER_URI,
				credentials);
		try {
			// System.err.println("Authentication View: "+cvService.getAuthenticationView());

			System.err
					.println("Sender View: "
							+ cvService
									.getEnvelopeSenderView("<Envelope Id>"));

			System.err.println("Recipient View: "
					+ cvService.getEnvelopeRecipientView(
							"<Envelope Id>",
							getRecipientViewRequest()));

			System.err.println("Correction View: "
					+ cvService.getEnvelopeCorrectionView(
							"<Envelope Id>",
							getCorrectionViewRequest()));

		} catch (ConsoleViewException e) {
			e.printStackTrace();
		}
	}

	private static CorrectionViewRequest getCorrectionViewRequest() {
		CorrectionViewRequest cvRequest = new CorrectionViewRequest();
		cvRequest.setSuppressNavigation(false);
		return cvRequest;
	}

	private static RecipientViewRequest getRecipientViewRequest() {
		RecipientViewRequest recipientView = new RecipientViewRequest();
		recipientView.setAuthenticationMethod("email");
		recipientView.setReturnUrl("http://demo.docusign.net");
		recipientView.setEmail("<Set Email ID>");
		recipientView.setUserName("Ajay Deshwal");
		return recipientView;
	}

	@SuppressWarnings("unused")
	private static void testSendingDocument(DocuSignCredentials credentials)
			throws ServiceInitException {

		// RequestSignatureService reqSignService = new RequestSignatureService(
		// SERVER_URI, credentials);
		// TemplateSignatureRequest signatureRequest =
		// getTemplateSignatureRequest();
		// signatureRequest.setStatus(Status.created);
		// SignatureResponse response = null;
		// try {
		// response = reqSignService.sendFromTemplate(signatureRequest);
		// System.out.println("SignatureResponse: " + response);
		// } catch (SignatureRequestException sre) {
		// sre.printStackTrace();
		// }
		EnvelopeService envService = new EnvelopeService(SERVER_URI,
				credentials);
		try {
			envService.addDocumentToDraftEnvelope("<Envelope Id>",
					getDocument());
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void testGetDocument(DocuSignCredentials credentials)
			throws ServiceInitException {
		EnvelopeService envService = new EnvelopeService(SERVER_URI,
				credentials);
		try {
			System.out
					.println(envService.getDocumentsCombined("<Envelope Id>"));
//			System.out
//			.println(envService.getEnvelope("e3b09d80-ac1a-4d46-a40b-bea9d7bb5996"));
//			System.out
//			.println(envService.getDocument("e3b09d80-ac1a-4d46-a40b-bea9d7bb5996",1));
			
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static void testGetEnvelope(DocuSignCredentials credentials)
			throws ServiceInitException {
		/*RequestSignatureService reqSignService = new RequestSignatureService(
				SERVER_URI, credentials);
		TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
		signatureRequest.setStatus(Status.created);
		SignatureResponse response = null;
		try {
			response = reqSignService.sendFromTemplate(signatureRequest);
			System.out.println("SignatureResponse: " + response);
		} catch (SignatureRequestException sre) {
			sre.printStackTrace();
		}*/

		EnvelopeService envService = new EnvelopeService(SERVER_URI,
				credentials);
		try {
			System.out
					.println(envService.getEnvelope("<Envelope Id>"));
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}
	
    @SuppressWarnings("unused")
    private static void testGetRecipient(DocuSignCredentials credentials) throws ServiceInitException {
        EnvelopeService envService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envService.getRecipientStatus("<Envelope Id>"));
        } catch (EnvelopeException e) {
            e.printStackTrace();
        }
    }

	private static void testSendingDoucmentSignRequest(
			DocuSignCredentials credentials) throws ServiceInitException {
		RequestSignatureService rsService = new RequestSignatureService(
				SERVER_URI, credentials);
		DocumentSignatureRequest signatureRequest = getDocumentSignatureRequest();
		try {
			System.err.println(rsService.sendDocument(signatureRequest));
		} catch (SignatureRequestException e) {
			e.printStackTrace();
		}
	}

	private static List<Document> getDocumentList() {
		List<Document> documentList = new ArrayList<Document>();
		documentList.add(getMockDocument("test-techblue.txt", "1", "/home/ajay/Documents/esign-test.txt"));
		return documentList;
	}

	private static Document getMockDocument(String name, String documentId, String path) {
		Document document = new Document();
		document.setName(name);
		document.setDocumentId(documentId);
		document.setPath(path);
		return document;
	}

	private static Document getDocument() {
		Document document = new Document();
		document.setName("test-signature.txt");
		document.setDocumentId("2");
		document.setPath("/home/ajay/Documents/esign-test.txt");
		return document;
	}

	private static DocumentSignatureRequest getDocumentSignatureRequest() {
		DocumentSignatureRequest signatureRequest = new DocumentSignatureRequest();
		signatureRequest.setEmailBlurb("Ajay Please sign the document.");
		signatureRequest.setEmailSubject("Please sign up this doc - "
				+ (new Date()));
		signatureRequest.setStatus(Status.sent);
		signatureRequest.setEnforceSignerVisibility(true);
		RecipientCollection recipientCollection = getRecipientCollection();
		signatureRequest.setRecipients(recipientCollection);
		signatureRequest.setDocuments(getDocumentList());
		return signatureRequest;
	}
	
	private static Envelope getEnvelope() {
		Envelope signatureRequest = new Envelope();
		signatureRequest.setEmailBlurb("Hey!! Please sign the document.");
		signatureRequest.setEmailSubject("Please sign up this document - "
				+ (new Date()));
		signatureRequest.setStatus(Status.sent);
		RecipientCollection recipientCollection = getRecipientCollection();
		signatureRequest.setRecipients(recipientCollection);
		signatureRequest.setDocuments(getDocumentInfoList());
		return signatureRequest;
	}

	private static List<DocumentInfo> getDocumentInfoList() {

		List<DocumentInfo> documentList = new ArrayList<DocumentInfo>();
		DocumentInfo document = new DocumentInfo();
		document.setName("test-signature.txt");
		document.setDocumentId("1");
		document.setPath("/home/ajay/Documents/esign-test.txt");
		documentList.add(document);
		return documentList;
	}

	private static RecipientCollection getRecipientCollection() {
		RecipientCollection recipientCollection = new RecipientCollection();
//		List<String> fields = new ArrayList<String>();
//		fields.add("landlord_id=1831");
//		signer.setCustomFields(fields);
		List<Signer> signerList = new ArrayList<Signer>();
		signerList.add(getSigner("1","<Signer Email>","<Signer Name>","1","Sign Here Ajay - Techblue"));
		recipientCollection.setSigners(signerList);
		return recipientCollection;
	}

	private static Signer getSigner(String recipientId, String email, String name, String documentId, String anchorString) {
		Signer signer1 = new Signer();
		signer1.setRecipientId(recipientId);
		signer1.setEmail(email);
		signer1.setName(name);
		SignHereTab signTab = new SignHereTab();
		signTab.setDocumentId(documentId);
		signTab.setAnchorString(anchorString);
		signTab.setAnchorIgnoreIfNotPresent(true);
		DocumentTabCollection tabCollection1 = new DocumentTabCollection();
		List<SignHereTab> tabList1 = new ArrayList<SignHereTab>();
		tabList1.add(signTab);
		tabCollection1.setSignHereTabs(tabList1);
		signer1.setTabs(tabCollection1);
		return signer1;
	}

	@SuppressWarnings("unused")
    private static List<CustomField> getCustomFieldList() {
	    List<CustomField> fieldList = new ArrayList<CustomField>();
	    CustomField field = new CustomField();
//	    field.setCustomFieldType(CustomFieldType.text);
//	    field.setShow(false);
	    field.setName("landlord_id");
	    field.setValue("1831");
	    fieldList.add(field);
        return fieldList;
    }

    @SuppressWarnings("unused")
	private static void testEnvelopeStatusChange(DocuSignCredentials credentials)
			throws ServiceInitException {
		RequestSignatureService reqSignService = new RequestSignatureService(
				SERVER_URI, credentials);
		TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
		signatureRequest.setStatus(Status.created);
		SignatureResponse response = null;
		try {
			response = reqSignService.sendFromTemplate(signatureRequest);
			System.out.println("SignatureResponse: " + response);
		} catch (SignatureRequestException sre) {
			sre.printStackTrace();
		}

		EnvelopeService envService = new EnvelopeService(SERVER_URI,
				credentials);
		try {
			envService.sendFromDrafts(response.getEnvelopeId(),
					"Need to get the agreement signed");
		} catch (EnvelopeException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void testSignatureService(DocuSignCredentials credentials)
			throws ServiceInitException {
		RequestSignatureService reqSignService = new RequestSignatureService(
				SERVER_URI, credentials);
		TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
		try {
			SignatureResponse response = reqSignService
					.sendFromTemplate(signatureRequest);
			System.out.println("SignatureResponse: " + response);
		} catch (SignatureRequestException sre) {
			sre.printStackTrace();
		}
	}

	private static TemplateSignatureRequest getTemplateSignatureRequest() {
		TemplateSignatureRequest signatureRequest = new TemplateSignatureRequest();
		signatureRequest.setTemplateId("<Envelope ID>");
		signatureRequest.setEmailBlurb("Ajay Please sign the document.");
		signatureRequest.setEmailSubject("Please sign up this doc - "
				+ (new Date()));
		signatureRequest.setEnforceSignerVisibility(true);
		signatureRequest.setStatus(Status.sent);
		List<TemplateRole> templateRoles = getTestTemplateRoles();
		signatureRequest.setTemplateRoles(templateRoles);
		return signatureRequest;
	}

	private static List<TemplateRole> getTestTemplateRoles() {
		List<TemplateRole> templateRoles = new ArrayList<TemplateRole>();
		TemplateRole roleA = new TemplateRole();
		roleA.setName("Ajay Deshwal");
		roleA.setEmail("<Set Email ID>");
		roleA.setRoleName("Manager");
		templateRoles.add(roleA);

		TemplateRole roleB = new TemplateRole();
		roleB.setName("Vik Tara");
		roleB.setEmail("<Set Email Id>");
		roleB.setRoleName("Borrower");
		templateRoles.add(roleB);

		return templateRoles;
	}

	@SuppressWarnings("unused")
	private static String getAccountId(DocuSignCredentials credentials) {
		ClientInfo clientInfo = testLoginService(credentials);
		return clientInfo.getLoginAccounts().get(0).getAccountId();
	}

	@SuppressWarnings("unused")
	private static void testTemplateService(DocuSignCredentials credentials)
			throws ServiceInitException {
		TemplateService templateService = new TemplateService(SERVER_URI,
				credentials);
		try {
			TemplateInfo template = templateService.retrieveTemplates();
			System.out.println("Template: " + template);
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	private static ClientInfo testLoginService(DocuSignCredentials credentials) {
		LoginService loginService = new LoginService(SERVER_URI);
		ClientInfo clientInfo = null;
		try {
			clientInfo = loginService.getLoginInformation(credentials);
			System.out.println("ClientInfo: " + clientInfo);
		} catch (LoginException e) {
			System.err.println("Error Response: " + e.getErrorResponse());
			e.printStackTrace();
		}
		return clientInfo;
	}

	private static DocuSignCredentials getDocuSignCredentials() {
		DocuSignCredentials credentials = new DocuSignCredentials(
				"<User Name>", "<Email>",
				"<Integrator Key>");
		return credentials;
	}
}
