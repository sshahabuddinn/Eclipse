package automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSelectLanguageEx02 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// to select languages in Google Home Page
		
		WebElement langs= driver.findElement(By.id("SIvCob"));   
		
		List <WebElement> links = langs.findElements(By.tagName("a"));   // List <WebElement> will be used only when we use findElements
		
		System.out.println("Number of links are: "+links.size());
		

	}

}
