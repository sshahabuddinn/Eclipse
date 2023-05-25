package automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx02 {

	public static void main(String[] args) {
		// Write script to find number of options in "Year" dropdown and print those values in Console from FB- Home Page
		
		//To initialize browser
				System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver94.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
						
				Select listYear=new Select(driver.findElement(By.name("birthday_year")));
				
				//to collect all the options info. from dropdown
				List<WebElement> options= listYear.getOptions();
				System.out.println("Number of values are: "+options.size());
				
				for(WebElement option : options) {
					//to read each option visibletext
					System.out.println(option.getText());
				}

	}

}
