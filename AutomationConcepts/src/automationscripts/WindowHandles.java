package automationscripts;

import java.awt.AWTException;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver99.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@href='http://naukri.shiksha.com']")).click();
		Thread.sleep(3000);
		Set <String> pagehandles=driver.getWindowHandles();
		Iterator<String>winhandles=pagehandles.iterator();
		
		while(winhandles.hasNext())
		{
			@SuppressWarnings("unused")
			String win1=winhandles.next();
		}
		
		if(!pagehandles.equals(winhandles))
		{
			
		//	driver.switchTo().window();
		}
		
				
		String title=driver.getTitle();
		System.out.println(title);
	
	
	}
	
}