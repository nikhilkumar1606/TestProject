package Opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement element=driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
//		element.sendKeys("Ajmer");
//		WebElement element1=driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT"));
//		element1.sendKeys("Jaipur");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.name("ctl00_mainContent_chk_StudentDiscount")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	

}
