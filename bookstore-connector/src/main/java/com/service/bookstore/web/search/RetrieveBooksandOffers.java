package com.service.bookstore.web.search;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.client.ClientProtocolException;

import com.service.bookstore.response.Article;
import com.service.bookstore.response.FindItemsByCategoryResponse;
import com.service.bookstore.response.Item;
import com.service.instantpayments.payment.ProcessPayments;
import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;
import com.service.rest.goodreads.response.GoodreadsRetrieveISBNResponse;
import com.service.rest.goodreads.response.Work;
import com.service.rest.goodreads.retrieve.GoodreadsInfoRetrievalService;
import com.service.rest.goodreads.retrieve.GoodreadsInfoRetrievalServiceImpl;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalService;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalServiceImpl;

public class RetrieveBooksandOffers {
	private static final GoodreadsInfoRetrievalService goodreadsInfoRetrievalService = new GoodreadsInfoRetrievalServiceImpl();
	private static final EbayOffersInfoRetrievalService ebayOffersInfoRetrievalService = new EbayOffersInfoRetrievalServiceImpl();
	private static final ProcessPayments ProcessPayments = new ProcessPayments();

	public List<Article> listbooksAndOffers(String keyword) {
		GoodreadsBooksCatalogueResponse booksCatalogueResponse = null;
		List<Article> articles = new ArrayList<Article>();
		try {
			booksCatalogueResponse = goodreadsInfoRetrievalService
					.retrieveBooksbyKeyword(URLEncoder.encode(keyword, "UTF-8"));
			for (Work work : booksCatalogueResponse.getSearch().getResults().getResultList()) {
				Article article = new Article();
				article.setId(String.valueOf(work.getBook().getId()));
				article.setTitle(work.getBook().getTitle());
				article.setImageUrl(work.getBook().getImageUrl());
				article.setPublicationYear(String.valueOf(work.getOriginalPublicationYear()));
				article.setAverageRating(work.getAverageRating());
				article.setRatingsCount(String.valueOf(work.getRatingsCount()));
				article.setAuthors(work.getBook().getAuthor().getName());

				GoodreadsRetrieveISBNResponse goodreadsRetrieveISBNResponse = goodreadsInfoRetrievalService
						.retrieveBookbyId(String.valueOf(work.getBook().getId()));
				article.setIsbn(goodreadsRetrieveISBNResponse.getArtifact().getIsbn());
				article.setIsbn13(goodreadsRetrieveISBNResponse.getArtifact().getIsbn13());
				article.setDescription(goodreadsRetrieveISBNResponse.getArtifact().getDescription());

				articles.add(article);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			for (Article article : articles) {
				FindItemsByCategoryResponse findItemsByCategoryResponse = ebayOffersInfoRetrievalService
						.retriveOffersByCategory(article.getIsbn13());
				if (findItemsByCategoryResponse != null && findItemsByCategoryResponse.getSearchResult() != null
						&& findItemsByCategoryResponse.getSearchResult().getItems() != null) {

					for (Item item : findItemsByCategoryResponse.getSearchResult().getItems()) {
						if (article.getTitle().replaceAll("\\s", "")
								.contains(item.getTitle().replaceAll("\\.", " ").replaceAll("\\s", ""))) {
							article.setCurrentPrice(item.getSellingStatus().getCurrentPrice());
							article.setIsAvailableForPurchase(item.getSellingStatus().getSellingState());
							article.setShippingServiceCost(item.getShippingInfo().getShippingServiceCost());
							article.setEbayUrl(item.getViewItemURL());
						}
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return articles;
	}

	public boolean processPayment(String cardNumber, String cardHolderName, int cardSecurityCode, String amount)
			throws JAXBException, Exception {
		return ProcessPayments.processPayments(cardNumber, cardHolderName, cardSecurityCode, amount) == 200
				? Boolean.TRUE : Boolean.FALSE;
	}

	public static void main(String[] args) {
		String cardNumber = "123456789876543212";
		String cardHolderName = "Kalaiarasan";
		String amount = "0.0";
		int cardSecurityCode = 1234;

		RetrieveBooksandOffers retrieveBooksandOffers = new RetrieveBooksandOffers();

		// List Articles and Offers //Secrets of Mental Math
		List<Article> articles = retrieveBooksandOffers.listbooksAndOffers("Secrets of Mental Math");

		// for (Article article : articles) {
		// System.out.println(article.getTitle());
		// System.out.println(article.getEbayUrl());
		// System.out.println("##########");
		// }

		// Select an article and Make payment
		Article article = articles.get(0);
		System.out.println("Title :" + article.getTitle());
		System.out.println("Author:" + article.getAuthors());
		System.out.println("Isbn:" + article.getIsbn());
		System.out.println("Isbn13:" + article.getIsbn13());
		System.out.println("Description:" + article.getDescription());

		amount = String.valueOf(article.getCurrentPrice());

		try {
			if (retrieveBooksandOffers.processPayment(cardNumber, cardHolderName, cardSecurityCode, amount)) {
				System.out.println("## Payment Recieved .... Thanks for the Order");
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
