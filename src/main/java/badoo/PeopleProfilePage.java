package badoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PeopleProfilePage extends BasePage {

    public PeopleProfilePage(WebDriver driver){
        super(driver, "peopleProfile_page");
    }

    public void writeAMessage(String content){
        pressButton(element("chat"));

        fillField(element("text_box"), content);
    }

    public void sendMessage() {
        pressButton(element("send_message"));
    }

    public void existMessage(String content) {

    }
}
