<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		
		session.invalidate();
		response.sendRedirect("00_shopMain.jsp");
	%>
