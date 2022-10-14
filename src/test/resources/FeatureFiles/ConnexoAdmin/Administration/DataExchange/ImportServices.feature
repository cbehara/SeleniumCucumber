## Author: Dileep.Mothe@Honeywell.com
## Date: 9th Sept 2022
## Reference: Existing framework "ImportServicesTest.java & ImportHistoryTest.java & UploadFileForImportTest.java"

Feature: Validate the ImportServices Basic functionality in Connexo Admin

Scenario: Validate ImportServices addition and removal and Activate and DeActivation in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-IMPORTSERVICES: I click on Import Services link
And ADMIN-IMPORTSERVICES: I add new Import Service withe below details:
|Name            |ABCImport              |
|FileImporter    |Calendar importer [STD]|
|ImportFolder    |temp                   |
|FilePattern     |.csv                   |
|InProgressFolder|progress               |
|SuccessFolder   |success                |
|FailureFolder   |failure                |
Then ADMIN-IMPORTSERVICES: I verify that ImportService "Add" Message
And ADMIN-IMPORTSERVICES: I Activate newly added Import service
Then ADMIN-IMPORTSERVICES: I verify that ImportService "Activate" Message
And ADMIN-IMPORTSERVICES: I edit newly added Import service
Then ADMIN-IMPORTSERVICES: I verify that ImportService "Save" Message
And ADMIN-IMPORTSERVICES: I Deactivate newly added Import service
Then ADMIN-IMPORTSERVICES: I verify that ImportService "Deactivate" Message
And ADMIN-IMPORTSERVICES: I Remove newly added Import service
Then ADMIN-IMPORTSERVICES: I verify that ImportService "Remove" Message
And HOME: I navigate to Admin Module
And ADMIN-IMPORTSERVICES: I click on Import History link
Then ADMIN_IMPORTSERVICES: I verify Import history page


Scenario: Validate Upload File Importer functionality
Given HOME: I navigate to Admin Module
And ADMIN-IMPORTSERVICES: I click on Import Services link
And ADMIN-IMPORTSERVICES: I activate "Calendar" Import services
Given HOME: I navigate to Admin Module
And ADMIN-IMPORTUPLOADFILESERVICES: I click on Upload File for Importer link
And ADMIN-IMPORTUPLOADFILESERVICES: I upload a file for "Calendar" Importer service
Then ADMIN-IMPORTUPLOADFILESERVICES: I verify Message after file upload
Given HOME: I navigate to Admin Module
And ADMIN-IMPORTSERVICES: I click on Import Services link
And ADMIN-IMPORTSERVICES: I Deactivate "Calendar" Import services





  






