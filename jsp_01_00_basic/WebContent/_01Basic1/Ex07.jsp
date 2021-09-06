<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<hr/>
	<pre> 
		심플 최대값 찾기
	         문제 
		# 최대값 구하기[2단계]
		1. 정수 값 3개를 입력한다.
		2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		3. 값 없으면 오류 창 띄우기 
	</pre>
<hr/>
	<script>
		function checkInput() {
			// js 를 사용할때는 자바주석 사용가능 

			if (document.f1.num1.value == "") {
				alert('첫번째 값을 입력하세요');

				document.f1.num1.focus(); // 커서 깜박임을 첫번째 입력으로 이동시킨다.
				return;
			}
			if (document.f1.num2.value == "") {
				alert('두번째 값을 입력하세요');
				document.f1.num2.focus(); // 커서 깜박임을 두번째 입력으로 이동시킨다.
				return;
			}
			if (document.f1.num3.value == "") {
				alert('세번째 값을 입력하세요');
				document.f1.num3.focus(); // 커서 깜박임을 세번째 입력으로 이동시킨다.
				return;
			}

			// submit을 하기 전에 유효성 검사를 직관적으로 해결할 수 있는 방법
			document.f1.submit(); 
		}
	</script>

	<form name="f1" action="Ex07Pro.jsp">
		<input type="number" name="num1"> &nbsp;&nbsp; &nbsp; 
		<input type="number" name="num2"> &nbsp;&nbsp; &nbsp; 
		<input type="number" name="num3"> &nbsp;&nbsp; &nbsp;
		<!--  button 을 이용해서 form 사용하기 -->
		<input type="button" onclick="checkInput()" value="전송">
	</form>

</body>
</html>