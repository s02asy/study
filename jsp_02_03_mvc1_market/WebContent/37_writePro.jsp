<%@page import="market.BoardDAO"%>
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
	<jsp:useBean id="board" class="market.BoardDTO">
		<jsp:setProperty name="board" property="*" />
	</jsp:useBean>
	<%
		BoardDAO.getInstance().insertBoard(board);
		response.sendRedirect("00_shopMain.jsp?center=07_customerCenter.jsp");
	%>
</body>
</html>