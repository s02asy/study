<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String dummyCount = (String)request.getParameter("dummyCount");
	int count = Integer.parseInt(dummyCount);
	
	session.setAttribute("dummyCount", dummyCount);
 	BoardDAO.getInstance().setSampleDummy(count);
 	response.sendRedirect("01_list.jsp");

%>
