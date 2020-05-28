package com.HyreFox.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.CandidateFollowupPage;
import com.HyreFox.pageObjects.CandidatePage;
import com.HyreFox.utilities.menupage;

public class CandidateFollowup extends BaseClass{
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
		CandidateFollowupPage cf= new CandidateFollowupPage(driver); 
		Thread.sleep(10000);
		logger.info("start5");
		candidate.search();
		logger.info("start6");
		Thread.sleep(4000);
		//candidate.fitlerDataOption("Name");
		logger.info("start7");
		candidate.fitlerData("8004919816");
		logger.info("Enter candidate no. for search");
		candidate.applyfilter();
		logger.info("applyfilter");
		Thread.sleep(5000);
		cf.CandidateId("H3834");
		logger.info("select candidate/opening menu");
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		logger.info("frame change");
		cf.Send_Email();
		logger.info("Send email");
		 Thread.sleep(5000);
		 logger.info("email");
		 cf.Call();
		 Thread.sleep(5000);
		 logger.info("call");
		 cf.Video_Call();
		 Thread.sleep(5000);
		 logger.info("video call");
		 cf.Send_Text();
		 Thread.sleep(5000);
		 logger.info("text");
		 Thread.sleep(5000);
		 cf.Video_Interview();
		 Thread.sleep(5000);
		 logger.info("videoInterview");
		 cf.Record_meeting_details();
		 Thread.sleep(5000);
		 logger.info("Record_meeting_details");
		 cf.Schedule_interview();
		 Thread.sleep(5000);
		 logger.info("Schedule_interview");
		 cf.Comment();
		 Thread.sleep(5000);
		 logger.info("Comment");
		 cf.Tracker_feedback();
		 Thread.sleep(5000);
		 logger.info("Tracker_feedback");
		 cf.Tracker_feedback();
		 Thread.sleep(5000);
		 logger.info("Tracker_feedback");
		 cf.Psychometric_Test_Request();
		 Thread.sleep(5000);
		 logger.info("Psychometric_Test_Request");
		 driver.switchTo().defaultContent(); 
		 driver.findElement(By.cssSelector("#kt_quick_comms_close_btn > i:nth-child(1)")).click();
		 
	}
	}
