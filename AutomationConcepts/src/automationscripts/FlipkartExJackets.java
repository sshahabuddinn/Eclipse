package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartExJackets {

	public static void main(String[] args) throws InterruptedException {
	// Write script to select "Jackets" option in "Men" menu at flipkart application
		//to Initialize browser
				System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//to close popup
				driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
				
				//create reference object for "Men" menu
				WebElement menuMen=driver.findElement(By.xpath("//span[text()='Men']"));
				
				Actions act= new Actions(driver);
				
				act.moveToElement(menuMen).build().perform();
				Thread.sleep(4000);
				
				//to click on "Jackets"
				driver.findElement(By.linkText("Jackets")).click();

	}

}
