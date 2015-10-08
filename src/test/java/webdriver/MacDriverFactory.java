package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MacDriverFactory {
    public static WebDriver getDriver(String targetBrowser) {
        return new SafariDriver();
    }
}
