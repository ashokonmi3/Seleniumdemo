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
	public void f() throws InterruptedException {
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		Assert.assertEquals("Gmail", driver.getTitle());

	}

	@Test
	public void verifyPageTitle2() {
		driver.get("http://www.rediff.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
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
