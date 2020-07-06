package com.OrangeHRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.util.TestBase;

public class PayGradesPage extends TestBase {

	By payGrades_lable = By.xpath("//div[@class='head']//h1");
	By add_btn = By.xpath("//input[@type='button'and @value='Add']");
	By delete_btn = By.id("btnDelete");
	
	By add_Pay_Grade_Title = By.xpath("//h1[@id='payGradeHeading']");
	By name_textField = By.xpath("//input[@type='text']");
	By save_btn = By.xpath("//input[@type='button' and @value='Save']");
	By cancel_btn = By.id("btnCancel");
	
	By edit_Pay_Grade_Title = By.xpath("//h1[@id='currencyListHeading']");
	By add_btn_currencies = By.id("btnAddCurrency");
	By currency_textfield = By.id("payGradeCurrency_currencyName");
	By min_Salary_textfield = By.id("payGradeCurrency_minSalary");
	By max_Salary_textfield = By.id("payGradeCurrency_maxSalary");
	By save_btn_currencies = By.id("btnSaveCurrency");
	By cancel_btn_currencies = By.id("cancelButton");
	By req_error_msg_currencies = By.xpath("//span[@class='validation-error']");
	
	By Confirmation_ok_btn = By.xpath("//input[@id='dialogDeleteBtn']");
	
	
	By header_checkbox = By.xpath("//th[@class='checkbox-col']//input");
	By requiredErrorMsg = By.xpath("//span[@class='validation-error']");
	By AlreadyExists_ErrorMsg = By.xpath("//span[@class='validation-error']");
	
	public String payGradeLabel() {
		return driver.findElement(payGrades_lable).getText();
	}
	
	public void clickAdd_Btn() {
		
		driver.findElement(add_btn).click();
		System.out.println("Add button clicked for adding new Pay Grade");
	}
	
	public void enter_Data_In_Name_Field(String Name) {
		driver.findElement(name_textField).sendKeys(Name);
	}
	
	
	public void clickAdd_Btn_currencies() {
		driver.findElement(add_btn_currencies).click();
	}
	
	public void clickSave_Btn_currencies() {
		driver.findElement(save_btn_currencies).click();
	}
	
	public void enter_Currency_Details(String minSalary, String maxSalary) {
		driver.findElement(currency_textfield).sendKeys("A");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ac_results']//ul//li"));
	    list.get(1).click();
	    
	    driver.findElement(min_Salary_textfield).sendKeys(minSalary);
	    driver.findElement(max_Salary_textfield).sendKeys(maxSalary);
	    
		
	}
	public void clickSavePG_Btn() {
		
		driver.findElement(save_btn).click();
		System.out.println("Save button clicked");
	}
	
	public void clickCancel_Btn() {
		driver.findElement(cancel_btn).click();
		System.out.println("Cancel button clicked");
	}
	
	public void clickDelete_Btn() {
		driver.findElement(delete_btn).click();
	}
	
	public void confirmation_OK_Btn() {
		driver.findElement(Confirmation_ok_btn).click();
	}
	
	public void existing_PayGrade_Data_entry(String existingJobTitle) {
		driver.findElement(name_textField).sendKeys(existingJobTitle);

	}
	
	public void singleDelete(String deletePayGrade) {
		driver.findElement(By.xpath("//a[contains(text(),'"+deletePayGrade+"')]//parent::td//preceding-sibling::td//input")).click();
		System.out.println(deletePayGrade+" option is clicked");
	}
	
	public void allDelete(String deletePayGrade) {
		driver.findElement(header_checkbox).click();
	}
	
	public void clickHeaderPayGrade() {
		driver.findElement(header_checkbox).click();
	}
		
	public String required_errorMessage() {
		return driver.findElement(requiredErrorMsg).getText();
	}
	
	public String Already_exists_errorMessage() {
		return driver.findElement(AlreadyExists_ErrorMsg).getText();
	}

	
} 
