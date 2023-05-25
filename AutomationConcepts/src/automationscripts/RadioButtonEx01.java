package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To initialize browser
				System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
				
				//to select "Male" Radiobutton
				driver.findElement(By.xpath("//*[text()='Male']")).click();

	}

}
