package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTheBrowser {
	@Test
	public void main() {
		System.out.println("opened the browser");
		//opened the browser 
		WebDriver driver = new ChromeDriver();
	}
}
