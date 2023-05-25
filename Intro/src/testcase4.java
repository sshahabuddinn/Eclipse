import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// selenium code
		
				// Create Driver object for Firefox Browser
				
				// We will strictly implement methods of webdriver
				
				/* Class name = ChromeDriver,
				 * 
				 *  X driver =new X(); Syntax for java to create object for the method where x is the object */
				// invoke .exe file first
				
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Ehtesham\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
				WebDriver driver=new InternetExplorerDriver();
				
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
				
		
	}

}
