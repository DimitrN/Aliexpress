package com.aliexpress;

import lib.Aliexpress;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
    public void test1(){
        driver.get("http://www.aliexpress.com/");
        aliexpress.main.checkPageTitle();
        aliexpress.main.chengeLL();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
