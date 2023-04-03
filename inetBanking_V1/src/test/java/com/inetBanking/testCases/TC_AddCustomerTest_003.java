package com.inetBanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\eclipse\\chromedriver_win32_v90\\chromedriver.exe");
		//System.getProperty("user.dir")+"//Drivers//firefox.exe");		
		/*readconfig.getchromepath());*/
		//driver=new ChromeDriver();
		
		driver.get(baseURL);
		System.out.println(baseURL);
		/*
		 * LoginPage lp= new LoginPage(driver); lp.setUserName(username);
		 * lp.setPassword(password);
		 * 
		 * lp.clickSubmit();
		 */
		
		TC_LoginTest_001 login = new TC_LoginTest_001();
		
		login.loginTest();
		Thread.sleep(7000);
		
		AddCustomerPage addcust= new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		addcust.custName("Thomas");
		addcust.custGender("male");
		addcust.custdob("5","11","1982");
		Thread.sleep(3000);
		addcust.custaddress("100 new Street");
		addcust.custcity("Chennai");
		addcust.custstate("Tamilnadu");
		addcust.custpinno("609001");
		addcust.custtelephoneno("9117992356");
		
		addcust.custemailid(randomstring()+"@gmail.com");
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		//String res = driver.getPageSource().concat("Customer Registered Successfully!!!");
		String S = driver.findElement(By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]")).getText().toString();
		
		
		if (S.equalsIgnoreCase("Customer Registered Successfully!!!")) {
			Assert.assertTrue(true);}
			
			else
			{Assert.assertTrue(false);
				
		}
		
		String id= driver.findElement(By.xpath("//tbody/tr[4]/td[2]")).getText().toString();
		
		System.out.println("Customer Id" + id);
	
		
		/*
		 * if (res == true) { Assert.assertTrue(true);
		 * 
		 * } else { Assert.assertTrue(false); }
		 */
			
	}
	
	public String randomstring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}

}
