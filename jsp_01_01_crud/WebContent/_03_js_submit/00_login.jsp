<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<hr />
	<pre>
			아이디와 비밀번호를 입력하지말고 "로그인" 버튼을 눌러보세요
	</pre>
	<hr />
	<%
		String id = "qwer";
		String pw = "1234";
	%>
	<script>
		function checkInput() {
			
			
			if (document.f2.id.value == "") {
				alert('아이디를 입력하세요');
				
				document.f2.id.focus();
				
				return;
			}

			if (document.f2.pw.value == "") {
				alert('비밀번호를 입력하세요');
				document.f2.pw.focus();
				return;
			}

			document.f2.submit();
		}
	</script>

	<form name="f2" action="01_loginPro.jsp">
		id : <input type="text" name="id"> <br>
		pw :  <input type="text" name="pw"> <br>	
		<br> <input type="button" onclick="checkInput()" value="로그인">
	</form>

</body>
</html>