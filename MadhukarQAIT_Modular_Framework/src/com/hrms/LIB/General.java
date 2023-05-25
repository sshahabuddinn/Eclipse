package com.hrms.LIB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.objects.ObjectsInfo;

public class General  extends  ObjectsInfo{
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Application opened");
	}
	
	public void tearDown() {
		driver.quit();
		System.out.println("Application and Browser are closed");
	}
	
	public void adminLogin() throws InterruptedException {
		driver.findElement(By.name(txt_username)).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name(btn_login)).click();
		
		Thread.sleep(5000);

	}
	
	public void adminLogout() throws InterruptedException {
		driver.findElement(By.linkText(link_Welcome_Admin)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Admin logout");
	}
	
	
	public void addEmp() {
		System.out.println("Added new Employee");
	}
	
	public void delEmp() {
		System.out.println("Deleted employee");
	}



	}


