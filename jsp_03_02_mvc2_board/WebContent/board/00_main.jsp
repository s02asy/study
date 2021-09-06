<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<a href="${ contextPath }/01_write.do">게시판 글쓰기</a> <br><br>
		<a href="${ contextPath }/03_boardList.do">게시판 목록</a>
	</div>
</body>
</html>