package tests.driverapps;

import org.testng.annotations.Test;
import pages.driverapps.loginPage;



public class Login extends BaseClassDriverApps{	
	
	@Test
	public void testLogin() {
		objLogin = new loginPage(driver);
		objLogin.SetTxtNoTelp("081299999");
		
	}
}

