<%@page import="market.ItemDAO"%>
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
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="item" class="market.ItemDTO">
		<jsp:setProperty name="item" property="*" />
	</jsp:useBean>
	<%
		if(item.getItem_image() == null){
			item.setItem_image("error.jpg");
		}
		ItemDAO.getInstance().insertNewItem(item);
		response.sendRedirect("00_shopMain.jsp?center=28_itemInfoUpdate.jsp");
	%>
</body>
</html>