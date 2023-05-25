package trainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaLatest {

	public static void main(String[] args) {
		
		// To initialize the browser
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        // driver.get("http://www.newtours.demoaut.com/");
        driver.manage().window().maximize();
        
        // To identify the path
        
        driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.get("http://www.newtours.demoaut.com/");
	}
}
