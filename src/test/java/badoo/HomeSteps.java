package badoo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;


    public HomeSteps(ShareDriver driver){
        this.driver = driver;
    }
/*
    @Given("^I am logged$")
    public void i_am_logged(){
        loginPage = new LoginPage(driver);
        loginPage.fillCredentials();
        homePage = new HomePage(driver);
    }
    @When("^I push the button with my photo$")
    public void i_push_the_button_with_my_photo(){
        homePage.GoToMyProfile();
    }
    @Then("^I can see my profile$")
    public void i_can_see_my_profile(){
        homePage.accessedToMyProfile();
    }*/
}
