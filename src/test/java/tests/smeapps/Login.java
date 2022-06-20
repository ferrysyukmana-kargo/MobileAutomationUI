package tests.smeapps;

import org.testng.annotations.Test;
import pages.smeapps.loginPage;



public class Login extends BaseClassSmeApps{	

	@Test
	public void testLogin() {
		objLogin = new loginPage(driver);
		objLogin.clikBtnMasuk();
	}
}

