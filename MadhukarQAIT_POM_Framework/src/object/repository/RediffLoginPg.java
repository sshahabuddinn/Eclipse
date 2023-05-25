package object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffLoginPg {
	
	//Assign locator value
			@FindBy(name="login")
			WebElement emailId;
			
			//Assign locator value
			@FindBy(name="passwd")
			WebElement pwd;
			
			//Assign locator value
			@FindBy(name="proceed")
			WebElement go;
			
			//to return obj
			public WebElement emailObj(WebDriver driver){
				return(emailId);
			}
			public WebElement pwdObj(WebDriver driver){
				return(pwd);
			}
			public WebElement goObj(WebDriver driver){
				return(go);
			}
	}



