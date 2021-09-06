<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script>
	var status = true;
	$(document).ready(function() {
		$("#delete").click(function() {//[회원정보수정]버튼 클릭
			var query = {
					id : $("#id").val(),
					passwd : $("#passwd").val()
				};
			$.ajax({
				type : "post",
				url : "confirm.do",
				data : query,
				success : function(data) {
					var str = '<p id="check">';
					var loc = data.indexOf(str);
					var len = str.length;
					var check = data.substr(loc + len, 1);
					if (check == "1") {
						$.ajax({
							type : "POST",
							url : "deletePro.do",
							data : query,
							success : function(data) {
								var str = '<p id="check">';
								var loc = data.indexOf(str);
								var len = str.length;
								var check = data.substr(loc + len, 1);
								if (check == "1") {
									window.location.href = "main.do";
								}
							}
						});
					} else if (check == "0") {
						alert("비밀번호가 맞지 않습니다.");
						$("#passwd").val("");
						$("#passwd").focus();
					}

				}
			});
		});

	});
</script>

<div align="center">
	<h2>회원정보 수정</h2>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" id="id" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" id="passwd" name="passwd"></td>
		</tr>
		<tr>
			
			<td><input type="button" id="delete" value="탈퇴"></td>
		</tr>
	</table>
</div>