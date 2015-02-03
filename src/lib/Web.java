package lib;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static lib.ConfigData.ui;

/**
 * Class provides most frequently used steps for working bla bla
 */
public class Web {
    static WebDriverWait waitForElement;
    WebDriver driver;

    public Web(WebDriver driver){
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, 10);
    }

    /**
     * Click Button
     */
    public void clickButton(String buttonLocator) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.findElement(ui(buttonLocator)).click();
    }

    /**
     * Input Text
     */
    public void input(String fieldLocator, String value) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.findElement(ui(fieldLocator)).clear();
        driver.findElement(ui(fieldLocator)).sendKeys(value);
        //driver.findElement(ui(fieldLocator)).sendKeys(Keys.ENTER);
    }


    public void openSite(String siteAddress){
        driver.get(siteAddress);
    }
    public void clickLink(String locator) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.findElement(ui(locator)).click();

    }
    public boolean isElementPresent(String elementLocator) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        return  (driver.findElement(ui(elementLocator)).isEnabled());
    }
    public void waitForElementPresent(String elementLocator){

    }
    public void refresh() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.navigate().refresh();
    }
    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException NoAlertEx){
            return false;
        }
    }




}
