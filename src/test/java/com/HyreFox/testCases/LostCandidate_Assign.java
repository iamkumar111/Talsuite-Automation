package com.HyreFox.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.CandidateFollowupPage;
import com.HyreFox.pageObjects.CandidatePage;
import com.HyreFox.pageObjects.LostCandidate_AssignPage;
import com.HyreFox.utilities.menupage;

public class LostCandidate_Assign extends BaseClass{
	@Test
	public void createrequire() throws InterruptedException,NoSuchElementException
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
		CandidatePage candidate=new CandidatePage(driver);
		LostCandidate_AssignPage lost=new LostCandidate_AssignPage(driver);
		Thread.sleep(10000);
		logger.info("start5");
		candidate.search();
		logger.info("start6");
		Thread.sleep(4000);
		candidate.fitlerDataOption("Name");
		logger.info("start7");
		candidate.fitlerData("Arjune");
		candidate.applyfilter();
		Thread.sleep(5000);
		lost.CandidateId("H1794");
		Thread.sleep(10000);
		 lost.LostCandiadte();
		lost.CandidateId("H1794");
		Thread.sleep(10000);
		 lost.RestoreCandidate();
		 
	}	
	
}