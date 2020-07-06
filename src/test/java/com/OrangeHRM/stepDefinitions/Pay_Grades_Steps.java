package com.OrangeHRM.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.DashboardPage;

import com.OrangeHRM.pages.PayGradesPage;
import com.OrangeHRM.util.TestBase;
import com.OrangeHRM.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Pay_Grades_Steps extends TestBase {

	TestUtil testUtil;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	PayGradesPage pageGradesPage;
	
	
	@Before("@2nd")
	public void preSteps() {
		TestBase.initialization();
		TestBase.login();
		
		dashboardPage = new DashboardPage();
		adminPage = dashboardPage.clickAdmin_btn();
		pageGradesPage = adminPage.clickPayGrades_btn("Pay Grades");
		

	}
	
	@After("@2nd")
	public void tearDown() {
		driver.quit();
		System.out.println("###########################################################");
	}
	
	@Given("User is on Pay Grades Page for Add functionality test")
	public void user_is_on_Pay_Grades_Page_for_Add_functionality_test() {
		System.out.println(dashboardPage.getDashboardTitle());
		
		System.out.println(adminPage.getTitle());
		String pageGradePageLabel = pageGradesPage.payGradeLabel();
		System.out.println("================"+pageGradePageLabel+"====================");
		Assert.assertEquals(pageGradePageLabel, "Pay Grades");
		
	}

	@When("Click on Add button to add Pay Grade")
	public void click_on_Add_button_to_add_Pay_Grade() {
	   pageGradesPage.clickAdd_Btn();
	}

	@Then("Enter data for Name field and click save and verify")
	public void enter_data_for_Name_field_and_click_save_and_verify() {
	    pageGradesPage.enter_Data_In_Name_Field(jobProp.getProperty("payGradeName"));
	    pageGradesPage.clickSavePG_Btn();
	    //pageGradesPage.clickCancel_Btn();
	    
	    pageGradesPage.clickAdd_Btn_currencies();
	    pageGradesPage.enter_Currency_Details(jobProp.getProperty("minSalary"), jobProp.getProperty("maxSalary"));
	    pageGradesPage.clickSave_Btn_currencies();
	    
	    List<WebElement> listOfCurrencies = driver.findElements(By.xpath("//td//a"));
	    System.out.println(listOfCurrencies.get(0).getText());

	    pageGradesPage.clickCancel_Btn();
	    
	    List<WebElement> listOfPayGrades = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
		   for(WebElement element: listOfPayGrades) {
			   if(element.getText().equals(jobProp.getProperty("payGradeName")))
				   System.out.println("==============New Pay Grade Added Successfully!=================");
		   }
	}

	@Given("User is on Pay Grades Page for existing Pay Grades data test")
	public void user_is_on_Pay_Grades_Page_for_existing_Pay_Grades_data_test() {
		String pageGradePageLabel = pageGradesPage.payGradeLabel();
		System.out.println("================"+ pageGradePageLabel +"====================");
		Assert.assertEquals(pageGradePageLabel, "Pay Grades");
	}

	@When("Click on Add button and enter existing data for Pay Grades")
	public void click_on_Add_button_and_enter_existing_data_for_Pay_Grades() {
		pageGradesPage.clickAdd_Btn();
		pageGradesPage.existing_PayGrade_Data_entry(jobProp.getProperty("existingPayGradeName"));
	    
	}

	@Then("Click on Save button and verify the error message")
	public void click_on_Save_button_and_verify_the_error_message() {
		pageGradesPage.clickSavePG_Btn();
	   
		String errorMsg = pageGradesPage.Already_exists_errorMessage();
		System.out.println(errorMsg);
		Assert.assertEquals(errorMsg, "Already exists");
	}
	
	@Given("User is on Pay Grades Page for empty Mandatory field test")
	public void user_is_on_Pay_Grades_Page_for_empty_Mandatory_field_test() {
		String pageGradePageLabel = pageGradesPage.payGradeLabel();
		System.out.println("================"+ pageGradePageLabel +"====================");
		Assert.assertEquals(pageGradePageLabel, "Pay Grades");
	}
	
	@When("Click on Add button with no data")
	public void click_on_Add_button_with_no_data() {
		pageGradesPage.clickAdd_Btn();

	}

	@Then("Click on Save button to save")
	public void click_on_Save_button_to_save() {
		pageGradesPage.clickSavePG_Btn();
		String requiredErrorMsg = pageGradesPage.required_errorMessage();
		System.out.println(requiredErrorMsg);
		Assert.assertEquals(requiredErrorMsg, "Required");
	}
	
	@Given("User is on Pay Grades Page for delete Pay Grades test")
	public void user_is_on_Pay_Grades_Page_for_delete_Pay_Grades_test() {
		String pageGradePageLabel = pageGradesPage.payGradeLabel();
		System.out.println("================"+ pageGradePageLabel +"====================");
		Assert.assertEquals(pageGradePageLabel, "Pay Grades");
	}

	@When("Click on checkbox corresponding to Pay Grade to be deleted")
	public void click_on_checkbox_corresponding_to_Pay_Grade_to_be_deleted() {
	    pageGradesPage.singleDelete(jobProp.getProperty("deletePayGrade"));
	}
	
	@Then("Click Delete and Click on OK button in Confirmation popup")
	public void click_Delete_and_Click_on_OK_button_in_Confirmation_popup() {
		pageGradesPage.clickDelete_Btn();
		pageGradesPage.confirmation_OK_Btn();
		//driver.findElements(By.xpath("//tr//td[@class='left']//a[contains(text(),'"+jobProp.getProperty("deletePayGrade")+"')]"));
		List<WebElement> list_PayGrade = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
		for(WebElement list : list_PayGrade) {
			if(!list.getText().equals(jobProp.getProperty("deletePayGrade"))) {
				continue;
			}
			else {
				System.out.println("Delete functionality failed");
			}
			System.out.println("Delete successfully done");
			}
		
	}

	@Given("User is on Pay Grades Page for deleting all Pay Grades test")
	public void user_is_on_Pay_Grades_Page_for_deleting_all_Pay_Grades_test() {
		String pageGradePageLabel = pageGradesPage.payGradeLabel();
		System.out.println("================"+ pageGradePageLabel +"====================");
		Assert.assertEquals(pageGradePageLabel, "Pay Grades");
	}

	@When("Click on checkbox corresponding to header Pay Grade to delete all")
	public void click_on_checkbox_corresponding_to_header_Pay_Grade_to_delete_all() {
	   pageGradesPage.clickHeaderPayGrade();
	   
	}
	
	@Then("Click Delete button and Click on OK button in Confirmation popup")
	public void click_Delete_button_and_Click_on_OK_button_in_Confirmation_popup() {
		pageGradesPage.clickDelete_Btn();
		pageGradesPage.confirmation_OK_Btn();
		List<WebElement> list_PayGrade = driver.findElements(By.xpath("//tr//td[@class='left']//a"));
		
		
	}
}
