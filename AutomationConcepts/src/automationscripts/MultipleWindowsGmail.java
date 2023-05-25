package automationscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsGmail {

	public static void main(String[] args) throws InterruptedException {
	//	Write script to read each window title while navigating multiple windows in Gmail
		// initialize browser
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver94.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			
			//to read page title
			String pgTitle1=driver.getTitle();
			System.out.println(pgTitle1);
			
			//to click on "Help"
			driver.findElement(By.linkText("Help")).click();
			Thread.sleep(4000);
			//to get all the opened window handles
			Set<String> pgHandles=	driver.getWindowHandles();
			//to read values from Set class
			Iterator<String> winHandles=pgHandles.iterator();
			
			@SuppressWarnings("unused")
			String w1=winHandles.next();
			String w2=winHandles.next();
			
			//to focus on 2nd window
			driver.switchTo().window(w2);
			String pgTitle2=driver.getTitle();
			System.out.println(pgTitle2);

	}

}
