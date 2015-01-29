package com.aliexpress;

import lib.Aliexpress;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class test {
    private WebDriver driver;
    private Aliexpress aliexpress;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        aliexpress = new Aliexpress(driver);

    }

    @Test
    public void test1() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        aliexpress.web.openSite("http://ru.aliexpress.com");
        aliexpress.main.checkMainPageTitle();
        aliexpress.main.changeCountry();
        aliexpress.main.checkLanguageChanging();
        aliexpress.web.openSite("http://us.ae.aliexpress.com/wsuser/buyerJoin/expressJoinIndex.htm?return=http%3A%2F%2Fru.aliexpress.com%2F%3Fspm%3Da2709.1681539.0.14");
        aliexpress.registration.checkRegistrationPageTitle();
        aliexpress.registration.siteRegistrationFillingForm();
        aliexpress.registration.unmarkAgreementTick();
        aliexpress.web.openSite("http://news.alibaba.com/article/detail/help/100453670-1-alibaba.com-free-membership-agreement.html");
        aliexpress.membershipAgreement.checkAgreementPageTitle();
        driver.close();
        driver.close();





        //System.out.println(driver.getTitle());


    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
