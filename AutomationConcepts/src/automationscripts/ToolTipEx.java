package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipEx {

	public static void main(String[] args) {
		// To Read ToolTip
		// to Initialize browser
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		String toolTip = driver.findElement(By.linkText("Business Email")).getAttribute("title");
		System.out.println(toolTip);
	}

}
