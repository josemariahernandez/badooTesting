package badoo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.Properties;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait driverWait;

    private Properties properties;

    public BasePage(WebDriver driver, String file){
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, 10);

        File classPathRoot = new File(System.getProperty("user.dir"));
        classPathRoot = new File(classPathRoot, "src");
        classPathRoot = new File(classPathRoot, "main");
        classPathRoot = new File(classPathRoot, "java");
        classPathRoot = new File(classPathRoot, "badoo");
        classPathRoot = new File(classPathRoot, "elements");
        File fileElements = new File(classPathRoot, file + ".properties");

        properties = getData(fileElements);
    }

    public void pressButton(String element){
        this.waitUntil(element);
        this.driver.findElement(By.xpath(element)).click();
    }

    public void fillField(String element, String content){
        this.waitUntil(element);
        this.driver.findElement(By.xpath(element)).sendKeys(content);
    }

    public void waitUntil(String element){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
    }

    public String element(String element){
        return properties.getProperty(element);
    }

    public String elementText(String element){

        return driver.findElement(By.xpath(element)).getText();
    }

    public String title(){
        System.out.println(driver.getTitle()+"-----------------");
        return driver.getTitle();
    }

    public Properties getData(File file){
        Properties temp = new Properties();
        InputStream input = null;
        try{
            input = new FileInputStream(file.getAbsolutePath());
            temp.load(input);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }finally{
            if(input != null){
                try{
                    input.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return temp;
    }
}
