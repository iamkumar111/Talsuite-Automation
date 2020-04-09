package com.HyreFox.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateEmployerPage {
	
WebDriver ldriver;

	
	public CreateEmployerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="btn-add-employer")
	@CacheLookup
	WebElement createEmp;

	public void createEmp()
	{
		createEmp.click();
	}
	
	@FindBy(id="frmEmployer")
	@CacheLookup
	WebElement frmEmployer;
	public void frmEmployer()
	{
		frmEmployer.click();
	}
	
	@FindBy(id="CompanyTypeID")
	@CacheLookup
	WebElement CompanyTypeID;
	public void CompanyTypeID(String br)
	{
		Select companyTypeID= new Select(CompanyTypeID);
		companyTypeID.selectByValue(br);
	}
	@FindBy(id="EmployerTypeID")
	@CacheLookup
	WebElement EmployerTypeID;
	public void EmployerTypeID(String br)
	{
		Select employerTypeID= new Select(EmployerTypeID);
		employerTypeID.selectByValue(br);
	}
	@FindBy(id="CompanyName")
	@CacheLookup
	WebElement CompanyName;
	public void CompanyName(String br)
	{
		CompanyName.sendKeys(br);
	}
	@FindBy(id="BrandName")
	@CacheLookup
	WebElement BrandName;
	public void BrandName(String br)
	{
		BrandName.sendKeys(br);
	}
	@FindBy(id="IndustryID")
	@CacheLookup
	WebElement IndustryID;
	public void IndustryID(String br)
	{
		Select industryID= new Select(IndustryID);
		industryID.selectByValue(br);
	}
	@FindBy(id="IncorporationYear")
	@CacheLookup
	WebElement IncorporationYear;
	public void IncorporationYear(String br)
	{
		IncorporationYear.sendKeys(br);
	}
	@FindBy(id="NoOfEmployees")
	@CacheLookup
	WebElement NoOfEmployees;
	public void NoOfEmployees(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", NoOfEmployees);
		Select noOfEmployees= new Select(NoOfEmployees);
		noOfEmployees.selectByValue(br);
	}
	@FindBy(id="Website")
	@CacheLookup
	WebElement Website;
	public void Website(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Website);
		Website.sendKeys(br);
	}
	@FindBy(id="LinkedInURL")
	@CacheLookup
	WebElement LinkedInURL;
	public void LinkedInURL(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", LinkedInURL);
		LinkedInURL.sendKeys(br);
	}
	@FindBy(id="Description")
	@CacheLookup
	WebElement Description;
	public void Description(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Description);
		Description.sendKeys(br);
	}
	@FindBy(id="Description_Template")
	@CacheLookup
	WebElement Description_Template;
	public void Description_Template(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Description_Template);
		Description_Template.sendKeys(br);
	}
	@FindBy(id="EmployerContractDetails")
	@CacheLookup
	WebElement EmployerContractDetails;
	public void EmployerContractDetails(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", EmployerContractDetails);
		EmployerContractDetails.sendKeys(br);
	}
	@FindBy(xpath="(//input[@checked='checked']/following-sibling::span)[1]")
	@CacheLookup
	WebElement IsActive;
	public void IsActive(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", IsActive);
		IsActive.click();
	}
	@FindBy(id="AddressLine1")
	@CacheLookup
	WebElement AddressLine1;
	public void AddressLine1(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", AddressLine1);
		AddressLine1.sendKeys(br);
	}
	@FindBy(id="AddressLine2")
	@CacheLookup
	WebElement AddressLine2;
	public void AddressLine2(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", AddressLine2);
		AddressLine2.sendKeys(br);
	}
	@FindBy(id="HeadOfficeCityID")
	@CacheLookup
	WebElement HeadOfficeCityID;
	public void HeadOfficeCityID(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", HeadOfficeCityID);
		Select headOfficeCityID= new Select(HeadOfficeCityID);
		headOfficeCityID.selectByValue(br);
	}
	@FindBy(id="Post Code")
	@CacheLookup
	WebElement PostCode;
	public void PostCode(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", PostCode);
		PostCode.sendKeys(br);
	}
	@FindBy(id="Name")
	@CacheLookup
	WebElement Name;
	public void Name(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Name);
		Name.sendKeys(br);
	}
	@FindBy(id="JobTitle")
	@CacheLookup
	WebElement JobTitle;
	public void JobTitle(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", JobTitle);
		JobTitle.sendKeys(br);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement Email;
	public void Email(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Email);
		Email.sendKeys(br);
	}
	@FindBy(id="Password")
	@CacheLookup
	WebElement Password;
	public void Password(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Password);
		Password.sendKeys(br);
	}
	@FindBy(id="Phone1")
	@CacheLookup
	WebElement Phone1;
	public void Phone1(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Phone1);
		Phone1.sendKeys(br);
	}
	@FindBy(id="Phone2")
	@CacheLookup
	WebElement Phone2;
	public void Phone2(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Phone2);
		Phone2.sendKeys(br);
	}
	@FindBy(id="CityID")
	@CacheLookup
	WebElement CityID;
	public void CityID(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", CityID);
		Select cityID= new Select(CityID);
		cityID.selectByValue(br);
	}
	@FindBy(id="GenderID")
	@CacheLookup
	WebElement GenderID;
	public void GenderID(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", GenderID);
		GenderID.sendKeys(br);
	}
	@FindBy(id="LinkedInURLEmployer")
	@CacheLookup
	WebElement LinkedInURLEmployer;
	public void LinkedInURLEmployer(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", LinkedInURLEmployer);
		LinkedInURLEmployer.sendKeys(br);
	}
	@FindBy(id="DOBDatestamp")
	@CacheLookup
	WebElement DOBDatestamp;
	public void DOBDatestamp(String br)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", DOBDatestamp);
		DOBDatestamp.sendKeys(br);
	}
	@FindBy(xpath="//input[@data-parsley-multiple='IsInterviewer']/following-sibling::span[1]")
	@CacheLookup
	WebElement Isinterviewer;
	public void Isinterviewer()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", Isinterviewer);
		Isinterviewer.click();
	}
	@FindBy(id="//input[@data-parsley-multiple='IsFeedbackDND']/following-sibling::span[1]")
	@CacheLookup
	WebElement FeedbackDND;
	public void FeedbackDND()

	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", FeedbackDND);
		FeedbackDND.click();
	}
	@FindBy(xpath="(//button[text()='Save'])[1]")
	@CacheLookup
	WebElement SaveID;
	public void SaveID()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", SaveID);
		SaveID.click();
	}
	@FindBy(css="div#employer-detail>div:nth-of-type(2)>div>div>div>button:nth-of-type(2)")
	@CacheLookup
	WebElement CancelID;
	public void CancelID()
	{	
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", CancelID);
		CancelID.click();
	}
	
	
	
}
