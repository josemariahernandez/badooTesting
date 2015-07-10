package badoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TypeWebDriver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(System.getProperty("browser").toLowerCase().equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\jossemaria.hernandez\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(System.getProperty("browser").toLowerCase().equals("firefox")){
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
