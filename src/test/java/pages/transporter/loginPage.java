package pages.transporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class loginPage{
	
	WebDriver driver;
	
	@FindBy(id="tech.kargo.transporter.staging.debug:id/kargo_button")
	WebElement btnDaftar;
	
	@FindBy(id="tech.kargo.transporter.staging.debug:id/error_text_account_type")
	WebElement msgTolongPilihJenisAkun;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public loginPage clickBtnDaftar() {
		btnDaftar.click();
		return this;
	} 
	
	public loginPage msgTolongPilihJenisAkun() {
		msgTolongPilihJenisAkun.getText();
		assertEquals("Tolong pilih jenis akun", msgTolongPilihJenisAkun);
		return this;
	}
	
	
}


