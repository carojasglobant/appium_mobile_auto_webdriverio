package tests;

import config.BaseTest;
import org.testng.annotations.Test;
import screens.HomeScreen;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        HomeScreen homeScreen = new HomeScreen(appiumDriver);
    }
}
