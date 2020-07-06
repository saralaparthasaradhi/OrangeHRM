package com.OrangeHRM.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.DashboardPage;
import com.OrangeHRM.pages.EmploymentStatusPage;
import com.OrangeHRM.pages.JobCategoriesPage;
import com.OrangeHRM.pages.PayGradesPage;
import com.OrangeHRM.util.TestBase;
import com.OrangeHRM.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Job_Categories_Steps extends TestBase {
	
	TestUtil testUtil;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	PayGradesPage pageGradesPage;
	EmploymentStatusPage employmentStatusPage;
	JobCategoriesPage jobCategoriesPage;
		
	@Before("@4th")
	public void setUp() {
		initialization();
		login();
		dashboardPage =new DashboardPage();
		adminPage = dashboardPage.clickAdmin_btn();
		jobCategoriesPage = adminPage.clickJobCategories_btn("Job Categories");
		
	}

	@After("@4th")
	public void tearDown() {
		driver.quit();
	}
	
	@Given("User is on Job Categories page")
	public void user_is_on_Job_Categories_page() {
		String title = jobCategoriesPage.verify_JobCategories_Label();
		System.out.println(title);
		//Assert.assertEquals(title, "Job Categories");
	}

	@When("Click on Add button for adding Job Category")
	public void click_on_Add_button_for_adding_Job_Category() {
	    jobCategoriesPage.clickAdd_btn();
	}

	@Then("Enter data for Name textbox and click save and verify")
	public void enter_data_for_Name_textbox_and_click_save_and_verify() {
	    jobCategoriesPage.enter_Data_in_Name_field(jobProp.getProperty("jobCategoriesName"));
	    jobCategoriesPage.clickSave_btn();
	    
	    List <WebElement> list = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
	    for(WebElement ele: list) {
	    	if((ele.getText()).equals(jobProp.getProperty("jobCategoriesName")));
	    	System.out.println("Successfully added");
	    }
	    
	    
	}

	@Given("User is on Job Categories page for empty field test")
	public void user_is_on_Job_Categories_page_for_empty_field_test() {
		String title = jobCategoriesPage.verify_JobCategories_Label();
		System.out.println(title);
		//Assert.assertEquals(title, "Job Categories");
	}

	@When("Click on Add button without entering any data for Job Categories")
	public void click_on_Add_button_without_entering_any_data_for_Job_Categories() {
	   jobCategoriesPage.clickAdd_btn();
	   
	}

	@Then("Click Save and check the error message displayed as Required")
	public void click_Save_and_check_the_error_message_displayed_as_Required() {
	    jobCategoriesPage.clickSave_btn();
	    String error = jobCategoriesPage.requiredError_msg();
	    Assert.assertEquals(error, "Required");
	}

	@Given("User is on Job Categories page for pre existing data test")
	public void user_is_on_Job_Categories_page_for_pre_existing_data_test() {
		String title = jobCategoriesPage.verify_JobCategories_Label();
		System.out.println(title);
		//Assert.assertEquals(title, "Job Categories");
	}

	@When("Click on Add button and enter already existing Job Category")
	public void click_on_Add_button_and_enter_already_existing_Job_Category() {
	    jobCategoriesPage.clickAdd_btn();
	    jobCategoriesPage.enter_Data_in_Name_field(jobProp.getProperty("jobCategoriesName"));
	}

	@Then("Click Save and check the error message displayed as Already Exists")
	public void click_Save_and_check_the_error_message_displayed_as_Already_Exists() {
	    jobCategoriesPage.clickSave_btn();
	    String error = jobCategoriesPage.alreadyExistsError_msg();
		Assert.assertEquals(error, "Already exists");

	}

	@Given("User is on Job Categories page for deleting single entry")
	public void user_is_on_Job_Categories_page_for_deleting_single_entry() {
		String title = jobCategoriesPage.verify_JobCategories_Label();
		System.out.println(title);
		//Assert.assertEquals(title, "Job Categories");
	}

	@When("Click on checkbox corresponding to Job Categories to be delete")
	public void click_on_checkbox_corresponding_to_Job_Categories_to_be_delete() {
	    jobCategoriesPage.single_delete_jobCategories(jobProp.getProperty("jobCategoriesName"));
	    
	    
	}

	@Then("Click Delete and Click OK in Confirmation popup and verify Job Category is deleted")
	public void click_Delete_and_Click_OK_in_Confirmation_popup_and_verify_Job_Category_is_deleted() {
		jobCategoriesPage.clickDelete_btn();
		
		boolean flag =driver.findElement(By.xpath("//a[contains(text(),'"+(jobProp.getProperty("jobCategoriesName"))+"')]"
	    		+ "//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).isDisplayed();
	    if(flag)
	    	System.out.println("Delete action Unsuccessful");
	    else
	    	System.out.println("deleted successfully");
	}

	@Given("User is on Job Categories page for deleting multiple entries")
	public void user_is_on_Job_Categories_page_for_deleting_multiple_entries() {
		String title = jobCategoriesPage.verify_JobCategories_Label();
		System.out.println(title);
		//Assert.assertEquals(title, "Job Categories");
	}

	@When("Click on checkboxes corresponding to Job Categories to be delete")
	public void click_on_checkboxes_corresponding_to_Job_Categories_to_be_delete() {
	    jobCategoriesPage.multiple_delete_jobCategories(jobProp.getProperty("jobCategoriesName1"), jobProp.getProperty("jobCategoriesName2"));
	}

	@Then("Click Delete and Click OK in Confirmation popup and verify seleted Job Categories are deleted")
	public void click_Delete_and_Click_OK_in_Confirmation_popup_and_verify_seleted_Job_Categories_are_deleted() {
jobCategoriesPage.clickDelete_btn();
		
		boolean flag1 =driver.findElement(By.xpath("//a[contains(text(),'"+(jobProp.getProperty("jobCategoriesName1"))+"')]"
	    		+ "//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).isDisplayed();
		
		boolean flag2 =driver.findElement(By.xpath("//a[contains(text(),'"+(jobProp.getProperty("jobCategoriesName2"))+"')]"
	    		+ "//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).isDisplayed();
	    if(flag1 && flag2)
	    	System.out.println("Delete action Unsuccessful");
	    else
    	System.out.println("deleted successfully");

	}
	



	
	
}
