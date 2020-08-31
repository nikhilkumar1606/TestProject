package com.training.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By password=By.name("password");
	By email=By.name("email");
	By Login=By.linkText("Login");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	
	

}
