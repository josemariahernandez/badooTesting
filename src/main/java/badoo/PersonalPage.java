package badoo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class PersonalPage extends BasePage{

    public PersonalPage(WebDriver driver) {
        super(driver, "personal_page");
    }

    public void exists(){
        waitUntil(element("title"));
        assertEquals(elementText("title"), "Chema");
    }

    public void addPhotos() {
        waitUntil(element("add_photos"));
        pressButton(element("add_photos"));
    }

    public void selectPhoto() {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File imageDir = new File(classpathRoot, "image");
        File image = new File(imageDir, "7.jpg");

        waitUntil(element("photo1"));
        fillField(element("photo1"), image.getAbsolutePath());

        waitUntil(element("load_state"));
        waitUntil(element("finish_button"));
        pressButton(element("finish_button"));

    }
}
