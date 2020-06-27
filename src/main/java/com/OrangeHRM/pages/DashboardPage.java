package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.util.TestBase;


public class DashboardPage extends TestBase {

	//By class to identify page elements:

	By Dashboard_Label = By.xpath("//div[@class='head']//h1");
	By Admin_btn = By.xpath("//b[contains(text(),'Admin')]");
	
	
	
	//Actions performed on the Dashboard page:

	public String getDashboardTitle() {
		return driver.findElement(Dashboard_Label).getText();
	}
	
	public AdminPage clickAdmin_btn() {
		
		driver.findElement(Admin_btn).click();
		return new AdminPage();
	}
	
}
