package automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpEx {

	public static void main(String[] args) {
		// initialize browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver99.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://the-internet.herokuapp.com/basic_auth");
				driver.manage().window().maximize();
				
				// To clear the Authentication Popup
				
	//***Syntax: driver.get("http://username:pwd@url");
				
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
				
				
		
	}

}
