package BatchTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test
	public void paymentInDollar() {
		Reporter.log("payment in dollar",true);
	}
	@Test
	public void paymentInRupees() {
		Reporter.log("payment in rupees",true);
	}
}
