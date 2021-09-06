<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.removeAttribute("log");		// 특정 세션을 지정해서 삭제하기
		session.invalidate();				// 모든 세션 지우기
	%>
		<script>
			alert("로그아웃 되었습니다.");
			location.href="03_01_userMain.jsp";
		</script>
	
</body>
</html>