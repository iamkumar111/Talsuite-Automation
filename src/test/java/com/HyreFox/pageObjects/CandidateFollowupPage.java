package com.HyreFox.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.diagnostics.logging.Logger;

public class CandidateFollowupPage {
	WebDriver ldriver;

	public CandidateFollowupPage(WebDriver rdriver)
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
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////Communications/////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//ul[@class='actions-btns']//button)[1]") @CacheLookup WebElement communicaton_button;
	public void communicaton_button()
	{
		communicaton_button.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@	FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-envelope')]") @CacheLookup WebElement Send_Email;
	@FindBy(how = How.XPATH, using="//span[@title=' - Select Template - ']") @CacheLookup WebElement selectTemplate;
	@FindBy(how = How.ID, using="btnSend") @CacheLookup WebElement send;
	@FindBy(how = How.XPATH, using="(//button[@class='btn btn-secondary'])[2]") @CacheLookup WebElement close;
	@FindBy(how = How.XPATH, using="//input[@class='select2-search__field']") @CacheLookup WebElement search;
	
	public void Send_Email() throws InterruptedException
	{	
		Send_Email.click();
		Thread.sleep(4000);
		Actions actions = new Actions(ldriver);
		actions.moveToElement(selectTemplate).click().perform();
		search.click();
		search.sendKeys("Applicant Rejection Letter");
		search.sendKeys(Keys.ENTER);
		close.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-phone-alt')])[1]") @CacheLookup WebElement Call;
	public void Call() throws InterruptedException
	{
		Call.click();
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector(".btn-default")).click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//button[@data-target='#vidCallModal']") @CacheLookup WebElement Video_Call;
	public void Video_Call() throws InterruptedException
	{
		Video_Call.click();
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#vidCallModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-comment')]") @CacheLookup WebElement Send_Text;
	public void Send_Text() throws InterruptedException
	{
		Send_Text.click();
		Thread.sleep(2000);
		WebElement item =ldriver.findElement(By.xpath("//select[@id='SMSWorkstepTemplate']"));
		Select Item= new Select(item);
        Item.selectByValue("-100");
		WebElement todolist =ldriver.findElement(By.xpath("//input[@id='ActionRemarks']"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#recordSkypeOrMeetingModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();

	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-video')])[1]") @CacheLookup WebElement Video_Interview;
	public void Video_Interview() throws InterruptedException
	{
		Video_Interview.click();
		Thread.sleep(10000);
	//	WebElement add = ldriver.findElement(By.xpath("(//button[text()='Add'])[1]"));
		WebElement close = ldriver.findElement(By.cssSelector("#vidIntreviewModal .btn-secondary"));
	//WebElement editInterview = ldriver.findElement(By.xpath("(//button[@class='btn btn-label-brand'])[2]"));
		close.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-user')])[1]") @CacheLookup WebElement Record_meeting_details;
	public void Record_meeting_details() throws InterruptedException
	{
		Record_meeting_details.click();
		Thread.sleep(4000);
		WebElement todolist =ldriver.findElement(By.xpath("//input[contains(@placeholder,'To-do Actions')]"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		ldriver.findElement(By.id("Description")).sendKeys("test");
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#recordSkypeOrMeetingModal .btn-secondary")).click();
	} 
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-calendar-alt')])[1]") @CacheLookup WebElement Schedule_interview;
	public void Schedule_interview() throws InterruptedException
	{
		Schedule_interview.click();
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#recordInterviewModal .btn-secondary")).click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//li[@data-original-title='Comment / Remarks']") @CacheLookup WebElement Comment;
	public void Comment() throws InterruptedException
	{
		Comment.click();
		Thread.sleep(4000);
		WebElement descripton =ldriver.findElement(By.id("Description"));
		descripton.sendKeys("test");
		WebElement todolist =ldriver.findElement(By.id("ActionRemarks"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#recordSkypeOrMeetingModal .btn-secondary")).click();
	
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-anchor')]") @CacheLookup WebElement Tracker_feedback;
	public void Tracker_feedback() throws InterruptedException
	{
		Tracker_feedback.click();
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector("#recordSkypeOrMeetingModal .btn-secondary")).click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-brain')]") @CacheLookup WebElement Psychometric_Test_Request;
	public void Psychometric_Test_Request() throws InterruptedException
	{
		Psychometric_Test_Request.click();
		Thread.sleep(4000);
		ldriver.findElement(By.cssSelector(".btn-default")).click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[@class='flaticon-more'])[2]") @CacheLookup WebElement more;
	public void more()
	{
		more.click();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

