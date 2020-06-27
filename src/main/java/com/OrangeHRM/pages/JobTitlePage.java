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
	}

	public void enter_Data_In_All_Fields() {
		driver.findElement(jobTitle_textField).sendKeys("Quality Analyst");
		driver.findElement(JobDescription_textField).sendKeys("Ensure the quality standards");
		driver.findElement(jobSpecification_textField).sendKeys("C:\\Sarala-testing\\ReadFile.txt");
		driver.findElement(note_textField).sendKeys("Note");

	}

	public void existing_JobTitle_Data_entry() {
		driver.findElement(jobTitle_textField).sendKeys("Quality Analyst");

	}

	public void clickSave_btn() {
		driver.findElement(save_btn).click();
	}

	public void enter_Data_in_Mandatory_field() {
		driver.findElement(jobTitle_textField).sendKeys("QA");

	}

	public String required_errorMessage() {
		return driver.findElement(requiredErrorMsg).getText();
	}

	public String Already_exists_errorMessage() {
		return driver.findElement(AlreadyExists_ErrorMsg).getText();
	}

	public void clickDelete_btn() {
		driver.findElement(delete_btn).click();
	}

	public void singleDelete() {
		driver.findElement(By.xpath("//a[contains(text(),'QA')]//parent::td//preceding-sibling::td//input")).click();

	}

	public void multipleDelete() {
		driver.findElement(By.xpath("//a[contains(text(),'Quality')]//parent::td//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CEO')]//parent::td//preceding-sibling::td//input")).click();

	}

	public void click_OK_Confimation() {
		driver.findElement(Confirmation_ok_btn).click();
	}

	public void click_Cancel_Confimation() {
		driver.findElement(Confirmation_cancel_btn).click();
	}
}










