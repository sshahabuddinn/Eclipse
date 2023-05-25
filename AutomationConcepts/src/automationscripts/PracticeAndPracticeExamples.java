package automationscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeAndPracticeExamples {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		  // Write script using FF browser to convert pdf to word // To initialize FF   Browser
		  
		  System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  driver.get("https://smallpdf.com/pdf-to-word");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//*[@type='button']")).click();
		  
		  // To execute AutoIT window based file
		  
		  Thread.sleep(4000);
		  
		  Runtime.getRuntime().exec("C:\\Users\\Ehtesham\\Documents\\FFpdfconvert.exe")  ;
		 
		
		
		
		
		
		  WebElement obj=driver.findElement(By.id("nav-link-accountList")); 
		  Actions a=new Actions(driver); a.moveToElement(obj).build().perform();
		 
		
	}

}
