package com.inetBanking.testCases;

import org.testng.annotations.Test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.AddNewAccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewAccountTest_006 extends BaseClass {
	@Test
	public void addNewAccount() throws InterruptedException
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
		Thread.sleep(2000);
		
		AddNewAccountPage addacct= new AddNewAccountPage(driver);
		
		addacct.clickNewAccount();
		addacct.custid("37754");
		addacct.acctype("Savings");
		addacct.initialdep("5000");
		
		addacct.submit();
		
		Thread.sleep(3000);
//		String res = driver.getPageSource().concat("Customer Registered Successfully!!!");
		
		/*
		 * if (res == true) { Assert.assertTrue(true);
		 * 
		 * } else { Assert.assertTrue(false); }
		 */
			

	}
}


