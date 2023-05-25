package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickButtonEx {

	public static void main(String[] args) throws InterruptedException {
	//	Write program to right click on button and to select "Paste" option
	//	Url:"https://swisnl.github.io/jQuery-contextMenu/demo.html
	// To Initialize browser
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
				driver.manage().window().maximize();
				
				//create reference object for webelement
				WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
				
				Actions act= new Actions(driver);
				
				//to perform right click on webelement
				act.moveToElement(ele).contextClick().build().perform();
				
				Thread.sleep(3000);
				//to select Paste option
				driver.findElement(By.xpath("//span[text()='Paste']")).click();
				Thread.sleep(3000);
				//to read msg from java Alert
				String eMsg=driver.switchTo().alert().getText();
				System.out.println(eMsg);
				
				//to close popup
				driver.switchTo().alert().accept();

	}

}
