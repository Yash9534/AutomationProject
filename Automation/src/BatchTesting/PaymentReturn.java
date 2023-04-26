package BatchTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaymentReturn {

	@Test
	public void paymentReturnByBank() {
		Reporter.log("payment return by bank",true);
	}
}
