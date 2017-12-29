package test.NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttest {
	@Test
	public void verifyTitle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Gmail");
		Thread.sleep(3000);
		driver.close();

	}
}
