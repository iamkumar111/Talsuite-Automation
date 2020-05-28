package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Employerspage {
WebDriver ldriver;

	
	public Employerspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using="ALL") private WebElement all;
	public void all() 
	{
		all.click();
	}
	@FindBy(how = How.LINK_TEXT, using="Today") private WebElement today;
	public void today() 
	{
		today.click();
	}
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-calendar-1 mr-0']") private WebElement yesterday;
	public void yesterday() 
	{
		yesterday.click();
	}
	@FindBy(how = How.XPATH, using="//i[@class='flaticon-multimedia-2 mr-0']") private WebElement unReadEmail;
	public void unReadEmail() 
	{
		unReadEmail.click();
	}
	@FindBy(how = How.CSS, using=".flaticon-search") private WebElement empSearch;
	public void empsearch() 
	{
		empSearch.click();
	}
	@FindBy(how = How.XPATH, using="(//i[@class='flaticon2-refresh'])[1]") private WebElement refresh;
	public void refresh() 
	{
		refresh.click();
	}
	@FindBy(how = How.XPATH, using="(//i[@class='flaticon2-refresh'])[3]") private WebElement Refresh1;
	public void refresh1() 
	{
		Refresh1.click();
	}
	@FindBy(how = How.XPATH, using="//input[@id='IsCompleted']/following-sibling::span[1]") private WebElement Showcomplete;
	public void Showcomplete() 
	{
		Showcomplete.click();
	}
	@FindBy(how = How.LINK_TEXT, using="Todo List") private WebElement todoList;
	public void todoList() 
	{
		todoList.click();
	}
	@FindBy(how = How.LINK_TEXT, using="Filters") private WebElement filtersoption;
	public void filtersoption() 
	{
		filtersoption.click();
	}
	@FindBy(how = How.ID, using="filterEmployerTypeID") private WebElement filterEmployerTypeID;
	public void filterEmployerTypeID(String br)
	{
		Select FilterEmployerTypeID= new Select(filterEmployerTypeID);
		FilterEmployerTypeID.selectByValue(br);
	}

	@FindBy(how = How.ID, using="filterIndustryID") private WebElement filterIndustryID;
	public void filterIndustryID(String br)
	{
		Select FilterIndustryID= new Select(filterIndustryID);
		FilterIndustryID.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterEmployerStageID") private WebElement filterEmployerStageID;
	public void filterEmployerStageID(String br)
	{
		Select FilterEmployerStageID= new Select(filterEmployerStageID);
		FilterEmployerStageID.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterEmployerSubStageID") private WebElement filterEmployerSubStageID;
	public void filterEmployerSubStageID(String br)
	{
		Select filterEmployerSubStageIDv= new Select(filterEmployerSubStageID);
		filterEmployerSubStageIDv.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterInterviewScheduledCBO") private WebElement notScheduled;
	public void notScheduled(String br)
	{
		Select notScheduledv= new Select(notScheduled);
		notScheduledv.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterInterviewAttendedCBO") private WebElement notAttended;
	public void filterInterviewAttendedCBO(String br)
	{
		Select notAttendedv= new Select(notAttended);
		notAttendedv.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterAddedOnFrom") private WebElement DateFrom;
	public void DateFrom(String br)
	{
		Select DateFromv= new Select(DateFrom);
		DateFromv.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterAddedOnTo") private WebElement DateTo;
	public void DateTo(String br)
	{
		Select DateTov= new Select(DateTo);
		DateTov.selectByValue(br);
	}
	@FindBy(how = How.ID, using="filterVendorUserID") private WebElement filterVendorUserID;
	public void filterVendorUserID(String br)
	{
		Select filterVendorUserIDv= new Select(filterVendorUserID);
		filterVendorUserIDv.selectByValue(br);
	}
	
	@FindBy(how = How.CSS, using="div#filterKeywordType>button") private WebElement fitlerDataOption;
	public void fitlerDataOption(String br)
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(fitlerDataOption).click().perform();
		actions.moveToElement(ldriver.findElement(By.linkText(br))).click().perform();
	}
	@FindBy(how = How.ID, using="filterOther") private WebElement filterDatavariable;
	public void fitlerData(String br)
	{
		filterDatavariable.sendKeys(br);
	}
	@FindBy(how = How.ID, using="btnFilter_apply") private WebElement fILTER;
	public void applyfilter() 
	{
		fILTER.click();
	}
	@FindBy(how = How.ID, using="btnFilter_reset") private WebElement reset;
	public void reset() 
	{
		reset.click();
	}
	

}
