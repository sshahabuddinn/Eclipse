package automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx02 {

	public static void main(String[] args) {
		// Write script to find number of frames in a page and to read each frame name
		// initialize browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();

		// to find no. of frames in a page
		List<WebElement> frames = driver.findElements(By.tagName("frame"));

		System.out.println("Number of Frames are: " + frames.size());

		for (WebElement frame : frames) {
			System.out.println(frame.getAttribute("name"));
		}
		
		driver.close();

	}

}
