package com.HyreFox.testCases;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
            
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;


public class BaseClass {

	public String baseurl="https://app.talsuite.com";
	public String username="Demo@talsuite.com";
	public String password="Tal12345";
	public static WebDriver driver;
	public static Logger logger;
	public String value="201911";
	@BeforeSuite
	public void setup()
	{			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharma\\eclipse-workspace\\HyreFox\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			logger= Logger.getLogger("HyreFox");
			PropertyConfigurator.configure("log4j.properties");
			driver.get(baseurl);
	}
	
	      public void captureScreen(WebDriver driver, String tname) throws IOException {
		  String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		  File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + dateName + ".png");
		  FileUtils.copyFile(source, target);
		  System.out.println("Screenshot taken");
		 }
	         
	      
	 
	
	@AfterSuite
	public void tearDown()
	{
		//driver.quit();
	}
	
	
}
