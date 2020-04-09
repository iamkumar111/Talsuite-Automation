package com.HyreFox.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class otpPage {
	

WebDriver ldriver;
	
	public otpPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="signup_button")
	@CacheLookup
	WebElement otpSubmit;

	public void otpsubmit()
	{
		otpSubmit.click();
	}
}

