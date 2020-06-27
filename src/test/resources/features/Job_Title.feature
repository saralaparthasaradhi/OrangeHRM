Feature: OrangeHRM Job title feature

#Scenario: Verify Add functionality for Job Titles with all fields
#
#Given User is on Job Title Page for all fields test
#When Click on Add button for all fields test
#Then Enter data for all fields and click save and verify


#Scenario: Verify Add functionality for Job Titles with empty Mandatory field
#
#Given User is on Job Title Page for empty Mandatory field test
#Then Click on Add button
#Then Click on Save button

#Scenario: Verify Add functionality for Job Titles with existing Job Title data in Job Title text field
#
#Given User is on Job Title Page for existing Job Title data test
#Then Click on Add button and enter data for Job title
#Then Click on Save button and verify error message
#
#Scenario: Verify Add functionality for Job Titles with Mandatory fields
#
#Given User is on Job Title Page for Mandatory fields test
#Then Click on Add option  and enter data for only Job Title field
#Then Click on Save button and verify
#
#Scenario: Verify Delete functionality for required Job Title
#
#Given User is on Job Title Page for delete Job Title test
#Then Click on checkbox corresponding to Job Title to be deleted
#Then Click on Delete and Click on OK button in Confirmation popup
#
#
Scenario: Verify Delete functionality for required multiple Job Titles 

Given User is on Job Title Page for delete multiple Job Title test
Then Click on checkboxes corresponding to Job Titles to be deleted
Then Click on Delete button and Click on OK button in Confirmation popup
