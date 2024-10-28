package com.crm.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	
	

	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		String expected_result ="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//in above line if we remove  / we can still perform or the code will still execute
		String actual_result=driver.getCurrentUrl();
		//create an object for soft assert
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		soft.assertEquals(expected_result,actual_result);
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
		WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
		search.click();
		soft.assertTrue(search.isEnabled());
		soft.assertAll();

}
}
