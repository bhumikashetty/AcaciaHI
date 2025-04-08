package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage 
{

	public Login(WebDriver driver)
	{
		super(driver);
	}	
	
	@FindBy(xpath="//input[@id='usrnm']")
	private WebElement txtusername;
	
	@FindBy(xpath="//input[@id='pwd']")
	private WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='loginBtn']")
	private WebElement btnlogin;

	
	public void setTxtusername(String username) {
		txtusername.sendKeys(username);
	}

	
	public void setTxtpassword(String password){
		txtpassword.sendKeys(password);
	}

	
	public void setBtnlogin( ) {
		btnlogin.click();
	}

	
}
