package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.AddCandidatePage;
import com.HyreFox.utilities.menupage;

public class AddCandidate extends BaseClass{
	@Test
	public void addcandidate() throws InterruptedException,NoSuchElementException,NullPointerException
	{
		logger.info("start");
		menupage menu=new menupage(driver);
		logger.info("start1");
		menu.candidatemenu();
		logger.info("start2");
		Thread.sleep(3000);
		logger.info("start3");
		menu.candidates();
		logger.info("start4");
		AddCandidatePage candidate=new AddCandidatePage(driver);
		Thread.sleep(10000);
		//scandidate.CandidateSearchby("1");
		candidate.EmployerAndRequirements("ABC");
		Thread.sleep(3000);
		candidate.addcandidate();
		Thread.sleep(5000);
		candidate.firstName("Test");
		candidate.middleName("Test");
		candidate.lastName("Test");
		candidate.aadhar("223344556677");
		candidate.mobile("998877665544");
		candidate.altMobile("9988776677");
		candidate.email("Test@email.com");
		candidate.dateOfBirth("10-10-1994");
		candidate.fathersFirstName("Test");
		candidate.genderID("-101");//Male="-101"//Female="-102	"
		candidate.currentCityID("-587");
		candidate.homeCityID("-587");
		candidate.linkedInURL("/Test");
		candidate.expInYears("4");
		candidate.currentOrg("Test");
		candidate.CTCLac("4");
		candidate.CTCThous("50");
		candidate.ExpectedHike("75");
		candidate.NoticePeriodDays("30");
		candidate.jobTitle("Test");
		candidate.keywords("Test");
		candidate.industryID("30");
		candidate.FunctionalAreaID("-122");
		candidate.vendorCandidateRatingID("5");
		//candidate.save();
		candidate.close();
	}

}
