<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recommendations</title>
</head>
<body>
	<form action="PaymentProcessingServlet" method="post">
		<table align="center" bgcolor="#99FFCC" border="1" width="70%">
			<c:forEach items="${searchResults}" var="searchResult">
				<%-- <c:if test="${searchResult.ebayUrl != null}"> --%>
					<tr>
						<td><input type="checkbox" value="${searchResult.id}"
							name="selecteditems" size="15" /></td>
						<td><img alt="image"
							src="<c:out value="${searchResult.imageUrl}" />"></td>
						<td>
							<p>
							<h4>${searchResult.title}</h4> - ${searchResult.author}
							<p>${searchResult.description}</p>
							<p>Average Rating: ${searchResult.averageRating}</p>
						</td>
						<td>
							<p>Current Price: ${searchResult.currentPrice} USD</p>
							<p>Shipping Service Cost Price:
								${searchResult.shippingServiceCost} USD</p>
							<p>Visit Ebay at : ${searchResult.ebayUrl}</p>
						</td>
					</tr>
				<%-- </c:if> --%>
			</c:forEach>
		</table>
		<p>Please fill the below form to purchase the selected book(s)</p>
		<table align="center" bgcolor="#FFEDDF" border="1" width="70%">
			<tr>
				<td>Credit/Debit Card Number:<input type="text"
					name="cardnumber"></td>
				<td>CardHolder Name:<input type="text" name="cardholdername"></td>

				<td>Security code:<input type="password" name="securitycode"></td>
			</tr>
			<tr>
				<td><p>Select Payment Gateway</p> <input type="radio" name="service"
					value="defaultservice" checked="checked"> Default Service<br>
					<input type="radio" name="service" value="peerservice">
					Peer Service <br></td>
				<td colspan="2" align="center"><input type="submit"
					value="Process Payment"></td>
			</tr>
		</table>

	</form>
</body>
</html>