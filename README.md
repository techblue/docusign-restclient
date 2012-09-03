docusign-restclient
===================

[DocuSign](http://www.docusign.com/) is an electronic signature and document workflow automation service provider that facilitates end user to electronically sign, manage and verify documents.

This project provides a java rest client api which consumes docusign RESTful services. Demo services can be viewed/executed @ [iodocs](http://iodocs.docusign.com/)

Usage
==========

Please create a developer account:

1. Create a developer account from [here](http://www.docusign.com/developer-center#form-devaccount).
2. Log into developer sandbox througn link on the same page. 
3. Request an integrator key. 

Now you have all necessary elements (username, passoword and an integrator key) to call docusign rest services.
Let us look at an example on how to upload document using RESTful client:

Initialize DocuSignCredentials using the aquired authentication data:
DocuSignCredentials credentials = new DocuSignCredentials("<Docusign Username>", "<Password>", "<Integrator Key>");

Each Service instantiation takes service endpoint URI and credentials as parameters.
Docusign's demo rest services endpoint is
String serviceURI = "https://demo.docusign.net/restapi/v1";

Create Envelope Service which encapsulates all envelope related rest service methods.
EnvelopeService envelopeService = new EnvelopeService(SERVER_URI, credentials);