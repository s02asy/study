<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(document).ready(function(){
	    $("#checkPw").change(function(){
	        if($("#checkPw").is(":checked")){
	            $("#hidePw").html("<input type='password' id='pw' name='pw'>");
	        }else{
	        	$("#hidePw").html("");
	        }
	    });

		$("#commentok").click(function(){
			if(commentcheck()){
				$.ajax({
					type : "post",
					url : "commentPro.do",
					data : {
						name : $("#name").val(),
						data : $("#data").val(),
						pw : $("#pw").val(),
					},
					success : function(data){
						alert("댓글을 달았습니다.");
						window.location.href="commentPro.do?writer=";
					},
					error : function(data){
						alert("error");
					}
				})
			}
		});
	});
</script>
<script>
	function commentcheck(){
		if(!$("#name").val()){
			alert("이름을 입력하세요");
			$("#name").focus();
			return false;
		}else if(!$("#data").val()){
			alert("내용을 입력하세요");
			$("#data").focus();
			return false;
		}else if($("#check").is(":checked") && !$("#pw").val()){
			alert("패스워드를 입력하세요");
			$("#pw").focus();
			return false;
		}
		return true;
	};

</script>


</head>
<body>
	<table border="1">
		<tr>
			<td>이름 </td>
			<td><input type="text" name="name" id="name"  style="width:570px; height:30px;"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
				<textarea rows="7" cols="79" name="data" id="data"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" width="600">비밀번호 설정<input type="checkbox" id="checkPw">
			<span id="hidePw"></span>
			</td>
		</tr>

	</table>
</body>
</html>