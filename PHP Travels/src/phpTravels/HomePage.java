package phpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://phptravels.com/demo/");
		 driver.manage().window().maximize();
		 
		 // To login
		 
		 driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
