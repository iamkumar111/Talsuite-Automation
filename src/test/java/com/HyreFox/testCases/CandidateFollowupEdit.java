package com.HyreFox.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.AddCandidatePage;
import com.HyreFox.pageObjects.CandidateFollowupEditPage;
import com.HyreFox.pageObjects.CandidatePage;
import com.HyreFox.utilities.menupage;

public class CandidateFollowupEdit extends BaseClass{
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
		CandidateFollowupEditPage cf= new CandidateFollowupEditPage(driver); 
		AddCandidatePage edit=new AddCandidatePage(driver);
		Thread.sleep(10000);
		logger.info("start5");
		candidate.search();
		logger.info("start6");
		Thread.sleep(4000);
		//candidate.fitlerDataOption("Name");
		logger.info("start7");
		candidate.fitlerData("8004919816");
		candidate.applyfilter();
		Thread.sleep(5000);
		cf.CandidateId();
		Thread.sleep(5000);
		 //driver.switchTo().frame(0);
		 cf.Edit_Candidate();
		 Thread.sleep(2000);
		 edit.CTCThous("20");
		 driver.findElement(By.id("btnCandidateSaveChange")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("div#alert-popup>div>div>div:nth-of-type(3)>button")).click();
		 driver.findElement(By.cssSelector("a#kt_quick_comms_close_btn>i")).click();
	}
}
