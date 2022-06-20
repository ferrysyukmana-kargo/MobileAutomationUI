package pages.transporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	
WebDriver driver;
	
	@FindBy(id="tech.kargo.transporter.staging.debug:id/kargo_button")
	WebElement btnMulaiSekarang;
	
	public basePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public basePage clickBtnMulaiSekarang() {
		btnMulaiSekarang.click();
		return this;
	}

}
