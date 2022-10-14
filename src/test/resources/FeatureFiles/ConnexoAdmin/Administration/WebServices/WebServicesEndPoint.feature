## Author: Dileep.Mothe@Honeywell.com
## Date: 15th Sept 2022
## Reference: Existing framework "WebServiceEndpointsTest.java"

Feature: Validate the WebServiceEndPoint Basic functionality in Connexo Admin

Scenario: Validate WebServiceEndPoint CRUD operations in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-WEBSERVICEENDPOINT: I click on WebService EndPoints link
And ADMIN-WEBSERVICEENDPOINT: I add a new WebService EndPoint with below details:
|Name              |SampleWeb        |
|Webservice        |CIM MeterReadings|
|UrlPath           |Temp             |
|Loglevel          |Warning          |   
|Authentication    |No authentication|
Then ADMIN-WEBSERVICEENDPOINT: I verify that WebService EndPoint "Add" Message
And ADMIN-WEBSERVICEENDPOINT: I activate WebService EndPoint
Then ADMIN-WEBSERVICEENDPOINT: I verify that WebService EndPoint "Activate" Message
And ADMIN-WEBSERVICEENDPOINT: I edit newly added WebService EndPoint
Then ADMIN-WEBSERVICEENDPOINT: I verify that WebService EndPoint "Save" Message
And ADMIN-WEBSERVICEENDPOINT: I remove newly added WebService EndPoint
Then ADMIN-WEBSERVICEENDPOINT: I verify that WebService EndPoint "Remove" Message
