package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDLocatorUsingFirefox {

	public static void main(String[] args) {
		
	/*	Procedure:
		Step1: Open the browser
		Step2: Navigate to Url
		Step3: Enter Username
		Step4: Enter Password
		Step5: Click on "Login"
	*/
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	// To login into the application
		
		/*
		 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 */	
		
		driver.findElement(By.name("email")).sendKeys("syedshahabuddin1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ehan12bad");
		driver.findElement(By.id("u_0_4")).click();
		
		

	}

}
