package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
	
	WebDriver Idriver;
	public EditAccountPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(how = How.XPATH, using ="//a[contains(text(),'Edit Account')]")
		 @CacheLookup
		 WebElement lnkEditAccount;
		
		@FindBy(how = How.NAME, using ="accountno")	
		@CacheLookup
		WebElement txtaccno;
		//=Idriver.findElement(By.name("name"));
		//.sendKeys("gcrindia");
		
		@FindBy(how = How.NAME, using ="AccSubmit")	
		@CacheLookup
		WebElement btnsub;
		
		@FindBy(how = How.NAME, using ="a_type")	
		@CacheLookup
		WebElement txtacctype ;
				
		@FindBy(how = How.XPATH, using ="//tbody/tr[21]/td[2]/input[1]\r\n"
				+ "")	
		@CacheLookup
		WebElement btnSubmit;

		public void clickEditAccount() {
			lnkEditAccount.click();
		}
	
		public void accountno(String accno) {
			txtaccno.sendKeys(accno);
		}

		public void submit() {
			btnsub.click();
		}

		public void acctype(String type) {
			txtacctype.sendKeys(type);
		}
		
		public void submitBal() {
			btnSubmit.click();
		}

}
