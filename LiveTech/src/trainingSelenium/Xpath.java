package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		// To initialize the browser
		
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://opensource-demo.orangehrmlive.com/");
				//	driver.get("https://www.facebook.com/");
					driver.manage().window().maximize();
					
		// To determine login for OrangeHRM
		
		  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123"); 
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
		  
		  
		  
		  
		  
		 
		
		

	}

}
