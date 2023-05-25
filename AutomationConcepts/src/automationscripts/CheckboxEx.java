package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEx {

	public static void main(String[] args) throws InterruptedException {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver99.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//to select "Rememeber me" checkbox
		
		driver.findElement(By.id("rememberUn")).click();
		
		//to pause execution
		Thread.sleep(3000);
		
		//to uncheck the checkbox
		driver.findElement(By.id("rememberUn")).click();   // There is no other different concept for check or uncheck checkbox
	}

}
