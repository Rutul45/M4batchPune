package com.crm.baseclass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {
@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		String expected_result ="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//Here we do not need to create an object because it is a static method
		String actual_result = driver.getCurrentUrl();
		assertEquals(expected_result,actual_result);
		//driver.findElement(By.id("small-searchterms")).sendKeys("Watch",Keys.ENTER);
		//in 4 version of selenium we can directly perform action using sendkeys 
		//ASSERT TRUE METHOD
		driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
		WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
		assertTrue(search.isEnabled());
		search.click();
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
