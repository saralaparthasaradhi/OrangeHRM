package com.OrangeHRM.pages;

import org.openqa.selenium.By;

import com.OrangeHRM.util.TestBase;

public class JobCategoriesPage extends TestBase {

	By jobCategories_lable = By.xpath("//div[@class='head']//h1");
	By add_btn = By.xpath("//input[@type='button'and @value='Add']");
	By delete_btn = By.xpath("//input[@type='submit'and @value='Delete']");
	
	By name_field = By.id("jobCategory_name");
	By save_btn = By.id("btnSave");
	By cancel_btn = By.id("btnCancel");
	
	By requiredErrorMsg = By.xpath("//span[@class='validation-error']");
	By AlreadyExists_ErrorMsg = By.xpath("//span[@class='validation-error']");
	
	By ok_Confirmation_btn = By.id("dialogDeleteBtn");
	
	
	public String verify_JobCategories_Label() {
		return(driver.findElement(jobCategories_lable).getText());
	}

	public void clickAdd_btn() {
		driver.findElement(add_btn).click();
		System.out.println("Add btn clicked");
	}
	
	public void enter_Data_in_Name_field(String jobCategoriesName) {
		driver.findElement(name_field).sendKeys(jobCategoriesName);
	}
	
	public void clickSave_btn() {
		driver.findElement(save_btn).click();
		System.out.println("Save btn clicked");
	}
	
	public void clickCancel_btn() {
		driver.findElement(cancel_btn).click();
		System.out.println("Cancel btn clicked");
	}
	
	public void clickDelete_btn() {
		driver.findElement(delete_btn).click();
		System.out.println("Delete btn clicked");
	}
	
	public String requiredError_msg() {
		return driver.findElement(requiredErrorMsg).getText();
	}
	
	public String alreadyExistsError_msg() {
		return driver.findElement(AlreadyExists_ErrorMsg).getText();
	}
	
	public void click_OK_btn() {
		driver.findElement(ok_Confirmation_btn);
		System.out.println("OK btn clicked in confirmation pop up");
	}
	
	public void single_delete_jobCategories(String jobCategoriesName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+jobCategoriesName+"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	public void multiple_delete_jobCategories(String jobCategoriesName1, String jobCategoriesName2) {
		driver.findElement(By.xpath("//a[contains(text(),'"+ jobCategoriesName1 +"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+ jobCategoriesName2 +"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
		
	}	
}
