package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractice/#/offers");
		driver.manage().window().maximize();
		
		List <WebElement> l1= driver.findElements(By.xpath("//tr//td[2]"));
		
		ArrayList<String> l2=new ArrayList<String>();
		for(int i=0;i<l1.size();i++) 
		{
			l2.add(l1.get(i).getText());
		}
		
		ArrayList <String> l3=new ArrayList<String>();
		for(int i=0;i<l2.size();i++)
		{
			l3.add(l2.get(i));
		}
		
		Collections.sort(l3);
		
		
	}

}
