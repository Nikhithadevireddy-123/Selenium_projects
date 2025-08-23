package TestNG_Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AssertDemo {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void title() {
	  String expectedtitle = "Selenium";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle,expectedtitle,"Title validation failed");
	  System.out.println("expected URL: "+expectedtitle);
	  System.out.println("ActuaL URL: "+actualtitle);
  }
  
  @Test
  public void url() {
	  String expectedurl = "https://www.selenium.dev/";
	  String actualurl = driver.getCurrentUrl();
	  Assert.assertEquals(actualurl,expectedurl,"Url validation failed");
	  System.out.println("expected URL: "+expectedurl);
	  System.out.println("ActuaL URL: "+actualurl);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
