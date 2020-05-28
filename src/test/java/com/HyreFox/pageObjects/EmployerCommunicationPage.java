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

public class EmployerCommunicationPage {
WebDriver ldriver;
	
	public EmployerCommunicationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//p[text()='Ankit Sharma - Manager']") @CacheLookup WebElement username;
	public void username()
	{
		username.click();
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//html/body/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/ul/li[1]/button/i") @CacheLookup WebElement Email;
	public void email()
	{
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Email).click().perform();
	}
	@FindBy(how = How.XPATH, using="//span[@title=' - Select Template - ']") @CacheLookup WebElement selectTemplate;
	@FindBy(how = How.ID, using="btnSend") @CacheLookup WebElement send;
	@FindBy(how = How.XPATH, using="(//button[@class='btn btn-secondary'])[1]") @CacheLookup WebElement close;
	@FindBy(how = How.XPATH, using="//input[@class='select2-search__field']") @CacheLookup WebElement search;
	
	public void ComposeMail()
	{	
		Actions actions = new Actions(ldriver);
		
		actions.moveToElement(selectTemplate).click().perform();
		search.click();
		search.sendKeys("zoom");
		search.sendKeys(Keys.ENTER);
		close.click();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-phone-alt')])[1]") @CacheLookup WebElement mobile;
	public void mobile() throws InterruptedException
	{
	mobile.click();
	Thread.sleep(2000);
	ldriver.findElement(By.cssSelector("div#alert-popup>div>div>div:nth-of-type(3)>button")).click();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-comment')]") @CacheLookup WebElement Text;
	public void Text() throws InterruptedException
	{
		Text.click();
		Thread.sleep(2000);
		WebElement item =ldriver.findElement(By.xpath("//select[@id='SMSWorkstepTemplate']"));
		Select Item= new Select(item);
        Item.selectByValue("-1");
		WebElement todolist =ldriver.findElement(By.xpath("//input[@id='ActionRemarks']"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-user')])[1]") @CacheLookup WebElement RecordMeetingDetails;
	public void RecordMeetingDetails() throws InterruptedException
	{
		RecordMeetingDetails.click();
		Thread.sleep(2000);
		WebElement todolist =ldriver.findElement(By.xpath("//input[contains(@placeholder,'To-do Actions')]"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		ldriver.findElement(By.id("Description")).sendKeys("test");
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//li[@data-original-title='Schedule Meeting']") @CacheLookup WebElement Schedule_meeting;
	public void ScheduleMeeting() throws InterruptedException
	{
		Thread.sleep(2000);
		Schedule_meeting.click();
		Thread.sleep(4000);
		WebElement item =ldriver.findElement(By.xpath("//select[@id='InterviewMode']"));
		Select Item= new Select(item);
        Item.selectByValue("Zoom");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='Interview_FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='Interview_FollowTimestamp']"));
		time.sendKeys("23:43");
		ldriver.findElement(By.xpath("(//button[text()='Close'])[3]")).click();
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-tags')]") @CacheLookup WebElement comment;
	public void Comment() throws InterruptedException
	{
		comment.click();
		Thread.sleep(2000);
		WebElement descripton =ldriver.findElement(By.id("Description"));
		descripton.sendKeys("test");
		WebElement todolist =ldriver.findElement(By.id("ActionRemarks"));
		todolist.sendKeys("test");
		WebElement date =ldriver.findElement(By.xpath("//input[@id='FollowDatestamp']"));
		date.sendKeys("15-04-2020");
		WebElement time =ldriver.findElement(By.xpath("//input[@id='FollowTimestamp']"));
		time.sendKeys("23:43");
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

}
