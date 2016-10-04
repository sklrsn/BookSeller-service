

import javax.jws.WebService;

@WebService(endpointInterface = "com.sevice.payment.instapay.InstaPayService")
public class InstaPayServiceImpl implements InstaPayService {

	@Override
	public String processPayment(String amount, String cardNumber, String cardHolderName, String securityCode) {
		return "true";
	}

}
