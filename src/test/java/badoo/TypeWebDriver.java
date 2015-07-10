package badoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


public class TypeWebDriver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(System.getProperty("browser").toLowerCase().equals("chrome")){
            File classpathRoot = new File(System.getProperty("user.dir"));
            File driverDir = new File(classpathRoot, "driver");
            File driverFile = new File(driverDir, "chromedriver.exe");

            System.setProperty("webdriver.chrome.driver",driverFile.getAbsolutePath());
            //System.setProperty("webdriver.chrome.driver","C:\\Users\\jossemaria.hernandez\\Desktop\\Java test\\juancar\\Badoo_bdd\\browsers");
            driver = new ChromeDriver();
        }else if(System.getProperty("browser").toLowerCase().equals("firefox")){
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
