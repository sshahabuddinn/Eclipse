package com.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		 this.driver=driver;
	}

	By username=By.id("user_login");
	By password=By.xpath("//*[@id='user_pass']");
	By login=By.name("wp-submit");

	public void typeUsername()
	 {
		 driver.findElement(username).sendKeys("admin");
	 }
	 
	 public void typePassword()
	 {
		 driver.findElement(password).sendKeys("demo123");
	 }
	 
	 public void clickLoginButton()
	 {
		 driver.findElement(login).click();
	 }

}


