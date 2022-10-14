## Author: Dileep.Mothe@Honeywell.com
## Date: 15th Sept 2022
## Reference: Existing framework "RelativePeriodTest.java"

Feature: Validate the Relative Periods Basic functionality in Connexo Admin

Scenario: Validate Relative Periods CRUD operations in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-RELATIVEPERIOD: I click on Relative Periods link
And ADMIN-RELATIVEPERIOD: I add a new Relative Period
Then ADMIN-RELATIVEPERIOD: I verify that Relative Period "Add" Message
And ADMIN-RELATIVEPERIOD: I edit newly added Relative Period
Then ADMIN-RELATIVEPERIOD: I verify that Relative Period "Save" Message
And ADMIN-RELATIVEPERIOD: I remove newly added Relative Period
Then ADMIN-RELATIVEPERIOD: I verify that Relative Period "Remove" Message
