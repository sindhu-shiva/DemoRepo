package com.MMLIS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMLIS.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory
    @FindBy(xpath="//input[@name='ctl00$PagePlaceHolder$LoginControl$UserName']")
    WebElement username;
    
    @FindBy(id="ctl00_PagePlaceHolder_LoginControl_Password")
    WebElement password;
    
    @FindBy(xpath="//input[@type='submit']")
    WebElement submit;
		


public LoginPage() {
	
	PageFactory.initElements(driver, this);//instead of this we can have LoginPage.class
	
	
}

public String validation()
{
	return driver.getTitle();
}

//public boolean validtaelogo() {
	//	return mmlislogo.isDisplayed();

public ContactsPage login(String us, String pwd) {
	
	username.sendKeys(us);
	password.sendKeys(pwd);
	submit.click();
	
	return  new ContactsPage();
}
	
}
