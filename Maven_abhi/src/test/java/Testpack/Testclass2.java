package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bus.Nextpage;

public class Testclass2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library Tools\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.abhibus.com/");
		
		Nextpage nextpage = new Nextpage(driver);
		nextpage.clickonnextpage();
		
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

