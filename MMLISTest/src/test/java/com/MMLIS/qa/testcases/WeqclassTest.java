package com.MMLIS.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMLIS.qa.base.TestBase;
import com.MMLIS.qa.pages.ContactsPage;
import com.MMLIS.qa.pages.LoginPage;
import com.MMLIS.qa.pages.Weqclass;
import com.MMLIS.qa.util.TestUtil;

public class WeqclassTest extends TestBase {
	
	LoginPage lp;
	ContactsPage cp;
	Weqclass weqe;
	String sheetName="Sheet1";
	
	WeqclassTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		lp= new LoginPage();
		weqe=new Weqclass();
		cp=lp.login(obj.getProperty("username"), obj.getProperty("password"));
		weqe= cp.clickweqEntry();
		
	}
	
	@DataProvider

	public Object[][] getTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getTestData")
	public void checkvalues(String itemname, String AccountNumber, String Company)
    {
		//weqe.createnewentry("210603PS000015","sindhu","checktest");
		
		weqe.createnewentry(itemname, AccountNumber, Company);
	}
	
	

	@AfterMethod
	public void teardown()
	{
	//driver.quit();
	}
}
