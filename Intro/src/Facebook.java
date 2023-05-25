import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ehtesham\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("syedshahabuddin1@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("ehan12bad");
		driver.findElement(By.xpath("//*[@id='u_0_e']/div[3]/button")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
	}

}

