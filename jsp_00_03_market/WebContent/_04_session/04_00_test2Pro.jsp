<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	
	<%
		// session의 값을  찾을때 반드시 같은자료형으로 형변환해야한다.
		// int ==> Integer
		int a = (Integer)session.getAttribute("a");
		
		String str = (String)session.getAttribute("str");
		
		System.out.print(a + " " + str);
		
	%>
</body>
</html>