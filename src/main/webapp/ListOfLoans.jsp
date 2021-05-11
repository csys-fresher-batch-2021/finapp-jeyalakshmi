<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import = "in.jeya.service.Loans" %>
<%@page import = "java.util.List" %>
<%@page import = "in.jeya.service.DisplayLoans" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Types of Loans</title>
</head>
<body>

<jsp:include page = "header.jsp"></jsp:include>
<main class = "container-fluid">

<table class = "table table-bordered">

<thead>
<tr><th>S.No </th><th>Available Loans</th></tr>
</thead>
<tbody>

<%
List<Loans> typesOfLoans = DisplayLoans.getLoanType();
int i = 0;
for(Loans loans : typesOfLoans){
	i++;
%>
<tr><td><%= i %></td>
<td><%=loans.loans %></td></tr>
<% } %>

</tbody>

</table>

</main>

</body>
</html>