package badoo;

import org.openqa.selenium.WebDriver;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver, "home_page");
    }

    public void exists(){
        waitUntil(element("title"));
        assertEquals(title(), "Badoo ? Encuentros");
    }

    public void goToMyProfile() {
        waitUntil(element("profile"));
        pressButton(element("profile"));
    }

    public void accessedToMyProfile(){
        PersonalPage personalPage;
        personalPage = new PersonalPage(driver);
        personalPage.exists();
    }

    public void goToPeopleNear(){
        waitUntil(element("people_near"));
        pressButton(element("people_near"));
    }
}
