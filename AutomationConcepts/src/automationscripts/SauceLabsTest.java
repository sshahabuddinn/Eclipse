package automationscripts;

import java.net.MalformedURLException;

import java.net.URL;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {

public static final String USERNAME = "sshahabuddin";

  public static final String ACCESS_KEY = "516c5308-5c7d-42da-a293-3ef95249a25b";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";



public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub



DesiredCapabilities caps = DesiredCapabilities.chrome();

caps.setCapability("platform", "Windows 7");

caps.setCapability("version", "51.0");

WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

driver.get("http://google.com");

System.out.println(driver.getTitle());

}



}




