package badoo;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class PersonalSteps {
    private WebDriver driver;
    private PersonalPage personalPage;

    public PersonalSteps(ShareDriver driver){
        this.driver = driver;
    }

    @Given("^I am about to personal page$")
    public void i_am_about_to_personal_page(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.goToMyProfile();
    }
    @When("^I push Add photos$")
    public void i_push_add_photos(){
        personalPage = new PersonalPage(driver);
        personalPage.addPhotos();
    }

    @And("^I select the photo$")
    public void i_select_the_photo(){
        personalPage.selectPhoto();
    }
}
