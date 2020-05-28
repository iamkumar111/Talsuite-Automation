package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CandidateInternalDBPage 
{
	WebDriver ldriver;

	public CandidateInternalDBPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void filter() throws InterruptedException 
	{
	ldriver.findElement(By.className("flaticon-grid-menu")).click();
	Thread.sleep(3000);
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
	public void applyfilter() throws InterruptedException 
	{
		fILTER.click();
		Thread.sleep(5000);
	}
	@FindBy(how = How.ID, using="btnFilter_reset") @CacheLookup WebElement reset;
	public void reset() throws InterruptedException 
	{
		//reset.click();
		ldriver.findElement(By.cssSelector("a#kt_quick_sidebar_close_btn")).click();
		Thread.sleep(2000);
	}
	public void CandidateId(String text) throws InterruptedException 
	
	{
		String id="(//p[contains(text(),"+text+")])";
		WebElement CandidateId=ldriver.findElement(By.xpath(id));
		CandidateId.click();
		Thread.sleep(3000);
	}
	 public void AddToRequiremnent() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 ldriver.findElement(By.xpath("//i[@class='fa fa-cogs']")).click();
		 Thread.sleep(4000);
		 ldriver.findElement(By.id("btnAddSelectedToReq")).click();
		 Actions actions = new Actions(ldriver);
		 WebElement nothingSelected = ldriver.findElement(By.xpath("(//div[@class='filter-option-inner-inner'])[2]"));	
		 actions.moveToElement(nothingSelected).click().sendKeys("H1820").sendKeys(Keys.ENTER).perform();
		 //ldriver.findElement(By.xpath("//button[text()='Add']")).click();
		 ldriver.findElement(By.xpath("(//button[text()='Close'])[1]")).click();
		 Thread.sleep(5000);
		 ldriver.findElement(By.id("kt_quick_comms_close_btn")).click();
	 }
	 	
}

	
	