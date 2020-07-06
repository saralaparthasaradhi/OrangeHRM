package com.OrangeHRM.pages;

import org.openqa.selenium.By;

import com.OrangeHRM.util.TestBase;

public class EmploymentStatusPage extends TestBase {

	By employmentStatus_lable = By.xpath("//div[@id='customerList']//h1");
	By add_btn = By.xpath("//div[@class='top']//input[@name='btnAdd']");
	By delete_btn = By.xpath("//div[@class='top']//input[@name='btnDelete']");
	
	By name_field = By.id("empStatus_name");
	By save_btn = By.id("btnSave");
	By cancel_btn = By.id("btnCancel");
	
	By required_msg = By.xpath("//span[@class='validation-error']");
	By alreadyExists_msg = By.xpath("//span[@class='validation-error']");
	
	By ok_Confirmation_btn = By.id("dialogDeleteBtn");
	
	
	
	public String verify_EmploymentStatus_Label() {
		return(driver.findElement(employmentStatus_lable).getText());
	}

	public void clickAdd_btn() {
		driver.findElement(add_btn).click();
		System.out.println("Add btn clicked");
	}
	
	public void enter_Data_in_Name_field(String employmentStatusName) {
		driver.findElement(name_field).sendKeys(employmentStatusName);
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
		return driver.findElement(required_msg).getText();
	}
	
	public String alreadyExistsError_msg() {
		return driver.findElement(alreadyExists_msg).getText();
	}
	
	public void single_delete_employmentStatus(String employmentStatusName) {
		driver.findElement(By.xpath("//a[contains(text(),'"+employmentStatusName+"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	public void multiple_delete(String employmentStatusName1, String employmentStatusName2) {
		driver.findElement(By.xpath("//a[contains(text(),'"+ employmentStatusName1 +"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+ employmentStatusName2 +"')]//parent::td[@class='left']//preceding-sibling::td//input[@type='checkbox']")).click();
		
	}
	
	public void click_OK_btn() {
		driver.findElement(ok_Confirmation_btn);
		System.out.println("OK btn clicked in confirmation pop up");
	}
	
}
