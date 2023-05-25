import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QAAcacademyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
					
		WebElement checkBoxSelected = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
        checkBoxSelected.click();
        Thread.sleep(2000L);
        String selectedCheckboxText = checkBoxSelected.getAttribute("value");
        System.out.println("The text of check box selected is: " +selectedCheckboxText);
        Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        s.selectByValue(selectedCheckboxText);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selectedCheckboxText);
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        String alertText = driver.switchTo().alert().getText();
        if (alertText.contains(selectedCheckboxText)){
            System.out.println("The checkbox text is present in the alert");
            driver.switchTo().alert().dismiss();
            driver.close();
        }else {
            System.out.println("The checkbox text is not present in the alert");
        }	
			
			driver.close();
		 
			}

}
