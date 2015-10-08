package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private DriverFactory(){}

    public static WebDriver resolveDriver(String targetBrowser){

        WebDriver driver = null;
        //String targetBrowser = System.getProperty("TargetBrowser");
        //String osArch = System.getProperty("os.arch");
        String osType = System.getProperty("sun.desktop");
        if(osType.equals("windows")) {
            driver = WinDriverFactory.getDriver(targetBrowser);
        }else if(osType.equals("macos")) {
            driver = LinuxDriverFactory.getDriver(targetBrowser);
        }else if(osType.equals("linux")){
            driver = MacDriverFactory.getDriver(targetBrowser);
        }else{
            //default for selenium - should work out of the box
            return new FirefoxDriver();
        }

        return driver;
    }
}
