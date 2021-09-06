<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");

	
	for(int i = 0; i < 10; i++){
		numberList[size] = size + 1;
		writerList[size] = "[작성자]" + (size + 1);
		titleList[size] = "[제목]" + (size + 1);
		contentList[size] = "[내용]" + (size + 1);
		size += 1;
	}
	
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	
	response.sendRedirect("03_01_testList.jsp");


%>