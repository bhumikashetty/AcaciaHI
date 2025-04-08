package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankMaster extends BasePage
{
  public BankMaster(WebDriver driver)
	  {
	  	super(driver);
	  }
	
	@FindBy(xpath="//b[normalize-space()='Masters']")
    WebElement master;
    
    @FindBy(xpath="//a[@id='BANKMASTER']")
    WebElement bankmaster;
    
    @FindBy(xpath="//input[@title='Create']")
    WebElement createbank;
    
    @FindBy(xpath="//button[@id='branchDetailsAddBtnId']")
    WebElement addbutton;
  
    @FindBy(xpath="//input[@id='okBtn']")
    WebElement clickokonalertmessage;
    
    @FindBy(xpath="//input[@id='bankName']")
    WebElement txtbankname;
    
    @FindBy(xpath="//select[@id='currency']") 
    WebElement currency;
  
	@FindBy(xpath="//select[@id='active']")
	WebElement active;		
	
    @FindBy(xpath="//input[@id='branchCode0']")
	WebElement bankbranchcode;
	
	@FindBy(xpath="//input[@id='branchName0']")
	WebElement bankbranchname;
	
	//this to check * of branch code
    @FindBy(xpath="//tbody/tr[1]/td[1]/span[1]")
    WebElement branchcodeaster;
	
	@FindBy(xpath="//input[@id='address0']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='contactPersonName0']")
	WebElement contactpersonname;
	
	@FindBy(xpath="//input[@id='email0']")
	WebElement bankemail;
	
	@FindBy(xpath="//input[@title='Exactly 10 digit are allowed']")
	WebElement bankcontactnumber;
     
	@FindBy(xpath="//select[@id='brnchActive']")
	WebElement branchactive;

    @FindBy(xpath="//input[@id='submit']")  
    WebElement submit;
    
   //this for successful message 
    @FindBy(xpath="//*[@id=\"successId\"]/td/ul/li")
    WebElement sucesfulmessage;
    
   
    
    
	/**
	 * @return the master
	 */
	public WebElement getMaster() {
		return master;
	}


	/**
	 * @return the bankmaster
	 */
	public WebElement getBankmaster() {
		return bankmaster;
	}


	/**
	 * @return the createbank
	 */
	public WebElement getCreatebank() {
		return createbank;
	}
	
	/**
	 * @return the addbutton
	 */
	public WebElement getAddbutton() {
		return addbutton;
	}
	
	/**
	 * @return the clickokonalertmessage
	 */
	public WebElement getClickokonalertmessage() {
		return clickokonalertmessage;
	}


	/**
	 * @return the txtbankname
	 */
	public WebElement getTxtbankname() {
		return txtbankname;
	}


	/**
	 * @return the currency
	 */
	public WebElement getCurrency() {
		return currency;
	}


	


	/**
	 * @return the active
	 */
	public WebElement getActive() {
		return active;
	}



	/**
	 * @return the bankbranchcode
	 */
	public WebElement getBankbranchcode() {
		return bankbranchcode;
	}
	
	public WebElement getBranchcodeaster() {
		return branchcodeaster;
	}


	/**
	 * @return the bankbranchname
	 */
	public WebElement getBankbranchname() {
		return bankbranchname;
	}
	
	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return address;
	}


	/**
	 * @return the contactpersonname
	 */
	public WebElement getContactpersonname() {
		return contactpersonname;
	}


	/**
	 * @return the bankemail
	 */
	public WebElement getBankemail() {
		return bankemail;
	}


	/**
	 * @return the bankcontactnumber
	 */
	public WebElement getBankcontactnumber() {
		return bankcontactnumber;
	}


	/**
	 * @return the branchactive
	 */
	public WebElement getBranchactive() {
		return branchactive;
	}

	/**
	 * @return the master
	 */
	public WebElement getSubmit() {
		return submit;
	}
	
	


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
	

	/*public void setMaster() {
	master.click();
	}

	public void setBankmaster() {
	bankmaster.click();
	}

	public void setBankcreate() {
	createbank.click();
	}

	public void setTxtbankname(String bankname) {
	txtbankname.sendKeys(bankname);
	}
    
	public void setCurrency() {
	currency.click();
	}
	
    public void setCurrencyghs() {
	currencyghs.click();
	}
    
    public void setActive(){
    active.click();
    	}
    
    public void setyes() {
    statusYes.click();
    	}
    
    public void setBranchcode(String branchcode) {
	bankbranchcode.sendKeys(branchcode);
	}

	public void setBranchname(String branchname) {
	bankbranchname.sendKeys(branchname); 
	}


	public void setAddress(String branchaddress) {
    address.sendKeys(branchaddress);
	}

	public void setContactpersonname(String branchcontactperson) {
	contactpersonname.sendKeys(branchcontactperson);
	}

	
	public void setBankemail(String branchemail) {
	bankemail.sendKeys(branchemail);
	}

	
	public void setBankcontactnumber(String branchcontactnumber) {
	bankcontactnumber.sendKeys(branchcontactnumber);
	}
	
	public void setBranchActive() {
	branchactive.click();
	}
	
	public void setBranchdropdown() {
	branchstatus.click();
		}*/
		
}
