package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Setup.Base;
import bus.Nextpage;
import bus.Openpage;

public class Testng extends Base{

	WebDriver driver;
	Openpage openpage;
	Nextpage nextpage;
	SoftAssert soft;
	
	@Parameters("browser")
	@BeforeTest
	public void beforetest(String browserName)
	{
		System.out.println("beforetest");
    	if(browserName.equals("chrome"))
    	{
    		driver = openChromeBrowser();
    	}
    	
    	if(browserName.equals("Msedge"))
    	{
    		driver = openmsedgeBrowser();
    	}
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
		 openpage = new Openpage(driver);
		 nextpage = new Nextpage(driver);
		
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		System.out.println("beforemethod");
		driver.get("https://www.abhibus.com/");
		 soft = new SoftAssert();
	}
	
	@Test(priority =1)
	public void test()
	{
		System.out.println("test");
		
		openpage.nextpage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		
	   soft.assertEquals(url,"https://www.abhibus.com/");
	   System.out.println("hello");
	   soft.assertEquals(title, "Book Bus Tickets Online at Lowest Fare, Flat ₹500 Cashback On Bus Booking | AbhiBus");
		soft.assertAll();
	}
	
	@Test(priority =2)
	public void test1() throws InterruptedException
	{
		System.out.println("test1");
		Thread.sleep(2000);
        nextpage.clickonnextpage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		
		 soft.assertEquals(url,"https://www.abhibus.com/");
		 System.out.println("hello abhibus");
	     soft.assertEquals(title, "Book Bus Tickets Online at Lowest Fare, Flat ₹500 Cashback On Bus Booking | AbhiBus");
	    soft.assertAll();
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
		System.out.println("logout");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
		driver.close();
	}
	
	
}
