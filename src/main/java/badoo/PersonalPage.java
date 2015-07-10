package badoo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        waitUntil(element("photo1"));
        fillField(element("photo1"), "C:\\Users\\jossemaria.hernandez\\Desktop\\7.jpg");
        //driver.findElement(By.xpath(element("photo1"))).sendKeys("C:\\Users\\jossemaria.hernandez\\Desktop\\7.jpg");
        waitUntil(element("load_state"));
        waitUntil(element("finish_button"));
        pressButton(element("finish_button"));
        //driver.findElement(By.xpath(element("finish_button"))).click();
    }
}
