## Author: Dileep.Mothe@Honeywell.com
## Date: 8th Sept 2022
## Reference: Existing framework "CalendarsTest.java"

Feature: Validate the Calendar Basic functionality in Connexo Admin

Scenario: Validate Calender Activation and Deactivation in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-CALENDAR: I click on Calender link
And ADMIN-CALENDAR: I Activate "Peak/Offpeak (Belgium)" calendar
And ADMIN-CALENDAR: I check Calendar "Peak/Offpeak (Belgium)" status as "Active"
And ADMIN-CALENDAR: I Deactivate "Peak/Offpeak (Belgium)" calendar
And ADMIN-CALENDAR: I check Calendar "Peak/Offpeak (Belgium)" status as "Inactive"

