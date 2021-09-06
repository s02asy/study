<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script>
	$(document).ready(function(){
		var writer = "${board.getWriter()}";
		$("#comment").click(function(){
			window.location.href="comment.do?king=${board.getWriter()}";
		});
		
		$("#update").click(function(){
			window.location.href="update.do?writer=${board.getWriter()}";
		});
		
		$("#delete").click(function(){
			var returnValue = confirm("삭제하면 달았던 댓글과 정보가 사라집니다.<br>정말로 삭제하시겠습니까?");
			if(returnValue){
				$.ajax({
					type : "post",
					url : "delete.do",
					data : {
						writer : "${board.getWriter()}"
					},
					success : function(data){
						alert("삭제 완료");
						window.location.href= "main.do";
					},
					error : function(data){
						alert("error");
					}
				});
			}
		});
	});
</script>

</head>
<body>
	<table border="1">
		<c:if test="${sessionScope.status eq 'main'}">
		<tr>
			<td width="600" align="center">

			<c:forEach var="i" begin="0" end="${sessionScope.totalpage-1}">
				<a href="showPage.do?currentpage=${i}">[${i+1}]</a>&nbsp;	
			</c:forEach>

			</td>
		</tr>
		</c:if>
		<c:if test="${sessionScope.status eq 'write'}">
			<tr>
				<td align="right" width="600">
					<button id="writeok">작성완료</button>					
				</td>
			</tr>
		</c:if>
		
		<c:if test="${sessionScope.status eq 'info'}">
			<tr>
				<td align ="right" width="600">
					<button id="comment">댓글달기</button> | 
					<button id="update">수정</button> | 
					<button id="delete">삭제</button> 
				</td>
			</tr>
		</c:if>	
		
		<c:if test="${sessionScope.status eq 'comment'}">
			<tr>
				<td align = "right" width ="600">
					<button id="commentok">작성완료</button>
				</td>
			</tr>
		</c:if>
		
		<c:if test="${sessionScope.status eq 'update'}">
			<tr>
				<td align="right" width="600">
					<button id="updateok">작성완료</button>					
				</td>
			</tr>
		</c:if>	
	</table>
</body>
</html>