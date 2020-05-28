package com.HyreFox.testCases;

import java.awt.AWTException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import com.HyreFox.pageObjects.RequirementsDrivePage;
import com.HyreFox.utilities.menupage;


public class RequirementDrive extends BaseClass{
	@Test
	public void createrequiredrive() throws InterruptedException,NoSuchElementException, AWTException
	{
		menupage menu=new menupage(driver);
		menu.requiremenu();
		Thread.sleep(2000);
		menu.requirementDrives();
		Thread.sleep(2000);
		RequirementsDrivePage drive=new RequirementsDrivePage(driver);
		drive.refresh();
		Thread.sleep(2000);
		drive.create();
		Thread.sleep(3000);
		drive.requirementID("3834");
		drive.Date("04/15/2020");
		drive.time("2:45 AM");
		drive.comment("Drive coming soon");
		drive.title();
		//drive.save();
		//Thread.sleep(3000);
		//drive.refresh();
		//Thread.sleep(3000);
		drive.cancel();
		Thread.sleep(2000);
		drive.scroll();
		drive.edit();
		Thread.sleep(2000);
		Thread.sleep(2000);
		drive.cancel();
		Thread.sleep(2000);
	}
}
