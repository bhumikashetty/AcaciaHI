package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.CorporateProposal;

public class TC03_CorporateProposal extends  BaseClassAcacia
{
@Test
	public void CreateCorporateProposal() throws InterruptedException
	{
	    CorporateProposal cp=new CorporateProposal(driver);
	    cp.getUnderwriting().click();
		cp.getProposal().click();
		cp.getProposalcreate().click();
		cp.getEffectivedate().sendKeys("01-04-2025");
		cp.getExpirydate().click();
	//to find mandatoryfield	
	WebElement	mandatoryplantype=driver.findElement(By.xpath("//*[@id=\"proposalForm\"]/table/tbody/tr[7]/td/table/tbody/tr[3]/td[1]"));
    String asterplantype=mandatoryplantype.getText();
    if(asterplantype.contains("*"))
    {
    	System.out.println("Plantype is mandatory");
    }
    else
    {
    	System.out.println("Plantype is not mandatory");
    }
    
    Select plantype=new Select(cp.getPlantype());
	plantype.selectByVisibleText("Corporate");
	
	Select sob=new Select(cp.getSob());
	sob.selectByValue("AGENT");
	Thread.sleep(3000);
	//to select agent from datalist
	WebElement agentinput=driver.findElement(By.xpath("//*[@id=\"srcIntrmd\"]"));
    agentinput.click();
    agentinput.sendKeys("RTLAGENT-00008-25");
	
	cp.getInitial().sendKeys("L");
	cp.getFirstname().sendKeys("Ram");
	cp.getLastname().sendKeys("Kumar");
	cp.getDob().sendKeys("03-04-1990");
	cp.getAfterdobjustaclick().click();
	
	Select prospecttype=new Select(cp.getProspecttype());
	prospecttype.selectByValue("NORMAL");
	
	cp.getGhanacard().sendKeys("32924HGHFe");
	cp.getProspectemail().sendKeys("nam@gmail.com");
	cp.getMobileno().sendKeys("9844542345");
	cp.getCompanyname().sendKeys("Helloword Tchno");
	cp.getBusinessactivity().sendKeys("B2B");
	cp.getProspectaddress().sendKeys("Tower GH");
	
	Select prospectcountry=new Select(cp.getProspectcountry());
	prospectcountry.selectByVisibleText("Ghana");
	 
	Select prospectregion=new Select(cp.getProspectregion());
	prospectregion.selectByVisibleText("GREATER ACCRA");
	
	//Select prospectcity=new Select(rp.getProspectcity());
	//prospectcity.selectByVisibleText("");
	
	
	}
}
