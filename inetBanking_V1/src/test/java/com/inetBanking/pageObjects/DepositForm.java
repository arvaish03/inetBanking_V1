package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DepositForm {
	
	WebDriver driver;
	public DepositForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		
		
	
		
		By accno= By.cssSelector("[name='accountno']");
		By bal= By.cssSelector("[name='balance']");
		By desc= By.cssSelector("[name='desc']");
		By submit=By.cssSelector("[name='Accsubmit']");
		
		public WebElement getAccountNo() 
 {
		return driver.findElement(accno);
		}

		public WebElement getBalance() {
			return driver.findElement(bal);
					
		}
		public WebElement getDesc() {
			return driver.findElement(desc);
		}	
		
		public WebElement getSubmit() {
			
			return driver.findElement(submit);
		}
		

		
	
	

}
