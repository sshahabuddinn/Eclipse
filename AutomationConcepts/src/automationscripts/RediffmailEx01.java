package automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffmailEx01 {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		// To get count of links
		
		 List <WebElement> links= driver.findElements(By.tagName("a"));
		  System.out.println("number of links are: "+links.size());
		  
		  for (WebElement link : links)
			  System.out.println(link.getText());
		  
		  }
	

}
