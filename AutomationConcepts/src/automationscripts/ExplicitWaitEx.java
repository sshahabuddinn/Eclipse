package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {

		// to Initialize browser
				System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://www.apsrtconline.in/oprs-web/");
				driver.manage().window().maximize();
				//to enter "NLR" in From drop down
				driver.findElement(By.name("source")).sendKeys("NLR");
				
				//to pause execution using Explicit wait
				Wait<WebDriver> wt= new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("BRAHMADEVI-NLR")));
				
				//to select "BRAHMADEVI-NLR"
				driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();
				
				

	}

}
