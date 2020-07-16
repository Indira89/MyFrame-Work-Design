package com.MyStore.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	@CacheLookup
	WebElement btnSignIn;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="passwd")
	@CacheLookup
	WebElement txtPassWord;
	
	@FindBy(id="SubmitLogin")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickSignin()
	{
		btnSignIn.click();
	}
	
	public void setUsername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassWord.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}

}
