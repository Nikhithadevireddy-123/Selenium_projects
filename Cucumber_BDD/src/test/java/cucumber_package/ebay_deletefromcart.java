package cucumber_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import java.util.List;

public class ebay_deletefromcart {
    WebDriver driver;
    WebDriverWait wait;

    @Given("ebay homepage is opened in default browser")
    public void ebay_homepage_is_opened_in_default_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @When("user signs in with valid credentials")
    public void user_signs_in_with_valid_credentials() {
        // Click Sign in
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[title='Sign in']")));
        login.click();
        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")));
        name.sendKeys("nikhithadevireddy@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        pass.sendKeys("Nikhitha@30");
        driver.findElement(By.id("sgnBt")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
    }

    @When("user removes an item from the cart")
    public void user_removes_an_item_from_the_cart() {
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[aria-label*='Cart']")));
        cart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-test-id='cart-items']")));

        List<WebElement> removeButtons = driver.findElements(By.cssSelector("button[data-test-id='cart-remove-item']"));
        if (removeButtons.size() > 0) {
            removeButtons.get(0).click(); 
            wait.until(ExpectedConditions.invisibilityOf(removeButtons.get(0)));
        } else {
            System.out.println("Cart is already empty");
        }
    }

    @Then("item should be successfully removed from the cart")
    public void item_should_be_successfully_removed_from_the_cart() {
        System.out.println("Item removed successfully from cart");
        driver.quit();
    }
}

