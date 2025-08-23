package TestNG_Selenium;

import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Abay_TestNG_prac {
	WebDriver driver;
	@BeforeTest//
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
	}
	
  @Test(priority = 1)
  public void login () throws InterruptedException {
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("userid")).sendKeys("nikhithadevireddy@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("pass")).sendKeys("Nikhitha@30");
	  driver.findElement(By.id("sgnBt")).click();
	  
	  System.out.println("successfully login ");
  } 
    @Test(priority = 2)
    public void addtoCart() throws InterruptedException {

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("gh-logo")).click();
	     Thread.sleep(2000);

	    WebElement search = driver.findElement(By.id("gh-ac"));
	    search.sendKeys("Coach CA548 Leather 2-way Shoulder Handbag White Gold Beige Women's New");
	    search.submit();
	    Thread.sleep(3000); 

	    WebElement firstProduct = driver.findElement(By.xpath("//*[@id=\"item42a3e1f75f\"]/div/div[1]/div[2]/div/div/a/img"));
	    firstProduct.click();
	    Thread.sleep(5000); 

	    String mainWindow = driver.getWindowHandle();
	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(mainWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }
	    WebElement addToCartBtn = driver.findElement(By.id("atcBtn_btn_1"));
	    addToCartBtn.click();
	    Thread.sleep(3000); 
	    System.out.println("Product successfully added to cart!");
    }
    @Test(priority = 3)
    public void DeleteFromCart() throws InterruptedException {
        driver.get("https://cart.ebay.com/");   // directly open cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("button[data-test-id='cart-remove-item']")));       
        removeBtn.click();
        System.out.println("Product removed from cart");
        wait.until(ExpectedConditions.invisibilityOf(removeBtn));
        System.out.println("Cart is empty now");
    }
    @Test(priority = 2)	 
    public void multisearch() {
    	String[] items = {"watch","phone","headphones"};
    	for (String item : items) {
    		WebElement search=driver.findElement(By.id("gh-ac"));
    		search.clear();
    		driver.findElement(By.id("gh-ac")).sendKeys(item);
    		driver.findElement(By.id("gh-search-btn")).click();
    		driver.findElement(By.id("gh-ac")).clear();
    		System.out.println("Searched for: " + item);
   
    		
    	}
    }
  //Change login name
    @Test(priority=5)
    public void details() throws InterruptedException
    {
  	  driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button")).click();
  	  driver.get("https://accountsettings.ebay.com/uas");
  	  driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]")).click();
  	  driver.findElement(By.id("individual_username_edit_button")).click();
  	  Thread.sleep(2000);
  	  WebElement uname=driver.findElement(By.cssSelector("input[id=\"user_name\"]"));
  	  uname.clear();
  	  uname.sendKeys("Nikhitha@30");
  	  driver.findElement(By.cssSelector("button[id=\"username_submit_edit_btn\"]")).click();  
    }

    //change current address
    @Test(priority=6)
    public void changeAdress() throws InterruptedException {
        driver.get("https://accountsettings.ebay.com/uas");
        driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]")).click();
        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
        Thread.sleep(2000);

        WebElement address=driver.findElement(By.id("addressLine1"));
        address.clear();
        address.sendKeys("Vemula");

        WebElement city=driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Mahabubnagar");

        // Use Select for dropdown
        Select stateDropdown = new Select(driver.findElement(By.id("stateOrProvince")));
        stateDropdown.selectByVisibleText("Telangana");

        WebElement pin=driver.findElement(By.id("postalCode"));
        pin.clear();
        pin.sendKeys("501905");

        driver.findElement(By.id("address_edit_submit_button")).click();
        Thread.sleep(2000);
        System.out.println("Address updated successfully");

        driver.get("https://www.ebay.com/");
    }

    	@Test(priority = 7)
    	public void shopbycategories() throws InterruptedException {
    		driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
    	    //Thread.sleep(2000);

    	    driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[1]/div[2]/div/a[3]")).click();
    	    Thread.sleep(2000);
    	    driver.navigate().back();
    	    Thread.sleep(2000);

    	    driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
    	    Thread.sleep(2000);

    	    driver.findElement(By.cssSelector("a[href*='Jewelry-Watches']")).click();
    	    Thread.sleep(2000);
    	    driver.navigate().back();
    	    //Thread.sleep(2000);

    	    driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
    	    Thread.sleep(2000);

    	    driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[3]")).click();
    	    Thread.sleep(2000);
    	    
            System.out.println("shop by catagory is done ");
    		
    		driver.get("https://www.ebay.com/");
    	}
    	@Test(priority = 8)
    	public void productRightClickAndDescription() throws InterruptedException {
    	    driver.findElement(By.id("gh-logo")).click(); 
    	    Thread.sleep(2000);

    	    // Search for the product
    	    WebElement searchBox = driver.findElement(By.id("gh-ac"));
    	    searchBox.sendKeys(" realme narzo 20 pro 5g");
    	    searchBox.submit();
    	    Thread.sleep(3000); 
    	    
    	    WebElement FirstProduct = driver.findElement(By.xpath("//*[@id=\"item1ab4ca4054\"]/div/div[1]/div/a/div/img"));
    	    FirstProduct.click();
    	    
    	    String mainWindow = driver.getWindowHandle();
    	    for (String handle : driver.getWindowHandles()) {
    	        if (!handle.equals(mainWindow)) {
    	            driver.switchTo().window(handle);
    	            break;
    	        }
    	    }

    	    Thread.sleep(2000);

    	    // Right-click the product image
    	    WebElement productImage = driver.findElement(By.xpath("//*[@id=\"PicturePanel\"]/div[1]/div/div[1]/div[1]/div[2]/div[4]/div[1]/img")); // flexible selector
    	    Actions actions = new Actions(driver);
    	    actions.contextClick(productImage).perform();
    	    System.out.println("Right-clicked on the product image");

    	    // Get product description
    	    WebElement productTitle = driver.findElement(By.cssSelector("h1 span[itemprop='name'], h1 span"));
    	    String productDescription = productTitle.getText();
    	    System.out.println("Product Description: " + productDescription);
    	    Thread.sleep(2000);
    	    driver.get("https://cart.ebay.com/");
    	}
    	
    	@Test(priority = 9)
    	public void checkAllCategories() {
    	    driver.get("https://www.ebay.com/");

    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	    WebElement categoryDropdown = wait.until(
    	        ExpectedConditions.elementToBeClickable(By.id("gh-cat")));
    	    categoryDropdown.click();

    	    // Select Cameras & Photo 
    	    WebElement option = wait.until(
    	        ExpectedConditions.elementToBeClickable(
    	            By.cssSelector("select#gh-cat > option[value='625']")));
    	    option.click();

    	    String selected = driver.findElement(
    	        By.cssSelector("select#gh-cat > option[value='625']")).getText();

    	    Assert.assertEquals(selected, "Cameras & Photo", "Category not selected properly!");
    	}
    	@Test(priority = 10)
    	public void ChangeLang() throws InterruptedException
    	{
    		 driver.get("https://accountsettings.ebay.com/uas");
    	        driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]")).click();
    	        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
    	        Thread.sleep(2000);

    		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    		    Thread.sleep(2000);
    		    WebElement country=driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
    			  country.sendKeys(Keys.ENTER);
    			  Thread.sleep(2000);
    			  driver.findElement(By.linkText("India")).click();
    		      Thread.sleep(2000);
    		   
    		}

//    	@Test(priority=10)
//    	 public void CheckAllCategories() throws InterruptedException
//    	 {
//    		 driver.get("https://www.ebay.com/");
//    		 driver.findElement(By.id("gh-cat")).click();
//    		 Thread.sleep(2000);
//    		 driver.findElement(By.cssSelector("option[value=\"15032\"]")).click();
//    		 String selected = driver.findElement(By.cssSelector("#gh-cat option[value='15032']")).getText();
//
//    		Assert.assertEquals(selected, "Cell Phones & Accessories", "Category not selected properly!");
//    		Thread.sleep(3000);
//    	 }

//    	@Test(priority = 11)
//    	public void logout() throws InterruptedException
//    	{
//    		driver.findElement(By.linkText("Sign in")).click();
//      	  driver.findElement(By.id("userid")).sendKeys("nikhithadevireddy@gmail.com");
//      	  driver.findElement(By.id("signin-continue-btn")).click();
//      	  Thread.sleep(2000);
//      	  driver.findElement(By.id("pass")).sendKeys("Nikhitha@30");
//      	  driver.findElement(By.id("sgnBt")).click();
//      	  
//      	  System.out.println("successfully login ");
//      	  
//      	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//      	 driver.get("https://accountsettings.ebay.com/uas");
//         driver.findElement(By.cssSelector("a[id=\"account-settings-link-PI\"]")).click();
//         driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
//         Thread.sleep(2000);
//
//     }
    	
}	    

 

  



	
	  

