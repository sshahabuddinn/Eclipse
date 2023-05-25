package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx01 {

	public static void main(String[] args) {
		// Write script to select "March" in "Month" dropdown at FB-Home Page, if other than "March" exist in dropdown

		//To initialize browser
				System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver94.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
				
				WebElement ele=driver.findElement(By.id("month"));
				
				//to read value which is selected in "Month" dropdown
				Select listMonth=new Select(ele);
				
				String monthName=listMonth.getFirstSelectedOption().getText();
				System.out.println(monthName);
				if(monthName.equalsIgnoreCase("Mar")) {
					System.out.println("Expected month exist");
				}
				else {
					System.out.println("WD selected required month");
					listMonth.selectByVisibleText("Mar");
				}
		
		
	}

}
