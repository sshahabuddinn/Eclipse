package automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFCLoginFFEx {

	public static void main(String[] args) {
		// initialize browser
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com");
		driver.manage().window().maximize();

		
	}

}
