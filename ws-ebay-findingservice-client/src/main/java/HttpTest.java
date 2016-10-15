
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpTest {
	public static void main(String[] args) {
		String url = "http://svcs.sandbox.ebay.com/services/search/FindingService/v1?"
				+ "OPERATION-NAME=findItemsByKeywords&SERVICE-VERSION=1.0.0&"
				+ "SECURITY-APPNAME=AaltoUni-ws-SBX-3e6eb0ea5-11d466dd&RESPONSE-DATA-FORMAT=XML&REST-PAYLOAD&"
				+ "keywords=harry%20potter%20phoenix";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet post = new HttpGet(url);

		try {
			HttpResponse response = client.execute(post);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
