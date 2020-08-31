package com.wipro.training;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.PageObjects.LandingPage;
import com.training.Resources.Base;



public class ValidateMenu extends Base {
	WebDriver driver;
	public static Logger log=Logger.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializerDriver();
		driver.get(prop.getProperty("url"));
		log.info("Naviagted to URL page::!!!");
				
	}
	@Test
	public void validateMenu()
	{
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getDownloadMenu().isDisplayed());
		log.info("Validation is completed");
		
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
