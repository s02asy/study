<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");
	
	
	int number = Integer.parseInt(request.getParameter("number"));
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	numberList[size] = number;
	titleList[size] = title;
	writerList[size] = writer;
	contentList[size] = content;
	size += 1;
		
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	
	response.sendRedirect("03_02_mainList.jsp");
	
%>
