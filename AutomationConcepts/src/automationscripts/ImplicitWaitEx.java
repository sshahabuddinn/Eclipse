package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		
		// to Initialize browser
				System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://www.apsrtconline.in/oprs-web/");
				driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//to enter "NLR" in From drop down
				driver.findElement(By.name("source")).sendKeys("NLR");
				
				//to pause execution
				//Thread.sleep(9000);
				
				//to select "BRAHMADEVI-NLR"
				driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();
		
	}

}
