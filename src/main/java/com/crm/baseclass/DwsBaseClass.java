package com.crm.baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.PropertiesFile;

public class DwsBaseClass {
	WebDriver driver = null;
	@BeforeClass
	public void precondition() throws IOException {
		String browser = PropertiesFile.property("browser");
		String url =PropertiesFile.property("url");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
				
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("fireFox")){
			
			driver = new FirefoxDriver();
		}
    else {
		
		driver = new ChromeDriver();
	} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

}
	@BeforeMethod
	public void login() throws IOException {
		String email = PropertiesFile.property("email");
		String password = PropertiesFile.property("password");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.id("Remember")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
	@AfterMethod
	public void logOut() {
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}
