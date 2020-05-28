/**
 * 
 */
package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Sharma
 *
 */
public class LostCandidate_AssignPage {
	WebDriver ldriver;

	public LostCandidate_AssignPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void CandidateId(String text)
	{
		String id="(//p[contains(text(),"+text+")])";
		WebElement CandidateId=ldriver.findElement(By.xpath(id));
		CandidateId.click();
	}
	public void LostCandiadte() throws InterruptedException
	{
		ldriver.switchTo().frame(0); 
		ldriver.findElement(By.xpath("(//i[@class='flaticon-more'])[2]")).click();
		 Thread.sleep(5000);
		 ldriver.findElement(By.xpath("//a[@title='Mark as Lost']")).click();
		 Thread.sleep(5000);
		 ldriver.findElement(By.xpath("(//button[text()='Save'])[5]")).click();
		 ldriver.switchTo().defaultContent();
		 Thread.sleep(10000);
		 ldriver.findElement(By.id("kt_quick_comms_close_btn")).click();
	}
	public void RestoreCandidate() throws InterruptedException 
	{
		ldriver.switchTo().frame(0); 
		ldriver.findElement(By.xpath("//span[text()=' Restore']")).click();
		 ldriver.switchTo().defaultContent();
		 Thread.sleep(10000);
		 ldriver.findElement(By.id("kt_quick_comms_close_btn")).click();

	}
}
	
