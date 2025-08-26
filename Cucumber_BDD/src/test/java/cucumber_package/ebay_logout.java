package cucumber_package;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When; 
public class ebay_logout 
{ 
	WebDriver driver; 
	@Given("open on ebay website") 
	public void open_in_default_browser() { 
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize(); 
		} 
	@When("click sign in and enter details") 
	public void click_sign_in_and_sigin() throws InterruptedException { 
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
	@When("click account settings and logout") 
	public void hover_account_settings_and_logout() throws InterruptedException { 
		driver.get("https://www.ebay.com/");
		WebElement elementToHover = driver.findElement(By.cssSelector("span>div[class=\"gh-flyout is-left-aligned\"]")); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(elementToHover).build().perform(); 
		Thread.sleep(5000); 
		driver.findElement(By.cssSelector("a[_sp=\"m570.l2622\"]")).click(); 
		Thread.sleep(5000); driver.close(); 
		} 
	@Then("logout_sucessfully") 
	public void logout_sucessfully() { 
		System.out.print("logout sucessfully"); 
		}
	}

