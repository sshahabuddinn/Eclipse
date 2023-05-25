package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup_Button_FB_HomePage {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

	 //create reference object for "Signup" button
		
	WebElement button= driver.findElement(By.name("websubmit"));   // if id is "u_0_18" - don't take this value
	
	//to read visibletext
	
	   String buttontext=button.getText();
	   System.out.println("Object visible text is: "+buttontext);
	   
	 //to read name attribute value
	   
	    @SuppressWarnings("unused")
		String buttonname=button.getAttribute("name");
	    

	}

}
