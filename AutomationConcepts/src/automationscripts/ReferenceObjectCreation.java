package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferenceObjectCreation {

	public static void main(String[] args) {
	// Create script to verify existing value in "Username" edit box after enter
		
		// To initialize the browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

//	To create reference object for "Username" edit box
		
		WebElement refobj =driver.findElement(By.id("username"));
		
		//to focus on "Username" editbox
		
		refobj.click();
		
		//to clear the data
		
		refobj.clear();
		
		//to enter "Madhukar"
		
		refobj.sendKeys("Shahab");
		
		//to Enter "QAIT"
		
		refobj.sendKeys("QAIT");
		
		//to read existing value from "Username" editbox
		
		   String uid=refobj.getAttribute("value");
		   
		 //to compare the value
		   
		   if (uid.equals("QAIT")) {
			   
			   System.out.println("Expected value is existing");
		
		   }
		   else {
			   
			   System.out.println("Expected value is: "+uid);
		   }
	
	}
	
	
	

}
