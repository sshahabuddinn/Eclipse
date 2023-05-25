package automationscripts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotEx {

	public static void main(String[] args) throws IOException {
	//	Write script to capture screenshot of www.facebook.com home page and save
	//	file with date stamp in project working directory
					//to Initialize browser
				System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
				
				//to capture screenshot of page and to return into file format
				File fo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
								
				//to capture system date
				Date dt= new Date();
				System.out.println(dt);
				//converting date into required format
				DateFormat df= new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss");
				System.out.println(df.format(dt));
				
				//to save in specified location
			//	FileHandler.copy(fo, new File("D:\\Facebook"+df.format(dt)+".png"));
				
				//to save file in "Defects" folder at Project directory
				FileHandler.copy(fo, new File(".//Defects//Yankee"+df.format(dt)+".png"));
				
				//7amdec19  "D:\\7amdec19"

	}

}
