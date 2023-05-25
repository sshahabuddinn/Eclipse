package test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import object.repository.RediffHomePg;
import object.repository.RediffLoginPg;

public class RediffLoginValidation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();
		
		//to initialize objects from "object.repository" package classes
		RediffHomePg RHP= PageFactory.initElements(driver, RediffHomePg.class);
		RediffLoginPg RLP= PageFactory.initElements(driver, RediffLoginPg.class);
		
		RHP.signinObj(driver).click();
		RLP.emailObj(driver).sendKeys("Madhukar");
		RLP.pwdObj(driver).sendKeys("Mercury");
		RLP.goObj(driver).click();
		
		Thread.sleep(3000);
		
		String pgTitle= driver.getTitle();
		if (pgTitle.contains("Inbox")){
			System.out.println("Successful login operation");
		}
		else{
			System.out.println("Unsuccessful login operation");
			}
		
	}



	}


