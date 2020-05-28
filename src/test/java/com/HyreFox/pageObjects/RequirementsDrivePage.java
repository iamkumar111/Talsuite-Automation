package com.HyreFox.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.HyreFox.testCases.BaseClass;

public class RequirementsDrivePage extends BaseClass{
WebDriver ldriver;
	
	public RequirementsDrivePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.ID, using="kt_create_toggler_btn") private WebElement create;
	public void create()
	{
		create.click();
	}
	@FindBy(how = How.XPATH, using="//a[contains(@class,'btn btn-clean')]") private WebElement refresh;
	public void refresh()
	{
		refresh.click();
	}
	@FindBy(how = How.ID, using="RequirementID") private WebElement requirementID;
	public void requirementID(String id)
	{
		Select RequirementID= new Select(requirementID);
		RequirementID.selectByValue(id);
	}
	@FindBy(how = How.ID, using="Datestamp") private WebElement Date;
	public void Date(String id)
	{
		Date.sendKeys(id);
	}
	@FindBy(how = How.ID, using="Timestamp") private WebElement Time;
	public void time(String id)
	{
		Time.sendKeys(id);
	}
	@FindBy(how = How.ID, using="Comment") private WebElement Comment;
	public void comment(String id)
	{
		Comment.sendKeys(id);
	}
	@FindBy(how = How.XPATH, using="//button[@class='btn btn-brand']") private WebElement save;
	public void save()
	{
		save.click();
	}
	@FindBy(how = How.XPATH, using="//button[@class='btn btn-secondary']") private WebElement cancel;
	public void cancel()
	{
		cancel.click();
	}
	@FindBy(css=".kt-datatable__cell--center:nth-child(2) .btn-hover-brand > .la") @CacheLookup WebElement edit;
	public void edit()
	{
		edit.click();
		
	}
	
	@FindBy(xpath="//span[contains(text(),'WIPRO - React Native Developer (H2899)')]/parent::td//following-sibling::td//i[@class='la la-trash']") @CacheLookup WebElement delete;
	public void delete()
	{
		 delete.click();
	}
	@FindBy(xpath="//span[contains(text(),'ABC  - Java Developer (H1820)')]/parent::td//preceding-sibling::td//i[@class='fa fa-caret-right']") @CacheLookup WebElement scroll;
	public void scroll()
	{
		scroll.click();
	}
	@FindBy(xpath="//*[@id=\"kt_create\"]/div/div/div/h3") @CacheLookup WebElement title;
	public void title()
	{
		title.click();
	}
	
	
}
