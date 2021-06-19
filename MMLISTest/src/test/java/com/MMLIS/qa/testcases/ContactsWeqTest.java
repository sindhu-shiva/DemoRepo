package com.MMLIS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MMLIS.qa.base.TestBase;
import com.MMLIS.qa.pages.ContactsPage;
import com.MMLIS.qa.pages.LoginPage;
import com.MMLIS.qa.pages.Weqclass;

public class ContactsWeqTest extends TestBase{
	LoginPage lp;
	ContactsPage cp;
	Weqclass weqe;
	
	ContactsWeqTest()
	{
		super();
	}

@BeforeMethod
	
	public void setup() {
		
		initialization();
		lp= new LoginPage();
		weqe= new Weqclass();
		cp=lp.login(obj.getProperty("username"),obj.getProperty("password"));
	}
	
	
	@Test
	
	public void checkweqentrytitleTest() {
		String homepagetitle= cp.verifyHomepagetitle();
		Assert.assertEquals(homepagetitle,"MML Investors Services","Homepage Title not matched");
		
		weqe=cp.clickweqEntry();
	}
		
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
}
