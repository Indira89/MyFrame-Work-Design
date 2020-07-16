package com.MyStore.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		logger.info("User opened URL");
		LoginPage lp=new LoginPage(driver);
		
		lp.clickSignin();
		logger.info("User entered into signin page");
		lp.setUsername(username);
		logger.info("User entered username");
		lp.setPassword(password);
		logger.info("User entered password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("My account - My Store123"))
		{
			Assert.assertTrue(true);
			logger.info("Login function passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login function failed");
		}
	}

}
