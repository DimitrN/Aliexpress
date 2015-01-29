package pages;

import junit.framework.Assert;
import lib.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static lib.ConfigData.ui;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class Main {
    WebDriver driver;

    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public void checkMainPageTitle() {
        //return (driver.getTitle().equals(pageTitle));
        if (driver.getTitle().equals("AliExpress — качественные товары по оптовым ценам")) {
            System.out.println("");
        } else {
            System.out.println("Main page link check failed");
            Assert.fail();
        }
    }

    public void changeCountry() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        driver.findElement(By.id("switcher-info")).click();
        driver.findElement(By.cssSelector("span.country-text")).click();
        driver.findElement(By.cssSelector("a.odd > span.css_flag.css_us")).click();
        driver.findElement(By.cssSelector("button")).click(); // следует указать конкретный локатор для кнопки!!!
    }

    public void checkLanguageChanging () {
        if (driver.findElement(By.cssSelector(".css_flag.css_us")).isEnabled()){
            System.out.println("");
        } else {
            System.out.println("Language changing is failed");
            Assert.fail();
        }
    }
}
