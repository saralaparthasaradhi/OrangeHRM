package com.OrangeHRM.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.DashboardPage;
import com.OrangeHRM.pages.JobTitlePage;
import com.OrangeHRM.util.TestBase;
import com.OrangeHRM.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import junit.framework.Assert;

public class Job_Titles_withData_in_All_Fields extends TestBase{

	TestUtil testUtil;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	JobTitlePage jobtitlePage;
	
	
	
	
	
	@Before
	public void preSteps() {

		TestBase.initialization();
		TestBase.login();
		jobtitlePage = new JobTitlePage();
		dashboardPage = new DashboardPage();

		adminPage = dashboardPage.clickAdmin_btn();

		jobtitlePage = adminPage.clickJobTitle_btn();


	}
	
//	@After
//	public void tearDown() {
//		driver.quit();
//		System.out.println("###########################################################");
//	}
	
//	@Given("^User is on Job Title Page for all fields test$")
//	public void click_on_Job_tab_and_click_on_Job_Titles_option_for_all_fields_test() throws Throwable {
//		
//		
//		System.out.println(dashboardPage.getDashboardTitle());
//		
//		System.out.println(adminPage.getTitle());
//		
//		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
//		System.out.println("All Fields Test:");
//		System.out.println("======================="+jobTitlePageLabel+"==================");
//	
//	}
//
//	@When("^Click on Add button for all fields test$")
//	public void Click_on_Add_button_for_all_fields_test() throws Throwable {
//		
//		jobtitlePage.clickAdd_btn();
//	}
//
//	
//
//	@Then("^Enter data for all fields and click save and verify$")
//	public void Enter_data_for_all_fields_and_click_save_and_verify() throws Throwable {
//		   
//		   jobtitlePage.enter_Data_In_All_Fields();
//		   jobtitlePage.clickSave_btn();
//		   
//		   List<WebElement> listOfJobTitles = driver.findElements(By.xpath("//tr[@class='odd']//td[@class='left']"));
//		   for(WebElement element: listOfJobTitles) {
//			   if(element.getText().equals("Quality Analyst"))
//				   System.out.println("==============New Job Title Added Successfully!=================");
//		   }
//	}
	
	
//	@Given("^User is on Job Title Page for empty Mandatory field test$")
//	public void user_is_on_Job_Title_Page_for_empty_Mandatory_field_test() throws Throwable {
//		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
//		System.out.println("Empty Mandatory field test: ");
//		System.out.println("======================="+jobTitlePageLabel+"==================");
//	}
//
//	@Then("^Click on Add button$")
//	public void click_on_Add_button() throws Throwable {
//		jobtitlePage.clickAdd_btn();
//
//	}
//
//	@Then("^Click on Save button$")
//	public void click_on_Save_button() throws Throwable {
//		   jobtitlePage.clickSave_btn();
//		   String errorMsg = jobtitlePage.required_errorMessage();
//		   Assert.assertEquals("Required", errorMsg);
//
//	}
//	
//	
//	@Given("^User is on Job Title Page for existing Job Title data test$")
//	public void user_is_on_Job_Title_Page_for_existing_Job_Title_data_test() throws Throwable {
//		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
//		System.out.println("Existing Job Title data test: ");
//		System.out.println("======================="+jobTitlePageLabel+"==================");
//		
//	}
//
//	@Then("^Click on Add button and enter data for Job title$")
//	public void click_on_Add_button_and_enter_data_for_Job_title() throws Throwable {
//		jobtitlePage.clickAdd_btn();
//		jobtitlePage.existing_JobTitle_Data_entry();
//
//	}
//
//	@Then("^Click on Save button and verify error message$")
//	public void click_on_Save_button_and_verify_error_message() throws Throwable {
//		   jobtitlePage.clickSave_btn();
//		   String errorMsg = jobtitlePage.Already_exists_errorMessage();
//		   Assert.assertEquals("Already exists", errorMsg);
//
//	}
//
//	@Given("^User is on Job Title Page for Mandatory fields test$")
//	public void user_is_on_Job_Title_Page_for_Mandatory_fields_test() throws Throwable {
//		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
//		System.out.println("Mandatory Job Title data test: ");
//		System.out.println("======================="+jobTitlePageLabel+"==================");
//	}
//
//	@Then("^Click on Add option  and enter data for only Job Title field$")
//	public void click_on_Add_option_and_enter_data_for_only_Job_Title_field() throws Throwable {
//		jobtitlePage.clickAdd_btn();
//		jobtitlePage.enter_Data_in_Mandatory_field();
//	}
//
//	@Then("^Click on Save button and verify$")
//	public void click_on_Save_button_and_verify() throws Throwable {
//		   jobtitlePage.clickSave_btn();
//		   
//		   List<WebElement> listOfJobTitles = driver.findElements(By.xpath("//tr//td[@class='left']"));
//		   for(WebElement element: listOfJobTitles) {
//			   if(element.getText().equals("QA"))
//				   System.out.println("==============New Job Title Added Successfully!=================");
//		   }
//
//	}
//	
//	
//	@Given("^User is on Job Title Page for delete Job Title test$")
//	public void user_is_on_Job_Title_Page_for_delete_Job_Title_test() throws Throwable {
//		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
//		System.out.println("Delete Job Title test: ");
//		System.out.println("======================="+jobTitlePageLabel+"==================");
//	}
//
//	@Then("^Click on checkbox corresponding to Job Title to be deleted$")
//	public void click_on_checkbox_corresponding_to_Job_Title_to_be_deleted() throws Throwable {
//	    jobtitlePage.singleDelete();
//	    
//	}
//
//	@Then("^Click on Delete and Click on OK button in Confirmation popup$")
//	public void click_on_Delete_and_Click_on_OK_button_in_Confirmation_popup() throws Throwable {
//		jobtitlePage.clickDelete_btn();
//	    jobtitlePage.click_OK_Confimation();
//	}
//
	@Given("^User is on Job Title Page for delete multiple Job Title test$")
	public void user_is_on_Job_Title_Page_for_delete_multiple_Job_Title_test() throws Throwable {
		String jobTitlePageLabel = jobtitlePage.jobTitleLable();
		System.out.println("Delete multiple Job Title test: ");
		System.out.println("======================="+jobTitlePageLabel+"==================");
	}

	@Then("^Click on checkboxes corresponding to Job Titles to be deleted$")
	public void click_on_checkboxes_corresponding_to_Job_Titles_to_be_deleted() throws Throwable {
	    jobtitlePage.multipleDelete();
	}

	@Then("^Click on Delete button and Click on OK button in Confirmation popup$")
	public void click_on_Delete_button_and_Click_on_OK_button_in_Confirmation_popup() throws Throwable {
		jobtitlePage.clickDelete_btn();
	    jobtitlePage.click_OK_Confimation();
	}


	
	
	
	
}
