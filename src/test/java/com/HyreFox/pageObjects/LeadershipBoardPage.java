package com.HyreFox.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadershipBoardPage 
{	
	

WebDriver ldriver;
	
	public LeadershipBoardPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Month")
	@CacheLookup
	WebElement Month;

			
	public void updatemonth(String br)
	{
		Select month= new Select(Month);
		month.selectByValue(br);
	}

	
	

}
