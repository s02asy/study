<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 		<!--  배열도 전송가능 -->
 	 
 	 <%
 		int[] arr = {10,20,30,40};	 	
 	 	String[] data = {"김철수" , "이만수" , "최영희" , "박준범"};
 	 	
 	 	
 	 	session.setAttribute("arr", arr);
 	 	session.setAttribute("data", data);
 	 	session.setMaxInactiveInterval(60 * 1); // 1분간 유지 후 삭제된다.
 	 	
 	 
 	 %>
 	 
	
</body>
</html>