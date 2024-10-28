package com.crm.FileUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertFile{
	public void login() throws IOException, InterruptedException {
		String url = PropertiesFile.property("url");
		String email = PropertiesFile.property("email");
		String pass = PropertiesFile.property("pass");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);driver.close();
	}
}


