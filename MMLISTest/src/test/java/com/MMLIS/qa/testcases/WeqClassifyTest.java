package com.MMLIS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MMLIS.qa.base.TestBase;
import com.MMLIS.qa.pages.ContactsPage;
import com.MMLIS.qa.pages.LoginPage;
import com.MMLIS.qa.pages.WeqClassify;

public class WeqClassifyTest extends TestBase{
	LoginPage lp;
	ContactsPage cp;
	WeqclassTest weqC;
	WeqClassify weqCla;
	
	WeqClassifyTest()
	{
		super();
	}

@BeforeMethod
	
	public void setup() {
		
		initialization();
		lp= new LoginPage();
		weqC= new WeqclassTest();
		cp=lp.login(obj.getProperty("username"),obj.getProperty("password"));
		weqCla=cp.clickweqclassify();
	}
	
	
	@Test
	
	public void checkweqentrytitleTest() {
		String homepagetitle= cp.verifyHomepagetitle();
		Assert.assertEquals(homepagetitle,"MML Investors Services","Homepage Title not matched");
		
	
	}
@Test
	
	public void checkweqentrylogoTest() {
		boolean l= weqCla.checklogo();
		Assert.assertTrue(l);
		
		
	
	}

@Test

public void checkbacktoportal() {
	weqCla.backtoportal();
	
	

}
	
	
	@AfterMethod
	public void teardown(){
		//driver.quit();
	}
	


}
