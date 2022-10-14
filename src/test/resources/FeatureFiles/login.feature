## Author: Dileep.Mothe@Honeywell.com
## Date: 29th August 2022


Feature: Login into the Connexo Application

 Scenario: Validate the connexo login functionality

Given I navigate to Connexo application
And I do login with root user
Then I should be on the Connexo dashboard page
And I logout from Connexo


