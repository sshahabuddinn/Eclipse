package array;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dckap.com/blog/best-practices-automation-testing-ecommerce-sites/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//driver.findElement(By.partialLinkText("Service")).click();
		  driver.findElement(By.className("blog-head-btn")).click();
		  
		  
		  driver.switchTo().frame(1);
		  Thread.sleep(3000);
		  driver.findElement(By.name("firstname")).sendKeys("Syed Shahabuddin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("company")).sendKeys("Cognizant");
		  Thread.sleep(3000);
		  driver.findElement(By.name("email")).sendKeys("syed.shahabuddin@cognizant.com");
		  Thread.sleep(3000);
		  driver.findElement(By.name("phone")).sendKeys("9966290065");
		  
		  
		  

	}

}
