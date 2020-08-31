package Opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg' and @onClick='myPromptFunction()']")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		
		
		
	}
}