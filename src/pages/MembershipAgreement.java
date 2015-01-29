package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class MembershipAgreement {
    WebDriver driver;

    public MembershipAgreement(WebDriver driver) {
        this.driver = driver;
    }

    public void AgreementReading(){

    }

    public void checkAgreementPageTitle() {
        //return (driver.getTitle().equals(pageTitle));
        if (driver.getTitle().equals("Alibaba.com Help Center - ALIBABA.COM Free Membership Agreement")) {
            System.out.println("");
        } else {
            System.out.println("Agreement page link check failed");
            Assert.fail();
        }
    }
}
