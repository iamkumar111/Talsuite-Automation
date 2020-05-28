package com.HyreFox.testCases;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.EmployerCommunicationPage;
import com.HyreFox.utilities.menupage;

public class EmployerCommunication extends BaseClass
{
 @Test
 public void empcom() throws InterruptedException,InvocationTargetException
 {
	 menupage menu =new menupage(driver);
	 menu.requiremenu();
	 Thread.sleep(3000);
	 menu.employers();
	 Thread.sleep(3000);
	 EmployerCommunicationPage empcom=new EmployerCommunicationPage(driver);
	 Thread.sleep(5000);
	 empcom.username();
	 Thread.sleep(10000);
	 logger.info("username");
	 Thread.sleep(5000);
	 driver.switchTo().frame(0);
	 empcom.email();
	 Thread.sleep(5000);
	 logger.info("email");
	 Thread.sleep(5000);
	 empcom.ComposeMail();
	 logger.info("emailcompelte");
	 Thread.sleep(5000);
	 empcom.mobile();
	 logger.info("mobile");
	 Thread.sleep(5000);
	 empcom.Text();
	 logger.info("text");
	 Thread.sleep(5000);
	 empcom.ScheduleMeeting();
	 logger.info("meeting");
	 Thread.sleep(5000);
	 empcom.RecordMeetingDetails();
	 logger.info("record");
	 Thread.sleep(5000);
	 empcom.Comment();
	 logger.info("comment");
	 Thread.sleep(5000);
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("(//i[@class='flaticon2-delete'])[1]")).click();
}
	
}
