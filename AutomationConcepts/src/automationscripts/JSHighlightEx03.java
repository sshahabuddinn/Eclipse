package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSHighlightEx03 {

	public static void main(String[] args) {

		// Write script to highlight "username" editbox at SF application
		// to Initialize browser
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//type-caste driver to JSExecutor
				JavascriptExecutor js=((JavascriptExecutor)driver);
				//Create reference object for WebElement (i.e. username editbox)
				WebElement ele=driver.findElement(By.id("username"));
				
		//to highlight username editbox
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px dashed red')",ele);

	}

}
