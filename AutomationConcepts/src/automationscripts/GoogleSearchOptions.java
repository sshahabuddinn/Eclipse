package automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchOptions {

	public static void main(String[] args) {
		// initialize browser and open Yahoomail
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		        WebDriver driver= new FirefoxDriver();
				driver.get("https://login.yahoo.com");
				driver.manage().window().maximize();
				

	}

}
