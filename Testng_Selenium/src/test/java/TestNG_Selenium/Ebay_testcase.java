package TestNG_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_testcase {
	
	WebDriver driver;
	PageClass pg;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		pg=new PageClass(driver);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
	}
  @Test(priority = 1)
  public void testLogin() {
	  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
	  
	  //login
	  PageClass pg=new PageClass(driver);
	  pg.email_in();
	  pg.con_in();
	  pg.pass_in();
	  pg.submit();
	  
  }
  @Test(priority = 2)
  public void testMultiplesearches() {
	  pg.search();
  }
  
  
  
}