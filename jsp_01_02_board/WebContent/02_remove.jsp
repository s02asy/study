<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String removeStr = request.getParameter("remove");
 	int removeNumber = Integer.parseInt(removeStr);
 	BoardDAO.getInstance().boardDelete(removeNumber);
 	
 	
 	response.sendRedirect("01_list.jsp");

%>