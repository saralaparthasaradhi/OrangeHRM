#Author: Sarala Parthasaradhi

@3rd
Feature: OrangeHRM Employment Status feature


Scenario: Verify Add functionality for Employment Status for Name textbox

Given User is on Employment Status page
When Click on Add button for adding new data
Then Enter data for Name text field and click save and verify

Scenario: Verify Add functionality for Employment Status with empty Name field 

Given User is on Employment Status page for empty field test
When Click on Add button without entering any data for Employment Status
Then Click Save and verify the error message displayed as Required

Scenario: Verify Add functionality for Employment Status with pre existing data

Given User is on Employment Status page for pre existing data test
When Click on Add button and enter pre existing data
Then Click Save and verify the error message displayed as Already Exists

Scenario: Verify Delete functionality for Employment Status single entry

Given User is on Employment Status page for deleting single entry
When Click on checkbox corresponding to Employment Status to be delete
Then Click on Delete and Click on OK in Confirmation popup and verify Employment Status is deleted

Scenario: Verify Delete functionality for Employment Status for multiple entry

Given User is on Employment Status page for deleting multiple entries
When Click on checkboxes corresponding to Employment Status to be delete
Then Click on Delete and Click on OK in Confirmation popup and verify seleted options are deleted


