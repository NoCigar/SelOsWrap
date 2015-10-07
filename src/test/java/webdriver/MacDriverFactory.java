package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by LechoAdmin on 2015-10-07.
 */
public class MacDriverFactory {
    public static WebDriver getDriver(String targetBrowser) {
        return new SafariDriver();
    }
}
