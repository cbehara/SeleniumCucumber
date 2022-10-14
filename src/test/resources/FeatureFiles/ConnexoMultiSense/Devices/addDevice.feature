## Author: Dileep.Mothe@Honeywell.com
## Date: 6th September 2022


Feature: Add a Device in MultiSense

 Scenario: Validate add device functionality

Given I navigate to Connexo application
And I do login with root user
Then I should be on the Connexo dashboard page
And I navigate to Multisense Module
And I click on Devices
And I add a Device :
#|Device Name| Device Type| Device Config|        
|Device471|Elster AS1440|Consumers|
