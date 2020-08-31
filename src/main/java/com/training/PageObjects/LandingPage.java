package com.training.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By registration=By.linkText("Register");
//	By registration=By.xpath("//a[@class='btn btn-black navbar-btn']");
	By Login=By.linkText("LOGIN");
	By DownloadMenu=By.linkText("Download");
	By Title=By.xpath("//*[@id=\"feature\"]/div[1]/h2");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement getregisteration()
	{
		return driver.findElement(registration);
	}
	
	public WebElement getDownloadMenu()
	{
		return driver.findElement(DownloadMenu);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
          
}
