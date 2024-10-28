package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingDataFromExcelandXml {
	@Test
	public void login() throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("../com.crm.AdvanceSeleniumM4/Configurefile/Propertiesfile");
		// always give one . or .. before pasting path
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.className("ico-login")).click();
		
		
		System.out.println(browser);
		Thread.sleep(1500);
		System.out.println(url);
		Thread.sleep(1500);
		FileInputStream fist = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\Multipledata.xlsx");
		Workbook wb = WorkbookFactory.create(fist);
		Sheet sheet = wb.getSheet("Sheet1");
		String data = sheet.getRow(0).getCell(0).toString();
		String data1 = sheet.getRow(0).getCell(1).toString();
		System.out.println(data);
		Thread.sleep(1000);
		System.out.println(data1);
		Thread.sleep(1000);
		
	}

}
