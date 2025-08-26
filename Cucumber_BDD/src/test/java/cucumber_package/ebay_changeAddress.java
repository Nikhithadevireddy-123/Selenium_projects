package cucumber_package;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
public class ebay_changeAddress 
{ 
	WebDriver driver; 
	@Given("ebay site should be opened in default browse") 
	public void ebay_site_should_be_opened_in_default_browse() 
	{ 
		driver=new ChromeDriver(); 
		driver.get("https://www.ebay.com/"); 
		driver.manage().window().maximize();
	}
@When("click on signin and complete process") 
public void click_on_signin_and_complete_process() throws InterruptedException 
{ 
	WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")); 
	  login.click(); 
	  Thread.sleep(3000); 
	  WebElement name=driver.findElement(By.id("userid")); 
	  name.sendKeys("nikhithadevireddy@gmail.com"); 
	  driver.findElement(By.id("signin-continue-btn")).click(); 
	  Thread.sleep(3000); 
	  WebElement pass=driver.findElement(By.id("pass")); 
	  pass.sendKeys("Nikhitha@30"); 
	  driver.findElement(By.id("sgnBt")).click(); 
	  Thread.sleep(4000); 
	}
@When("hover on account and complete change address") 
public void hover_on_account_and_complete_change_address() throws InterruptedException 
{ 
	driver.get("https://accountsettings.ebay.com/uas");
    driver.findElement(By.id("account-settings-link-PI")).click();
    driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
    Thread.sleep(2000);

    WebElement address=driver.findElement(By.id("addressLine1"));
    address.clear();
    address.sendKeys("vemula");

    WebElement city=driver.findElement(By.id("city"));
    city.clear();
    city.sendKeys("Hyderabad");
    Select stateDropdown = new Select(driver.findElement(By.id("stateOrProvince")));
    stateDropdown.selectByVisibleText("Telangana");

    WebElement pin=driver.findElement(By.id("postalCode"));
    pin.clear();
    pin.sendKeys("509807");

    driver.findElement(By.id("address_edit_submit_button")).click();
    Thread.sleep(2000);
    System.out.println("Address updated successfully");

    driver.get("https://www.ebay.com/");
}
@Then("successful chang address") 
public void successful_chang_address() 
{ 
	System.out.println("successful change addres"); 
}
}


