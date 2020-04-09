package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.CreateRequirementsPage;
import com.HyreFox.utilities.menupage;

public class CreateRequirements extends BaseClass
{
	@Test
	public void createrequire() throws InterruptedException,NoSuchElementException
	{
		menupage menu=new menupage(driver);
		menu.requiremenu();
		menu.requirements();
		CreateRequirementsPage crt=new CreateRequirementsPage(driver);
		crt.all();
		crt.Create();
		String id="";
		crt.employerUserID(id);
		crt.requirementTypeID(id);
		crt.Jobtitle(id);
		crt.keypointers(id);
		crt.jobdescription(id);
		crt.keywords(id);
		crt.NextStep();
		
	}
}
