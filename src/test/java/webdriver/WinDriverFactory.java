package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WinDriverFactory {

    public static WebDriver getDriver(String targetBrowser) {

        String osArch = System.getProperty("os.arch");

        if(targetBrowser.equals("chrome")){
            //set 32bit chrome as it's the only one
            return new ChromeDriver();
        }else if(targetBrowser.equals("ie") && (osArch.equals("amd64"))){
            //set 64bit ie
            return new InternetExplorerDriver();
        }else if(targetBrowser.equals("ie") && (osArch.equals("x86"))){
            //set 32bit ie
            return new InternetExplorerDriver();
        }else{
            return new FirefoxDriver();
        }

    }
}
