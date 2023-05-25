package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("pavantraining");
		
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("xyz");
		
		driver.navigate().refresh();
		
		try
		{		
		username.sendKeys("pavantraining");
		}
		
		catch(StaleElementReferenceException e) {
			
			username= driver.findElement(By.name("email"));
			username.sendKeys("pavantraining");
			
			password= driver.findElement(By.name("password"));
			password.sendKeys("xyz");
			
			
		}
	}

}
