package test.NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
	public WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();    
  }

  @Test 
  public void verifyPageTitle1(){
  driver.get("https://www.gmail.com");
  Assert.assertEquals("Gmail", driver.getTitle());
  }

  @Test
  public void verifyPageTitle2(){
  driver.get("https://in.yahoo.com/");
  Assert.assertEquals("Yahoo", driver.getTitle());
  }

  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
