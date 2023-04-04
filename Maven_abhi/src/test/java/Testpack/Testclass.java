package Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bus.Openpage;

public class Testclass {

		
	public static void main(String[] args) throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Library Tools\\chromedriver_win32\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.abhibus.com/");
	
	Openpage openpage = new Openpage(driver);
	openpage.nextpage();
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if(url.contains("https://www.abhibus.com/"))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
		
	}
}
