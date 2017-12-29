package test.NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeafterClass {
	public WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.gmail.com");
		Assert.assertEquals("Gmail", driver.getTitle());

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
