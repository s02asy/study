<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String showBoardCountStr = (String)request.getParameter("showBoardCount");
	session.setAttribute("showBoardCount", showBoardCountStr);
 	response.sendRedirect("05_mainList.jsp");

%>