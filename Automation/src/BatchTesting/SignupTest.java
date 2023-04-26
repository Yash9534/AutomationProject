package BatchTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignupTest {

	@Test
	public void signupByEmail() {
		Reporter.log("Signup By Email",true);
	}
	@Test
	public void signupByFacebook() {
		Reporter.log("Signup By Facebook",true);
	}
	@Test
	public void signupByTwitter() {
		Reporter.log("Signup by Twitter",true);
	}
}
