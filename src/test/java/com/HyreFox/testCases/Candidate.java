package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.CandidatePage;
import com.HyreFox.utilities.menupage;

public class Candidate extends BaseClass{
	@Test
	public void createrequire() throws InterruptedException,NoSuchElementException
	{
		Thread.sleep(5000);
		logger.info("start");
		menupage menu=new menupage(driver);
		logger.info("start1");
		menu.candidatemenu();
		logger.info("start2");
		Thread.sleep(3000);
		logger.info("start3");
		menu.candidates();
		logger.info("start4");
		CandidatePage candidate=new CandidatePage(driver);
		Thread.sleep(5000);
//		logger.info("start5");
//		candidate.search();
//		logger.info("start6");
//		Thread.sleep(3000);
//		candidate.fitlerDataOption("Name");
//		logger.info("start7");
//		candidate.fitlerData("ankit");
//		candidate.applyfilter();
//		Thread.sleep(5000);
		candidate.Social();
		logger.info("Social");
		Thread.sleep(3000);
		candidate.Archived();
		logger.info("Archived");
		Thread.sleep(3000);
		candidate.Recycle_Candidate_Response_Pending();
		Thread.sleep(3000);
		logger.info("Recycle_Candidate_Response_Pending");
		candidate.Lead_Candidate_is_Interested();
		Thread.sleep(3000);
		logger.info("Lead_Candidate_is_Interested");
		candidate.Lost_Duplicate();
		Thread.sleep(3000);
		logger.info("Lost_Duplicate");
		candidate.Unread_Email();
		Thread.sleep(3000);
		logger.info("Unread_Email");
		candidate.pending();
		Thread.sleep(3000);
		logger.info("pending");
		candidate.yesterday();
		Thread.sleep(3000);
		logger.info("yesterday");
		candidate.today();
		logger.info("today");
		Thread.sleep(3000);
		candidate.aLL();
		logger.info("all");
		
	}

}
