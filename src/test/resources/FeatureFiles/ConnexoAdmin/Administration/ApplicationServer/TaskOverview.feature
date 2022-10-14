## Author: Dileep.Mothe@Honeywell.com
## Date: 13th Sept 2022
## Reference: Existing framework "TaskOverViewTest.java"

Feature: Validate the TaskOveriew Basic functionality in Connexo Admin

Scenario: Validate TaskOveriew in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-TASKOVERVIEW: I click on Task Overview link
And ADMIN-TASKOVERVIEW: I apply and Verify Task Overview filter with Queue type as "CALTimeSeriesExtQ"
And HOME: I logout from Connexo