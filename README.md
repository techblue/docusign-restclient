Docusign RESTful Client
===================

[DocuSign](http://www.docusign.com/) is an electronic signature and document workflow automation service provider that facilitates end user to electronically sign, manage and verify documents.

This project provides a java rest client api which consumes docusign RESTful services. Demo services can be viewed/executed @ [iodocs](http://iodocs.docusign.com/)

##Maven
Following declaration can be used to add this library as a maven dependency:
```xml
<dependency>
    <groupId>uk.co.techblue</groupId>
    <artifactId>docusign-restclient</artifactId>
    <version>2.0.4-SNAPSHOT</version>
</dependency>
```

##Usage


###Please create a developer account:

1. Create a developer account from [here](http://www.docusign.com/developer-center#form-devaccount).
2. Log into developer sandbox througn link on the same page. 
3. Request an integrator key. 

Now you have all necessary elements (username, passoword and an integrator key) to call docusign rest services.

###Let us look at an example on how to upload document using RESTful client:

- Initialize DocuSignCredentials using the aquired authentication data.

```java
DocuSignCredentials credentials = new DocuSignCredentials("<Docusign Username>", "<Password>", "<Integrator Key>");
```
- Each Service instantiation takes service endpoint URI and credentials as parameters. RequestSignature Service encapsulates all flavours of signature request rest methods. Initialize it with docusign demo rest services endpoint.

```java
String serviceURI = "https://demo.docusign.net/restapi/v2";
RequestSignatureService signatureService = new RequestSignatureService(serviceURI, credentials);
```

- Create Document signature request DTO by setting necessary signer info.

```java
DocumentSignatureRequest signatureRequest = new DocumentSignatureRequest();
signatureRequest.setEmailBlurb("Ajay, Please sign the document.");// Email body custom text
signatureRequest.setEmailSubject("Please sign attached document");
signatureRequest.setStatus(Status.sent);
```
- Create a recipient collection with signer details and set it into signature request.

```java
RecipientCollection recipientCollection = new RecipientCollection();
Signer signer = new Signer();
signer.setRecipientId("1");
signer.setEmail("ajay.deshwal@techblue.co.uk");
signer.setName("Ajay");
List<Signer> signerList = new ArrayList<Signer>();
signerList.add(signer);
recipientCollection.setSigners(signerList);

signatureRequest.setRecipients(recipientCollection);
```
- Create document list configured with necessary document info and set it into signature request DTO.

```java
List<Document> documentList = new ArrayList<Document>();
Document document = new Document();
document.setName("test-signature.txt");
document.setDocumentId("1");
document.setPath("/home/ajay/Documents/test-signature.txt");
documentList.add(document);
signatureRequest.setDocuments(documentList);
```

- Send the signature request.

```java
SignatureResponse response = signatureService.sendDocument(signatureRequest);
```

Signature response, among other useful information, will contain newly created envelope Id and URI.

```java
response.getEnvelopeId();
response.getUri();
```
