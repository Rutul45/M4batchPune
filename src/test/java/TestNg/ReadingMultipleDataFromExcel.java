package TestNg;


	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ReadingMultipleDataFromExcel {
		public void login() throws EncryptedDocumentException, IOException, InterruptedException {
			System.out.println("Reading multiple data");
			FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\Multipledata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Thread.sleep(1000);
			for(int i=0;i<3;i++) {
				for(int j = 0;j<2;j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data);
				Thread.sleep(1500);
			}
			}
			}

	}


