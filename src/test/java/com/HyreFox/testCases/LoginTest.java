package com.HyreFox.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void logintest() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("open hyrefox");
		lp.setUserName(username);
		logger.info("Enter Username");
		lp.setPassword(password);
		logger.info("Enter Password");
		lp.clickbtn();
		logger.info("Try to Login");
		Thread.sleep(5000);
		//otpPage lp2=new otpPage(driver);
		//logger.info("Enter OTP");
		//lp2.otpsubmit();
		if(driver.getTitle().equals("Hyrefox |"))
		{
			logger.info("Login Fail : Wrong OTP");
			captureScreen(driver, "logintest");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Success : Welcome to Dashboard");
		}
		}
}