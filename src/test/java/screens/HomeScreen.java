package screens;

import config.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"WEBDRIVER\")")
    private WebElement lblWebDriverTitle;

    public HomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


}
