package com.HyreFox.testData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployerdata {

WebDriver ldriver;
	
	public CreateEmployerdata(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/* Company Type ID selected By value
	 <option value="7">College / University</option>
	<option value="6">Partnership</option>
	<option value="2">Private / LLP Large</option>
	<option value="1">Private / LLP SME</option>
	<option value="3">Public Indian</option>
	<option value="4">Public MNC</option>
	<option value="5">Sole Proprietor</option> */
	public String Companytype="2";
	
	/* Employer Type ID
	 * <option selected="selected" value="-1"></option>
	 * <option value="5">Contractual</option>
	 * <option value="7">Other</option>
	 * <option value="1">Permanent</option>
	 * <option value="6">Staffing</option>*/
	public String Employertype="5";
	/*
	 * Company Name*/
	public String Cname="Test";
	/*
	 * Brand Name*/
	public String Bname="Test";
	/*
	 * Industry Type
	 * <option selected="selected" value="-1"></option>
	 * <option value="-100">Accounting/Finance</option>
	 * <option value="-101">Advertising/PR/MR/Events</option>
	 * <option value="-102">Agriculture/Dairy</option>
	 * <option value="-103">Animation</option>
	 * <option value="-104">Architecture/Interior Designing</option>
	 * <option value="-105">Auto/Auto Ancillary</option>
	 * <option value="-106">Aviation / Aerospace Firms</option>
	 * <option value="-107">Banking/Financial Services/Broking</option>
	 * <option value="-108">BPO/ITES</option>
	 * <option value="-109">Brewery / Distillery</option>
	 * <option value="-110">Broadcasting</option>
	 * <option value="-111">Ceramics /Sanitary ware</option>
	 * <option value="-112">Chemicals/PetroChemical/Plastic/Rubber</option>
	 * <option value="-113">Construction/Engineering/Cement/Metals</option>
	 * <option value="-114">Consumer Durables</option>
	 * <option value="-115">Courier/Transportation/Freight</option>
	 * <option value="-116">Defence/Government</option>
	 * <option value="-117">Education/Teaching/Training</option>
	 * <option value="-118">Electricals / Switchgears</option>
	 * <option value="-119">Export/Import</option>
	 * <option value="-120">Facility Management</option>
	 * <option value="31">Fashion &amp; Lifestyle</option>
	 * <option value="-121">Fertilizers/Pesticides</option>
	 * <option value="-122">FMCG/Foods/Beverage</option>
	 * <option value="-123">Food Processing</option>
	 * <option value="-124">Fresher/Trainee</option>
	 * <option value="-125">Gems &amp; Jewellery</option>
	 * <option value="-126">Glass</option>
	 * <option value="-127">Heat Ventilation Air Conditioning</option>
	 * <option value="-128">Hotels/Restaurants/Airlines/Travel</option>
	 * <option value="-129">Industrial Products/Heavy Machinery</option>
	 * <option value="-130">Insurance</option>
	 * <option value="-131">Internet/Ecommerce</option>
	 * <option value="30">IT - Software</option>
	 * <option value="-132">IT-Hardware &amp; Networking</option>
	 * <option value="-133">IT-Software/Software Services</option>
	 * <option value="-134">KPO / Research /Analytics</option>
	 * <option value="-135">Leather</option>
	 * <option value="-136">Legal</option>
	 * <option value="-137">Media/Dotcom/Entertainment</option>
	 * <option value="-139">Medical Devices / Equipments</option>
	 * <option value="-138">Medical/Healthcare/Hospital</option>
	 * <option value="-140">Mining</option>
	 * <option value="-141">NGO/Social Services</option>
	 * <option value="-142">Office Equipment/Automation</option>
	 * <option value="-143">Oil and Gas/Power/Infrastructure/Energy</option>
	 * <option value="-162">Other</option>
	 * <option value="-144">Paper</option>
	 * <option value="-145">Pharma/Biotech/Clinical Research</option>
	 * <option value="-146">Printing/Packaging</option>
	 * <option value="-147">Publishing</option>
	 * <option value="-148">Real Estate/Property</option>
	 * <option value="-149">Recruitment</option>
	 * <option value="-150">Retail</option>
	 * <option value="-151">Security/Law Enforcement</option>
	 * <option value="-152">Semiconductors/Electronics</option>
	 * <option value="-153">Shipping/Marine</option>
	 * <option value="-154">Steel</option>
	 * <option value="-155">Strategy /Management Consulting Firms</option>
	 * <option value="-156">Sugar</option>
	 * <option value="-157">Telcom/ISP</option>
	 * <option value="29">Telecom / ISP</option>
	 * <option value="-158">Textiles/Garments/Accessories</option>
	 * <option value="-159">Tyres</option>
	 * <option value="-160">Water Treatment / Waste Management</option>
	 * <option value="-161">Wellness / Fitness / Sports / Beauty</option>*/
	public String IndustryName="29";
	/*Incorporation Year
	 * */
	public String IncorporationYear="2000";
	/*No of Employees
	 *
           <option value="0-10">0-10</option>
           <option value="10-50">10-50</option>
           <option value="50-200">50-200</option>
           <option value="200-1000">200-1000</option>
           <option value=">1000">&gt;1000</option>
                             */
	public String NoofEmp="50-200";
	/*	Website*/
	public String Website="www.test.com";
	/*Company Linkedln URl*/
	public String Clinkedln="/test";
	/*Employer Description*/
	public String Description ="etst	";
	/*Email Description*/
	public String Email_Description="test";
	/*Employer Contract Details*/
	public String ContractDescription="test";
	/*IsActive*/
	/*Address LIne 1*/
	public String Address1="test";
	/*Address LIne 2*/
	public String Address2="test";
	/*City*/
	public String City="-571";
	/*Post Code*/
	public String PostCode="111111";
	/*HRname*/
	public String HRname="test";
	/*HRJobTitle*/
	public String HRjobtitle="test";
	/*Email(Username)*/
	public String Username_or_Email="test";
	/*Password*/
	public String Password="testtest";
	/*HR Phone1*/
	public String HRphone1="1234567890";
	/*HR Phone2*/
	public String HRphone2="0987654321";
	/*HR City*/
	public String HRCity="-571";
	/*HR Gender selected by text*/
	public String gender="male";
	/*HR DOB*/
	public String DoB="04-06-1992";
	/*HR Linkedln URl*/
	public String HRlinkedln="/test";
	/*Isinterviewer*/
	/*IsFeedbackDnD*/
	/*SAve*/
	/*Cancel*/
}
