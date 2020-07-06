package com.OrangeHRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrangeHRM.util.TestBase;



public class JobTitlePage extends TestBase {

	// By class to identify page elements:
	By jobTitle_lable = By.xpath("//div[@class='head']//h1");
	By add_btn = By.xpath("//input[@type='button' and @value='Add']");
	By delete_btn = By.id("btnDelete");
	By jobTitle_textField = By.id("jobTitle_jobTitle");
	By JobDescription_textField = By.id("jobTitle_jobDescription");
	By jobSpecification_textField = By.id("jobTitle_jobSpec");
	By note_textField = By.id("jobTitle_note");
	By save_btn = By.id("btnSave");
	By cancel_btn = By.id("btnCancel");
	By Confirmation_ok_btn = By.xpath("//div[@class='modal-footer']//input[@id='dialogDeleteBtn']");
	By Confirmation_cancel_btn = By.xpath("//div[@class='modal-footer']//input[@class='btn reset']");

	By requiredErrorMsg = By.xpath("//span[@class='validation-error']");
	By AlreadyExists_ErrorMsg = By.xpath("//span[@class='validation-error']");

	// Actions performed on the Job Title page:

	public String jobTitleLable() {
		return driver.findElement(jobTitle_lable).getText();
	}

	public void clickAdd_btn() {

		driver.findElement(add_btn).click();
		System.out.println("Add button clicked for adding new Job Title");
	}

	public void enter_Data_In_All_Fields(String AllFieldJobTitle,String JobDescription,String JobSpec, String Note) {
		driver.findElement(jobTitle_textField).sendKeys(AllFieldJobTitle);
		driver.findElement(JobDescription_textField).sendKeys(JobDescription);
		driver.findElement(jobSpecification_textField).sendKeys(JobSpec);
		driver.findElement(note_textField).sendKeys(Note);

	}

	public void existing_JobTitle_Data_entry(String existingJobTitle) {
		driver.findElement(jobTitle_textField).sendKeys(existingJobTitle);

	}

	public void clickSaveJT_btn() {
		driver.findElement(save_btn).click();
		System.out.println("Save button clicked");
	}

	public void enter_Data_in_Mandatory_field(String mandatory_JobTitle) {
		driver.findElement(jobTitle_textField).sendKeys(mandatory_JobTitle);

	}

	public String required_errorMessage() {
		return driver.findElement(requiredErrorMsg).getText();
	}

	public String Already_exists_errorMessage() {
		return driver.findElement(AlreadyExists_ErrorMsg).getText();
	}

	public void clickDelete_btn() {
		driver.findElement(delete_btn).click();
		System.out.println("Delete btn Clicked");
	}

	public void singleDelete(String deleteJobTitle) {//QA
		driver.findElement(By.xpath("//a[contains(text(),'"+deleteJobTitle+"')]//parent::td//preceding-sibling::td//input")).click();
		System.out.println(deleteJobTitle+" option is clicked");
	}

	public void multipleDelete(String delete1JobTitle, String delete2JobTitle) {//Quality,CEO
		driver.findElement(By.xpath("//a[contains(text(),'"+delete1JobTitle+"')]//parent::td//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+delete2JobTitle+"')]//parent::td//preceding-sibling::td//input")).click();

	}

	public void click_OK_Confimation() {
		driver.findElement(Confirmation_ok_btn).click();
		System.out.println("OK btn clicked in the Confirmation popup");
	}

	public void click_Cancel_Confimation() {
		driver.findElement(Confirmation_cancel_btn).click();
		System.out.println("Cancel btn clicked in the Confirmation popup");  

	}
}










