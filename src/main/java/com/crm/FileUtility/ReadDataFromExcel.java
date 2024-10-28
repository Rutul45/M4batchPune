package com.crm.FileUtility;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test

public void login1() throws EncryptedDocumentException, IOException {
		String email = ExcelFile1.excel("sheet1",0,0);
		System.out.println(email);
		String pass = ExcelFile1.excel("sheet1",0,1);
		System.out.println(pass);
	
	
}
}
