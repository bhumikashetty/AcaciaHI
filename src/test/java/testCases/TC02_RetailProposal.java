package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.RetailProposal;

public class TC02_RetailProposal extends BaseClassAcacia
{
	@Test
	public void CreateRetailProposal() throws InterruptedException 
	{
		RetailProposal rp=new RetailProposal(driver);
		
		rp.getUnderwriting().click();
		rp.getProposal().click();
		rp.getProposalcreate().click();
		rp.getEffectivedate().sendKeys("01-04-2025");
		rp.getExpirydate().click();
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
	
	
	
		Select plantype=new Select(rp.getPlantype());
		plantype.selectByVisibleText("Retail");
		
		Select sob=new Select(rp.getSob());
		sob.selectByValue("AGENT");
		Thread.sleep(3000);
		//to select agent from datalist
		WebElement agentinput=driver.findElement(By.xpath("//*[@id=\"srcIntrmd\"]"));
        agentinput.click();
        agentinput.sendKeys("RTLAGENT-00008-25");
		
		rp.getInitial().sendKeys("L");
		rp.getFirstname().sendKeys("Nam");
		rp.getLastname().sendKeys("Kumar");
		rp.getDob().sendKeys("03-04-1990");
		rp.getAfterdobjustaclick().click();
		
		Select prospecttype=new Select(rp.getProspecttype());
		prospecttype.selectByValue("NORMAL");
		
		rp.getGhanacard().sendKeys("32424HGHFe");
		rp.getProspectemail().sendKeys("nam@gmail.com");
		rp.getMobileno().sendKeys("9844332345");
		rp.getProspectaddress().sendKeys("Tower GH");
		
		Select prospectcountry=new Select(rp.getProspectcountry());
		prospectcountry.selectByVisibleText("Ghana");
		 
		Select prospectregion=new Select(rp.getProspectregion());
		prospectregion.selectByVisibleText("GREATER ACCRA");
		
		//Select prospectcity=new Select(rp.getProspectcity());
		//prospectcity.selectByVisibleText("");
		
		
	}
}
