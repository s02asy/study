<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script>
	$(document).ready(function() {
		$("#update").click(function(){
			var query = {id:$("#id").val(), 
					  passwd:$("#passwd").val(),
				      name:$("#name").val(),
				      address:$("#address").val(),
				      tel:$("#tel").val()};
			
			$.ajax({
				type: "post",
				url: "updatePro.do",
				data: query,
				success: function(data){
					var str = '<p id="check">';
					var loc = data.indexOf(str);
					var len = str.length;
					var check = data.substr(loc+len, 1);
					
					if(check == "1"){
						alert("정보를 수정합니다");
						window.location.href = "main.do";
					}else {
						
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
			<td><input type="email" id="id" name="id" value="${sessionScope.id}" readonly disabled></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" id="passwd" name="passwd"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" id="name" name="name" value="${ memeber.getName()}"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" id="address" name="address"
				value="${ memeber.getAddress()}"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="tel" id="tel" name="tel"
				value="${ memeber.getTel()}"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="update">수정</button>
			</td>
		</tr>
	</table>
</div> 