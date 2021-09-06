<%@page import="market.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int cart_number = Integer.parseInt(request.getParameter("cart_number"));
		CartDAO.getInstance().deleteCart(cart_number);
		response.sendRedirect("00_shopMain.jsp?center=19_cartInfo.jsp");
	%>
</body>
</html>