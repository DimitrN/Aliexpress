package pages;

import lib.Web;
import org.openqa.selenium.WebDriver;

/**
 * Created by ViTaLES on 21.01.2015.
 */
public class Main {
    WebDriver driver;

    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkPageTitle() {
        return (driver.getTitle().equals("AliExpress — качественные товары по оптовым ценам"));
    }

    public void changeLL() {
        /*
        click to




         */
    }
}
