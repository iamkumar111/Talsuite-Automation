package com.HyreFox.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class menupage {

WebDriver ldriver;

	public menupage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using="(//span[@class='kt-menu__link-text'])[2]") 
	@CacheLookup
	WebElement leadershipBoard;

	@FindBy(how = How.XPATH, using="(//span[@class='kt-menu__link-text'])[3]") 
	@CacheLookup 
	WebElement dashboard;
	
	@FindBy(how = How.XPATH, using="(//span[@class='kt-menu__link-text'])[4]") 
	@CacheLookup 
	WebElement teamDashboard;
	
	@FindBy(how = How.XPATH, using="(//span[@class='kt-menu__link-text'])[5]") 
	@CacheLookup 
	WebElement dailyCommunications;
	
	@FindBy(how = How.XPATH, using="//span[text()='All Reports']")
	@CacheLookup 
	WebElement allReports;
	
	@FindBy(how = How.XPATH, using="(//span[text()='Candidates'])[1]")
	@CacheLookup 
	WebElement candidates;
	
	@FindBy(how = How.XPATH, using="//span[text()='Lost Candidates']") 
	@CacheLookup 
	WebElement lostCandidates;
	
	@FindBy(how = How.XPATH, using="//a[@href='/Billable']") 
	@CacheLookup 
	WebElement billables;
	
	@FindBy(how = How.XPATH, using="//span[text()='Internal DB']") 
	@CacheLookup 
	WebElement internalDB;

	@FindBy(how = How.XPATH, using="//span[text()='Employers']") 
	@CacheLookup 
	WebElement employers;

	@FindBy(how = How.XPATH, using="(//span[text()='Requirements'])[1]") 
	@CacheLookup 
	WebElement requirements;

	@FindBy(how = How.XPATH, using="//span[text()='Requirement Drives']") 
	@CacheLookup 
	WebElement requirementDrives;

	@FindBy(how = How.XPATH, using="//span[text()='Poster Configuration']") 
	@CacheLookup 
	WebElement posterConfiguration;
	
	@FindBy(how = How.XPATH, using="//span[text()='Tutorials']") 
	@CacheLookup 
	WebElement tutorials;
	
	@FindBy(how = How.XPATH, using="//span[text()='Import / Export Data']") 
	@CacheLookup 
	WebElement importExport;

	@FindBy(how = How.XPATH, using="//span[text()='Template']") 
	@CacheLookup 
	WebElement template;
	
	@FindBy(how = How.XPATH, using="//span[text()='Candidate Sub Stage']") 
	@CacheLookup 
	WebElement candidateSubStage;
	
	@FindBy(how = How.XPATH, using="//span[text()='Interview Stage']") 
	@CacheLookup 
	WebElement interviewStage;
	
	@FindBy(css=".flaticon-analytics") 
	@CacheLookup 
	WebElement analyticmenu;
	
	@FindBy(xpath="//i[@class='kt-menu__link-icon flaticon-users']/following-sibling::span[1]") 
	@CacheLookup 
	WebElement candidatemenu;
	
	@FindBy(xpath="//div[@id='kt_aside_menu']/ul/li[3]/a/i") 
	@CacheLookup 
	WebElement requiremenu;
	
	@FindBy(xpath="//i[@class='kt-menu__link-icon flaticon-settings-1']/following-sibling::span[1]") 
	@CacheLookup 
	WebElement adminmenu;
	

	@FindBy(xpath="//i[@class='kt-menu__link-icon flaticon-interface-1']/following-sibling::span[1]") 
	@CacheLookup 
	WebElement mastermenu;
	
	public void candidatemenu()
	{
		
		candidatemenu.click();
	}
	
	public void requiremenu()
	{
		requiremenu.click();
	}
	
	public void adminmenu()
	{
		adminmenu.click();
	}
	
	public void mastermenu()
	{
		mastermenu.click();
	}
	
	
	public void analyticmenu()
	{
		analyticmenu.click();
	}
	
	
	public void dashboard()
	{
		dashboard.click();
	}

	public void teamDashboard()
	{
		teamDashboard.click();
	}
	
	public void dailyCommunications()
	{
		teamDashboard.click();
	}
			
	public void candidates()
	{
		candidates.click();
	}
	
	public void allReports()
	{
		allReports.click();
	}
	
	public void lostCandidates()
	{
		lostCandidates.click();
	}
	
	public void billables()
	{
		billables.click();
	}
	
	public void internalDB()
	{
		internalDB.click();
	}
	
	public void employers()
	{
		employers.click();
	}
	
	public void requirements()
	{
		requirements.click();
	}
	
	public void requirementDrives()
	{
		requirementDrives.click();
	}
	
	public void posterConfiguration()
	{
		posterConfiguration.click();
	}
	
	public void tutorials()
	{
		tutorials.click();
	}
	
	public void importExport()
	{
		importExport.click();
	}
	
	public void template()
	{
		template.click();
	}
	
	public void candidateSubStage()
	{
		candidateSubStage.click();
	}
			
	public void interviewStage()
	{
		interviewStage.click();
	}
	
}
