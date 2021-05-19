<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import = "in.jeya.service.Loan.Loan" %>
<%@page import = "java.util.List" %>
<%@page import = "in.jeya.service.Loan.DisplayLoans" %>
<html lang = "en">
<head>
<meta charset="ISO-8859-1">
<title>Types of Loans</title>
</head>
<body>

<jsp:include page = "header.jsp"></jsp:include>
<main class = "container-fluid">
<h3>...Types of Loans Available...</h3>

<!-- types of available loans  -->

<table class = "table table-bordered">


<thead>
<tr><th id = "SNo">S.No </th><th id = "loans">Available Loans</th></tr>
</thead>
<tbody>

<%
List<Loan> typesOfLoans = DisplayLoans.getLoanType();
int i = 0;
for(Loan loans : typesOfLoans){
	i++;
%>
<tr><td><%= i %></td>
<td><%= loans.getLoans() %></td></tr>
<% } %>

</tbody>

</table>

</main>

</body>
</html>