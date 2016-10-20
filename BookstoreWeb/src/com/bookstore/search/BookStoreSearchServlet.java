package com.bookstore.search;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.bookstore.response.Article;
import com.service.bookstore.web.search.RetrieveBooksandOffers;

/**
 * Servlet implementation class BookStoreSearchServlet
 */
@WebServlet("/BookStoreSearchServlet")
public class BookStoreSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookStoreSearchServlet() {
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
		HttpSession session = request.getSession(true);

		RetrieveBooksandOffers retrieveBooksandOffers = new RetrieveBooksandOffers();
		List<Article> articles = retrieveBooksandOffers.listbooksAndOffers(request.getParameter("keyword"));

		request.setAttribute("searchResults", articles);
		session.setAttribute("results", articles);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/SearchResults.jsp").forward(request, response);
	}

}
