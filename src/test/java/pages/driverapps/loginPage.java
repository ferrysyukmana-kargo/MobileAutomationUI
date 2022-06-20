package pages.driverapps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.driverapps.loginPage;

public class loginPage{
	
	WebDriver driver;
	
	@FindBy(id="tech.kargo.driver.staging.debug:id/edt_phone_number")
	WebElement txtNoTelp;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public loginPage SetTxtNoTelp(String telp) {
		txtNoTelp.clear();
		txtNoTelp.sendKeys(telp);
		return this;
	} 
	
	
}


