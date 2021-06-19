package com.MMLIS.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

public static	WebDriver driver;
public static Properties obj;

public TestBase(){
	
	 obj = new Properties(); 
	 try {
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMLIS\\qa\\config\\config.properties");
		try {
			obj.load(objfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
}	

public static void initialization() {
	String browsername= obj.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		driver= new ChromeDriver();
	}
	else
		if (browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\52101780\\Downloads\\geckodriver-v0.29.1-win64\\geckoDriver.exe");
		driver= new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(obj.getProperty("url"));
	
}
}
