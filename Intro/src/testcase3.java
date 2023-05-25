import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selenium code
		
				// Create Driver object for Firefox Browser
				
				// We will strictly implement methods of webdriver
				
				/* Class name = ChromeDriver,
				 * 
				 *  X driver =new X(); Syntax for java to create object for the method where x is the object */
				// invoke .exe file first
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ehtesham\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				
				WebDriver driver=new FirefoxDriver();
				
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
				
		
	}

}
