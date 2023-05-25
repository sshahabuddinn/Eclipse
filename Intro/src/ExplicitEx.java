import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		WebDriverWait expwait=new WebDriverWait(driver,30);
		
		
		// using explicit wait
		
		driver.findElement(By.partialLinkText("Click to load ")).click();
		expwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
		
		String emsg=driver.findElement(By.id("results")).getText();
		
		System.out.println(""+emsg);
		
		driver.close();

	}

}


 /* System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
        WebDriverWait d=new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable(By.id("results")));
        System.out.println(driver.findElement(By.id("results")).getText());
     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());  
      */
