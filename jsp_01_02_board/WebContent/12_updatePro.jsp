<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="board" class="board.Board">
	<jsp:setProperty name="board" property="*" />
</jsp:useBean>

<% 
	BoardDAO.getInstance().boardUpdate(board);
%>

<% response.sendRedirect("05_mainList.jsp"); %>
