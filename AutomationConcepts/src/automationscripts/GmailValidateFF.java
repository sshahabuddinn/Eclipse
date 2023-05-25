package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailValidateFF {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("identifier")).sendKeys("almandi694@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(3000);
		
		//to Enter pwd
		driver.findElement(By.name("password")).sendKeys("bounty123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		
		
		

	}

}
