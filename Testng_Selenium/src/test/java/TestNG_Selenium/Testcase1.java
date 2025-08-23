package TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase1 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
  @Test(enabled=true)
  public void login() throws InterruptedException {
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("userid")).sendKeys("nikhithadevireddy@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("pass")).sendKeys("Nikhitha@30");
	  driver.findElement(By.id("sgnBt")).click();
	  
	  System.out.println("login successful"); 
  }
  @Test(dependsOnMethods = "login", invocationCount = 2)
  public void search() throws InterruptedException {
	  //driver.get("https://www.ebay.com/");	  
	  String[] items = {"watch","phone","headphones"};
  	   for (String item : items) {
  		WebElement search1=driver.findElement(By.id("gh-ac"));
  		search1.clear();
  		driver.findElement(By.id("gh-ac")).sendKeys(item);
  		driver.findElement(By.id("gh-search-btn")).click();
  		driver.findElement(By.id("gh-ac")).clear();
  		System.out.println("Searched for: " + item);
  		
  	}
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-logo")).click();
  }

}
