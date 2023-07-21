package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.example.enums.PlatformType;

public class DriverFactory {

    public AppiumDriver<MobileElement> createInstance(String platform) {

        AppiumDriver<MobileElement> driver = null;

        PlatformType mobilePlatform = PlatformType.valueOf(platform.toUpperCase());

        switch (mobilePlatform) {

            case ANDROID:
                driver = new AndroidDriverManager().createInstance();
                break;

            case IOS:
                driver = new IOSDriverManager().createInstance();
        }
        return driver;
    }
}