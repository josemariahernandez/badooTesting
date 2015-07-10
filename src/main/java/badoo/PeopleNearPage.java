package badoo;

import org.openqa.selenium.WebDriver;

public class PeopleNearPage extends BasePage {

    public PeopleNearPage(WebDriver driver){
        super(driver, "peopleNear_page");
    }

    public void exists() {
    }

    public void accessToPeopleProfile() {
        waitUntil(element("people"));
        pressButton(element("people"));
    }
}
