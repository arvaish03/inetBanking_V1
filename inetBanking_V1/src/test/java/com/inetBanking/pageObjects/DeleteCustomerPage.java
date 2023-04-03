package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver Idriver;
	public DeleteCustomerPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[4]/a[1]")
	 @CacheLookup
	 WebElement lnkDeleteCustomer;
	
	@FindBy(how=How.NAME, using ="cusid")
	@CacheLookup
	WebElement txtCustid;
	
	@FindBy(how=How.NAME, using ="AccSubmit")
	@CacheLookup
	WebElement btnfind;
	
	/*
	 * @FindBy(how = How.NAME, using ="name")
	 * 
	 * @CacheLookup WebElement txtCustomerName ;
	 * //=Idriver.findElement(By.name("name")); //.sendKeys("gcrindia");
	 * 
	 * @FindBy(how=How.NAME, using ="rad1")
	 * 
	 * @CacheLookup WebElement rdGender;
	 * 
	 * @FindBy(how=How.NAME, using="dob")
	 * 
	 * @CacheLookup WebElement txtdob;
	 */
	
	/*
	 * @FindBy(how=How.NAME, using="city")
	 * 
	 * @CacheLookup WebElement txtcity;
	 * 
	 * @FindBy(how=How.NAME, using="addr")
	 * 
	 * @CacheLookup WebElement txtaddr;
	 * 
	 * 
	 * 
	 * @FindBy(how=How.NAME, using="state")
	 * 
	 * @CacheLookup WebElement txtstate;
	 * 
	 * @FindBy(how=How.NAME, using="pinno")
	 * 
	 * @CacheLookup WebElement txtpin;
	 * 
	 * @FindBy(how=How.NAME, using="telephoneno")
	 * 
	 * @CacheLookup WebElement txtphoneno;
	 * 
	 * 
	 * 
	 * @FindBy(how=How.NAME, using="emailid")
	 * 
	 * @CacheLookup WebElement txtemailid;
	 */
	
	
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement btnsub;

	@FindBy(how=How.NAME, using="res")
	@CacheLookup
	WebElement btnres;
	
	public void clickEditCustomer() {
		lnkDeleteCustomer.click();
	}
	
	public void findCustId(String cid) {
		txtCustid.sendKeys(cid);
	}
	
	
	/*
	 * public void custName(String cname) { txtCustomerName.sendKeys(cname); }
	 * 
	 * public void custGender(String cgender) { rdGender.click(); }
	 * 
	 * 
	 * public void custdob(String mm,String dd,String yy) { txtdob.sendKeys(mm);
	 * txtdob.sendKeys(dd); txtdob.sendKeys(yy);
	 * 
	 * }
	 */
	/*
	 * public void custaddress(String caddress) { txtaddr.clear();
	 * txtaddr.sendKeys(caddress); }
	 * 
	 * public void custcity(String ccity) { txtcity.clear();
	 * txtcity.sendKeys(ccity); } public void custstate(String cstate) {
	 * txtstate.clear(); txtstate.sendKeys(cstate);
	 * 
	 * }
	 * 
	 * public void custpinno(String cpinno) { txtpin.clear();
	 * txtpin.sendKeys(cpinno); } public void custtelephoneno(String ctelephoneno) {
	 * txtphoneno.clear();
	 * 
	 * txtphoneno.sendKeys(ctelephoneno);
	 * 
	 * } public void custemailid(String cemailid) { txtemailid.clear();
	 * txtemailid.sendKeys(cemailid);
	 * 
	 * }
	 */

	/*
	 * public void custpassword(String cpassword) { txtpwd.sendKeys(cpassword);
	 * 
	 * }
	 */
	public void custsubmit() {
		btnsub.click();
	}
	public void findcustsubmit() {
		btnfind.click();
	}

}
