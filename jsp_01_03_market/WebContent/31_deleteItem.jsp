<%@page import="market.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		System.out.println("item_number = " + item_number);
		
		ItemDAO.getInstance().deleteItem(item_number);
		response.sendRedirect("00_shopMain.jsp?center=28_itemInfoUpdate.jsp");
	%>
