package badoo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoginPage extends BasePage{

    Properties credentials;

    public LoginPage(WebDriver driver) {
        super(driver, "login_page");
        driver.get("https://badoo.com/es/signin/?f=top");
        File classPathRoot = new File(System.getProperty("user.dir"));
        classPathRoot = new File(classPathRoot, "src");
        classPathRoot = new File(classPathRoot, "main");
        classPathRoot = new File(classPathRoot, "java");
        classPathRoot = new File(classPathRoot, "badoo");
        classPathRoot = new File(classPathRoot, "config");
        File file = new File(classPathRoot, "login_valid.properties");

        credentials = getData(file);
    }

    public void fillCredentials(){
        fillField(element("email"), credentials.getProperty("email"));
        fillField(element("password"), credentials.getProperty("password"));
        pressButton(element("sign_in"));
    }

    public void isCorrectLogin(){
        HomePage homePage;
        homePage = new HomePage(driver);
        homePage.exists();
    }
}
