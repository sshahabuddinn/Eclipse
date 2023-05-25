package automationscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		
		// Click on any link
		
		//driver.manage().deleteAllCookies();  -- To delete All Cookies
		
  // login page - verify login url
		
		driver.get("http://google.com");
		
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // Screenshot casting
	       FileUtils.copyFile(src,new File("C://screenshot.png"));
	       
	  
	       
	       // In order to import package for FileUtils which is not available on mouse over
	       // Go to commons.apache.org/proper/commons-io/download_io.cgi
	      
	
	}

}
