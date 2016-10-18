package com.service.bookstore.web.search;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.apache.http.client.ClientProtocolException;

import com.service.bookstore.response.Article;
import com.service.bookstore.response.FindItemsByCategoryResponse;
import com.service.bookstore.response.Item;
import com.service.rest.goodreads.response.GoodreadsBooksCatalogueResponse;
import com.service.rest.goodreads.response.Work;
import com.service.rest.goodreads.retrieve.GoodreadsInfoRetrievalService;
import com.service.rest.goodreads.retrieve.GoodreadsInfoRetrievalServiceImpl;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalService;
import com.services.ebay.offers.retrieval.EbayOffersInfoRetrievalServiceImpl;

public class RetrieveBooksandOffers {
	private static final GoodreadsInfoRetrievalService goodreadsInfoRetrievalService = new GoodreadsInfoRetrievalServiceImpl();
	private static final EbayOffersInfoRetrievalService ebayOffersInfoRetrievalService = new EbayOffersInfoRetrievalServiceImpl();

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

		FindItemsByCategoryResponse findItemsByCategoryResponse = null;
		try {
			findItemsByCategoryResponse = ebayOffersInfoRetrievalService.retriveOffersByCategory(keyword);
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Item item : findItemsByCategoryResponse.getSearchResult().getItems()) {
			for (Article article : articles) {
				if (article.getTitle().replaceAll("\\s", "")
						.contains(item.getTitle().replaceAll("\\.", " ").replaceAll("\\s", ""))) {
					article.setCurrentPrice(item.getSellingStatus().getCurrentPrice());
					article.setIsAvailableForPurchase(item.getSellingStatus().getSellingState());
					article.setShippingServiceCost(item.getShippingInfo().getShippingServiceCost());
					article.setEbayUrl(item.getViewItemURL());
				}
			}
		}
		return articles;
	}

	public static void main(String[] args) {
		List<Article> articles = new RetrieveBooksandOffers().listbooksAndOffers("Secrets of Mental Math");
		for (Article article : articles) {
			System.out.println(article.getTitle());
			System.out.println(article.getEbayUrl());
			System.out.println("##########");
		}

	}

}
