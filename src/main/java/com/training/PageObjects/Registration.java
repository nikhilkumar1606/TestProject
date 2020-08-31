package com.training.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public WebDriver driver;
	
	//By registration=By.xpath("//a[@class='btn btn-black navbar-btn']");
	By username = By.id("input-username");
	By firstname = By.id("input-firstname");
	By Lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By country = By.id("input-country");

	public Registration(WebDriver driver) {
	this.driver=driver;


	}
//	public WebElement getregistration()
//	{
//		return driver.findElement(registration);
//	}

	public WebElement getusername() {
		return driver.findElement(username);
	}

	public WebElement getfirstname() {
		return driver.findElement(firstname);
	}

	public WebElement getLastname() {
		return driver.findElement(Lastname);
	}

	public WebElement getemail() {
		return driver.findElement(email);
	}

	public WebElement getcountry() {
		return driver.findElement(country);
	}
}
