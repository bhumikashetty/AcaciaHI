package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.LogOut;
import pageObjects.Login;

public class BaseClassAcacia
{
	public WebDriver driver;
	ChromeOptions options=new ChromeOptions();
	
	@BeforeClass
	public void setup()
	{ 
		options.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://119.82.108.150:8444/Acacia_Health_Dev_Test_Link/login.html");
		driver.manage().window().maximize(); 
	
		Login logpg= new Login(driver);
		logpg.setTxtusername("Bhumi");
		logpg.setTxtpassword("Chegus@555");
		logpg.setBtnlogin();
	}
	
	@AfterClass
	   public void teardown()
		  {
		    LogOut lop = new LogOut(driver);
			lop.setdropdownforlogout();
			lop.setlogout();
		  }
	//from 45 to 63 it is used to auto generate data randomly
	public String randomString() 
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}		
	
	public String randomNumber() 
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomAlphaNumeric() 
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(5);
		return generatedstring+generatednumber;
	}
	}
