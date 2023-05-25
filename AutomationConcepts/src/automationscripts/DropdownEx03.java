package automationscripts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx03 {

	
	private static Scanner sc;

	public static void main(String[] args) {
		// Write script to select given country name in "Country" dropdown at Mercury Tours application
		
		sc = new Scanner(System.in);
		System.out.println("Enter required Country name");
		String myCountry=sc.nextLine();
		
		boolean myStatus= false;
		//To initialize browser
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver94.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
			
		//to click on "REGISTER" link
		driver.findElement(By.linkText("REGISTER")).click();
				
		//to configure "Country" dropdown to Select class
		Select listCountry=new Select(driver.findElement(By.name("country")));
		
		//to read all the options from dropdown
		List<WebElement> options=	listCountry.getOptions();
		
		for(WebElement option: options) {
			String actCountry=option.getText().trim();
			if(actCountry.equalsIgnoreCase(myCountry)) {
				//to select country
				listCountry.selectByVisibleText(actCountry);
				System.out.println("Expected country name exist");
				myStatus= true;
				break;
			}
			
		}

		if(myStatus==false) {
			System.out.println("Expected country name doesn't exist");

	}

}
}

