package badoo;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PeopleNearSteps {
    private WebDriver driver;
    private PeopleNearPage peopleNearPage;
    private PeopleProfilePage peopleProfilePage;

    public PeopleNearSteps(ShareDriver driver){
        this.driver = driver;
    }

    @Given("^I am about people near page$")
    public void i_am_about_people_near_page(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.goToPeopleNear();
        peopleNearPage = new PeopleNearPage(driver);
    }

    @When("^I push some photo$")
    public void i_push_some_photo(){
        peopleNearPage.accessToPeopleProfile();
    }

    @And("^I send the message$")
    public void i_write_the_message(){
        peopleProfilePage = new PeopleProfilePage(driver);
        peopleProfilePage.writeAMessage("hola");
        peopleProfilePage.sendMessage();
    }

    @Then("^I can see it$")
    public void i_can_send_it(){
        peopleProfilePage.existMessage("hola");
    }
}
