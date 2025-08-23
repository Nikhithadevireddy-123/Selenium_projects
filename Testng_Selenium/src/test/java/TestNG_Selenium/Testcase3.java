
package TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Testcase3 {
	 WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example.com/dummy-login"); 
	    }
  @Test
 @Parameters({"username","password"})
  public void loginTest(@Optional("admin") String username,
          @Optional("admin123") String password) {
	  WebElement user = driver.findElement(By.id("username"));
      user.clear();
      user.sendKeys(username);
   
      WebElement pass = driver.findElement(By.id("password"));
      pass.clear();
      pass.sendKeys(password);
      driver.findElement(By.id("loginBtn")).click();
  }
  @AfterClass
  public void f() {
      driver.quit();
  }
}


