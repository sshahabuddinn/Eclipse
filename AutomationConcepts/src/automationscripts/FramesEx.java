package automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesEx {

	public static void main(String[] args) throws InterruptedException {
//		"http://jqueryui.com/droppable/"
			//to Initialize browser
					System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
					WebDriver driver=new FirefoxDriver();
					driver.get("http://jqueryui.com/droppable/");
					driver.manage().window().maximize();
					
				driver.switchTo().frame(0);		
				
		// To locate/identify total no of frames in the webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		
		Actions a=new Actions(driver);
		
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	
	a.dragAndDrop(source, target).build().perform();
	a.moveToElement(target).doubleClick().build().perform();
	
	driver.switchTo().defaultContent();	
	
	
	
		//driver.findElement(By.id("draggable")).click();
	}

}
