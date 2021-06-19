package com.MMLIS.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.MMLIS.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	
	public static String Test_data_sheet_path="C:\\Users\\52101780\\eclipse-workspace\\MMLISTest\\src\\main\\java\\com\\MMLIS\\qa\\testDataExcel\\WEQDATA.xlsx";
 static Workbook book;
 static Sheet sheet;


public static Object[][] getTestData(String sheetName){
	FileInputStream file= null;
	try {
		file=new FileInputStream(Test_data_sheet_path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		book= WorkbookFactory.create(file);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sheet=book.getSheet(sheetName);
	
	Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for (int i=0;i<sheet.getLastRowNum();i++)
	{
	for (int k=0;i<sheet.getRow(0).getLastCellNum();k++)
	{
		data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	}
	
	}
	return data;
}
}