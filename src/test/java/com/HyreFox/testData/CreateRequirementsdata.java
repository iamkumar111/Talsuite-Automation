package com.HyreFox.testData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateRequirementsdata {
	

WebDriver ldriver;
	
	public CreateRequirementsdata(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public String employerUserID = "166";
	public String requirementTypeID = "-100";
	public String Jobtitle = "test";
	public String keypointers = "test";
	public String jobdescription = "test";
	public String keywords = "test";
	public String WorkExMin = "1";
	public String WorkExMax = "2";
	public String CTCMinL = "1";
	public String CTCMinK = "56";
	public String CTCMaxL = "2";
	public String CTCMaxK = "00";
	public String CTCcurrency = "-100";
	public String CTCremarks= "test"; 
	public String NoOfVacancies = "4";
	public String industryID = "-103";
	public String functionalAreaID = "-109";
	public String jobRoleID = "1";
	public String employementTypeID = "1";
	public String candidateProfile = "test";
	public String ReplacementDays = "30";
	public String cityID = "353";
	public String turnAroundTime = "12";
	public String joiningDate = "04-04-2020";
	public String empPayPercent = "12";
	public String empPayAmount = "20000";
	public String empIncentiveRemarks = "test";
	public String sPOCVendorUserID = "423";
	public String requirementStatusID = "-101";
	 	
}
