<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
</head>
<body>
	<table align="center" bgcolor="#99FFCC" border="1" width="70%">
		<c:forEach items="${searchResults}" var="searchResult">
			<tr>
				<td><img alt="image"
					src="<c:out value="${searchResult.imageUrl}" />"></td>
				<td><c:out value="${searchResult.title}" /></td>
				<td><a><c:out value="${searchResult.ebayUrl}" /></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>