package com.HyreFox.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateRequirementsPage 
{
	
WebDriver ldriver;

	
	public CreateRequirementsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how = How.ID, using="kt_content") 
	@CacheLookup private WebElement allotted;
	public void allotted()
	{
		allotted.click();
	}
	
	@FindBy(how = How.LINK_TEXT, using="All") 
	@CacheLookup private WebElement all;
	public void all()
	{
		all.click();
	}

	@FindBy(how = How.ID, using="allTracker") 
	@CacheLookup private WebElement allTrackers;
	public void allTracker()
	{
		allTrackers.click();
	}

	@FindBy(how = How.ID, using="overallTracker") 
	@CacheLookup private WebElement overallTracker;
	public void overallTracker()
	{
		overallTracker.click();
		
	}

	@FindBy(how = How.LINK_TEXT, using="Create") 
	@CacheLookup private WebElement create;
	public void Create()
	{
		create.click();
	}

	@FindBy(how = How.LINK_TEXT, using="Edit") 
	@CacheLookup private WebElement edit;
	public void edit()
	{
		edit.click();
	}

	@FindBy(how = How.ID, using="EmployerUserID") 
	@CacheLookup private WebElement employerUserID;
	public void employerUserID(String id)
	{
		Select employeruserID= new Select(employerUserID);
		employeruserID.selectByValue(id);
	}

	@FindBy(how = How.ID, using="JobTitle") 
	@CacheLookup private WebElement jobTitle;
	public void Jobtitle(String id)
	{
	jobTitle.sendKeys(id);
	}
	@FindBy(how = How.ID, using="RequirementTypeID") 
	@CacheLookup private WebElement RequirementTypeID;
	public void requirementTypeID(String id)
	{
		Select requirementTypeID= new Select(RequirementTypeID);
		requirementTypeID.selectByValue(id);
	}
	@FindBy(how = How.ID, using="KeyPointers") 
	@CacheLookup private WebElement keyPointers;
	public void keypointers	(String id)
	{
	keyPointers.sendKeys(id);
	}
	
	@FindBy(how = How.CLASS_NAME, using="note-editable") 
	@CacheLookup private WebElement noteEditable;
	public void jobdescription	(String id)
	{
	noteEditable.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="Keywords") 
	@CacheLookup private WebElement Keywords;
	public void keywords(String id)
	{
	Keywords.sendKeys(id);
	}
	
	@FindBy(how = How.XPATH, using="//button[contains(@class,'btn btn-brand')]") 
	@CacheLookup private WebElement nextStep;
	public void NextStep()
	{
	nextStep.click();
	}
	
	@FindBy(how = How.ID, using="WorkExMin") @CacheLookup 
	private WebElement WorkExMin;
	public void WorkExMin(String id)
	{
	WorkExMin.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="WorkExMax") @CacheLookup 
	private WebElement WorkExMax;
	public void WorkExMax(String id)
	{
	WorkExMax.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="CTCMinL") @CacheLookup 
	private WebElement CTCMinL;
	public void CTCMinL(String id)
	{
	CTCMinL.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="CTCMinK") @CacheLookup 
	private WebElement CTCMinK;
	public void CTCMinK(String id)
	{
	CTCMinK.sendKeys(id);
	}
	@FindBy(how = How.ID, using="CTCMaxL") @CacheLookup 
	private WebElement CTCMaxL;
	public void CTCMaxL(String id)
	{
	CTCMaxL.sendKeys(id);
	}

	@FindBy(how = How.ID, using="CTCMaxK") @CacheLookup 
	private WebElement CTCMaxK;
	public void CTCMaxK(String id)
	{
	CTCMaxK.sendKeys(id);
	}

	@FindBy(how = How.ID, using="CTCCurrencyID") @CacheLookup 
	private WebElement cTCCurrencyID;
	public void CTCcurrency(String id)
	{
	
		Select ctCCurrency=new Select(cTCCurrencyID);
		ctCCurrency.selectByValue(id);
	}

	@FindBy(how = How.ID, using="CTCRemarks") @CacheLookup 
	private WebElement cTCRemarks;
	public void cTCRemarks(String id)
	{
		cTCRemarks.sendKeys(id);
	}	
	
	@FindBy(how = How.ID, using="NoOfVacancies") @CacheLookup 
	private WebElement NoOfVacancies;
	public void NoOfVacancies(String id)
	{
		NoOfVacancies.sendKeys(id);
	}
	@FindBy(how = How.ID, using="IndustryID") @CacheLookup 
	private WebElement industryID;
	public void industryID(String id)
	{
	
		Select industry=new Select(industryID);
		industry.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="FunctionalAreaID") @CacheLookup 
	private WebElement functionalAreaID;
	public void functionalAreaID(String id)
	{
	
		Select functionalareaID=new Select(functionalAreaID);
		functionalareaID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="JobRoleID") @CacheLookup 
	private WebElement jobRoleID;
	public void jobRoleID(String id)
	{
	
		Select JobRoleID=new Select(jobRoleID);
		JobRoleID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="EmployementTypeID") @CacheLookup 
	private WebElement employementTypeID;
	public void employementTypeID(String id)
	{
	
		Select EmployementTypeID=new Select(employementTypeID);
		EmployementTypeID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="CandidateProfile") @CacheLookup 
	private WebElement candidateProfile;
	public void candidateProfile(String id)
	{
		candidateProfile.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="ReplacementDays") @CacheLookup 
	private WebElement replacementDays;
	public void ReplacementDays(String id)
	{
		replacementDays.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="CityID") @CacheLookup 
	private WebElement cityID;
	public void cityID(String id)
	{
	
		Select CityID=new Select(cityID);
		CityID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="TurnAroundTime") @CacheLookup 
	private WebElement turnAroundTime;
	public void turnAroundTime(String id)
	{
		turnAroundTime.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="JoiningDate") @CacheLookup 
	private WebElement joiningDate;
	public void joiningDate(String id)
	{
		joiningDate.sendKeys(id);
	}
	
	@FindBy(how = How.XPATH, using="(//input[@type='checkbox']/following-sibling::span)[1]") @CacheLookup 
	private WebElement isImmideate;
	public void isImmideate()
	{
		isImmideate.click();
	}
	
	@FindBy(how = How.ID, using="EmpPayPercent") @CacheLookup 
	private WebElement empPayPercent;
	public void empPayPercent(String id)
	{
		empPayPercent.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="EmpPayAmount") @CacheLookup 
	private WebElement empPayAmount;
	public void empPayAmount(String id)
	{
		empPayAmount.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="EmpIncentiveRemarks") @CacheLookup 
	private WebElement empIncentiveRemarks;
	public void empIncentiveRemarks(String id)
	{
		empIncentiveRemarks.sendKeys(id);
	}
	
	@FindBy(how = How.ID, using="SPOCVendorUserID") @CacheLookup 
	private WebElement sPOCVendorUserID;
	public void sPOCVendorUserID(String id)
	{
	
		Select sPOCVendoruserID=new Select(sPOCVendorUserID);
		sPOCVendoruserID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="RequirementStatusID") @CacheLookup 
	private WebElement requirementStatusID;
	public void requirementStatusID(String id)
	{
	
		Select RequirementStatusID=new Select(requirementStatusID);
		RequirementStatusID.selectByValue(id);
	}
	
	@FindBy(how = How.ID, using="cropme_PosterIMG") @CacheLookup 
	private WebElement poster;
	@FindBy(how = How.XPATH, using="//button[contains(@class,'btn btn-secondary')]") @CacheLookup 
	private WebElement previous;
	public void previous()
	{
		previous.click();
	}
		
	@FindBy(how = How.XPATH, using="//button[contains(@class,'btn btn-success')]") @CacheLookup 
	private WebElement submit;
	public void submit()
	{
		submit.click();
	}
	
		
}
