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
	    String dbId = "qwer";
		String dbPw = "1111";
   	 %>


	<h2>로그인</h2>
	<form method="post" action="Ex04pro.jsp">
		아이디 : <input type="text" name="id" /> <br>
		비밀번호 : <input type="password" name="pw" /> <br>
		<!-- (중요) form 에서 입력받지않은 값을 더음페이지로 이동시킬때  hidden 사용 -->
		<input type="hidden" name="dbId" value="<%=dbId %>" /> 
		<input type="hidden" name="dbPw" value="<%=dbPw %>" /> 
		<input type="submit" value="로그인">
	</form>

</body>
</html>