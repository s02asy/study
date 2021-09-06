<%@page import="user.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 로딩 페이지</title>
</head>
<body>
	<%
		// 메모장 파일이 저장될 위치를 저장한다.
		UserDAO.getInstance().realpath = application.getRealPath("/");
		// 파일이 존재하면 해당 파일을 불러온다.
		UserDAO.getInstance().loadData();
		
		// 파일 로딩 후, 바로 메인 페이지로 강제 이동시킨다.
		response.sendRedirect("01_index.jsp");
	%>
</body>
</html>