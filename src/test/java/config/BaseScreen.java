package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    public AppiumDriver driver;

    public BaseScreen(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * Clicks specified element
     * @param element WebElement to be clicked
     * @param description Description of the clicked WebElement
     */
    public void clickElement(WebElement element, String description) {
        element.click();
    }

    /**
     * Sends text to textfield
     * @param element WebElement to send the text
     * @param text Text to send
     * @param description Description of the sent text
     */
    public void sendKeys(WebElement element, String text, String description) {
        element.sendKeys(text);
    }


    /**
     * Validate if the element is visible
     * @param element Element to validate visibility
     * @return return true if the element is visible, false otherwise.
     */
    public boolean isTheWebElementVisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(seconds));
        try {
            WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));
            return webElement != null;
        } catch (Exception e) {
            return false;
        }
    }

}