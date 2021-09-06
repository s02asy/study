<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마켓컬리</title>
<style type="text/css">
	a{
		color: black;
	}
	a:hover{
		color: purple;
	}
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String center = request.getParameter("center");
		if(center == null){
			center = "03_center.jsp";
		}
	%>
	<div align="center">
		<jsp:include page="01_top.jsp"></jsp:include>
		<jsp:include page="<%=center %>"></jsp:include>
		<jsp:include page="02_bottom.jsp"></jsp:include>
	</div>
</body>
</html>