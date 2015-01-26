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
        aliexpress.web.openSite("http://ru.aliexpress.com/category/202000104/laptops.html?g=y&pvId=19007-349873&shipCountry=ua&isrefine=y");
        aliexpress.main.checkPageTitle();
        System.out.println(driver.getTitle());
        aliexpress.main.changeLL();

    }

    @After
    public void tearDown(){
        //driver.quit();
    }
}
