package com.inetBanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.DepositForm;
import com.inetBanking.pageObjects.LoginPage;


public class TC_DepositFormTest extends BaseClass
{
	
	
		@BeforeTest
		
		public void initalize() throws IOException, InterruptedException
		{
			driver.get(baseURL);
			System.out.println(baseURL);
			LoginPage lp= new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			
			lp.clickSubmit();
			Thread.sleep(2000);
		
		}
		@Test
		
		public void depositForm()
		{
			DepositForm depForm= new DepositForm(driver);
			depForm.getAccountNo().sendKeys("97707");
			depForm.getBalance().sendKeys("5000");
			depForm.getDesc().sendKeys("Salary");
			
			depForm.getSubmit().click();
		}
		    
		    @AfterTest
		    
		    public void teardown()
		    {
		    	driver.close();
		    }

}
