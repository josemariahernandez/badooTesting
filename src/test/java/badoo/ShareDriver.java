package badoo;


import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ShareDriver extends EventFiringWebDriver {

    private static WebDriver driver;

    static{
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\jossemaria.hernandez\\Downloads\\IEDriverServer.exe");
        //driver = new InternetExplorerDriver();
        //driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\jossemaria.hernandez\\Downloads\\chromedriver.exe");
        //driver = new ChromeDriver();
        /*if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\jossemaria.hernandez\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
        }*/

        /*if(System.getProperty("browser").toLowerCase().contains("firefox")){
            driver = new FirefoxDriver();
        } else if(System.getProperty("browser").toLowerCase().contains("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\jossemaria.hernandez\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
        }*/
    }
    public ShareDriver(){
        super(TypeWebDriver.getDriver());
    }

    @After
    public void closeWebDriver(){
        //quit();
        //close();
    }
}
