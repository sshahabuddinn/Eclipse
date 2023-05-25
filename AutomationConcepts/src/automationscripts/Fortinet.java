package automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Fortinet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://s3.amazonaws.com/istreet-assets/bHFRMn4JHQnwP7QcqCer7w/fortinet-qa-testsite.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String pgTitle=driver.getCurrentUrl();
		System.out.println(pgTitle);
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Task Name']"));
		driver.findElement(By.name("name")).sendKeys("Admin Module");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Deadline']"));
		driver.findElement(By.name("deadline")).click();
		
		@SuppressWarnings("unused")
		Select ls=(Select) new Select(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"))).getOptions();
		driver.findElement(By.xpath("//class(ui-datepicker-year")).isSelected();
		
		/*
		 * System.out.println("Task Name is present");
		 * System.out.println("Deadline is present"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@type=('checkbox')]")).click();
		 * System.out.println("Complete checkbox is selected"); Thread.sleep(3000);
		 * driver.findElement(By.id("add-item")).click();
		 * System.out.println("Add Item is selected");
		 */


	}

}
