package automationscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// initialize browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.ilovepdf.com/word_to_pdf");
				driver.manage().window().maximize();

				// to click on "Choose file"
				driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
				
				Thread.sleep(5000);
				//to select file path
				StringSelection myFile= new StringSelection("C:\\Users\\Ehtesham\\Documents\\Cognizant.doc");
				
				// to set the selected value into System clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, null);
				
				Robot rb= new Robot();
				//to press Ctrl+V
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				
				//to release Keys
				rb.keyRelease(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				
				//To press TAB
				Thread.sleep(4000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				
				//To press TAB
				Thread.sleep(4000);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				
				//To press ENTER
				Thread.sleep(4000);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
