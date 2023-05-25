package mercuryExcelDataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_MercuryTours {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String path="D:\\MercuryLoginData.xlsx";
		XLUtils.setExcelFile(path, "Sheet1");
		int rows=XLUtils.getRowCount(path, "Sheet1");
		for(int i=1; i<=rows; i++) {
			
			String username=XLUtils.getCellData(path, "Sheet1", i, 0);
			String pwd=XLUtils.getCellData(path, "Sheet1", i, 1);
			
			//to perform login operation
			
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			Thread.sleep(8000);
			//to read page title
			String pgTitle=driver.getTitle();
			if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
				System.out.println("Test passed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "Successful login operation");
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
			}
			else {
				System.out.println("Test Failed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "Unsuccessful login operation");
		
			}
			driver.findElement(By.linkText("Home")).click();
		}
	}


	}



