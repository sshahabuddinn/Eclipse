package automationscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvertWordToPDF_AutoITEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * // To initialize the browser
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.get("http://tinyupload.com/"); driver.manage().window().maximize();
		 * 
		 * // To click on File Upload //Thread.sleep(3000);
		 * 
		 * driver.findElement(By.name("uploaded_file")).click();
		 */

		// initialize browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver94.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();

		// to click on "Choose file"
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Runtime.getRuntime().exec("C:\\Users\\Ehtesham\\Documents\\fileupload.exe");

	}

}
