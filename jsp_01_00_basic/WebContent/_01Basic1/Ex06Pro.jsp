<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	int height = Integer.parseInt(request.getParameter("height"));
	int parents =  Integer.parseInt(request.getParameter("parents"));
	String result =""; 
	if(height >= 120) {
		result= "놀이기구 이용가능합니다.";
	}
	if(height < 120) {
	
		if(parents == 1) {
			result= "놀이기구 이용가능합니다.";
		}
		if(parents == 0) {
			result= "놀이기구를 이용할 수 없습니다.";
		}
	}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



	<h2>
		<%=result %>
	</h2>

	<!--  button 을 이용해서 페이지이동  -->
	<button onclick="location.href='Ex06.jsp'">뒤로가기</button>

</body>
</html>