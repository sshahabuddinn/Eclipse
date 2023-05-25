import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperationOrangeHRM {

	public static void main(String[] args) throws IOException {
		//to specify Properties file location
				FileInputStream fi= new FileInputStream("./Properties//inputdata.properties");
				//create Object for properties class
				Properties prop=new Properties();
				prop.load(fi);
				//to read key values from properties file
				String autURL=prop.getProperty("baseUrl");
				String userName=prop.getProperty("userId");
				String pwd=prop.getProperty("pwd");
				
				//To initialize browser
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver99.exe");
				WebDriver driver= new ChromeDriver();
				driver.get(autURL);
				driver.manage().window().maximize();
				
				//to perform login operation
				driver.findElement(By.name("txtUsername")).sendKeys(userName);
				driver.findElement(By.name("txtPassword")).sendKeys(pwd);
				driver.findElement(By.name("Submit")).click();

			}

		


	}


