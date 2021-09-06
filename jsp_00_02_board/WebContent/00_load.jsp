<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int [] numberList = new int[1000];   	// 번호
	String[] writerList = new String[1000]; // 글쓴이
	String[] titleList = new String[1000];  // 제목
	String[] contentList = new String[1000];// 내용
	int size = 0;
	
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	
	response.sendRedirect("01_index.jsp");

%>