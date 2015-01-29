package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class Registration {
    WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void checkRegistrationPageTitle() {
        //return (driver.getTitle().equals(pageTitle));
        if (driver.getTitle().equals("Создать Ваш AliExpress профиль")) { //Create your AliExpress.com account
            System.out.println("");
        } else {
            System.out.println("Registration page link check failed");
            Assert.fail();
        }
    }

    public void siteRegistrationFillingForm (){
        //driver.findElement(By.cssSelector(".account-unsigned>a")).click();

        //e-mail filling
        driver.findElement(By.id("email-ipt")).clear();
        driver.findElement(By.id("email-ipt")).sendKeys("someEmail@gmail.com");
        driver.findElement(By.id("email-tipbox")).isDisplayed();

        //name filling
        driver.findElement(By.id("first-name-ipt")).clear();
        driver.findElement(By.id("first-name-ipt")).sendKeys("SomeName");
        driver.findElement(By.id("last-name-ipt")).clear();
        driver.findElement(By.id("last-name-ipt")).sendKeys("SomeSurname");
        driver.findElement(By.id("last-name-tipbox")).isDisplayed();


        //password filling
        driver.findElement(By.id("password-ipt")).clear();
        driver.findElement(By.id("password-ipt")).sendKeys("somePassword");
        driver.findElement(By.id("password-tipbox")).isDisplayed();

        driver.findElement(By.id("confirm-password-ipt")).clear();
        driver.findElement(By.id("confirm-password-ipt")).sendKeys("somePassword");
        driver.findElement(By.id("confirm-password-tipbox")).isDisplayed();


    }

    public void unmarkAgreementTick () {
        driver.findElement(By.id("agree-ckb")).click();
    }
}
