package validationcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.LoginPage;

public class VerifyWordpressLogin 
{
	
	@Test
	public void VerifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		
		
		  LoginPage login=new LoginPage(driver); 
		  login.typeUsername();
		  login.typePassword(); 
		  login.clickLoginButton();
		  
		  driver.quit();
		 
	}

}
