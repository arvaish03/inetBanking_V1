package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewAccountPage {
	
	WebDriver Idriver;
	public AddNewAccountPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(how = How.XPATH, using ="//a[contains(text(),'New Account')]")
		 @CacheLookup
		 WebElement lnkNewAccount;
		
		@FindBy(how = How.NAME, using ="cusid")	
		@CacheLookup
		WebElement txtCustid ;
		//=Idriver.findElement(By.name("name"));
		//.sendKeys("gcrindia");
		
		@FindBy(how=How.NAME, using ="selaccount")
		@CacheLookup
		WebElement acctype;
		
		@FindBy(how=How.NAME, using="inideposit")
		@CacheLookup
		WebElement txtinidep;
		
		
		@FindBy(how = How.NAME, using ="button2")	
		@CacheLookup
		WebElement btnsub ;
		
		public void clickNewAccount() {
			lnkNewAccount.click();
		}
		
		
		
		public void custid(String cid) {
			txtCustid.sendKeys(cid);
		}

		public void acctype(String actype) {
			acctype.sendKeys(actype);
		}
		public void initialdep(String intdep) {
			txtinidep.sendKeys(intdep);
		}	
		
		
		
		public void submit() {
			btnsub.click();
		}
		
	
	

}
