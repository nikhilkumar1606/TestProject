package com.wipro.training;


import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;
import com.training.PageObjects.LandingPage;
import com.training.Resources.Base;


public class ValidateTitle extends Base {
	
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
	public void validateTitle1()
	{
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(),"Simple to start.Easy to run..");
		Log.info("Validate title is completed successfully");
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
