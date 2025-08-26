package cucumber_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebay_shopbycatagory {
	WebDriver driver;
	@Given("open ebay website")
	public void open_ebay_website() {
		driver=new ChromeDriver(); 
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize(); 
	  
	}

	@When("clicking shop by category")
	public void clicking_shop_by_category() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button")).click();
	    Thread.sleep(2000);
	    
	   // driver.findElement(By.linkText("Electronics")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.linkText("Cell Phones, Smart Watches & Accessories")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("hairclip")).click();
	    Thread.sleep(3000);

	    
	}

	@Then("successful shop by category")
	public void successful_shop_by_category() {
		System.out.println("Successful shop by category");
	    
	}



}







