#Author: Sarala Parthasaradhi

@4th
Feature: OrangeHRM Job Categories feature


Scenario: Verify Add functionality for Job Categories for Name textbox

Given User is on Job Categories page
When Click on Add button for adding Job Category
Then Enter data for Name textbox and click save and verify


Scenario: Verify Add functionality for Job Categories with empty Name field 

Given User is on Job Categories page for empty field test
When Click on Add button without entering any data for Job Categories
Then Click Save and check the error message displayed as Required


Scenario: Verify Add functionality for Job Categories with pre existing data

Given User is on Job Categories page for pre existing data test
When Click on Add button and enter already existing Job Category
Then Click Save and check the error message displayed as Already Exists

#@4th
Scenario: Verify Delete functionality for Job Categories single entry

Given User is on Job Categories page for deleting single entry
When Click on checkbox corresponding to Job Categories to be delete
Then Click Delete and Click OK in Confirmation popup and verify Job Category is deleted

#@4th
Scenario: Verify Delete functionality for Job Categories for multiple entry

Given User is on Job Categories page for deleting multiple entries
When Click on checkboxes corresponding to Job Categories to be delete
Then Click Delete and Click OK in Confirmation popup and verify seleted Job Categories are deleted



