package com.MMLIS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MMLIS.qa.base.TestBase;
import com.MMLIS.qa.pages.ContactsPage;
import com.MMLIS.qa.pages.LoginPage;

public class WeqClassify extends TestBase{
	LoginPage lp;
	ContactsPage cp;
	WeqClassify weqC;
	
	WeqClassify()
	{
		super();
	}

@BeforeMethod
	
	public void setup() {
		
		initialization();
		lp= new LoginPage();
		weqC= new WeqClassify();
		cp=lp.login(obj.getProperty("username"),obj.getProperty("password"));
	}
	
	
	@Test
	
	public void checkweqentrytitleTest() {
		String homepagetitle= cp.verifyHomepagetitle();
		Assert.assertEquals(homepagetitle,"MML Investors Services","Homepage Title not matched");
		
	
	}
		
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	


}
