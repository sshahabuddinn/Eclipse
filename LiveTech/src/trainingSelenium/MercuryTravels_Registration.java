package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTravels_Registration {

	public static void main(String[] args) throws Exception {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		
		// to complete Registration form
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// To fill up the complete Registration form
		  // Contact Information
		
		driver.findElement(By.name("firstName")).sendKeys("Syed");
		driver.findElement(By.name("lastName")).sendKeys("Shahabuddin");
		driver.findElement(By.name("phone")).sendKeys("9966290065");
		driver.findElement(By.id("userName")).sendKeys("syed123@gmail.com");
		
		// Mailing Information
		
		driver.findElement(By.name("address1")).sendKeys("1-1-398,Flat No.102");
		driver.findElement(By.name("address2")).sendKeys("Paramount Colony, Tolichowki");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500008");
		
		// To use select class for static dropdown
		/*
		 * Thread.sleep(2000); Select s=new
		 * Select(driver.findElement(By.name("country"))); s.selectByValue("107");
		 */
		   
		  // To select "GERMANY" 
		  
		 // Select drp=new Select(driver.findElement(By.))
		
		Thread.sleep(3000);
		Select drp=new Select(driver.findElement(By.name("country")));
		 // drp.selectByVisibleText("AUSTRALIA");
		
		//drp.selectByValue("234");
		
		drp.selectByIndex(4);
		
		// To display user information
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin1");
		driver.findElement(By.name("confirmPassword")).sendKeys("admin1");
		driver.findElement(By.name("register")).click();
		
	}

}
