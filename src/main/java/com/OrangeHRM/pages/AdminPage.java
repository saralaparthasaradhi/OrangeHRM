package com.OrangeHRM.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.util.TestBase;
  


public class AdminPage extends TestBase{

	//By class to identify page elements:

	
	By UserManagement_btn = By.id("menu_admin_UserManagement");
	By Job_btn = By.id("menu_admin_Job");	
	By Organization_btn =By.id("menu_admin_Organization");
	By Qualification_btn = By.id("menu_admin_Qualifications");
	By Nationalities = By.id("menu_admin_nationality");
	By Configuration = By.id("menu_admin_Configuration");
	
	
	//Actions performed on the Admin page:

	public String getTitle() {
		return driver.getTitle();
	} 
	

	public JobTitlePage clickJobTitle_btn(String JobTitle_option) {
		
		driver.findElement(Job_btn).click();

//		List<WebElement> list =driver.findElements(By.xpath("//a[@id='menu_admin_Job']//parent::li//ul//li//a"));
//		
//		for(int i=0;i<list.size();i++) {
//			String text =list.get(i).getText();
//			if(text.equalsIgnoreCase(JobTitle_option));
//			
//			WebElement jobtitle = list.get(i);
//			//list.get(i).click();
//			 System.out.println(jobtitle.getText());
//			   jobtitle.click();
//			   return new JobTitlePage();
//		}
//		return null; 
//				}
	
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']//parent::li//ul//li//a[contains(text(), '"+JobTitle_option+"')]")).click();
		
		return new JobTitlePage();
	
	}
	
	public PayGradesPage clickPayGrades_btn(String PayGrades_option) {
		
		driver.findElement(Job_btn).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']//parent::li//ul//li//a[contains(text(),'"+PayGrades_option+"')]")).click();
		
		return new PayGradesPage();
	
	}
	
	
	public EmploymentStatusPage clickEmploymentStatus_btn(String EmploymentStatus_option) {

		driver.findElement(Job_btn).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']//parent::li//ul//li//a[contains(text(),'"+EmploymentStatus_option+"')]")).click();

		return new EmploymentStatusPage();

	}
	
	public JobCategoriesPage clickJobCategories_btn(String JobCategories_option) {
		driver.findElement(Job_btn).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']//parent::li//ul//li//a[contains(text(),'"+JobCategories_option+"')]")).click();

		return new JobCategoriesPage();
	}
	
}
