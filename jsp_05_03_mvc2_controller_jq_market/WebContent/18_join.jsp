<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	
	var contextPath = window.location.pathname.substring(0,
			window.location.pathname.indexOf("/", 2));
	var status = true;

	$(document).ready(function() {
		$("#checkDoubleId").click(function() {
			if ($("#id").val()) {
				$.ajax({
					type : "POST",
					url : contextPath + "/checkDoubleId.do",
					data : {
						id : $("#id").val()
					},

					success : function(data) {
						
						alert(data);
						
						var str = '<p id="check">';
						var loc = data.indexOf(str);
						var len = str.length;
						var check = data.substr(loc + len, 1);
						
						if (check == "1") {
							alert("중복된 아이디입니다.");
							$("#id").val("");
							$("#id").focus();
							status = false;
						} else {
							alert("사용할 수 있는 아이디입니다.");
							$("#pw").focus();
						}
					}
				});
			} else {
				alert("사용할 아이디를 입력하세요.");
				$("#id").focus();
			}
		});

		$("#checkDoubleEmail").click(function() {
			if ($("#email").val()) {
				$.ajax({
					type : "POST",
					url : contextPath + "/checkDoubleEmail.do",
					data : {
						email : $("#email").val()
					},

					success : function(data) {
						var str = '<p id="check">';
						var loc = data.indexOf(str);
						var len = str.length;
						var check = data.substr(loc + len, 1);
						
						if (check == "1") {
							alert("중복된 이메일입니다");
							$("#email").val("");
							$("#email").focus();
							status = false;
						} else {
							alert("사용할 수 있는 이메일입니다.");
						}
					}
				});
			} else {
				alert("사용할 이메일을 입력하세요.");
				$("#email").focus();
			}

		});

		$("#join").click(function() {
			checkInfo();

			if (status) {
				$.ajax({
					type : "post",
					url : contextPath + "/joinPro.do",
					data : {
						id : $("#id").val(),
						pw : $("#pw").val(),
						name : $("#name").val(),
						tel : $("#tel").val(),
						address : $("#address").val(),
						email : $("#email").val()
					},

					success : function(data) {
						alert("회원가입이 완료되었습니다.");
						window.location.href = contextPath + "/shopMain.do";
					},

					error : function(data) {
						alert("error");
					}
				});

			}

		});

	});

	function checkInfo() {
		status = true;

		if (!$("#id").val()) {
			alert("아이디를 입력하세요.");
			$("#id").focus();
			status = false;
			return false;
		}

		if (!$("#pw").val()) {
			alert("비밀번호를 입력하세요.");
			$("#passwd").focus();
			status = false;
			return false;
		}

		if (!$("#name").val()) {
			alert("사용자 이름을 입력하세요.");
			$("#name").focus();
			status = false;
			return false;
		}

		if (!$("#tel").val()) {
			alert("전화번호를 입력하세요.");
			$("#tel").focus();
			status = false;
			return false;
		}

		if (!$("#address").val()) {
			alert("주소를 입력하세요.");
			$("#address").focus();
			status = false;
			return false;
		}

		if (!$("#email").val()) {
			alert("이메일을 입력하세요.");
			$("#email").focus();
			status = false;
			return false;
		}

	}

	</script>


<!-- ------------------------------------------------------------------ -->

<h1>회원가입</h1>
<hr width="700" color="black" size="3" />
<br>
<table>
	<tr height="50">
		<th width="150">아이디</th>
		<td width="300" align="center"><input type="text" id="id"
			name="id" placeholder="6자 이상의 영문 혹은 영문과 숫자를 조합"
			style="width: 300px; height: 40px"></td>
		<td width="75">
			<button id="checkDoubleId">중복확인</button>
		</td>
	</tr>
	<tr height="50">
		<th width="150">패스워드</th>
		<td width="300" align="left" colspan="2"><input type="password"
			id="pw" name="pw" placeholder="비밀번호를 입력해주세요"
			style="width: 300px; height: 40px"></td>
	</tr>
	<tr height="50">
		<th width="150">이름</th>
		<td width="300" align="left" colspan="2"><input type="text"
			id="name" name="name" placeholder="이름을 입력해주세요"
			style="width: 300px; height: 40px"></td>
	</tr>
	<tr height="50">
		<th width="150">휴대폰</th>
		<td width="300" align="left" colspan="2"><input type="text"
			id="tel" name="tel" placeholder="(-)없이 입력"
			style="width: 300px; height: 40px"></td>
	</tr>
	<tr height="50">
		<th width="150">주소</th>
		<td width="300" align="left" colspan="2"><input type="text"
			id="address" name="address" placeholder="주소를 입력해주세요"
			style="width: 300px; height: 40px"></td>
	</tr>
	<tr height="50">
		<th width="150">이메일</th>
		<td width="300" align="center"><input type="email" id="email"
			name="email" placeholder="예:marketkurly@kurly.com"
			style="width: 300px; height: 40px"></td>
		<td width="75">
			<button id="checkDoubleEmail">중복확인</button>
		</td>
	</tr>
	<tr height="50">
		<td colspan="3" align="center"><br>
			<button id="join">가입하기</button></td>
	</tr>
</table>
