package TestNG_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageClass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	 
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void email_in()
	{
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("nikhithadevireddy@gmail.com");
	}
	public void pass_in()
	{
		driver.findElement(email).click();
		driver.findElement(pass).sendKeys("Nikhitha@30");	
	}
	public void con_in()
	{
		driver.findElement(By.id("signin-continue-btn")).click();
		
	}
	public void submit()
	{
		driver.findElement(By.id("sgnBt")).click();		
	}
	public void search()
	{
//		driver.findElement(search).click();
//		driver.findElement(search).sendKeys("watch");
//		driver.findElement(search).sendKeys(Keys.ENTER);
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
	public void addanddeletecart() throws InterruptedException
	{
		driver.findElement(By.id("gh-logo")).click();
	    Thread.sleep(2000);

	    // Search for a product
	    WebElement search = driver.findElement(By.id("gh-ac"));
	    search.sendKeys("laptop hp");
	    search.submit();
	    Thread.sleep(3000); 

	    WebElement firstProduct = driver.findElement(By.xpath("//*[@id=\"item3bc45462ca\"]/div/div[1]/div/a/div/img"));
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

	    driver.findElement(By.id("gh-logo")).click();
	    Thread.sleep(2000);

	    System.out.println("Product successfully added to cart!");
	    
	    WebElement seeincart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a"));
	    seeincart.click();
	    Thread.sleep(3000);
	    
	    WebElement deletecart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[1]/div[1]/div/ul/li/div/div/div/div[2]/span[2]/button"));
	    deletecart.click();
	    Thread.sleep(3000);
	}
}

	
