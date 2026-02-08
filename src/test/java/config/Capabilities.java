package config;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Capabilities {

    public static UiAutomator2Options getAndroidOptions() {
        return new UiAutomator2Options()
                .setApp("")
                .setDeviceName("")
                .setPlatformVersion("");
    }

    public static XCUITestOptions getIosOptions() {
        return new XCUITestOptions()
                .setApp("")
                .setDeviceName("")
                .setPlatformVersion("");
    }
}
