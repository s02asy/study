<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.removeAttribute("log");		// 특정 세션을 지정해서 삭제하기
		session.invalidate();				// 모든 세션 지우기 , 둘중하나만 사용해도된다.]
		response.sendRedirect("03_01_userMain.jsp");
	%>
		
	
</body>
</html>