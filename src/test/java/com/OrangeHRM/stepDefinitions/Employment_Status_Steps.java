package com.OrangeHRM.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.DashboardPage;
import com.OrangeHRM.pages.EmploymentStatusPage;
import com.OrangeHRM.pages.PayGradesPage;
import com.OrangeHRM.util.TestBase;
import com.OrangeHRM.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Employment_Status_Steps extends TestBase{
	
	TestUtil testUtil;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	PayGradesPage pageGradesPage;
	EmploymentStatusPage employmentStatusPage;
	
	@Before("@3rd")
	public void setUp() {
		
		initialization();
		login();
		dashboardPage = new DashboardPage();
		adminPage = dashboardPage.clickAdmin_btn();
		employmentStatusPage = adminPage.clickEmploymentStatus_btn("Employment Status");
	}
	
	@After("@3rd")
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Given("User is on Employment Status page")
	public void user_is_on_Employment_Status_page() {
		String title = employmentStatusPage.verify_EmploymentStatus_Label();
		System.out.println(title);
		Assert.assertEquals(title, "Employment Status");
	}

	@When("Click on Add button for adding new data")
	public void click_on_Add_button_for_adding_new_data() {
	    employmentStatusPage.clickAdd_btn();
	}

	@Then("Enter data for Name text field and click save and verify")
	public void enter_data_for_Name_text_field_and_click_save_and_verify() {
	    employmentStatusPage.enter_Data_in_Name_field(jobProp.getProperty("employmentStatusName"));
	    employmentStatusPage.clickSave_btn();
	    
	    List <WebElement> list = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
	    for(WebElement ele: list) {
	    	if((ele.getText()).equals(jobProp.getProperty("employmentStatusName")));
	     }
	    System.out.println("Successfully added");
	}

	@Given("User is on Employment Status page for empty field test")
	public void user_is_on_Employment_Status_page_for_empty_field_test() {
		String title = employmentStatusPage.verify_EmploymentStatus_Label();
		System.out.println(title);
		Assert.assertEquals(title, "Employment Status");
	
	}

	@When("Click on Add button without entering any data for Employment Status")
	public void click_on_Add_button_without_entering_any_data_for_Employment_Status() {
	    employmentStatusPage.clickAdd_btn();

	}

	@Then("Click Save and verify the error message displayed as Required")
	public void click_Save_and_verify_the_error_message_displayed_as_Required() {
	    employmentStatusPage.clickSave_btn();
	    Assert.assertEquals(employmentStatusPage.requiredError_msg(),"Required");
	}
	
	@Given("User is on Employment Status page for pre existing data test")
	public void user_is_on_Employment_Status_page_for_pre_existing_data_test() {
		String title = employmentStatusPage.verify_EmploymentStatus_Label();
		System.out.println(title);
		Assert.assertEquals(title, "Employment Status");
	}

	@When("Click on Add button and enter pre existing data")
	public void click_on_Add_button_and_enter_pre_existing_data() {
	    employmentStatusPage.clickAdd_btn();
	    employmentStatusPage.enter_Data_in_Name_field(jobProp.getProperty("employmentStatusName"));
	}

	@Then("Click Save and verify the error message displayed as Already Exists")
	public void click_Save_and_verify_the_error_message_displayed_as_Already_Exists() {
	    employmentStatusPage.clickSave_btn();
	    String errormsg =  employmentStatusPage.alreadyExistsError_msg();
	    Assert.assertEquals(errormsg, "Already exists");
	}

	@Given("User is on Employment Status page for deleting single entry")
	public void user_is_on_Employment_Status_page_for_deleting_single_entry() {
		String title = employmentStatusPage.verify_EmploymentStatus_Label();
		System.out.println(title);
		Assert.assertEquals(title, "Employment Status");
	}

	@When("Click on checkbox corresponding to Employment Status to be delete")
	public void click_on_checkbox_corresponding_to_Employment_Status_to_be_delete() {
	     employmentStatusPage.single_delete_employmentStatus(jobProp.getProperty("employmentStatusName"));
	}

	@Then("Click on Delete and Click on OK in Confirmation popup and verify Employment Status is deleted")
	public void click_on_Delete_and_Click_on_OK_in_Confirmation_popup_and_verify_Employment_Status_is_deleted() {
	    employmentStatusPage.clickDelete_btn();
	    employmentStatusPage.click_OK_btn();
	    
	    List <WebElement> list = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
	    for(WebElement ele : list) {
	    	if(!(ele.getText()).equals(jobProp.getProperty("employmentStatusName")))
	    		continue;
	    	else
	    		System.out.println("Delete functionality failed");
	    	System.out.println("Single Delete action is done successfully");
	    			
	    	
	    }
	}

	@Given("User is on Employment Status page for deleting multiple entries")
	public void user_is_on_Employment_Status_page_for_deleting_multiple_entries() {
		String title = employmentStatusPage.verify_EmploymentStatus_Label();
		System.out.println(title);
		Assert.assertEquals(title, "Employment Status");
	  
	}

	@When("Click on checkboxes corresponding to Employment Status to be delete")
	public void click_on_checkboxes_corresponding_to_Employment_Status_to_be_delete() {
	   employmentStatusPage.multiple_delete(jobProp.getProperty("employmentStatusName1"), jobProp.getProperty("employmentStatusName2"));
	}

	@Then("Click on Delete and Click on OK in Confirmation popup and verify seleted options are deleted")
	public void click_on_Delete_and_Click_on_OK_in_Confirmation_popup_and_verify_seleted_options_are_deleted() {
		employmentStatusPage.clickDelete_btn();
	    employmentStatusPage.click_OK_btn();
	    
	    List <WebElement> list = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
	    for(WebElement ele : list) {
	    	if(!(ele.getText()).equals(jobProp.getProperty("employmentStatusName1")) && !(ele.getText()).equals(jobProp.getProperty("employmentStatusName2")))
	    			continue;
	    	else
	    		System.out.println("delete functionality failed");
	    	
	    }
	    System.out.println("Mulitple delete action is done successfully");
	}
	    


}
