package tests;

import config.BaseTest;
import org.testng.annotations.Test;
import screens.HomeScreen;


public class NavigationTest extends BaseTest {

    @Test(testName = "Validate home screen is displayed")
    public void homeScreenDisplayed() {
        HomeScreen homeScreen = new HomeScreen(appiumDriver);
        homeScreen.isHomeScreenDisplayed();
    }
}
