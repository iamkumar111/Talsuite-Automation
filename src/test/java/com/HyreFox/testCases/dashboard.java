package com.HyreFox.testCases;

import org.testng.annotations.Test;

import com.HyreFox.utilities.menupage;

public class dashboard extends BaseClass {
	
	@Test
	public void Dashboard()  
	{
		menupage menu=new menupage(driver);
		menu.analyticmenu();
		menu.dashboard();
		
		
		
		
	}

}
