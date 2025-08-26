package cucumber_package; 
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When; 
public class ebay_addtocart { 
	WebDriver driver; 
	@Given("Ebay website should be opened in default browser") 
	public void ebay_website_should_be_opened_in_default_browser() { 
		driver=new ChromeDriver(); 
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize();
		}
	@When("click signin and complete signin") 
	public void clcik_signin_and_complete_signin() throws InterruptedException { 
		WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")); 
		login.click(); 
		Thread.sleep(10000); 
		WebElement name=driver.findElement(By.id("userid")); 
		name.sendKeys("nikhithadevireddy@gmail.com"); 
		driver.findElement(By.id("signin-continue-btn")).click(); 
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("pass")); 
		pass.sendKeys("Nikhitha@30"); 
		driver.findElement(By.id("sgnBt")).click(); 
		Thread.sleep(4000); 
		} 
	@When("click on search and add ana item to the cart") 
	public void click_on_search_and_add_ana_item_to_the_cart() throws InterruptedException { 
		driver.findElement(By.id("gh-logo")).click(); 
		Thread.sleep(2000); 
		WebElement search = driver.findElement(By.id("gh-ac")); 
		search.sendKeys("Coach CA548 Leather 2-way Shoulder Handbag White Gold Beige Women's New"); 
		search.submit(); 
		Thread.sleep(3000); 
		WebElement firstProduct = driver.findElement(By.xpath("//*[@id=\"item42a3e1f75f\"]/div/div[1]/div/a/div/img")); 
		firstProduct.click();
		Thread.sleep(5000); 
		String mainWindow = driver.getWindowHandle(); 
		for (String handle : driver.getWindowHandles()) 
		{ 
			if (!handle.equals(mainWindow)) { 
				driver.switchTo().window(handle); 
				break; }
			}
		
	   WebElement addToCartBtn = driver.findElement(By.id("atcBtn_btn_1"));
       addToCartBtn.click();
       Thread.sleep(3000);
	}
	@Then("successful add to cart") 
	public void successful_add_to_cart() { 
		System.out.print("Successful add to cart"); 
		driver.get("https://www.ebay.com/");
		}
	}






















