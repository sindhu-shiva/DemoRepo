package com.MMLIS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMLIS.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//span[@id='ctl00_UserRole']")
	WebElement userTitle;
	
	@FindBy(linkText="WeQ")
	WebElement Weqheader;
	
	@FindBy(linkText="• Entry")
	WebElement entry;
	
	@FindBy(linkText="• Classify")
	WebElement classify;
	
	public ContactsPage()
	{
	PageFactory.initElements(driver, this);	
	}
	
	public String verifyHomepagetitle()
	{
		return driver.getTitle();
	}
	
	public Weqclass clickweqEntry()
	{
		Actions a=new Actions(driver);
        a.moveToElement(Weqheader).build().perform();
        entry.click();
        
        return new Weqclass();
	}
	
	public WeqClassify clickweqclassify()
	{
		Actions a=new Actions(driver);
        a.moveToElement(Weqheader).build().perform();
        classify.click();
        
        return new WeqClassify();
	}

}
