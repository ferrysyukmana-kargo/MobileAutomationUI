package tests;

import org.testng.annotations.Test;
import pages.transporter.loginPage;



public class Tests extends BaseClass{	
	loginPage objLogin;
	

	@Test
	public void testLogin() {
		objLogin = new loginPage(driver);
		objLogin.clickBtnDaftar()
				.msgTolongPilihJenisAkun();
		
	}
}

