package trainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	driver.get("https://www.facebook.com");
	
	String title = driver.getTitle();
		System.out.println(title);
		

	}

}
