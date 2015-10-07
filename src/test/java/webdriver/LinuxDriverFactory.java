package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by LechoAdmin on 2015-10-07.
 */
public class LinuxDriverFactory {

    public static WebDriver getDriver(String targetBrowser) {

        String osArch = System.getProperty("os.arch");

        if (targetBrowser.equals("chrome") && (osArch.equals("amd64"))) {
            //set 32bit chrome as it's the only one
            return new ChromeDriver();
        } else if (targetBrowser.equals("chrome") && (osArch.equals("x86"))) {
            //set 64bit chrome as it's the only one
            return new ChromeDriver();
        } else {
            return new FirefoxDriver();
        }
    }

}