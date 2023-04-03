package com.inetBanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.DeleteCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass {

	@Test
	public void deleteCustomer() throws InterruptedException
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
		
		DeleteCustomerPage deletecust= new DeleteCustomerPage(driver);
		
		deletecust.clickEditCustomer();
		
		deletecust.findCustId("37754");
		
		deletecust.findcustsubmit();
		
		
		Thread.sleep(3000);
		
		String s = driver.switchTo().alert().getText();
		if (s.equalsIgnoreCase("customer deleted Successfully"))
		{
			Assert.assertTrue(true);
			
			
		}
		else
		{
			Assert.assertTrue(false);
		}	
		
		//System.out.println("Alert Text " + s);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		/*
		 * editcust.custName("Priya"); editcust.custGender("Female");
		 * editcust.custdob("10","12","1975"); Thread.sleep(3000);
		 */
	/*	editcust.custaddress("India");
		editcust.custcity("Chennai");
		editcust.custstate("Tamilnadu");
		editcust.custpinno("609001");
		editcust.custtelephoneno("9443390330");
		
		editcust.custemailid(randomstring()+"@gmail.com");
		//editcust.custpassword("abcdef");
		editcust.custsubmit();
		
		Thread.sleep(3000);
		
		driver.get("file:///C:/path/alerts.html"); Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click(); 
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert(); 
		System.out.println("Alert Text" + alert.getText());
		alert.accept();
		String S = driver.findElement(By.xpath("//p[contains(text(),'Customer details updated Successfully!!!')]")).getText().toString();
		System.out.println(S);
		//p[contains(text(),'Customer details updated Successfully!!!')]
	//	String res = driver.getPageSource().concat("Customer Registered Successfully!!!");
		
		if (S.equalsIgnoreCase("Customer details updated Successfully!!!"))
		{
			Assert.assertTrue(true);
			
			
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		
		 * if (res == true) { Assert.assertTrue(true);
		 * 
		 * } else { Assert.assertTrue(false); }
		 
			
	}
	
	public String randomstring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}*/
	}
}
/*
 * {
 * 
 * WebDriver driver; String baseURL="http://demo.guru99.com/v3/index.php";
 * String userName="mngr329201"; String password="rYjYduq";
 * 
 * public TC_EditCustomerTest_004() throws InterruptedException {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Selenium\\eclipse\\chromedriver_win32_v90\\chromedriver.exe"); driver=
 * new ChromeDriver();
 * 
 * driver.get(baseURL);
 * 
 * driver.findElement(By.name("uid")).sendKeys(userName);
 * driver.findElement(By.name("password")).sendKeys(password);
 * driver.findElement(By.name("btnLogin")).submit();
 * 
 * driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[3]/a[1]"
 * )).click();
 * 
 * Thread.sleep(1000);
 * 
 * driver.findElement(By.name("cusid")).sendKeys("88402"); Thread.sleep(1000);
 * driver.findElement(By.name("AccSubmit")).click();
 * 
 * Thread.sleep(3000); driver.findElement(By.name("addr")).clear();
 * driver.findElement(By.name("addr")).sendKeys("125 Eversyde Blvd SW");
 * driver.findElement(By.name("city")).clear();
 * driver.findElement(By.name("city")).sendKeys("Calgary");
 * driver.findElement(By.name("state")).clear();
 * driver.findElement(By.name("state")).sendKeys("Alberta");
 * driver.findElement(By.name("pinno")).clear();
 * driver.findElement(By.name("pinno")).sendKeys("900061");
 * driver.findElement(By.name("telephoneno")).clear();
 * driver.findElement(By.name("telephoneno")).sendKeys("5879171876");
 * driver.findElement(By.name("emailid")).clear();
 * driver.findElement(By.name("emailid")).sendKeys("aaa@yahoo.com");
 * 
 * Thread.sleep(3000); driver.findElement(By.name("sub")).click();
 * 
 * }
 */
