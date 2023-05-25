package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Select ls=new Select (driver.findElement(By.name(("birthday_year"))));
		
		//to collect all the options info. from dropdown
		
		List<WebElement> options=	ls.getOptions();
		System.out.println("Number of values are: "+options.size());
		
		 for (WebElement option: options)
		{
			System.out.println(option.getText());
		}

	}

}
