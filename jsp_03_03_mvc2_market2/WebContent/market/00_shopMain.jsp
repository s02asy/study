<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>마켓컬리</title>
	<style>
		a{
			color : black;
		}
		a:hover{
			color : purple;
		}
	</style>

</head>
<body>
	<div align="center">
		<jsp:include page="01_top.jsp"/>
		<jsp:include page="${center}"/>
		<jsp:include page="02_bottom.jsp"/>
	</div>
</body>
</html>