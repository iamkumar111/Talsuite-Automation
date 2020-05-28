package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.CandidateInternalDBPage;
import com.HyreFox.utilities.menupage;

public class CandidateInternalDB extends BaseClass{
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
		menu.internalDB();
		logger.info("start4");
		CandidateInternalDBPage db=new CandidateInternalDBPage(driver);
		Thread.sleep(10000);
		db.filter();
		logger.info("start5");
		db.reset();
		logger.info("start6");
		db.filter();
		logger.info("start7");
		db.fitlerDataOption("Name");
		logger.info("start8");
		db.fitlerData("Arjune");
		logger.info("start9");
		db.applyfilter();
		logger.info("start11");

		db.CandidateId("H1794");
		logger.info("start12");
		db.AddToRequiremnent();
		logger.info("start13");
		
	}
	}
