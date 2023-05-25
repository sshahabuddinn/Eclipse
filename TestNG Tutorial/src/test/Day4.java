package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4 {

	
	@Test
	public void WebloginHomeloan()
	{
		//Selenium
		Assert.assertEquals("Smith", "Smith123");
		System.out.println("WebLoginHomeloan");
	}



	@Test(groups= {"Smoke"})
	public void MobileLoginHomeloan()
	
	{
		// Appium
		System.out.println("MobileLoginHomeloan");
	}
	
	
	@Test
	public void LoginAPIHomeloan()
	
	{
		// RestAPI
		System.out.println("LoginAPIHomeloan");
	}
}