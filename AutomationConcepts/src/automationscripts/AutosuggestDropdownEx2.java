package automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdownEx2 {

	public static void main(String[] args) {
		
		// To initialize the browser
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver99.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		
		// To perform autosuggest dropdown ajax
		
		

	}

}
