<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form에서 값을 전달하는 방법</title>
</head>
<body>
	<%-- 방법 1) 입력받은 데이터를 name속성을 이용해 전달 --%>
	<form method="post" action="_03_06_formPro.jsp">
		아이디 : <input type="text" name="id"> <br>
		패스워드 : <input type="password" name="pw"> <br>
		
		<%-- 방법 2) input태그의 hidden속성값을 이용해 전달 --%>
		<input type="hidden" name="age" value="11">
		<input type="hidden" name="email" value="qwer@naver.com">
				
		<input type="submit" value="전송하기">
	</form>
</body>
</html>