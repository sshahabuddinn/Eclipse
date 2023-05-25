package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		//	driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			// To Login in Facebook
			
			driver.findElement(By.id("email")).sendKeys("syedshahabuddin1@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("ehan12bad");
			driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
