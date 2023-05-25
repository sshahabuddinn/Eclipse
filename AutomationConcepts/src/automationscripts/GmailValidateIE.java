package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailValidateIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("almandi694@gmail.com");
		driver.findElement(By.className("ZFr60d CeoRYc")).click();
		
			
		

	}

}
