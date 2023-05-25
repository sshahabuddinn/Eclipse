package exceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleExceptionEx02 {
		@Test
		public void Crm() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.pavantestingtools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[15]/a"));
		link.click();
		
	driver.navigate().back();
	//WebElement link1=driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[15]/a"));
	  Thread.sleep(3000);
		  try
	  {
	      link.click();
	  }
	  catch(StaleElementReferenceException e)
	  {
		link=driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[15]/a"));
		link.click();
	  }

		}
}
