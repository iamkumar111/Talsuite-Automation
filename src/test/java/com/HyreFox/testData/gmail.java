package com.HyreFox.testData;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail 
{
	@Test
	public void setup() throws AWTException, InterruptedException
	{			
			WebDriver driver; 
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharma\\eclipse-workspace\\HyreFox\\Drivers\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			Thread.sleep(3000);
			driver.findElement(By.id("identifierId")).sendKeys("anisha.adam.8130@mail.linnbenton.edu");
			driver.findElement(By.xpath("//span[text()='Next']")).click();	
			
	}
		

}
