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
 		값을 저장하고 , 저장된 값들이 페이지간의 이동을 가능하게 해주는 클래스 
 		일반적으론 서버가끝날때까지 데이터는 보존이된다.
 			
 		-- 데이터 삭제방법 -- 
 		1) 시간설정을 하고 시간이 지나면 삭제되게 만들수있다.
 		2) 직접 삭제 가능 
 	 -->
 	 
 	 <%
 	 	int a = 10;
 	 
 	 	response.sendRedirect("04_00_test1Pro.jsp");
 	 	
 	 	
 	 %>
 	 
	
</body>
</html>