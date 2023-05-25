import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		
		
		/*
		 * System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
		 * WebDriver driver=new InternetExplorerDriver();
		 * 
		 * driver.get("http://facebook.com"); driver.manage().window().maximize();
		 * 
		 * String pg=driver.getPageSource(); System.out.println(pg);
		 */
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		 
		 driver.manage().window().maximize();
		  
		/*
		 * String pg=driver.getPageSource();
		 * 
		 * System.out.println(pg);
		 */	 
		 
		 driver.quit();
		 
		 
	}

}
