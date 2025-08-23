package TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTest1{
	
	  ChromeDriver driver= new ChromeDriver();
	  @Test
	  public void amazon() throws InterruptedException
	  {
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/"); 
		  String expectedurl="https://www.amazon.in/";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
		  Thread.sleep(3000);
		  System.out.println("amazon - Thread ID :" +Thread.currentThread().getId());
	  }
    
    
  }
