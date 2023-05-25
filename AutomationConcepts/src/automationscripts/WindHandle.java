package automationscripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver99.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 String currenturl = driver.getCurrentUrl();
		 System.out.println("Current window: "+currenturl);
		 
		 String main= driver.getWindowHandle();
		 
		WebElement twit= driver.findElement(By.linkText("Follow On Twitter"));
		twit.click();
		
		Set <String> wins= driver.getWindowHandles();
		@SuppressWarnings("unused")
		Iterator<String>it= wins.iterator();
		
		for(String win : wins)
		{
			 driver.switchTo().window(win);
			 System.out.println("Current window: "+driver.getTitle());
			
			 
		}
		 
		driver.switchTo().window(main);
		 System.out.println("Current window: "+driver.getTitle());
	}

}
