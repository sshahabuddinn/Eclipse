package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCLoginFrameEx {

	public static void main(String[] args) {
		// initialize browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://netbanking.hdfcbank.com");
				driver.manage().window().maximize();
				
				// To click on Continue
		driver.switchTo().frame("login_page");
		driver.findElement(By.cssSelector("[alt='continue']")).click();
		
		// to read the message from popup
		
		  String Msg=driver.switchTo().alert().getText();
		  System.out.println(Msg);
		
		
		// To remove the java popup or close the popup
		
		driver.switchTo().alert().accept();
		
		// to enter user id
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("abc123");
		

	}

}
