package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Idriver;
	public LoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	//= Idriver.findElement(By.id("uid"));
	
	@FindBy(name="password")
	WebElement txtpassword;

	@FindBy(name="btnLogin")
	WebElement btnLogin;



public void setUserName(String uname)
{
	txtUserName.sendKeys(uname);
}
public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public String getUserName()
{
	return txtUserName.getAttribute("value");
}
public void clickSubmit()
{
	btnLogin.click();
}
}