package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	public WebDriver driver;
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/akash/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.quit();
	}

}
