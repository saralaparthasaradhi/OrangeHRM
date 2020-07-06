@2nd
Feature: OrangeHRM Pay Grades feature

Scenario: Verify Add functionality for required Pay Grades

Given User is on Pay Grades Page for Add functionality test
When Click on Add button to add Pay Grade
Then Enter data for Name field and click save and verify

Scenario: Verify Add functionality for Pay Grades with existing Pay Grade data in Name text field

Given User is on Pay Grades Page for existing Pay Grades data test
When Click on Add button and enter existing data for Pay Grades
Then Click on Save button and verify the error message


Scenario: Verify Add functionality for Pay Grades with empty Name field

Given User is on Pay Grades Page for empty Mandatory field test
When Click on Add button with no data
Then Click on Save button to save


Scenario: Verify Delete functionality for required Pay Grade

Given User is on Pay Grades Page for delete Pay Grades test
When Click on checkbox corresponding to Pay Grade to be deleted
Then Click Delete and Click on OK button in Confirmation popup


Scenario: Verify Delete functionality for selecting all Pay Grades option

Given User is on Pay Grades Page for deleting all Pay Grades test
When Click on checkbox corresponding to header Pay Grade to delete all
Then Click Delete button and Click on OK button in Confirmation popup




