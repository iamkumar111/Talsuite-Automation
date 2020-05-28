package com.HyreFox.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployerDetailsPage {
WebDriver ldriver;
	
	public EmployerDetailsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath="//i[@class='fa fa-info-circle']") @CacheLookup WebElement Emp_Details;
	public void Emp_details()
	{
		Emp_Details.click();
	}
	@FindBy(xpath="//button[@class=\"btn btn-sm btn-info\"]") @CacheLookup WebElement Edit_Employer;
	public void Edit_Employer()
	{
		Edit_Employer.click();
	}
	@FindBy(xpath="//i[@class='btn-edit-employer-user']") @CacheLookup WebElement Edit_User;
	public void Edit_User()
	{
		Edit_User.click();
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-paperclip']") private WebElement Documents;
	public void Documents()
	{
		Documents.click();
	
	}
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-suitcase']") private WebElement Requirements;
	public void Requirements()
	{
		Requirements.click();
	
	}
	@FindBy(how = How.XPATH, using="//a[@href='#tabCandidatelist']") private WebElement Candidates;
	public void Candidates()
	{
		Candidates.click();
	
	}
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-external-link-alt')]") private WebElement Popout;
	public void Popout()
	{
		Popout.click();
	
	}

}
