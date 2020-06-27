package com.OrangeHRM.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("C:\\Sarala-testing\\OrangeHRM_BDD\\src\\main\\java\\"
					+ "com\\OrangeHRM\\config\\config.properties");
			prop.load(file);
		} 
		 catch (IOException e) {
			e.getMessage();
		}
		
		
	}
	
	
	public static void initialization() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
		    WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", "C:\\Sarala-testing\\Selenium Reference Lib Files"
//					+ "\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","C:\\Sarala-testing\\Selenium Reference Lib Files\\geckodriver.exe" );
			driver= new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
			
	}
	
	public static void login() {
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
}
