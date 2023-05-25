package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Osmania_University");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//li[@id='ca-talk']//a[contains(text(),'Talk')]")).click();
		

	}

}
