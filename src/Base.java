import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug (1).apk");
			
		DesiredCapabilities Cap = new DesiredCapabilities();
//		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); //Device Name
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator1");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, Cap);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByXPath("(//android.widget.TextView)[3]").click();
		driver.findElementById("android:id/checkbox").click();
//		driver.findElementByXPath("(//android.widget.LinearLayout)[2]").click();
		driver.findElementByXPath("//android.widget.ListView[@text='WiFi settings']").click();
//		capabilities.setCapability("uiautomator2ServerLaunchTimeout", 90000);

//		driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
//		driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
//		driver.findElementByAccessibilityId("test-LOGIN").click();
//		driver.findElementByAccessibilityId("android.widget.ImageView").click();
//		driver.findElementByClassName("android.widget.ImageView").click();
//		driver.findElementById("id(\"test\")");
//		driver.findElementByClass
//		driver.findElementById(id)
	}

}
