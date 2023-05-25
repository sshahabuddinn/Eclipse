package automationscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEx02 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write script to navigate URL, to generate browser popup(i.e. JavaAlert) and
		 * to enter value in "username" editbox using JavascriptExecutor
		 */
				// initialize browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		//		driver.get("https://www.rediff.com/");

				driver.manage().window().maximize();
				
				JavascriptExecutor js=((JavascriptExecutor)driver);
				//to navigate URL
				js.executeScript("window.location='https://login.salesforce.com'");
				
				// to generate java alert
				Thread.sleep(5000);
				js.executeScript("window.alert('Hi, I am JavaScriptExecutor Running')");
				
				Thread.sleep(4000);
				//to read msg from java alert
				String msg=driver.switchTo().alert().getText();
				System.out.println(msg);
				
				//to close java alert
				driver.switchTo().alert().accept();
				
				//to enter user name using JavascriptExecutor
				js.executeScript("window.document.getElementById('username').value='MadhukarQAIT'");

	}

}
