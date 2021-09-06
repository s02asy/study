<%-- 05_loginPro.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
	</head>
	<body>
		<c:if test="${ 1 eq check }">
			<script>
				alert('${sessionScope.memId}님, 환영합니다!');
				location.href='index.do';
			</script>
		</c:if>
		<c:if test="${ -1 eq check }">
			<script>
				alert('아이디와 패스워드를 확인해주세요!');
				history.go(-1); // 바로 직전페이지로 이동 => location.href='login.do';
			</script>
		</c:if>
	</body>
</html>