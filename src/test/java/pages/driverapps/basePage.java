package pages.driverapps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	
WebDriver driver;
	
	@FindBy(id="tech.kargo.driver.staging.debug:id/btn_enter")
	WebElement btnMasuk;
	
	@FindBy(id="tech.kargo.driver.staging.debug:id/btn_agree")
	WebElement btnSetuju;
	
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	WebElement btnAllowLocation;
	
	@FindBy(id="android:id/button1")
	WebElement btnAllowLocationOk;
	
	public basePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public basePage clickBtnMasuk() {
		btnMasuk.click();
		return this;
	}
	
	public basePage clickBtnSetuju() {
		btnSetuju.click();
		return this;
	}
	
	public basePage clickBtnAllowLocation() {
		btnAllowLocation.click();
		return this;
	}
	
	public basePage clickBtnAllowLocationOk() {
		btnAllowLocationOk.click();
		return this;
	}

}
