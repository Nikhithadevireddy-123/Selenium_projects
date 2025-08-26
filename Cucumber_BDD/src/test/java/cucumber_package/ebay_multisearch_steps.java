package cucumber_package;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
public class ebay_multisearch_steps { 
	WebDriver driver;
@Given("Ebay website should opened in homepage") 
public void ebay_website_should_opened_in_homepage() { 
	driver=new ChromeDriver(); 
	driver.get("https://www.ebay.com/"); 
	driver.manage().window().maximize(); 
	} 
@When("click on vaalues and enter search term") 
public void click_on_vaalues_and_enter_search_term() throws InterruptedException { 
	Thread.sleep(1000); 
	 driver.navigate().to("https://www.ebay.com/");
		List<String> sr=new ArrayList();
		sr.add("phone");
		sr.add("watch");
		sr.add("headphones");
		for(String item:sr)
		{
			WebElement search=driver.findElement(By.id("gh-ac"));
			search.clear();
			search.sendKeys(item);
			search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
}
@Then("Successfull search") 
public void successfull_search() { 
	System.out.println("Successful search"); 
	driver.get("https://www.ebay.com/");
	}
}





