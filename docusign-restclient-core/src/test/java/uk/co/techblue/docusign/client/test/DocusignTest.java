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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.text.WordUtils;

import uk.co.techblue.docusign.client.credential.BasicDocusignCredential;
import uk.co.techblue.docusign.client.credential.DocuSignCredentials;
import uk.co.techblue.docusign.client.dto.AuditEvent;
import uk.co.techblue.docusign.client.dto.AuditEventField;
import uk.co.techblue.docusign.client.dto.AuditEventsResponse;
import uk.co.techblue.docusign.client.dto.CorrectionViewRequest;
import uk.co.techblue.docusign.client.dto.CustomField;
import uk.co.techblue.docusign.client.dto.Document;
import uk.co.techblue.docusign.client.dto.DocumentInfo;
import uk.co.techblue.docusign.client.dto.DocumentSignatureRequest;
import uk.co.techblue.docusign.client.dto.DocumentTabCollection;
import uk.co.techblue.docusign.client.dto.Envelope;
import uk.co.techblue.docusign.client.dto.EnvelopeExpiration;
import uk.co.techblue.docusign.client.dto.EnvelopeNotificationInfo;
import uk.co.techblue.docusign.client.dto.EnvelopeReminder;
import uk.co.techblue.docusign.client.dto.EnvelopeStatusQueryForm;
import uk.co.techblue.docusign.client.dto.SignatureResponse;
import uk.co.techblue.docusign.client.dto.Template;
import uk.co.techblue.docusign.client.dto.TemplateInfo;
import uk.co.techblue.docusign.client.dto.TemplateRole;
import uk.co.techblue.docusign.client.dto.TemplateSignatureRequest;
import uk.co.techblue.docusign.client.dto.TextCustomField;
import uk.co.techblue.docusign.client.dto.recipients.RecipientCollection;
import uk.co.techblue.docusign.client.dto.recipients.RecipientViewRequest;
import uk.co.techblue.docusign.client.dto.recipients.Signer;
import uk.co.techblue.docusign.client.dto.tabs.SignHereTab;
import uk.co.techblue.docusign.client.dto.tabs.TextTab;
import uk.co.techblue.docusign.client.dto.user.ClientInfo;
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
    private static final String SERVER_URI = "https://demo.docusign.net/restapi/v2";

    public static void main(final String[] args) {
        final DocuSignCredentials credentials = getDocuSignCredentials();
        // try {
        // testLoginService(credentials);
        // testEnvelopeStatusChange(credentials);
        // testTemplateService(credentials);
        // testGettingAuditEvents(credentials);
        // testSendingDocumentSignRequest(credentials);
        // testSendTemplateSignRequest(credentials);
        // testRetrieveTemplate(credentials);
        // testSignatureService(credentials);
        // testSendingDocument(credentials);
        // testGetEnvelope(credentials);
        // testGetRecipient(credentials);
        // testGetEnvelope(credentials);
        // testGetDocument(credentials);
        // testGettingConsoleViews(credentials);
        // testSavingEnvelopeToDrafts(credentials);
        // testGettingEnvelopeStatus(credentials);
        // testGettingCustomFields(credentials);
        // testGettingCertificate(credentials);
        // testGettingNotificationInfo(credentials);
        // testGettingRecipientStatus(credentials);
        // } catch (final ServiceInitException e) {
        // e.printStackTrace();
        // }
        try {
            // testSendTemplateSignRequest(credentials);
            // final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
            // System.out.println(envelopeService.getRecipientStatus("5aa6d353-80c1-4242-98ec-f382596bcc7c", true, true));
            // testGetDocument(credentials);
            // testGettingEnvelopeStatus(credentials);
            testGettingConsoleViews(credentials);
        } catch (final ServiceInitException e) {
            e.printStackTrace();
        }
        // catch (final EnvelopeException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

    }

    @SuppressWarnings("unused")
    private static void testRetrieveTemplate(final DocuSignCredentials credentials) throws ServiceInitException {
        final TemplateService templateService = new TemplateService(SERVER_URI, credentials);
        try {
            final Template template = templateService.retrieveTemplate("beba756e-5826-43be-8755-861d429b8a94");
            final RecipientCollection recsCollection = template.getRecipients();
            for (final Signer signer : recsCollection.getSigners()) {
                System.out.println(signer);
            }
        } catch (final TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGettingAuditEvents(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            final AuditEventsResponse auditEventsResponse = envelopeService.getAuditEvents("55ce29d2-093e-4355-8f30-de81f91aed86");
            final List<AuditEvent> auditEvents = auditEventsResponse.getAuditEvents();
            for (final AuditEvent ev : auditEvents) {
                System.out.println("\n");
                final List<AuditEventField> eventFields = ev.getEventFields();
                for (final AuditEventField field : eventFields) {
                    System.out.println(field.getName() + ": " + field.getValue());
                }
            }
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGettingRecipientStatus(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envelopeService.getRecipientStatus("<Envelope Id>", true, true));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGettingNotificationInfo(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envelopeService.getNotificationInfo("<Envelope Id>"));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGettingCertificate(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envelopeService.getCertificate("<Envelope Id>", true, false));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGettingCustomFields(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envelopeService.getCustomFields("<Envelope Id>"));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unused")
    private static void testGettingEnvelopeStatus(
        final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        final EnvelopeStatusQueryForm statusQueryForm = new EnvelopeStatusQueryForm();
        // final Calendar cal = Calendar.getInstance();
        // cal.set(Calendar.YEAR, 2014);
        // cal.set(Calendar.DATE, 15);
        // cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        // statusQueryForm.setFromDate(cal.getTime());
        // final List<Status> statuses = new ArrayList<Status>();
        // statuses.add(Status.completed);
        // statusQueryForm.setStatuses(statuses);
        final List<String> envelopeIds = new ArrayList<String>();
        envelopeIds.add("461af76a-12db-409a-9a66-5ce2d7113d2e");
        statusQueryForm.setEnvelopeIds(envelopeIds);
        try {
            // System.err.println(envelopeService.getEnvelopeStatus("db903aac-ac16-4662-88ee-d1e07d1624a4"));
            System.err.println(envelopeService.getEnvelopeStatus(statusQueryForm));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unused")
    private static void testSavingEnvelopeToDrafts(
        final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);
        try {
            envelopeService.saveToDrafts(getEnvelope());
        } catch (final SignatureRequestException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unused")
    private static void testGettingConsoleViews(final DocuSignCredentials credentials)
        throws ServiceInitException {
        final ConsoleViewService cvService = new ConsoleViewService(SERVER_URI,
            credentials);
        try {
            // System.err.println("Authentication View: "+cvService.getAuthenticationView());

            // System.err
            // .println("Sender View: "
            // + cvService
            // .getEnvelopeSenderView("<Envelope Id>", null));

            System.err.println("Recipient View: "
                + cvService.getEnvelopeRecipientView(
                    "a10f550e-ba01-49e0-a96a-abd6b5a1d40f",
                    getRecipientViewRequest()));

            // System.err.println("Correction View: "
            // + cvService.getEnvelopeCorrectionView(
            // "<Envelope Id>",
            // getCorrectionViewRequest()));

        } catch (final ConsoleViewException e) {
            e.printStackTrace();
        }
    }

    private static CorrectionViewRequest getCorrectionViewRequest() {
        final CorrectionViewRequest cvRequest = new CorrectionViewRequest();
        cvRequest.setSuppressNavigation(false);
        return cvRequest;
    }

    private static RecipientViewRequest getRecipientViewRequest() {
        final RecipientViewRequest recipientView = new RecipientViewRequest();
        recipientView.setAuthenticationMethod("email");
        recipientView.setReturnUrl("http://demo.docusign.net");
        recipientView.setEmail("ritesh.wadhwa@techblue.co.uk");
        recipientView.setUserName("Mr. Ritesh Wadhwa");
        recipientView.setClientUserId("31");
        return recipientView;
    }

    @SuppressWarnings("unused")
    private static void testSendingDocument(final DocuSignCredentials credentials)
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
        final EnvelopeService envService = new EnvelopeService(SERVER_URI,
            credentials);
        try {
            envService.addDocumentToDraftEnvelope("<Envelope Id>",
                getDocument());
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGetDocument(final DocuSignCredentials credentials)
        throws ServiceInitException {
        final EnvelopeService envService = new EnvelopeService(SERVER_URI,
            credentials);
        try {
            System.out
                .println(envService.getDocumentsCombined("4ba2d260-694e-4712-9e8a-8a8fd126a69e"));
            // System.out
            // .println(envService.getEnvelope("e3b09d80-ac1a-4d46-a40b-bea9d7bb5996"));
            // System.out
            // .println(envService.getDocument("e3b09d80-ac1a-4d46-a40b-bea9d7bb5996",1));

        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGetEnvelope(final DocuSignCredentials credentials)
        throws ServiceInitException {
        /*
         * RequestSignatureService reqSignService = new RequestSignatureService( SERVER_URI, credentials);
         * TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
         * signatureRequest.setStatus(Status.created); SignatureResponse response = null; try { response =
         * reqSignService.sendFromTemplate(signatureRequest); System.out.println("SignatureResponse: " + response); } catch
         * (SignatureRequestException sre) { sre.printStackTrace(); }
         */

        final EnvelopeService envService = new EnvelopeService(SERVER_URI,
            credentials);
        try {
            System.out
                .println(envService.getEnvelope("<Envelope Id>"));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testGetRecipient(final DocuSignCredentials credentials) throws ServiceInitException {
        final EnvelopeService envService = new EnvelopeService(SERVER_URI, credentials);
        try {
            System.err.println(envService.getRecipientStatus("<Envelope Id>"));
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    private static void testSendingDocumentSignRequest(
        final DocuSignCredentials credentials) throws ServiceInitException {
        final RequestSignatureService rsService = new RequestSignatureService(
            SERVER_URI, credentials);
        final DocumentSignatureRequest signatureRequest = getDocumentSignatureRequest();
        try {
            System.err.println(rsService.sendDocument(signatureRequest));
        } catch (final SignatureRequestException e) {
            e.printStackTrace();
        }
    }

    private static void testSendTemplateSignRequest(final DocuSignCredentials credentials) throws ServiceInitException {
        final RequestSignatureService rsService = new RequestSignatureService(
            SERVER_URI, credentials);
        final TemplateSignatureRequest signatureRequest = getMockTemplateSignatureRequest();
        try {
            System.err.println(rsService.sendFromTemplate(signatureRequest));
        } catch (final SignatureRequestException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    private static TemplateSignatureRequest getMockTemplateSignatureRequest() {

        final TemplateSignatureRequest signRequest = new TemplateSignatureRequest();

        // signRequest.setEmailBlurb("Please sign this document");
        // signRequest.setEmailSubject("Please sign this document");
        signRequest.setStatus(Status.sent);
        signRequest.setTemplateId("4911B504-4F4E-4DE9-863B-2FE7E280C548");
        signRequest.setTemplateRoles(getMockTemplateRoles());
        return signRequest;
    }

    /**
     * @return
     */
    private static List<TemplateRole> getMockTemplateRoles() {
        final List<TemplateRole> templateRoles = new ArrayList<TemplateRole>();

        final TemplateRole role = new TemplateRole();
        role.setEmail("dheeraj.arora@techblue.co.uk");
        role.setName("Dheeraj Arora");
        role.setRoleName("landlordSigner");
        role.setTabs(getMockDocumentTabCollection());

        final TemplateRole role1 = new TemplateRole();
        role1.setEmail("dheeraj6188@gmail.com");
        role1.setName("Drj");
        role1.setRoleName("tenantSigner");
        role1.setTabs(getMockDocumentTabCollection());

        templateRoles.add(role);
        templateRoles.add(role1);
        return templateRoles;
    }

    /**
     * @return
     */
    private static DocumentTabCollection getMockDocumentTabCollection() {
        final DocumentTabCollection tabs = new DocumentTabCollection();
        final List<TextTab> textTabs = new ArrayList<TextTab>();
        textTabs.add(getMockPropertyAddress("21-23 Clemens Street, Leamington Spa, CV31 2DW"));
        textTabs.add(getMockTextTab("21-23 Clemens Street, Leamington Spa, CV31 2DW", "landlordAddress"));
        textTabs.add(getMockTextTab("70 St. Andrew Street, Lincoln, LN5 7UG", "tenantAddress"));
        textTabs.add(getMockTextTab("Nitin Jain", "tenantName"));
        textTabs.add(getMockTextTab("Dheeraj Arora", "landlordName"));
        textTabs.add(getMockTextTab("20", "tenancyStartDay"));
        textTabs.add(getMockTextTab("09", "tenancyStartMonth"));
        textTabs.add(getMockTextTab("2014", "tenancyStartYear"));
        tabs.setTextTabs(textTabs);

        return tabs;
    }

    private static TextTab getMockTextTab(final String value, final String textTabLabel) {

        final TextTab textTab = new TextTab();
        // textTab.setLocked(true);
        textTab.setValue(value);

        textTab.setTabLabel(textTabLabel);
        return textTab;
    }

    private static TextTab getMockPropertyAddress(final String value) {
        final TextTab textTab = new TextTab();
        textTab.setAnchorString("<<property_address>>");
        textTab.setRequired(true);
        textTab.setLocked(true);
        textTab.setBold(true);
        textTab.setValue(value);
        return textTab;
    }

    private static TextTab getMockInitialsHere(final String value, final String anchorText) {
        final TextTab textTab = new TextTab();
        textTab.setAnchorString(anchorText);
        textTab.setRequired(true);
        textTab.setLocked(true);
        textTab.setBold(true);
        textTab.setAnchorXOffset(60);
        textTab.setAnchorYOffset(-3);
        textTab.setValue(WordUtils.initials(value));
        return textTab;
    }

    private static List<Document> getDocumentList() {
        final List<Document> documentList = new ArrayList<Document>();
        documentList.add(getMockDocument("docusign.txt", "1", "C:\\Users\\marco\\Desktop\\docusign.txt"));
        return documentList;
    }

    private static Document getMockDocument(final String name, final String documentId, final String path) {
        final Document document = new Document();
        document.setName(name);
        document.setDocumentId(documentId);
        document.setPath(path);
        return document;
    }

    private static Document getDocument() {
        final Document document = new Document();
        document.setName("test-signature.txt");
        document.setDocumentId("2");
        document.setPath("/home/ajay/Documents/esign-test.txt");

        return document;
    }

    private static DocumentSignatureRequest getDocumentSignatureRequest() {
        final DocumentSignatureRequest signatureRequest = new DocumentSignatureRequest();
        signatureRequest.setEmailBlurb("Please sign the document.");
        signatureRequest.setEmailSubject("Please sign the attached document");
        signatureRequest.setStatus(Status.sent);
        signatureRequest.setEnforceSignerVisibility(true);
        final RecipientCollection recipientCollection = getRecipientCollection();
        signatureRequest.setRecipients(recipientCollection);
        signatureRequest.setDocuments(getDocumentList());
        // signatureRequest.setNotification(getNotificationInfo());
        return signatureRequest;
    }

    private static EnvelopeNotificationInfo getNotificationInfo() {
        final EnvelopeNotificationInfo notificationInfo = new EnvelopeNotificationInfo();
        final EnvelopeExpiration envExpiration = new EnvelopeExpiration();
        envExpiration.setExpireEnabled(true);
        envExpiration.setExpireAfter(0);
        envExpiration.setExpireWarn(0);
        final EnvelopeReminder reminder = new EnvelopeReminder();
        reminder.setReminderEnabled(true);
        reminder.setReminderFrequency(0);
        reminder.setReminderDelay(0);
        notificationInfo.setExpirations(envExpiration);
        notificationInfo.setReminders(reminder);
        return notificationInfo;
    }

    private static Envelope getEnvelope() {
        final Envelope signatureRequest = new Envelope();
        signatureRequest.setEmailBlurb("Hey!! Please sign the document.");
        signatureRequest.setEmailSubject("Please sign up this document - "
            + (new Date()));
        signatureRequest.setStatus(Status.sent);
        final RecipientCollection recipientCollection = getRecipientCollection();
        signatureRequest.setRecipients(recipientCollection);
        signatureRequest.setDocuments(getDocumentInfoList());
        return signatureRequest;
    }

    private static List<DocumentInfo> getDocumentInfoList() {

        final List<DocumentInfo> documentList = new ArrayList<DocumentInfo>();
        final DocumentInfo document = new DocumentInfo();
        document.setName("test-signature.txt");
        document.setDocumentId("1");
        document.setPath("/home/ajay/Documents/esign-test.txt");
        documentList.add(document);
        return documentList;
    }

    private static RecipientCollection getRecipientCollection() {
        final RecipientCollection recipientCollection = new RecipientCollection();
        // List<String> fields = new ArrayList<String>();
        // fields.add("landlord_id=1831");
        // signer.setCustomFields(fields);
        final List<Signer> signerList = new ArrayList<Signer>();
        signerList.add(getSigner("1", "maltieri@exari.com", "Marco Altieri", "1", "Test"));
        recipientCollection.setSigners(signerList);
        return recipientCollection;
    }

    private static Signer getSigner(final String recipientId, final String email, final String name, final String documentId, final String anchorString) {
        final Signer signer1 = new Signer();
        signer1.setRecipientId(recipientId);
        signer1.setEmail(email);
        signer1.setName(name);
        final SignHereTab signTab = new SignHereTab();
        signTab.setDocumentId(documentId);
        signTab.setAnchorString(anchorString);
        signTab.setAnchorIgnoreIfNotPresent(true);
        final DocumentTabCollection tabCollection1 = new DocumentTabCollection();
        final List<SignHereTab> tabList1 = new ArrayList<SignHereTab>();
        tabList1.add(signTab);
        tabCollection1.setSignHereTabs(tabList1);
        signer1.setTabs(tabCollection1);
        return signer1;
    }

    @SuppressWarnings("unused")
    private static List<CustomField> getCustomFieldList() {
        final List<CustomField> fieldList = new ArrayList<CustomField>();
        final CustomField field = new CustomField();
        // field.setCustomFieldType(CustomFieldType.text);
        // field.setShow(false);
        TextCustomField tcf = new TextCustomField();
        tcf.setName("landlord_id");
        tcf.setValue("1831");
        field.setTextCustomFields(Arrays.asList(tcf));
        fieldList.add(field);
        return fieldList;
    }

    @SuppressWarnings("unused")
    private static void testEnvelopeStatusChange(final DocuSignCredentials credentials)
        throws ServiceInitException {
        final RequestSignatureService reqSignService = new RequestSignatureService(
            SERVER_URI, credentials);
        final TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
        signatureRequest.setStatus(Status.created);
        SignatureResponse response = null;
        try {
            response = reqSignService.sendFromTemplate(signatureRequest);
            System.out.println("SignatureResponse: " + response);
        } catch (final SignatureRequestException sre) {
            sre.printStackTrace();
        }

        final EnvelopeService envService = new EnvelopeService(SERVER_URI,
            credentials);
        try {
            envService.sendFromDrafts(response.getEnvelopeId(),
                "Need to get the agreement signed");
        } catch (final EnvelopeException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private static void testSignatureService(final DocuSignCredentials credentials)
        throws ServiceInitException {
        final RequestSignatureService reqSignService = new RequestSignatureService(
            SERVER_URI, credentials);
        final TemplateSignatureRequest signatureRequest = getTemplateSignatureRequest();
        try {
            final SignatureResponse response = reqSignService
                .sendFromTemplate(signatureRequest);
            System.out.println("SignatureResponse: " + response);
        } catch (final SignatureRequestException sre) {
            sre.printStackTrace();
        }
    }

    private static TemplateSignatureRequest getTemplateSignatureRequest() {
        final TemplateSignatureRequest signatureRequest = new TemplateSignatureRequest();
        signatureRequest.setTemplateId("<Envelope ID>");
        signatureRequest.setEmailBlurb("Ajay Please sign the document.");
        signatureRequest.setEmailSubject("Please sign up this doc - "
            + (new Date()));
        signatureRequest.setEnforceSignerVisibility(true);
        signatureRequest.setStatus(Status.sent);
        final List<TemplateRole> templateRoles = getTestTemplateRoles();
        signatureRequest.setTemplateRoles(templateRoles);
        return signatureRequest;
    }

    private static List<TemplateRole> getTestTemplateRoles() {
        final List<TemplateRole> templateRoles = new ArrayList<TemplateRole>();
        final TemplateRole roleA = new TemplateRole();
        roleA.setName("Ajay Deshwal");
        roleA.setEmail("<Set Email ID>");
        roleA.setRoleName("Manager");
        templateRoles.add(roleA);

        final TemplateRole roleB = new TemplateRole();
        roleB.setName("Vik Tara");
        roleB.setEmail("<Set Email Id>");
        roleB.setRoleName("Borrower");
        templateRoles.add(roleB);

        return templateRoles;
    }

    @SuppressWarnings("unused")
    private static String getAccountId(final DocuSignCredentials credentials) {
        final ClientInfo clientInfo = testLoginService(credentials);
        return clientInfo.getLoginAccounts().get(0).getAccountId();
    }

    @SuppressWarnings("unused")
    private static void testTemplateService(final DocuSignCredentials credentials)
        throws ServiceInitException {
        final TemplateService templateService = new TemplateService(SERVER_URI,
            credentials);
        try {
            final TemplateInfo template = templateService.retrieveTemplates();
            System.out.println("Template: " + template);
        } catch (final TemplateException e) {
            e.printStackTrace();
        }
    }

    private static ClientInfo testLoginService(final DocuSignCredentials credentials) {
        final LoginService loginService = new LoginService(SERVER_URI, credentials);
        ClientInfo clientInfo = null;
        try {
            clientInfo = loginService.getLoginInformation();
            System.out.println("ClientInfo: " + clientInfo);
        } catch (final LoginException e) {
            System.err.println("Error Response: " + e.getErrorResponse());
            e.printStackTrace();
        }
        return clientInfo;
    }

    private static DocuSignCredentials getDocuSignCredentials() {
        // final DocuSignCredentials credentials = new TokenDocuSignCredential("pFJjeUmiOJ+6SzDktsTIPr4RVMM=", "", "");
        final DocuSignCredentials credentials = new BasicDocusignCredential("dheeraj.arora@techblue.co.uk", "Techblue!",
            "TECH-ca1df08a-66d8-41bb-9226-5aeb9a921dbe");
        return credentials;
    }
}
