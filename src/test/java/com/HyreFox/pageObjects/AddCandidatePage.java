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
import org.openqa.selenium.support.ui.Select;


public class AddCandidatePage 
{
WebDriver ldriver;

	
	public AddCandidatePage(WebDriver rdriver)
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
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.CSS, using="button#candidateTabFilter-selectedText") @CacheLookup WebElement CandidateSearchby;
	public void CandidateSearchby(String id)
	{

		Actions actions = new Actions(ldriver);
		actions.moveToElement(CandidateSearchby).click().perform();
		if(id=="1")
		{
			actions.moveToElement(ldriver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]"))).click().perform();
	
		}
		if(id=="2")
		{
			actions.moveToElement(ldriver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]"))).click().perform();
		}
		{
		if(id=="3")
			actions.moveToElement(ldriver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]"))).click().perform();
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//button[contains(@class,'btn dropdown-toggle')])[1]") @CacheLookup WebElement EmployerAndRequirements;
	public void EmployerAndRequirements(String id)
	{	Actions action=new Actions(ldriver);
		action.moveToElement(EmployerAndRequirements).click().perform();
		action.moveToElement(ldriver.findElement(By.xpath("(//input[@role='combobox'])[1]"))).sendKeys(id).sendKeys(Keys.ENTER).perform();
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="FirstName") private WebElement firstName;
	public void firstName(String id)
	{
		firstName.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="MiddleName") private WebElement middleName;
	public void middleName(String id)
	{
		middleName.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="LastName") private WebElement lastName;
	public void lastName(String id)
	{
		lastName.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="Aadhar") private WebElement aadhar;
	public void aadhar(String id)
	{
		aadhar.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="Mobile") private WebElement mobile;
	public void mobile(String id)
	{
		mobile.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="AltMobile") private WebElement altMobile;
	public void altMobile(String id)
	{
		altMobile.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="Email") private WebElement email;
	public void email(String id)
	{
		email.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="DOB") private WebElement dateOfBirth;
	public void dateOfBirth(String id)
	{
		dateOfBirth.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="FatherFirstName") private WebElement fathersFirstName;
	public void fathersFirstName(String id)
	{
		fathersFirstName.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="GenderID") private WebElement genderID;
	public void genderID(String id)
	{
		Select employeruserID= new Select(genderID);
		employeruserID.selectByValue(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="CurrentCityID") private WebElement currentCityID;
	public void currentCityID(String id)
	{
		Select employeruserID= new Select(currentCityID);
		employeruserID.selectByValue(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="HomeCityID") private WebElement homeCityID;
	public void homeCityID(String id)
	{
		Select employeruserID= new Select(homeCityID);
		employeruserID.selectByValue(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="LinkedInURL") private WebElement linkedInURL;
	public void linkedInURL(String id)
	{
		linkedInURL.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="ExpInYears") private WebElement expInYears;	
	public void expInYears(String id)
	{
		expInYears.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="CurrentOrg") private WebElement currentOrg;
	public void currentOrg(String id)
	{
		currentOrg.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="CTCLac") private WebElement CTCLac;
	public void CTCLac(String id)
	{
		Select employeruserID= new Select(CTCLac);
		employeruserID.selectByValue(id);

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="CTCThous") private WebElement CTCThous;
	public void CTCThous(String id)
	{
		Select employeruserID= new Select(CTCThous);
		employeruserID.selectByValue(id);

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="ExpectedHike") private WebElement ExpectedHike;
	public void ExpectedHike(String id)
	{
		Select employeruserID= new Select(ExpectedHike);
		employeruserID.selectByValue(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="NoticePeriodDays") private WebElement NoticePeriodDays;
	public void NoticePeriodDays(String id)
	{
		NoticePeriodDays.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="JobTitle") private WebElement jobTitle;
	public void jobTitle(String id)
	{
		jobTitle.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="Keywords") private WebElement keywords;
	public void keywords(String id)
	{
		keywords.sendKeys(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="IndustryID") private WebElement industryID;
	public void industryID(String id)
	{
		Select employeruserID= new Select(industryID);
		employeruserID.selectByValue(id);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="FunctionalAreaID") private WebElement FunctionalAreaID;
	public void FunctionalAreaID(String id)
	{
		Select employeruserID= new Select(FunctionalAreaID);
		employeruserID.selectByValue(id);

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="VendorCandidateRatingID") private WebElement vendorCandidateRatingID;
	public void vendorCandidateRatingID(String id)
	{
		Select employeruserID= new Select(vendorCandidateRatingID);
		employeruserID.selectByValue(id);

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.ID, using="btnCandidateSaveChange") private WebElement save;
	public void save()
	{
		save.click();
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//button[@class='btn btn-secondary'])[2]") private WebElement close;
	public void close()
	{
		close.click();
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[@class='flaticon2-delete'])[2]") private WebElement quit;
	public void quit()
	{
		quit.click();
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
