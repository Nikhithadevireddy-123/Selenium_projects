package TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ClassTest2Test {
	WebDriver driver;
  @Test
  public void flipkart() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles,lifestyle,groceries,electronics,Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	  System.out.println("Flipkart-Thread Id:"+Thread.currentThread().getId());
	  driver.quit();
  }
}

