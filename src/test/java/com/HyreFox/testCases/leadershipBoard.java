package com.HyreFox.testCases;	

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.LeadershipBoardPage;

public class leadershipBoard extends BaseClass
{
	@Test
	public void leaderboard() throws InterruptedException, IOException
	{
		
	logger.info("Opening Leadership board Page");
	LeadershipBoardPage lp5=new LeadershipBoardPage(driver);
	logger.info("wait 5 sec");
	Thread.sleep(5000);
	logger.info("Month Updating");
	lp5.updatemonth(value);
	logger.info("Month Updated");
	Thread.sleep(5000);
	logger.info("wait 5 sec");
	WebElement element=driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/div[1]/div[2]/span[1]\r\n"));
	logger.info("try to select elements");
	String text=element.getText();
	logger.info("get element text");
	//For printing the text in console output
	
	System.out.println("Text obtained is" + text);

	if(text.contains("Ayushi Gupta"))
	{
		Assert.assertTrue(true);
		logger.info("Month Updated");
		
	}
	else
	{
		logger.info("Month Updation Fail : Wrong Candidate");
		captureScreen(driver, "logintest");
		Assert.assertTrue(false);
	}
	
	}	
}
