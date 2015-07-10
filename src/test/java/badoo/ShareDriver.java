package badoo;


import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ShareDriver extends EventFiringWebDriver {

    private static WebDriver driver;

    public ShareDriver(){
        super(TypeWebDriver.getDriver());
    }

    @After
    public void closeWebDriver(){
        quit();
    }
}
