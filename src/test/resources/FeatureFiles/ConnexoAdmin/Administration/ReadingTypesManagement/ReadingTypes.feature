## Author: Dileep.Mothe@Honeywell.com
## Date: 12th Sept 2022
## Reference: Existing framework "ReadingTypesTest.java"

Feature: Validate the ReadingTypes Basic functionality in Connexo Admin

Scenario: Validate creation of ReadingTypes in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-READINGTYPES: I click on Reading Types link
And ADMIN-READINGTYPES: I create new Reading Types with below Details:
|Period            |Daily     |
|Commodity         |CH4       |
|Phases            |Phase-AN  | 

