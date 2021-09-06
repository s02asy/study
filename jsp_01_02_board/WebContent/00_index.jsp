<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		BoardDAO.getInstance().init();
		response.sendRedirect("01_list.jsp");
%>
