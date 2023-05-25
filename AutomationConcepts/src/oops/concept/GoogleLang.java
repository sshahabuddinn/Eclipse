package oops.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLang {
	
// Develop Automation test script to select different language links
	//in www.google.co.in, whereas each operation there should be individual methods
	/*-To Initialize browser
	-To select language link
	-To close application*/
	
	WebDriver driver;
	//To Initialize browser
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver99.exe");
		driver= new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
	}
	//To select language link
	public void langSelection( String myLanguage) throws InterruptedException {
		//to click on Telugu link
			driver.findElement(By.linkText(myLanguage)).click();
				Thread.sleep(4000);
	}
	
	public void tearDown() {
		driver.close();
		
	}

	//To close application
	public static void main(String[] args) throws InterruptedException {
		
		GoogleLang gl=new GoogleLang();
		gl.setUp();
		gl.langSelection("తెలుగు");
		gl.langSelection("हिन्दी");
		gl.langSelection("मराठी");
		gl.langSelection("English");
		
		gl.tearDown();
		
		
		
	}

}
