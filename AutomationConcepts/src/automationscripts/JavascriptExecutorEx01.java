package automationscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorEx01 {

	public static void main(String[] args) throws InterruptedException {
		
	// Write script to perform scroll bar operations in Rediffmail home page
		// initialize browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//scroll down
		js.executeScript("window.scrollBy(0, 3500)");
		
		Thread.sleep(3000);		
		//scroll up
		js.executeScript("window.scrollBy(0, -1000)");
		
				
	}

}
