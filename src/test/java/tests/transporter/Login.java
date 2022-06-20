package tests.transporter;

import org.testng.annotations.Test;
import pages.transporter.loginPage;



public class Login extends BaseClassTransporter{	
	
	@Test
	public void testLogin() {
		objLogin = new loginPage(driver);
		objLogin.clickBtnDaftar()
				.msgTolongPilihJenisAkun();
		
	}
}

