package TestNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


@Listeners(com.crm.Listeners.sample.class)

public class FileForListener {
	@Test
		public void csk() throws InterruptedException   {
		String val1 = "mani";
		String val2 = "rutul";
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.chennaisuperkings.com/");
			Thread.sleep(2000);
			driver.quit();
			Reporter.log("csk",true);
			assertEquals(val1,val2);
		}
	
	public void rcb() throws InterruptedException {
		String val1 = "mani";
		String val2 = "rutul";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}
	

	}


