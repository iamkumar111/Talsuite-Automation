
package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.CreateRequirementsPage;
import com.HyreFox.testData.CreateRequirementsdata;
import com.HyreFox.utilities.menupage;

public class CreateRequirements extends BaseClass
{
	@Test
	public void createrequire() throws InterruptedException,NoSuchElementException
	{
		menupage menu=new menupage(driver);
		menu.requiremenu();
		Thread.sleep(3000);
		menu.requirements();
		Thread.sleep(5000);
		CreateRequirementsPage crt=new CreateRequirementsPage(driver);
		crt.all();
		crt.Create();
		CreateRequirementsdata d = new CreateRequirementsdata(driver);
		crt.employerUserID(d.employerUserID);
		crt.requirementTypeID(d.requirementTypeID);
		crt.Jobtitle(d.Jobtitle);
		crt.keypointers(d.keypointers);
		crt.jobdescription(d.jobdescription);
		crt.keywords(d.keywords);
		crt.NextStep();
		Thread.sleep(5000);
		crt.WorkExMin(d.WorkExMin);
		crt.WorkExMax(d.WorkExMax);
		crt.CTCMinL(d.CTCMinL);
		crt.CTCMinK(d.CTCMinK);
		crt.CTCMaxL(d.CTCMaxL);
		crt.CTCMaxK(d.CTCMaxK);
		crt.CTCcurrency(d.CTCcurrency);
		crt.cTCRemarks(d.CTCremarks);
		crt.NoOfVacancies(d.NoOfVacancies);
		crt.industryID(d.industryID);
		crt.functionalAreaID(d.functionalAreaID);
		crt.jobRoleID(d.jobRoleID);
		crt.employementTypeID(d.employementTypeID);
		crt.candidateProfile(d.candidateProfile);
		crt.ReplacementDays(d.ReplacementDays);
		crt.cityID(d.cityID);
		crt.NextStep();
		Thread.sleep(5000);
		crt.turnAroundTime(d.turnAroundTime);
		crt.joiningDate(d.joiningDate);
		crt.isImmideate();
		crt.empPayPercent(d.empPayPercent);
		crt.empPayAmount(d.empPayAmount);
		logger.info("emppayAmount");
		crt.empIncentiveRemarks(d.empIncentiveRemarks);
		logger.info("empIncentiveRemarks");
		crt.sPOCVendorUserID(d.sPOCVendorUserID);
		logger.info("sPOCVendorUserID");
		crt.requirementStatusID(d.requirementStatusID);
		logger.info("requirementStatusID");
		crt.NextStep();
		logger.info("Next Step");
		Thread.sleep(5000);
	}
}

