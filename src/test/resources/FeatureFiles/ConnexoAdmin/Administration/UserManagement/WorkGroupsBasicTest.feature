## Author: Dileep.Mothe@Honeywell.com
## Date: 9th Sept 2022
## Reference: Existing framework "WorkGroupsTest.java"

Feature: Validate the WorkGroups Basic functionality in Connexo Admin

 Scenario: Validate WorkGroups addition and removal in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-WORKGROUPS: I click on WorkGroups link
And ADMIN-WORKGROUPS: I Add a new WorkGroup as "AConnexoOperator"
Then ADMIN-WORKGROUPS: I verify that WorkGroup "Add" Message
And ADMIN-WORKGROUPS: I edit "AConnexoOperator" WorkGroup Name
Then ADMIN-WORKGROUPS: I verify that WorkGroup "Save" Message
And ADMIN-WORKGROUPS: I remove "AConnexoOperator" WorkGroup Name
Then ADMIN-WORKGROUPS: I verify that WorkGroup "Remove" Message