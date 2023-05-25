package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Select fruitlist=new Select(driver.findElement(By.id("day")));
		
		java.util.List<WebElement> options=fruitlist.getOptions();
		System.out.println("List is: "+options.size() );
		
		for(WebElement granite : options)
			
		{
			System.out.println("get the list "+granite.getText());
		}

	}

}
