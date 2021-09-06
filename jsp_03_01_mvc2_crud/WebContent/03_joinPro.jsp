<%-- 03_joinPro.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
	<c:if test="${ 1 eq check }">
		<script>
			alert('회원가입을 축하합니다!');
			location.href='index.do';
		</script>
	</c:if>
	
	<c:if test="${ -1 eq check }">
		<script>
			alert('아이디가 중복됩니다!');
			history.go(-1); // 바로 직전페이지로 이동 => location.href='join.do';
		</script>
	</c:if>
	</body>
</html>