package Opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasic {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("Ni334255");
		driver.findElement(By.id("input-firstname")).sendKeys("Nikhil");
		driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		driver.findElement(By.id("input-email")).sendKeys("kr.nikhil21@gmail.com");
		Select select=new Select(driver.findElement(By.id("input-country")));
		select.selectByIndex(99);
		driver.findElement(By.id("input-password")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
		
		
		
	}

}
