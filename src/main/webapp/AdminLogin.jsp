<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h1>.....Admin Login Page.....</h1>
		<%
		String errorMessage = request.getParameter("errorMessage");
		if (errorMessage != null) {
			out.println("<font color = 'red'>" + errorMessage + "</font>");
		}
		%>

		<form action="AdminLoginServlet" method="get">

			<br> <br> <label for="username">User Name</label> <input
				type="text" name="username" id="username"
				placeholder="Enter UserName" required /> <br> <br> <label
				for="password">Password</label> <input type="password"
				name="password" id="password" placeholder="Enter Password" requried />
			<br> <br>
			<button type="submit" class="btn btn-primary">LOGIN</button>
		</form>
	</main>
</body>
</html>