## Author: Dileep.Mothe@Honeywell.com
## Date: 12th Sept 2022
## Reference: Existing framework "RolesTest.java"

Feature: Validate the Roles functionality in Connexo Admin

Scenario: Validate CRUD operation of Roles in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-ROLES: I click on Roles link
And ADMIN-ROLES: I add a new Role as "Admin Role"
Then ADMIN-ROLES: I verify that Role "Add" Message
And ADMIN-ROLES: I edit "Admin Role" Role Name
Then ADMIN-ROLES: I verify that Role "Save" Message
And ADMIN-ROLES: I remove "Admin Role" Role Name
Then ADMIN-ROLES: I verify that Role "Remove" Message