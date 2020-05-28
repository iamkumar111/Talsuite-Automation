package com.HyreFox.testCases;


import org.testng.annotations.Test;
import com.HyreFox.testData.*;
import com.HyreFox.pageObjects.CreateEmployerPage;
import com.HyreFox.utilities.menupage;

public class CreateEmployer extends BaseClass{
	
	@Test
	public void createemp() throws InterruptedException 
	{
		menupage menu =new menupage(driver);
		CreateEmployerdata data=new CreateEmployerdata(driver);
		Thread.sleep(10000);
		menu.requiremenu();
		logger.info("Menu Create");
		Thread.sleep(3000);
		menu.employers();
		logger.info("Open Employees");
		CreateEmployerPage emp=new CreateEmployerPage(driver);
		Thread.sleep(10000);
		emp.createEmp();
		Thread.sleep(3000);
		logger.info("Create Employer");
		emp.frmEmployer();
		logger.info("Active employer");
		emp.CompanyTypeID(data.Companytype);
		emp.EmployerTypeID(data.Employertype);
		emp.CompanyName(data.Cname);
		emp.BrandName(data.Bname);
		emp.IndustryID(data.IndustryName);
		emp.IncorporationYear(data.IncorporationYear);
		Thread.sleep(4000);
		emp.NoOfEmployees(data.NoofEmp);
		emp.Website(data.Website);
		emp.LinkedInURLEmployer(data.Clinkedln);
		emp.Description(data.Description);
		emp.Description_Template(data.Email_Description);
		emp.EmployerContractDetails(data.ContractDescription);
		emp.AddressLine1(data.Address1);
		emp.AddressLine2(data.Address2);
		emp.HeadOfficeCityID(data.City);
		emp.PostCode(data.PostCode);
		emp.Name(data.HRname);
		emp.JobTitle(data.HRjobtitle);
		emp.Email(data.Username_or_Email);
		emp.Password(data.Password);
		emp.Phone1(data.HRphone1);
		emp.Phone2(data.HRphone2);
		emp.CityID(data.HRCity);
		emp.GenderID(data.gender);
		emp.DOBDatestamp(data.DoB);
		emp.LinkedInURLEmployer(data.HRlinkedln);
		emp.Isinterviewer();
		emp.Isinterviewer();
		emp.CancelID();
		}

}
