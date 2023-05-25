package automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesEx {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver94.exe");
		WebDriver driver=new ChromeDriver();
		
		// To Delete All Cookies in the entire session
		driver.manage().deleteAllCookies();
		
		// To delete only one Cookie
		driver.manage().deleteCookieNamed("asdf");
		
		// How to maximize the window
		driver.manage().window().maximize();
		

	}

}
