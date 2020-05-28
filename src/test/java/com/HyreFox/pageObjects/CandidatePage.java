package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CandidatePage {
	WebDriver ldriver;

	public CandidatePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.CSS, using="button#kt_sidebar_toggler_btn") @CacheLookup WebElement search;
	public void search()
	{
		search.click();
	}
	@FindBy(how = How.CSS, using="div#filterKeywordType>button") @CacheLookup WebElement fitlerDataOption;
	public void fitlerDataOption(String br)
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(fitlerDataOption).click().perform();
		actions.moveToElement(ldriver.findElement(By.linkText(br))).click().perform();
	}
	@FindBy(how = How.ID, using="filterOther") @CacheLookup WebElement filterDatavariable;
	public void fitlerData(String br)
	{
		filterDatavariable.sendKeys(br);
	}
	@FindBy(how = How.ID, using="btnFilter_apply") @CacheLookup WebElement fILTER;
	public void applyfilter() 
	{
		fILTER.click();
	}
	@FindBy(how = How.ID, using="btnFilter_reset") @CacheLookup WebElement reset;
	public void reset() 
	{
		reset.click();
	}
	

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.CLASS_NAME, using="flaticon-add") @CacheLookup WebElement addcandidate;
	public void addcandidate()
	{
		addcandidate.click();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.CLASS_NAME, using="(//i[@class='flaticon2-refresh'])[1]") @CacheLookup WebElement refresh;
	public void refresh()
	{
		refresh.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[@class='flaticon-suitcase'])[1]") @CacheLookup WebElement Requirement_Details;
	public void Requirement_Details()
	{
		Requirement_Details.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////*****************************Search By Requirement*********************************//////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="candidateTabFilter-selectedText") @CacheLookup WebElement RequirementSearchBY;
	public void RequirementSearchBY()
	{
		RequirementSearchBY.click();
	}
	@FindBy(how = How.XPATH, using="(//div[@class='filter-option-inner-inner'])[1]") @CacheLookup WebElement Requirements;
	public void Requirements()
	{
		Requirements.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.LINK_TEXT, using="ALL") @CacheLookup WebElement aLL;
	public void aLL()
	{
		aLL.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.LINK_TEXT, using="Today") @CacheLookup WebElement today;
	public void today()
	{
		today.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-calendar-1 mr-0']") @CacheLookup WebElement yesterday;
	public void yesterday()
	{
		yesterday.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-stopwatch mr-0']") @CacheLookup WebElement pending;
	public void pending()
	{
		pending.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-multimedia-2 mr-0']") @CacheLookup WebElement Unread_Email;
	public void Unread_Email()
	{
		Unread_Email.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-cancel mr-0']") @CacheLookup WebElement Lost_Duplicate;
	public void Lost_Duplicate()
	{
		Lost_Duplicate.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-customer mr-0']") @CacheLookup WebElement Lead_Candidate_is_Interested;
	public void Lead_Candidate_is_Interested()
	{
		Lead_Candidate_is_Interested.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-refresh mr-0']") @CacheLookup WebElement Recycle_Candidate_Response_Pending;
	public void Recycle_Candidate_Response_Pending()
	{
		Recycle_Candidate_Response_Pending.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-folder-1 mr-0']") @CacheLookup WebElement Archived;
	public void Archived()
	{
		Archived.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-share mr-0']") @CacheLookup WebElement Social;
	public void Social()
	{
		Social.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.CLASS_NAME, using="flaticon-confetti") @CacheLookup WebElement Rediscover;
	public void Rediscover()
	{
		Rediscover.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
}
