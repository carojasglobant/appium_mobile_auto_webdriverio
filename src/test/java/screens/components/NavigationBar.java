package screens.components;

import config.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavigationBar extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Home\")")
    private WebElement btnHome;

    @AndroidFindBy(uiAutomator = "text(\"Webview\")")
    private WebElement btnWebView;

    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    private WebElement btnLogin;

    @AndroidFindBy(uiAutomator = "text(\"Forms\")")
    private WebElement btnForm;

    @AndroidFindBy(uiAutomator = "text(\"Swipe\")")
    private WebElement btnSwipe;

    @AndroidFindBy(uiAutomator = "text(\"Drag\")")
    private WebElement btnDrag;

    public NavigationBar(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void tapHomeButton() {
        clickElement(btnHome, "Home");
    }

    public void tapWebViewButton() {
        clickElement(btnWebView, "WebView");
    }

    public void tapLoginButton() {
        clickElement(btnLogin, "Login");
    }

    public void tapFormsButton() {
        clickElement(btnForm, "Forms");
    }

    public void tapSwipeButton() {
        clickElement(btnSwipe, "Swipe");
    }

    public void tapDragButton() {
        clickElement(btnDrag, "Drag");
    }
}
