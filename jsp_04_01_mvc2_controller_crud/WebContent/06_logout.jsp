<%-- 06_logout.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>로그아웃</title>
	</head>
	<body>
		<script>
			alert('로그아웃 되었습니다.');
			location.href='index.do';
		</script>
	</body>
</html>