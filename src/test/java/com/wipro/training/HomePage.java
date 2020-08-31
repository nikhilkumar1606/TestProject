package com.wipro.training;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.PageObjects.LandingPage;
import com.training.PageObjects.LoginPage;
import com.training.Resources.Base;



public class HomePage extends Base {
	WebDriver driver;
	public static Logger log=Logger.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializerDriver();
		driver.get(prop.getProperty("url"));
		log.info("Naviagted to URL page::!!!");
	}
	
	@Test(dataProvider="getdata")	
	public void BasepageNavigation(String username,String password,String text)
	{
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage page=new LoginPage(driver);
		page.getEmail().sendKeys(username);
		page.getPassword().sendKeys(password);
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="kr.nikhil21@gmail.com";
		data[0][1]="Nikhil@123";
		data[0][2]="first data executed";	
		
		data[1][0]="kr.nikhil16@gmail.com";
		data[1][1]="Nikhil@12345";
		data[1][2]="second data executed";		
		
		
		return data;
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
