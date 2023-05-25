package trainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		 driver.navigate().to("https://www.facebook.com/");
		 
		driver.navigate().back();

		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
