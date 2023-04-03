package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
	
	WebDriver Idriver;
	public DeleteAccountPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(how = How.XPATH, using ="//a[contains(text(),'Delete Account')]")
		 @CacheLookup
		 WebElement lnkDeleteAccount;
		
		@FindBy(how = How.NAME, using ="accountno")	
		@CacheLookup
		WebElement txtaccno;
		//=Idriver.findElement(By.name("name"));
		//.sendKeys("gcrindia");
		
		@FindBy(how = How.NAME, using ="AccSubmit")	
		@CacheLookup
		WebElement btnsub;
		
		
	  
		
		public void clickDeleteAccount() {
			lnkDeleteAccount.click();
		}
		
		
		
		public void accountno(String accno) {
			txtaccno.sendKeys(accno);
		}

	
		
		
		
		public void submit() {
			btnsub.click();
		}
		
		
		
	

}
