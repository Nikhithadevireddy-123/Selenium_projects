package TestNG_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assign_testcases {
	WebDriver driver;
	@BeforeTest//
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	}
  @Test(priority=1)
  public void login() throws InterruptedException {
	  driver.findElement(By.id("user-name")).sendKeys("problem_user");
	  Thread.sleep(1000);
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
	  WebElement dashboard = driver.findElement(By.cssSelector("app_logo"));
      Assert.assertEquals(dashboard.getText(), "Products");
	  System.out.println("successfully login");  
	  
  }
  @Test(priority = 2)	
  public void addtocart() throws InterruptedException {
	  //add to cart
  		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
  		 WebElement cartitem = driver.findElement(By.id("shopping_cart_link"));
  		 Thread.sleep(2000);
  		driver.get("https://www.saucedemo.com/cart.html");
  		Assert.assertEquals(cartitem.getText(), "add-to-cart-sauce-labs-backpack");
  		System.out.println("product is added to the cart");
  		
  }
  
  @Test(priority = 3)	 
  public void checkoutflow() throws InterruptedException {
	  driver.findElement(By.id("checkout")).click();
	  Thread.sleep(2000);
	  driver.get("https://www.saucedemo.com/cart.html");
	  driver.findElement(By.id("first-name")).sendKeys("Nikhitha");
	  driver.findElement(By.id("last-name")).sendKeys("Devireddy");
	  driver.findElement(By.id("postal-code")).sendKeys("509001");
	  Thread.sleep(2000);
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("finish")).click();
	  
	  //Order confirmation page 
	  WebElement confirmMsg = driver.findElement(By.className("complete-header"));
      Assert.assertEquals(confirmMsg.getText(), "Thank you for your order");
      System.out.println("Checkout completed successfully");
  }
  @Test(priority = 4)	 
  public void logout() throws InterruptedException {
	  driver.findElement(By.id("https://www.saucedemo.com/inventory.html")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  
	  //Verify that the login page is displayed again.
	  WebElement login = driver.findElement(By.id("login-button"));
	  Thread.sleep(2000);
      Assert.assertTrue(login.isDisplayed(), "Logout failed");
      System.out.println(" Logout successful");
  } 
}
