package lib;

import org.openqa.selenium.WebDriver;
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
    /**
     * Input Text

    public void openSite();
    public void clickLink();
    public void isElementPresent(String elementLocator);
    public void waitForElementPresent();
    public void refresh();
    public void isAlertPresent();
     */



}
