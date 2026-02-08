package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static config.Capabilities.getAndroidOptions;

public class BaseTest {

    public AppiumDriver appiumDriver;

    @BeforeMethod
    public void setUp() {
        appiumDriver = createAppiumDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (appiumDriver != null) {
         this.appiumDriver.close();
        }
    }

    public AppiumDriver createAppiumDriver() {
        try {
            AppiumDriver appDriver =
                    new AppiumDriver(new URL("http://127.0.0.1:4723/"),
                            getAndroidOptions());
            appDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return appDriver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}