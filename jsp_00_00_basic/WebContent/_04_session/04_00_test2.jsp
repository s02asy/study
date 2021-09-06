<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<!--  session 
 		페이지간의 데이터 이동을 가능하게 해주는 클래스 
 	 -->
 	 
 	 <%
 	 	int a = 10; 	 	
 	 	String str = "김철수";
 	 	
 	 	session.setAttribute("a", a);
 	 	session.setAttribute("str", str);
 	 	
 	 	response.sendRedirect("04_00_test2Pro.jsp");
 	 	
 	 %>
 	 
	
</body>
</html>