package tests.transporter;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.transporter.basePage;
import pages.transporter.loginPage;

public class BaseClassTransporter {
	
	static AppiumDriver<MobileElement> driver;
	basePage objBase;
	loginPage objLogin;
	
	@BeforeSuite
	public void openMobileApps() {
		
		try {
			
		String app = System.getProperty("user.dir") + "\\src\\test\\resources\\apps\\app-staging-debug.apk";
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 5 API 28");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "9.0.0");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		caps.setCapability(MobileCapabilityType.FULL_RESET, false);
		caps.setCapability(MobileCapabilityType.APP, app);
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		caps.setCapability("appPackage", "tech.kargo.transporter.staging.debug");
		caps.setCapability("appActivity", "tech.kargo.transporter.SplashActivity");
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		//driver = new AndroidDriver<MobileElement>(url, caps);
		
		objBase = new basePage(driver);
		objBase.clickBtnMulaiSekarang();
		
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		}
	}
	
//	@Test
//	public void welcome(){
//		System.out.println("berhasil masuk");
//		objLogin = new loginPage(driver);
//		objLogin.clickBtnMulaiSekarang();
//	}
	
	@AfterSuite
	public void closeMobileApps(){
		driver.close();
		driver.quit();
	}

}
