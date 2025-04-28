package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateProposal extends BasePage {

	public CorporateProposal(WebDriver driver) 
	{
		super(driver);
	}	
	
	@FindBy(xpath="//b[normalize-space()='Underwriting']")
    WebElement underwriting;

    @FindBy(xpath="//a[@id='PROPOSAL']")
    WebElement proposal;

    @FindBy(xpath="//input[@title='Create']")
    WebElement proposalcreate;

    @FindBy(xpath="//input[@id='effDt']")
    WebElement effectivedate;
    
    @FindBy(xpath="//input[@id='expDt']")
    WebElement expirydate;
    
    @FindBy(xpath="//select[@id='planType']")
    WebElement plantype;
    
    @FindBy(xpath="//select[@id='srcOfBuss']")
    WebElement sob;
    
    @FindBy(xpath="//input[@id='proposalDO.initial']")
    WebElement initial;
    
    @FindBy(xpath="//input[@id='prospectName']")
    WebElement fristname;
    
    @FindBy(xpath="//input[@id='TEXT000005']")
    WebElement lastname;
    
    @FindBy(xpath="//input[@id='prospectDob']")
    WebElement dob;
    
    @FindBy(xpath="//td[normalize-space()='Prospect Type']")
    WebElement afterdobjustaclick;
    
    @FindBy(xpath="//select[@id='customerTypeInput']")
    WebElement prospecttype;
    
    @FindBy(xpath="//input[@id='TEXT000008']")
    WebElement ghanacard;
    
    @FindBy(xpath="//input[@id='prospEmail']")
    WebElement prospectemail;
    
    @FindBy(xpath="//input[@id='mobile1Id']")
    WebElement mobileno;
    
    @FindBy(xpath="//input[@id='compName']")
    WebElement companyname;
    
    @FindBy(xpath="//textarea[@id='AREA000001']")
    WebElement businessactivity;
    
    @FindBy(xpath="//textarea[@id='AREA000002']")
    WebElement prospectaddress;

    @FindBy(xpath="//select[@id='country']")
    WebElement prospectcountry;
    
    @FindBy(xpath="//select[@id='region']")
    WebElement prospectregion;
    
   // @FindBy(xpath="//select[@id='city']")
    //WebElement prospectcity;
    
    
    
    
    
    
    
    
    
    
    
    
    /**
	 * @return the underwriting
	 */
	public WebElement getUnderwriting() {
		return underwriting;
	}

	/**
	 * @return the proposal
	 */
	public WebElement getProposal() {
		return proposal;
	}

	/**
	 * @return the proposalcreate
	 */
	public WebElement getProposalcreate() {
		return proposalcreate;
	}

	/**
	 * @return the effectivedate
	 */
	public WebElement getEffectivedate() {
		return effectivedate;
	} 
	
	/**
	 * @return the effectivedate
	 */
	public WebElement getExpirydate() {
		return expirydate;
	}
     
	/**
	 * @return the plantype
	 */
	public WebElement getPlantype() {
		return plantype;
	}

	/**
	 * @return the sob
	 */
	public WebElement getSob() {
		return sob; 
	}
	
	/**
	 * @return the initial
	 */
	public WebElement getInitial() {
		return initial;
	}
	
	/**
	 * @return the fristname
	 */
	public WebElement getFirstname() {
		return fristname;
	}
	
	/**
	 * @return the lastname
	 */
	public WebElement getLastname() {
		return lastname;
	}
	
	/**
	 * @return the dob
	 */
	public WebElement getAfterdobjustaclick() {
		return afterdobjustaclick;
	}
	
	/**
	 * @return the dob
	 */
	public WebElement getDob() {
		return dob;
	}
	
	/**
	 * @return the prospecttype
	 */
	public WebElement getProspecttype() {
		return prospecttype;
	}
	/**
	 * @return the ghanacard
	 */
	public WebElement getGhanacard() {
		return ghanacard;
	}
	/**
	 * @return the prospectemail
	 */
	public WebElement getProspectemail() {
		return prospectemail;
	}
	/**
	 * @return the mobileno
	 */
	public WebElement getMobileno() {
		return mobileno;
	}
	
	/**
	 * @return the companyname
	 */
	public WebElement getCompanyname() {
		return companyname;
	}
	
	/**
	 * @return the businessactivity
	 */
	public WebElement getBusinessactivity() {
		return businessactivity;
	}
	
	/**
	 * @return the prospectaddress
	 */
	public WebElement getProspectaddress() {
		return prospectaddress;
	}
	
	/**
	 * @return the prospectcountry
	 */
	public WebElement getProspectcountry() {
		return prospectcountry;
	}
	
	/**
	 * @return the prospectregion
	 */
	public WebElement getProspectregion() {
		return prospectregion;
	}
	
	/**
	 * @return the prospectcity
	 */
	//public WebElement getProspectcity() {
	//	return prospectcity;
	//}
}
