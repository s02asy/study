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
<c:if test="${check eq 1}">
	<script>
		location.href="${contextPath}/03_boardList.do";
	</script>
</c:if>

<c:if test="${check ne 1}">
	<script>
		alert('비밀번호가 틀렸습니다.');
		history.go(-1);
	</script>
</c:if>
</body>
</html>