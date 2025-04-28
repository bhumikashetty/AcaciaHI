package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
	 WebDriver driver;
	 Properties p;
	 ChromeOptions options=new ChromeOptions();
	//EdgeOptions options=new EdgeOptions();
	
	@BeforeClass
	//@Parameters({"browser"})
	public void setup() throws IOException
	{
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		/*switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		default: System.out.println("No matching browser"); return;
	    }*/
		
		options.setAcceptInsecureCerts(true);
		
		driver=new ChromeDriver(options);
		//driver=new EdgeDriver(options);
	   
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("acaciaurl"));
		//driver.get("https://119.82.108.150:8444/Acacia_Health_Dev_Test_Link/login.html");
		driver.manage().window().maximize(); 
		
	
		Login logpg= new Login(driver);
		logpg.setTxtusername(p.getProperty("username"));
		
		logpg.setTxtpassword(p.getProperty("password"));
		logpg.setBtnlogin();
		
			
	}
	@AfterClass
    public void teardown() throws InterruptedException
		  {
		    LogOut lop = new LogOut(driver);
		    Thread.sleep(3000);
			lop.setdropdownforlogout();
			Thread.sleep(3000);
			lop.setlogout();
			Thread.sleep(3000);
		    driver.quit();
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
