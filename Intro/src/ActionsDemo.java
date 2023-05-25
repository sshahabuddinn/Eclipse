import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		//	driver.get("https://opensource-demo.orangehrmlive.com/");
		//	driver.get("https://www.facebook.com/");
			
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			
			// To initialize Actions on Amazon.com website
			// To call entire line into one variable = 'move' , Replacing the entire script line to (move)
			
			WebElement move= driver.findElement(By.id("nav-link-accountList"));
			
		 // Need to initialize Actions class
		
			Actions a=new Actions(driver);
		//	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			
			
			// To write composite Actions
			
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			a.moveToElement(move).contextClick().build().perform();

	}

}
