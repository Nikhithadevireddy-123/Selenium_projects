package TestNG_Selenium;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class tira_TestNG_pracTest {
	WebDriver driver;
	 WebDriverWait wait;
  @BeforeTest
  public void Beforetest() throws InterruptedException 
  {
	  driver=new ChromeDriver();
		driver.get("https://www.tirabeauty.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	  
  }
  
  @Test(priority=1)
  public void login() throws InterruptedException {
	  //driver.get("https://www.tirabeauty.com/auth/login?redirectUrl=%252F");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/a/div/img")).click();
	  Thread.sleep(2000);
	  WebElement Input = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[1]/span/input"));
      Input.click();
      Input.sendKeys("8074321146"); 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div/img")).click();
      WebElement otpButton = wait.until(ExpectedConditions.elementToBeClickable(
              By.cssSelector("custom-btn primary lg no-tap-highlight,'Send OTP')]")));
      
//      WebElement otpButton = driver.findElement(By.cssSelector("button.custom-btn.primary.lg.no-tap-highlight"));
      Assert.assertTrue(otpButton.isEnabled(), "Send OTP");
      otpButton.click();
      //Thread.sleep(3000);
	  
	  
  }

//  @AfterTest
//  public void aftertest() {
//	  driver.close();
//  }

}
