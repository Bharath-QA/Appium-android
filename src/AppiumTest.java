import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Oppo phone"); //Device Name
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
		caps.setCapability("udid", "ebdfdeac"); //FOR IOS
		caps.setCapability("appPackage", "com.swaglabsmobileapp");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
//		caps.setCapability(MobileCapabilityType.NO_RESET, "true");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, caps);
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
		driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
		driver.findElementByAccessibilityId("test-LOGIN").click();
//		driver.findElementByClassName("android.widget.ImageView").click();
		Thread.sleep(3000);
		driver.quit();
	}
}

