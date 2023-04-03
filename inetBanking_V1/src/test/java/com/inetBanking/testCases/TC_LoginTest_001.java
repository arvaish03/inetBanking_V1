package com.inetBanking.testCases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

			@Test 
			public void loginTest() throws InterruptedException
			{
				driver.get(baseURL);
				System.out.println(baseURL);
				//logger.info("URL is opened");
				
			//	System.out.println(driver.getCurrentUrl());
				LoginPage lp=new LoginPage(driver);
			//	System.out.println(driver.getPageSource());
			//	System.out.println(driver.getWindowHandle());
				lp.setUserName(username);
				//logger.info("Entered username");
				lp.setPassword(password);
				//logger.info("Entered password");
		//		System.out.println(lp.getUserName());
				
			    Thread.sleep(1000);
				lp.clickSubmit();
				System.out.println(driver.getTitle());
				if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
				{
					System.out.println("Get the title");			
					AssertJUnit.assertTrue(true);
					//logger.info("Login Test passed");
					
				}
				else
				{
					AssertJUnit.assertTrue(false);
					//logger.info("Login Test failed");
				}
				
				/*WebElement mgrTitle=driver.findElements_by_xpath('//marquee[contains(text(),"Welcome To Manager"'"s Page of Guru99 Bank")]'));
				String title = mgrTitle.getText();
				if (title.equals("Welcome To Manager's Page of Guru99 Bank"))
				{
					System.out.println("Manager's home page");
					AssertJUnit.assertTrue(true);
					
				}
				else
				{
					AssertJUnit.assertTrue(false);
				}*/
			}
	
	}
	
	

