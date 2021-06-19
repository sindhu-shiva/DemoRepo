package com.MMLIS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MMLIS.qa.base.TestBase;
import com.MMLIS.qa.pages.ContactsPage;
import com.MMLIS.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage lp;
	ContactsPage cp;
	
	public LoginPageTest() {
		super();// calling tst base condtructor
	 
	}

		
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		lp= new LoginPage();
	}
	
	
	@Test
	
	public void checktitleTest() {
		String title= lp.validation();
		Assert.assertEquals(title,"MML Investors Services");
	}
		
	@Test
	
	public void loginTest()
	{
		cp =lp.login(obj.getProperty("username"),obj.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	

}