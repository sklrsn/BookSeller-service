package com.bookstore.search;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBException;

import com.service.bookstore.response.Article;
import com.service.bookstore.web.search.RetrieveBooksandOffers;

import fi.aalto.t_75_5300.bank.VisaCard;
import fi.aalto.t_75_5300.bank.VisaTransaction;
import fi.aalto.bank.service.MakeVisaTransaction;

/**
 * Servlet implementation class PaymentProcessingServlet
 */
@WebServlet("/PaymentProcessingServlet")
public class PaymentProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PaymentProcessingServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RetrieveBooksandOffers retrieveBooksandOffers = new RetrieveBooksandOffers();

		String[] selectedItems = request.getParameterValues("selecteditems");
		String cardNumber = request.getParameter("cardnumber");
		String cardholderName = request.getParameter("cardholdername");
		String securityCode = request.getParameter("securitycode");
		String selectedService = request.getParameter("service");

		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<Article> articles = (List<Article>) session.getAttribute("results");

		int amount = 0;
		List<String> items = Arrays.asList(selectedItems);

		for (Article article : articles) {
			if (items.contains(article.getId())) {
				amount += Float.parseFloat(article.getCurrentPrice() != null ? article.getCurrentPrice() : "100.00");
				amount += Float.parseFloat(
						article.getShippingServiceCost() != null ? article.getShippingServiceCost() : "10.0");
			}
		}
		try {
			if (selectedService.equals("defaultservice")) {
				Boolean isProcessed = retrieveBooksandOffers.processPayment(cardNumber, cardholderName,
						Integer.parseInt(securityCode), String.valueOf(amount));
				if (isProcessed)
					request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
				else
					request.getRequestDispatcher("/WEB-INF/failure.jsp").forward(request, response);
			} else {
				MakeVisaTransaction MakeVisaTransaction = new MakeVisaTransaction();
				VisaCard card = new VisaCard(cardholderName, cardNumber, 2026, 8, securityCode);
				VisaTransaction visaTransaction = new VisaTransaction(500, card, cardNumber, "");
				Boolean isSuccess = MakeVisaTransaction.processVisaTransaction(visaTransaction);
				if (isSuccess)
					request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
				else
					request.getRequestDispatcher("/WEB-INF/failure.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
