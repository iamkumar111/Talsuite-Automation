package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CandidateFollowupEditPage
{
	WebDriver ldriver;

	public CandidateFollowupEditPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//p[contains(text(),'H3834')]") @CacheLookup WebElement CandidateId;
	public void CandidateId()
	{
		CandidateId.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////Edit/////////////////////////////////////////////////////////
	@FindBy(how = How.CSS, using=".fa-info-circle") @CacheLookup WebElement Edit_Candidate;
	public void Edit_Candidate() throws InterruptedException
	{
		Edit_Candidate.click();
		Thread.sleep(5000);
		ldriver.findElement(By.cssSelector("#btn-edit-candidate")).click();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	}

