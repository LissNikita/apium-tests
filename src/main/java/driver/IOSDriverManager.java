package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverManager {

    private AppiumDriver<MobileElement> driver;

    public AppiumDriver<MobileElement> createInstance() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.UDID, "udid");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ios");
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/User/Downloads/av.app");
        try {
            driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }
}