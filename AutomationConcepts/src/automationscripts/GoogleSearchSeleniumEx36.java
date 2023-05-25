package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSeleniumEx36 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write script to select 3rd option in Google search after enter "Selenium" in
		 * search box without using locator value for that option
		 		Script: */
			// initialize browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://google.co.in");
				driver.manage().window().maximize();
				
				//create reference object for Search editbox
				WebElement txtSearch=driver.findElement(By.name("q"));
				
				//to enter Selenium
				txtSearch.sendKeys("selenium");
				
				Thread.sleep(4000);
				
				txtSearch.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				txtSearch.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				txtSearch.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);
				txtSearch.sendKeys(Keys.ENTER);

	}

}
