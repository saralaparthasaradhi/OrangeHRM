$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Employment_Status.feature");
formatter.feature({
  "name": "OrangeHRM Employment Status feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.scenario({
  "name": "Verify Add functionality for Employment Status for Name textbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Employment Status page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.user_is_on_Employment_Status_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button for adding new data",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_Add_button_for_adding_new_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter data for Name text field and click save and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.enter_data_for_Name_text_field_and_click_save_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Employment Status with empty Name field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Employment Status page for empty field test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.user_is_on_Employment_Status_page_for_empty_field_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button without entering any data for Employment Status",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_Add_button_without_entering_any_data_for_Employment_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save and verify the error message displayed as Required",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_Save_and_verify_the_error_message_displayed_as_Required()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Employment Status with pre existing data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Employment Status page for pre existing data test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.user_is_on_Employment_Status_page_for_pre_existing_data_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button and enter pre existing data",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_Add_button_and_enter_pre_existing_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save and verify the error message displayed as Already Exists",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_Save_and_verify_the_error_message_displayed_as_Already_Exists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for Employment Status single entry",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Employment Status page for deleting single entry",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.user_is_on_Employment_Status_page_for_deleting_single_entry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkbox corresponding to Employment Status to be delete",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_checkbox_corresponding_to_Employment_Status_to_be_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Delete and Click on OK in Confirmation popup and verify Employment Status is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_Delete_and_Click_on_OK_in_Confirmation_popup_and_verify_Employment_Status_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for Employment Status for multiple entry",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@3rd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Employment Status page for deleting multiple entries",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.user_is_on_Employment_Status_page_for_deleting_multiple_entries()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkboxes corresponding to Employment Status to be delete",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_checkboxes_corresponding_to_Employment_Status_to_be_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Delete and Click on OK in Confirmation popup and verify seleted options are deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Employment_Status_Steps.click_on_Delete_and_Click_on_OK_in_Confirmation_popup_and_verify_seleted_options_are_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Job_Categories.feature");
formatter.feature({
  "name": "OrangeHRM Job Categories feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.scenario({
  "name": "Verify Add functionality for Job Categories for Name textbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Categories page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.user_is_on_Job_Categories_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button for adding Job Category",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_on_Add_button_for_adding_Job_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter data for Name textbox and click save and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.enter_data_for_Name_textbox_and_click_save_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Job Categories with empty Name field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Categories page for empty field test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.user_is_on_Job_Categories_page_for_empty_field_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button without entering any data for Job Categories",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_on_Add_button_without_entering_any_data_for_Job_Categories()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save and check the error message displayed as Required",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_Save_and_check_the_error_message_displayed_as_Required()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Job Categories with pre existing data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Categories page for pre existing data test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.user_is_on_Job_Categories_page_for_pre_existing_data_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button and enter already existing Job Category",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_on_Add_button_and_enter_already_existing_Job_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save and check the error message displayed as Already Exists",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_Save_and_check_the_error_message_displayed_as_Already_Exists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for Job Categories single entry",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Categories page for deleting single entry",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.user_is_on_Job_Categories_page_for_deleting_single_entry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkbox corresponding to Job Categories to be delete",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_on_checkbox_corresponding_to_Job_Categories_to_be_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete and Click OK in Confirmation popup and verify Job Category is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_Delete_and_Click_OK_in_Confirmation_popup_and_verify_Job_Category_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for Job Categories for multiple entry",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4th"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Categories page for deleting multiple entries",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.user_is_on_Job_Categories_page_for_deleting_multiple_entries()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkboxes corresponding to Job Categories to be delete",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_on_checkboxes_corresponding_to_Job_Categories_to_be_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete and Click OK in Confirmation popup and verify seleted Job Categories are deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Categories_Steps.click_Delete_and_Click_OK_in_Confirmation_popup_and_verify_seleted_Job_Categories_are_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Job_Titles.feature");
formatter.feature({
  "name": "OrangeHRM Job titles feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.scenario({
  "name": "Verify Add functionality for Job Titles with all fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for all fields test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Job_tab_and_click_on_Job_Titles_option_for_all_fields_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button for all fields test",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.Click_on_Add_button_for_all_fields_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter data for all fields and click save and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.Enter_data_for_all_fields_and_click_save_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Job Titles with empty Mandatory field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for empty Mandatory field test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.user_is_on_Job_Title_Page_for_empty_Mandatory_field_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Job Titles with existing Job Title data in Job Title text field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for existing Job Title data test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.user_is_on_Job_Title_Page_for_existing_Job_Title_data_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button and enter data for Job title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Add_button_and_enter_data_for_Job_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button and verify error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Save_button_and_verify_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Job Titles with Mandatory fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for Mandatory fields test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.user_is_on_Job_Title_Page_for_Mandatory_fields_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add option  and enter data for only Job Title field",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Add_option_and_enter_data_for_only_Job_Title_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Save_button_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for required Job Title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for delete Job Title test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.user_is_on_Job_Title_Page_for_delete_Job_Title_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkbox corresponding to Job Title to be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_checkbox_corresponding_to_Job_Title_to_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Delete and Click on OK button in Confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Delete_and_Click_on_OK_button_in_Confirmation_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for required multiple Job Titles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@1st"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for delete multiple Job Title test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.user_is_on_Job_Title_Page_for_delete_multiple_Job_Title_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkboxes corresponding to Job Titles to be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_checkboxes_corresponding_to_Job_Titles_to_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Delete button and Click on OK button in Confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_Steps.click_on_Delete_button_and_Click_on_OK_button_in_Confirmation_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Pay_Grades.feature");
formatter.feature({
  "name": "OrangeHRM Pay Grades feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.scenario({
  "name": "Verify Add functionality for required Pay Grades",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Pay Grades Page for Add functionality test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.user_is_on_Pay_Grades_Page_for_Add_functionality_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button to add Pay Grade",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_Add_button_to_add_Pay_Grade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter data for Name field and click save and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.enter_data_for_Name_field_and_click_save_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Pay Grades with existing Pay Grade data in Name text field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Pay Grades Page for existing Pay Grades data test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.user_is_on_Pay_Grades_Page_for_existing_Pay_Grades_data_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button and enter existing data for Pay Grades",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_Add_button_and_enter_existing_data_for_Pay_Grades()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button and verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_Save_button_and_verify_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add functionality for Pay Grades with empty Name field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Pay Grades Page for empty Mandatory field test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.user_is_on_Pay_Grades_Page_for_empty_Mandatory_field_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button with no data",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_Add_button_with_no_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button to save",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_Save_button_to_save()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for required Pay Grade",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Pay Grades Page for delete Pay Grades test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.user_is_on_Pay_Grades_Page_for_delete_Pay_Grades_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkbox corresponding to Pay Grade to be deleted",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_checkbox_corresponding_to_Pay_Grade_to_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete and Click on OK button in Confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_Delete_and_Click_on_OK_button_in_Confirmation_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Delete functionality for selecting all Pay Grades option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2nd"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Pay Grades Page for deleting all Pay Grades test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.user_is_on_Pay_Grades_Page_for_deleting_all_Pay_Grades_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkbox corresponding to header Pay Grade to delete all",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_on_checkbox_corresponding_to_header_Pay_Grade_to_delete_all()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete button and Click on OK button in Confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Pay_Grades_Steps.click_Delete_button_and_Click_on_OK_button_in_Confirmation_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});