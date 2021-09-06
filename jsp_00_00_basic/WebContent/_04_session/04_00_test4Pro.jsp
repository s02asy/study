<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 		<!--  삭제 가 가능하다 -->
 	 
 	 <%
 	 	session.removeAttribute("arr");
 		session.removeAttribute("data");
 	 
 		int[] arr = (int[])session.getAttribute("arr");
	 	
	 	String[] data = (String[]) session.getAttribute("data");
	 	
	 	for(int i = 0; i < arr.length; i++){
	 		System.out.print(arr[i] + " " + data[i]);
	 	}
 	 %>
 	 
	
</body>
</html>