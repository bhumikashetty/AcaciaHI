package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BankMaster;

public class TC01_BankMaster extends  BaseClassAcacia
{
	@Test
	public void CreateBankMaster() throws InterruptedException
	{
		
		BankMaster bm=new BankMaster(driver);
		bm.getMaster().click();
		bm.getBankmaster().click();
		bm.getCreatebank().click();
		//Thread.sleep(500);
		bm.getAddbutton().click();
		//Thread.sleep(3000);
		bm.getClickokonalertmessage().click();
		//Thread.sleep(1000);
		
		bm.getTxtbankname().sendKeys(randomString().toUpperCase());
		//bm.getTxtbankname().sendKeys("HDDVFfFFDFu4");
		bm.getCurrency().click();;
		//Thread.sleep(3000);
		
		//currency
        Select currencydropdown =new Select(bm.getCurrency());
		
		currencydropdown.selectByValue("2171");
		//Thread.sleep(2000);
		
		//active
	    Select activedropdown =new Select(bm.getActive());
		
		activedropdown.selectByValue("Y");
		//Thread.sleep(2000);
		
		//to check branch code is mandatory or not
		WebElement label = driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[5]/td[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[1]"));
		String labelText = label.getText();
        if (labelText.contains("*")) {
            System.out.println("The field labeled '" + labelText + "' is mandatory (contains *).");
        } else {
            System.out.println("The field labeled '" + labelText + "' is NOT mandatory (does not contain *).");
        }
        
     
        
        //to check address is mandatory or not
        WebElement addresslabel = driver.findElement(By.xpath("//td[normalize-space()='Address']"));
		String addresslabelText = addresslabel.getText();
        if (addresslabelText.contains("*")) {
            System.out.println("The field labeled '" + labelText + "' is mandatory (contains *).");
        } else {
            System.out.println("The field labeled '" + labelText + "' is NOT mandatory (does not contain *).");
        }
		
        //by using attribute to check for attribute
        if(bm.getBankbranchcode().getAttribute("class").contains("Required"))
        {
        	System.out.println("field is mandatory");
        }
        else
        {
        	System.out.println("Not mandatory");
        }
        	
       		
		bm.getBankbranchcode().sendKeys(randomAlphaNumeric());
		//bm.getBankbranchcode().sendKeys("HVVDFFFFsC0008");
		
	    
		bm.getBankbranchname().sendKeys(randomString().toUpperCase());
		//bm.getBankbranchname().sendKeys("HUBGsFDGGYytF71 Layout");
		//bm.getAddress().sendKeys(randomString().toUpperCase());
		bm.getAddress().sendKeys("TowerDD 59, graden road, wood street");
		bm.getContactpersonname().sendKeys("Gilbert");
		bm.getBankemail().sendKeys("kalya8kaDr@gmail.com");
		//bm.getBankcontactnumber().sendKeys(randomNumber());
		bm.getBankcontactnumber().sendKeys("5007080977");
		Thread.sleep(3000);
		
		//branchactive
		Select branchactivedp=new Select(bm.getBranchactive());
		
		branchactivedp.selectByValue("Y");
		//Thread.sleep(2000);
		
	//	bm.getSubmit().click();
		//Thread.sleep(5000);
		
		
	}

}	
		
		
		
		
		
		
		
		
		
	


	
	
			
		
	

