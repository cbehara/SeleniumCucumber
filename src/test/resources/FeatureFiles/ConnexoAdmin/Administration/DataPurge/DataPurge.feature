## Author: Dileep.Mothe@Honeywell.com
## Date: 15th Sept 2022
## Reference: Existing framework "Admin_DataPurgeTest.java"

Feature: Validate the Basic DataPurge Settings functionality in Connexo Admin

Scenario: Validate DataPurge Settings and Data Purge History in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-DATAPURGE: I click on Data Purge Setting link
And ADMIN-DATAPURGE: I update the Data Purge Settings
And ADMIN-DATAPURGE: I reset the Data Purge Settings
And HOME: I navigate to Admin Module
And ADMIN-DATAPURGE: I click on Data Purge History link
And ADMIN-DATAPURGE: I verfiy Data Purge History Page