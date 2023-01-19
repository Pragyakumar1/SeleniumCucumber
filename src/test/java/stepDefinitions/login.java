package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    WebDriver driver = new  ChromeDriver();
    @When("Launch chrome browser")
    public void launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello world print");
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
    }
    @Then("open facebook url page")
    public void open_facebook_url_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello world");
    }
    @Then("check login button is present or not")
    public void check_login_button_is_present_or_not() {
        // Write code here that turns the phrase above into concrete actions
        boolean status = driver.findElement(By.id("email")).isDisplayed();
        System.out.println("Status is "+status);
        Assert.assertEquals(true,status);
    }
    @And("close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello world");
        driver.quit();
    }
}
