<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Welcome</h1>
	<form action="BookStoreSearchServlet" method="post">
		<table align="center" bgcolor="#99FFCC" border="1" width="70%">
			<tr>
				<td colspan="2" align="center">BooksHub</td>
			</tr>
			<tr>
				<td>Search the Books here</td>
				<td><input type="text" name="keyword" maxlength="25"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Search"></td>
			</tr>
		</table>
	</form>
</body>
</html>