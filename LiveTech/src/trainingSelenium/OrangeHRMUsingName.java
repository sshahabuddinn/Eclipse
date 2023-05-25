package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMUsingName {

	public static void main(String[] args) {
		
		// To initialize the browser
		
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://opensource-demo.orangehrmlive.com/");
					driver.manage().window().maximize();
					
				// To login into the application
					
					/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
					driver.findElement(By.id("txtPassword")).sendKeys("admin123");
					driver.findElement(By.id("btnLogin")).click();
					*/
					
					driver.findElement(By.name("txtUsername")).sendKeys("Admin");
					driver.findElement(By.name("txtPassword")).sendKeys("admin123");
					driver.findElement(By.name("Submit")).click();
					

	}

}
