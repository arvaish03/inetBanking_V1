package com.inetBanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.EditAccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditAccountTest_008 extends BaseClass {
	@Test
	public void editAccount() throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\eclipse\\chromedriver_win32_v90\\chromedriver.exe");
		//System.getProperty("user.dir")+"//Drivers//firefox.exe");		
		/*readconfig.getchromepath());*/
		//driver=new ChromeDriver();
		
		driver.get(baseURL);
		System.out.println(baseURL);
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		
		Thread.sleep(7000);
		
		EditAccountPage editacct= new EditAccountPage(driver);
		
		editacct.clickEditAccount();
		editacct.accountno("97707");
	
		editacct.submit();
		
	
		
		Thread.sleep(3000);
	
		editacct.acctype("Savings");
		//editacct.balance("6000");
		
		
		
		Thread.sleep(5000);
		
		editacct.submitBal();
//		String res = driver.getPageSource().concat("Customer Registered Successfully!!!");
		
		/*
		 * if (res == true) { Assert.assertTrue(true);
		 * 
		 * } else { Assert.assertTrue(false); }
		 */
			

	}
}


