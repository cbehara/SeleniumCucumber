## Author: Dileep.Mothe@Honeywell.com
## Date: 8th Sept 2022
## Reference: Existing framework "ProcessesTest.java"

Feature: Validate the Processes Basic functionality in Connexo Admin

 Scenario: Validate Processes Activation and Deactivation in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-PROCESSES: I click on Processes link
And ADMIN-PROCESSES: I activate "Activate device" process
And ADMIN-PROCESSES: I edit "Activate device" process
And ADMIN-PROCESSES: I check Process "Activate device" status as "Active"
And ADMIN-PROCESSES: I Deactivate "Activate device" Process
And ADMIN-PROCESSES: I check Process "Activate device" status as "Inactive"


