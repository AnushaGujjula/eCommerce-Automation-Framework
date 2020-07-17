package com.eCommerce.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.eCommerce.pageobjects.LoginPage;

import junit.framework.Assert;

public class TC_Login_03 extends BaseClass
{
  	@Test
	public void login() throws IOException
	{
        //Create a login page object to call its methods.
  		LoginPage lp=new LoginPage(driver);  
  		
  		lp.clickAccount();
  		logger.info("Clicked on account tab");
		lp.clickSignIn();
		logger.info("On account tab, clicked on sign-in");
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);	
		logger.info("Entered Password");
		lp.signIn();
		logger.info("Clicked sign-in");
		
		// verify the title of page to ensure successful login.
		if(lp.robotLogin().equals("Help us keep your account safe by clicking on the checkbox below."))
		{
			captureScreen(driver,"loginError");
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
		}
 	}
}
