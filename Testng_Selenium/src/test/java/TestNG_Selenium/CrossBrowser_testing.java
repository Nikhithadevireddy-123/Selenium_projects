package TestNG_Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;

public class CrossBrowser_testing {		
		  WebDriver driver;
		  @Test
		  public void chrome() throws InterruptedException
		  {
			  driver = new ChromeDriver();
			  driver.get("https://www.amazon.in/");
			  String expectedurl="https://www.amazon.in/";
			  String actualurl=driver.getCurrentUrl();
			  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
			  Thread.sleep(3000);
			  System.out.println("amazon - Thread ID :" +Thread.currentThread().getId());
		  }
		  @Test()
		  public void edgedriver() throws InterruptedException
		  {
			  System.out.println("C:\\Users\\nitis\\OneDrive\\Desktop\\java_selenium");
			  driver = new EdgeDriver();
			  driver.get("https://www.flipkart.com/"); 
			  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			  String actualtitle=driver.getTitle();
			  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
			  Thread.sleep(3000);
			  System.out.println("flipcart - Thread ID :" +Thread.currentThread().getId());
		  }
		  @Test()
		  public void firefox() throws InterruptedException
		  {
			  driver = new FirefoxDriver();
			  driver.get("http://zero.webappsecurity.com/");
			  WebElement search=driver.findElement(By.id("searchTerm"));
			  search.sendKeys("Online banking");
			  search.sendKeys(Keys.ENTER);
			  Assert.assertTrue(true,"search button is not clickable ");
			  Thread.sleep(3000);
			  System.out.println("zerobank - Thread ID :" +Thread.currentThread().getId());
		  }
		  @Test()
		  public void AfterMethod() 
		  {
			  driver.quit();
		  }
		  
		  
	    
	  }


