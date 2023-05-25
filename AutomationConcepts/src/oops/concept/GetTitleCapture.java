package oops.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleCapture {

	public static void main(String[] args) throws IOException {
		//To initialize browser
				System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver99.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://facebook.com");
				driver.manage().window().maximize();
				
				driver.getTitle();
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("D://screennewshot.png"));

	}

}
