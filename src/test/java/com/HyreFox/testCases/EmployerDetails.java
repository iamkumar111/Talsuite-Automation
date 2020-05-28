package com.HyreFox.testCases;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.HyreFox.pageObjects.CreateEmployerPage;
import com.HyreFox.pageObjects.EmployerCommunicationPage;
import com.HyreFox.pageObjects.EmployerDetailsPage;
import com.HyreFox.testData.CreateEmployerdata;
import com.HyreFox.utilities.menupage;

public class EmployerDetails extends BaseClass{
	@Test
	 public void empcom() throws InterruptedException,InvocationTargetException
	 {
		Thread.sleep(5000);
		 menupage menu =new menupage(driver);
		 menu.requiremenu();
		 Thread.sleep(3000);
		 menu.employers();
		 logger.info("employer");
		 Thread.sleep(3000);
		 EmployerCommunicationPage empcom=new EmployerCommunicationPage(driver);
		 EmployerDetailsPage empdtl=new EmployerDetailsPage(driver);
		 CreateEmployerPage cemp=new CreateEmployerPage(driver);
		 CreateEmployerdata edata=new CreateEmployerdata(driver);
		 Thread.sleep(10000);
		 empcom.username();
		 logger.info("username");		 
		 Thread.sleep(10000);
		 logger.info("username");
		 Thread.sleep(5000);
		 //driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 empdtl.Emp_details();
		 Thread.sleep(2000);
		 empdtl.Edit_Employer();
		 Thread.sleep(2000);
		 cemp.BrandName(edata.Bname);
		 cemp.CancelID();
		 driver.findElement(By.xpath("(//i[@class='flaticon2-delete'])[1]")).click();
		 
	 }

}
