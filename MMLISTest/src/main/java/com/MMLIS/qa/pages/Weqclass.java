package com.MMLIS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMLIS.qa.base.TestBase;

public class Weqclass extends TestBase {
	
	@FindBy(id="GetWorkByName")
	WebElement getwork;

	@FindBy(id="btnGetWorkByName")
	WebElement getworkbutton;
	
	@FindBy(id="accountNumber")
	WebElement accnumber;
	
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="btnComplete")
	WebElement complete;
	
	public  Weqclass() 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void createnewentry(String itemname, String an,String comy)
	{
		getwork.sendKeys(itemname);
		getworkbutton.click();
		accnumber.sendKeys(an);
		company.sendKeys(comy);
		complete.click();
	}
	
}
