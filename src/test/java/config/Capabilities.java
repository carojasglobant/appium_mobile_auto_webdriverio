package config;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Capabilities {

    public static UiAutomator2Options getAndroidOptions() {
        return new UiAutomator2Options()
                .setApp("/Users/ca.rojas/Downloads/android.wdio.native.app.v2.0.0.apk")
                .setDeviceName("pixel_8_pro")
                .setAppActivity(".MainActivity")
                .setPlatformVersion("16");
    }

    public static XCUITestOptions getIosOptions() {
        return new XCUITestOptions()
                .setApp("")
                .setDeviceName("")
                .setPlatformVersion("");
    }
}
