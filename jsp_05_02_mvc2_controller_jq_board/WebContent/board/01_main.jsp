<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1>TOP 입니다.</h1>
	<jsp:include page="1_top.jsp"/>
</div>
<hr>

<div align="center">
<h1>CENTER입니다.</h1>
	<jsp:include page="${cont}" />
</div>
<hr>


<div align="center">
	<h1>BOTTOM입니다</h1>
	<jsp:include page="3_bottom.jsp"/>
</div>
</body>
</html>