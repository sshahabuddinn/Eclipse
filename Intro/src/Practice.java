//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("http://www.facebook.com"); // URL in the browser
		//   driver.get("http://server:8000/ERPPMC1.0");
		
		/*driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_e']/div[4]/a")).click(); */
		
		
	}

}

/* CSS path & CSS regular expression
driver.findElement(By.cssSelector("a[title='Sign in']")).click();   // To click on Go with link on login page
driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye"); // Using CSS regular expression   */
