package com.crm.FileUtility;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public static void excel() throws EncryptedDocumentException, IOException {
		FileInputStream excelfis=new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\data34.xlsx");
	    Workbook wb=WorkbookFactory.create(excelfis);
	    Sheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
	}

}

