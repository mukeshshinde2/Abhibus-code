package bus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Openpage {

	// variable element
	
	@FindBy(xpath = "//input[@id='source']")
	WebElement leaving ;
	
	@FindBy(xpath = "//li[text()='Aurangabad (Maharastra)']")
	WebElement press1 ;
	
	@FindBy(xpath = "//input[@id='destination']")
	WebElement destination ;
	
	@FindBy(xpath = "//li[text()='Mumbai International Airport']")
	WebElement press2 ;
	
	@FindBy(xpath = "//input[@id='datepicker1']")
	WebElement datebox ;
	
	@FindBy(xpath = "(//a[text()='20'])[1]")
	WebElement press3 ;
	
	@FindBy(xpath = "//a[text()='Search']")
	WebElement searchbutton ;
	
	// constructor
	public Openpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// method Action webelement
	
	public void nextpage()
	{
		leaving.click();
		leaving.sendKeys("mumbai");
		destination.click();
		destination.sendKeys("nashik");
		datebox.click();
		datebox.sendKeys("20");
		searchbutton.click();
	}
}
