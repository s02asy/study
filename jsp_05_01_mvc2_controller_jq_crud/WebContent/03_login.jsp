<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
var contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));

var status = true;

$(document).ready(function() {
	
	$("#login").click(function() {
		checkIt();//입력폼에 입력한 상황 체크
		if (status) {
			//입력된 사용자의 아이디와 비밀번호를 얻어냄
			var query = {
				id : $("#id").val(),
				passwd : $("#passwd").val()
			};

			$.ajax({
				type : "POST",
				url : "loginPro.do",
				data : query,
				success : function(data) {
					
					var str = '<p id="check">';
					var loc = data.indexOf(str);
					var len = str.length;
					var check = data.substr(loc+len, 1);
					
					if(check == "1"){
						window.location.href = "main.do";
					}else {
						alert("아이디와 패스워드를 확인해주세요.");
						$("#id").val("");
						$("#pw").val("");
					}										
				}
			});
		}
	});
	//[취소]버튼을 클릭하면 자동실행
	$("#join").click(function() {
		window.location.href = "join.do";
	});
	
	$("#cancle").click(function() {
		window.location.href = "main.do";
	});

});

//인증되지 않은 사용자 영역에서 사용하는 입력 폼의 입력값 유무 확인
function checkIt() {
	status = true;
	// trim() : 좌우공백제거
	if (!$.trim($("#id").val())) {
		alert("아이디를 입력하세요.");
		$("#id").focus();
		status = false;
		return false;
	}
	else if (!$.trim($("#passwd").val())) {
		alert("비밀번호를 입력하세요.");
		$("#passwd").focus();
		status = false;
		return false;
	}
}

</script>

</head>
<body>
	<div align="center">
		<h1>로그인</h1>

		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" id="id" name="id"
					placeholder="example@kings.com"></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" id="passwd" name="passwd"
					placeholder="6~16자 숫자/문자"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button id="login">로그인</button>
					<button id="join">회원가입</button>
					<button id="cancle">취소</button>
				</td>
			</tr>
		</table>
	
	</div>
</body>
</html>