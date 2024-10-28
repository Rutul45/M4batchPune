package com.crm.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation{
	@Test(dataProvider= "login")
	public void sendData(String email,String password) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("Email")).sendKeys(email);
	  Thread.sleep(2000);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.id("RememberMe")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[value='Log in']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[value='Add to cart'])[2]")).click();
	  Thread.sleep(2000);
	  driver.close();
	}
	  
	@DataProvider(name= "login")
	//public Object[][]provider(){
		//Object[][] obj=new Object[2][2];
		//obj[0][0]="admin01@gmail.com";
		//obj[0][1]="pass1";
		//obj[1][0]="admin02@gmail.com";
		//obj[1][1]="Admin2";
		//return obj;
	public Object[][]Provider() throws EncryptedDocumentException, IOException{
		FileInputStream fist = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop.xlsx");
		Workbook wb = WorkbookFactory.create(fist);
		Sheet sheet = wb.getSheet("data34");
		int row = sheet.getPhysicalNumberOfRows();
		int coloum = sheet.getRow(0).getPhysicalNumberOfCells();
		Object  obj = new Object[row][coloum];
		for (int i = 0; i < row; i++) {
			for(int j=0;j< coloum,J++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
			
		}
		return obj;
		
		
	
		
				
	}
	

}
