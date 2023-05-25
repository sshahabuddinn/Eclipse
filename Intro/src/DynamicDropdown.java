import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		//a[@value='BLR']; //a[@value='HYD']
		
		//a[@value='MAA'] ; //a[text()='Chennai (MAA)']
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ehtesham\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
       driver.get("https://www.spicejet.com/");
       
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='HYD']")).click();
       Thread.sleep(2000L);
       // driver.findElement(By.xpath("(//a[@value='KQH'])[2]")).click();
       
       driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
       
       
       
       //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
       
       
       
       
       
		
		
	}

}
