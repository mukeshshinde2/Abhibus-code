package bus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nextpage {

	// variable element
	
	@FindBy(xpath = "//input[@id='source']")
	WebElement leaving ;
	
	@FindBy(xpath = "//li[text()='Aurangabad (Maharastra)']")
	WebElement press ;
	
	@FindBy(xpath = "//input[@id='destination']")
	WebElement going ;
	
	@FindBy(xpath = "//li[text()='Mumbai International Airport']")
	WebElement press1 ;
	
	@FindBy(xpath = "//input[@id='datepicker1']")
	WebElement datebox ;
	
	@FindBy(xpath = "(//a[text()='20'])[1]")
	WebElement press2 ;
	
	@FindBy(xpath = "//a[text()='Search']")
	WebElement searchbutton ;
	
	@FindBy(xpath = "(//span[text()='Select Seat'])[4]")
	WebElement select ;
	
	@FindBy(xpath = "//a[@id='O14-5ZZ']")
	WebElement selectseat ;
	
	@FindBy(xpath = "//select[@id='boardingpoint_id']")
	WebElement bordingpoint ;
	
	@FindBy(xpath = "//option[contains(text(),'Waluj,Dolphin ')]")
	WebElement bordclick ;
	
	@FindBy(xpath = "//select[@id='droppingpoint_id']")
	WebElement droppingpoint ;
	
	@FindBy(xpath = "(//option[contains(text(),'Ka')])[1]")
	WebElement dropclick ;
	
	@FindBy(xpath = "//input[@id='btnEnable1']")
	WebElement continuebutton ;
	
	// constructor webelement
	
	public Nextpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action method
	
	public void clickonnextpage() throws InterruptedException
	{
		
		leaving.click();
		leaving.sendKeys("aurangabad");
//		Thread.sleep(2000);
		press.click();
		going.click();
		going.sendKeys("mumbai");
//		Thread.sleep(3000);
		press1.click();
		datebox.click();
		datebox.sendKeys("20");
//		Thread.sleep(3000);
		press2.click();
		searchbutton.click();
		Thread.sleep(3000);
		select.click();
		Thread.sleep(3000);
		selectseat.click();
		Thread.sleep(3000);
		bordingpoint.click();
		bordclick.click();
//		Thread.sleep(3000);
		droppingpoint.click();
		dropclick.click();
		continuebutton.click();

	
	}
	

}
