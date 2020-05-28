package com.HyreFox.testCases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.Employerspage;
import com.HyreFox.utilities.menupage;

public class Employers extends BaseClass {
	@Test
	public void createrequire() throws InterruptedException,NoSuchElementException
	{
		menupage menu=new menupage(driver);
		menu.requiremenu();
		Thread.sleep(3000);
		menu.employers();
		Employerspage emp= new Employerspage(driver);
		Thread.sleep(10000);
		//emp.unReadEmail();
		//Thread.sleep(3000);
		//emp.yesterday();
		//Thread.sleep(3000);
		//emp.today();
		//Thread.sleep(3000);
		//emp.all();
		//Thread.sleep(3000);
		//emp.refresh();
		//Thread.sleep(5000);
		emp.empsearch();
		Thread.sleep(3000);
		emp.fitlerDataOption("Name");
		emp.fitlerData("ankit");
		emp.applyfilter();
		Thread.sleep(5000);
				
	}
}
