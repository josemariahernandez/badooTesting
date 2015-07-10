package badoo;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps(ShareDriver driver){
        this.driver = driver;
    }

    @Given("^I am about to login$")
    public void i_am_about_to_login(){
        loginPage = new LoginPage(driver);
    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials(){
        loginPage.fillCredentials();
    }

    @Then("^I can see the homepage$")
    public void i_can_see_the_homepage(){
        loginPage.isCorrectLogin();
    }

}
