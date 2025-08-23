package TestNG_Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Wait_example {
  
	WebDriver driver;
	@BeforeTest//1(primary condition)
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/"); 
	  }
  
  @Test
  public void implicitwait() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void openpage() {
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String pointURL = driver.getCurrentUrl();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  
	  WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys(Keys.ENTER);
  }

  
  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"Search button is not working");
	 // driver.close();
  }
  @AfterMethod
  public void aftermethod() {
	  driver.quit();
  }

}


