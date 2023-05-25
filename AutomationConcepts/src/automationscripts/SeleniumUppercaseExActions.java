package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUppercaseExActions {

	public static void main(String[] args) {
		
	// Write script to enter "selenium" in upper case at search edit box
		//to Initialize browser
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://google.co.in");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//create reference object for search editbox
				WebElement txtSearch=driver.findElement(By.name("q"));
				
				Actions act= new Actions(driver);
				//to enter "selenium"
				act.moveToElement(txtSearch).click().keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
				act.sendKeys(Keys.ENTER).build().perform();
		

	}

}
