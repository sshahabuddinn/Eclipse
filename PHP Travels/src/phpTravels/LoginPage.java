package phpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		// To initialize the browser
		
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.get("https://www.phptravels.org/clientarea.php");
				 driver.manage().window().maximize();
				 
				 // To login
				 
				 driver.findElement(By.id("inputEmail")).sendKeys("Admin");
				 driver.findElement(By.id("inputPassword")).sendKeys("admin123");
				 

	}

}
