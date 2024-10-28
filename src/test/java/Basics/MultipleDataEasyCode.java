package Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataEasyCode {
	public static void main(String []args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("Reading multiple data");
		FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\Multipledata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int coloum = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row+"   "+coloum);
		Thread.sleep(1000);
		for(int i=0;i<row;i++) {
			for(int j = 0;j<coloum;j++) {
			String data = sheet.getRow(i).getCell(j).toString();
			System.out.println(data);
			Thread.sleep(1500);
		}
		}
		}

}
