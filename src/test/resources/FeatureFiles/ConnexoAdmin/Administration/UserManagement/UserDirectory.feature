## Author: Dileep.Mothe@Honeywell.com
## Date: 19th Sept 2022
## Reference: Existing framework "UserDirectoriesTest.java"

Feature: Validate the UserDirectories functionality in Connexo Admin

Scenario: Validate CRUD operation of UserDirectories in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-USERDIRECTORY: I click on UserDirectory link
And ADMIN-USERDIRECTORY: I add new UserDirectory withe below details:
|Name                 |ABCDirectory           |
|Url                  |https://connexo.com/   |
|Backupurl            |https://connexo1.com/  |
|securityprotocol     |None                   |
|directoryUser        |ABC                    |
|Password             |123                    |
|BaseUrl              |https://connexo.com/   |
|BaseGroup            |XYZ                    |
Then ADMIN-USERDIRECTORY: I verify that UserDirectory "Add" Message
And ADMIN-USERDIRECTORY: I edit newly added UserDirectory
Then ADMIN-USERDIRECTORY: I verify that UserDirectory "Save" Message
And ADMIN-USERDIRECTORY: I Remove newly added UserDirectory
Then ADMIN-USERDIRECTORY: I verify that UserDirectory "Remove" Message