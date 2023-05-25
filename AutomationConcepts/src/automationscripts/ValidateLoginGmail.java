package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginGmail {

	public static void main(String[] args) throws InterruptedException {

		// initialize browser and open g-mail
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver99.exe");
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.setBinary("chromedriver.exe");
		 */
				WebDriver driver= new ChromeDriver();
				driver.get("https://gmail.com");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//to enter Email
				driver.findElement(By.name("identifier")).sendKeys("almandi694@gmail.com");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				Thread.sleep(3000);
				
				//to Enter pwd
				driver.findElement(By.name("password")).sendKeys("bounty123");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				Thread.sleep(9000);
				
				//to read page title
				String pgTitle=driver.getTitle();
				if(pgTitle.contains("almandi694@gmail.com")) {
					System.out.println("Successful login operation");
				}
				else {
					System.out.println("Unsuccessful login operation");
				}

	}

}
