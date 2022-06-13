package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;


public class TestsBrowserStack extends BaseBrowserStack{
	
	@Test
	public void testOne(){
		MobileElement one = driver.findElement(By.id("tech.kargo.transporter.staging.debug:id/kargo_button"));
		
		one.click();
	}

}

