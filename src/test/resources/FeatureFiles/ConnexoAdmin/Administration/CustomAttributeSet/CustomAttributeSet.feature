## Author: Dileep.Mothe@Honeywell.com
## Date: 15th Sept 2022
## Reference: Existing framework "CustomAttributesTest.java"

Feature: Validate the CustomAttributeSet Basic functionality in Connexo Admin

Scenario: Verfiy CustomAttributeSet in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-CUSTOMATTRIBUTESET: I click on Custom Attribute Set link
And ADMIN-CUSTOMATTRIBUTESET: I apply and verfiy filter with Custom Attribute as Register
