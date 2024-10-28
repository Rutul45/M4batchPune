package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromXml {
	@Test
	
	public void login() throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("../com.crm.AdvanceSeleniumM4/Configurefile/Propertiesfile");
		// always give one . or .. before pasting path
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String pass = prop.getProperty("pass");
		System.out.println(browser);
		Thread.sleep(1500);
		System.out.println(url);
		Thread.sleep(1500);
		System.out.println(email);
		Thread.sleep(1500);
		System.out.println(pass);
		Thread.sleep(1500);
		
	}

}
