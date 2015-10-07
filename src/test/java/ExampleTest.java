import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import webdriver.DriverFactory;

import static org.junit.Assert.assertEquals;


/**
 * Created by LechoAdmin on 2015-10-07.
 */
public class ExampleTest {

    protected WebDriver webDriver;

    DriverFactory driverFactory;


    @Before
    public void setUp(){

        String targetBrowser = System.getProperty("TargetBrowser");
        String osArch = System.getProperty("os.arch");
        String osType = System.getProperty("sun.desktop");
        System.out.println("target browser: "+targetBrowser);
        System.out.println("os type: "+osType);
        System.out.println("os architecture: "+osArch);

        webDriver = driverFactory.resolveDriver(targetBrowser);

    }


    @Test
    public void getTest(){
        //webDriver = new FirefoxDriver();
        webDriver.get("http://www.google.com");
        assertEquals("Google", webDriver.getTitle());
        webDriver.quit();
    }

}
