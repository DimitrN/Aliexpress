package lib;

import org.openqa.selenium.WebDriver;
import pages.Main;
import pages.MembershipAgreement;
import pages.Registration;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class Aliexpress {
    public Main main;
    public Registration registration;
    public MembershipAgreement membershipAgreement;
    public Web web;
    static WebDriver driver;

    public Aliexpress(WebDriver driver) throws Exception {
        membershipAgreement = new MembershipAgreement(driver);
        registration = new Registration(driver);
        main = new Main(driver);
        web  = new Web(driver);
    }
}
