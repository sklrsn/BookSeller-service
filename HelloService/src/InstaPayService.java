

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface InstaPayService {

	@WebMethod
	String processPayment(String amount, String cardNumber, String cardHolderName, String securityCode);

}
