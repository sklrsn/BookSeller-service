import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import com.service.bookstore.response.FindItemsByKeywordsResponse;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalService;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalServiceImpl;

public class Test {
	public static void main(String[] args) {
		EbayOffersInfoRetrievalService ebayOffersInfoRetrievalService = new EbayOffersInfoRetrievalServiceImpl();
		try {
			FindItemsByKeywordsResponse findItemsByKeywordsResponse = ebayOffersInfoRetrievalService
					.retriveOffersByKeywords("harry potter phoenix");
			System.out.println(findItemsByKeywordsResponse.getAck());
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
