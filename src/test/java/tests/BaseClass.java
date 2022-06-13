package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 5 API 28");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "9.0.0");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		caps.setCapability("appPackage", "tech.kargo.transporter.staging.debug");
		caps.setCapability("appActivity", "tech.kargo.transporter.SplashActivity");
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		//driver = new AndroidDriver<MobileElement>(url, caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	@Test
	public void sampleTest() {
		System.out.println("ini test");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
