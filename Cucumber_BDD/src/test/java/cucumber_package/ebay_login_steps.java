package cucumber_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import java.time.Duration;

public class ebay_login_steps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("ebay login page should be open in default browser")
    public void ebay_login_page_should_be_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @When("click on sign link in home page")
    public void click_on_sign_link_in_home_page() {
        WebElement signInLink = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))
        );
        signInLink.click();
    }

    @And("click on username and add username")
    public void click_on_username_and_add_username() {
        WebElement usernameField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("userid"))
        );
        usernameField.sendKeys("nikhithadevireddy@gmail.com"); 
    }

    @And("click on continue")
    public void click_on_continue() {
        WebElement continueBtn = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("signin-continue-btn"))
        );
        continueBtn.click();
    }

    @And("click on password and add password")
    public void click_on_password_and_add_password() {
        WebElement passwordField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("pass"))
        );
        passwordField.sendKeys("Nikhitha@30"); 

        WebElement signInBtn = driver.findElement(By.id("sgnBt"));
        signInBtn.click();
    }

    @Then("successful home page is displayed after sign in")
    public void successful_home_page_is_displayed_after_sign_in() {
        boolean loggedIn = wait.until(
            ExpectedConditions.urlContains("ebay.com")
        );

        if(loggedIn) {
            System.out.println(" Login successful!");
        } else {
            System.out.println(" Login failed!");
        }

        driver.quit();
    }
}




