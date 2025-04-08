package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut extends BasePage{

	public LogOut(WebDriver driver) 
	{
		super(driver);
	}	
	
	@FindBy(xpath="//a[@id='linkg']")
	private WebElement drpdown;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement logout;

	
	public void setdropdownforlogout()
	{
		drpdown.click();
	}
	
    public void setlogout() 
    {
	   logout.click();
	}

}
