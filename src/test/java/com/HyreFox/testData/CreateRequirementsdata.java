package com.HyreFox.testData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateRequirementsdata {
	

WebDriver ldriver;
	
	public CreateRequirementsdata(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	
	
	
	
	
	
}
