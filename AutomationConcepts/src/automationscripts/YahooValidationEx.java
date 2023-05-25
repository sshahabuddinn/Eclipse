package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooValidationEx {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * // initialize browser and open g-mail
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver= new ChromeDriver();
		 * driver.get("https://login.yahoo.com"); driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 * 
		 * // Thread.sleep(4000);
		 * driver.findElement(By.name("username")).sendKeys("almandi609");
		 * 
		 * // Thread.sleep(6000);
		 * driver.findElement(By.xpath("//input[@type=('submit')]")).click();
		 * 
		 */
		
		
		// initialize browser and open Yahoomail
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		        WebDriver driver= new FirefoxDriver();
				driver.get("https://login.yahoo.com");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			//	Thread.sleep(4000);
				driver.findElement(By.name("username")).sendKeys("almandi609");
				
			//	Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@type=('submit')]")).click();
				
				driver.findElement(By.id("login-passwd")).sendKeys("ehan12bad");
				driver.findElement(By.id("login-signin")).click();
				
				driver.findElement(By.xpath("//a[@id='mega-bottombar-mail']")).click();
				
				// To Compose
				
				driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
				
				driver.findElement(By.id("message-to-field")).sendKeys("s_shahabuddin@yahoo.com");
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Plz find my attached resume");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("This is Syed");
		
		// To click on Send button and send mail to the recipient successfully
		
		// Using xpath
		
		driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		
		// Using cssSelector
		
		// driver.findElement(By.cssSelector("[data-test-id='compose-send-button']")).click();
					
				
	}

}
