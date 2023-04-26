package BatchTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginByEmail() {
		Reporter.log("this is login by email",true);
	}
	@Test
	public void loginByfacebook() {
	Reporter.log("this is login by facebook",true);}
	@Test
	public void loginByTwitter() {
		Reporter.log("this is login by twitter ",true);
	}
}
