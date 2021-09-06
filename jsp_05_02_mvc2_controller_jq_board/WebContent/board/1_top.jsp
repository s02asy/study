<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script>
	var contextpath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	
	$(document).ready(function(){
		$("#changepage").click(function(){
			window.location.href="showPage.do?pageCount="+$("#pagefront").val();
		});
		
		$("#write").click(function(){
			window.location.href="write.do";
		});
		
		$("#latest").click(function(){
			window.location.href="showPage.do?board=latest";
		});
		
		$("#popular").click(function(){
			window.location.href="showPage.do?board=popular";
		});
		
		$("#search").click(function(){
			if(!$("#searchword").val()){
				alert("검색어를 입력하세요");
				$("#searchword").focus();
			}else{
				
				$.ajax({
					type : "post",
					url : "search.do",
					data : {
						searchword : $("#searchword").val(),
						category : $("#category").val(),
					},
					success : function(data){
						var str = '<p id="check">';
						var loc = data.lastIndexOf(str);
						var len = str.length;
						var check = data.substr(loc + len, 1);
						
						if(check=="1"){
							var searchword = $("#searchword").val();
							var category = $("#category").val();
							window.location.href="searchPro.do?searchword="+searchword+"&category="+category;
						}else{
							alert("검색결과가 없습니다.");
						}
					},
					error : function(data){
						alert("error");
					}
				})
			}
		});
		
		$("#mainGo").click(function(){
			var returnValue = confirm("이 페이지를 벗어나면 마지막 저장 후 수정된 정보는 저장되지 않습니다. \n돌아가시겠습니까?");
			if(returnValue){
			window.location.href="main.do";
			}
		});
		$("#back").click(function(){
			var returnValue = confirm("이 페이지를 벗어나면 마지막 저장 후 수정된 정보는 저장되지 않습니다. \n돌아가시겠습니까?");
			if(returnValue){
				history.go(-1);
			}
		})
		
		$("#mainGo2").click(function(){
			window.location.href="main.do";
		});
		
		$("#commentback").click(function(){
			var returnValue = confirm("이 페이지를 벗어나면 마지막 저장 후 수정된 정보는 저장되지 않습니다. \n돌아가시겠습니까?");
			if(returnValue){
				window.location.href="commentPro.do";
			}
		});
		
	});
</script>

</head>

<!-- ----------- head ----------- -->


<body>
	
	<table border="1">
		<c:if test="${sessionScope.status eq 'main'}">
		<tr>
			<td align="center" width="600">목록(현재페이지:${currentpage+1})</td>
		</tr>
		<tr>
			<td>
				현재 보이는 패이지 개수  ${sessionScope.pageCount} 개 &nbsp;
				<select id="pagefront">
				<c:forEach var ="i" begin="0" end="${fn:length(sessionScope.pageList)-1}">			
					<option <c:if test="${sessionScope.pageCount eq pageList[i]}">selected</c:if> value="${pageList[i] }">${pageList[i] }</option>
				</c:forEach>
				</select>
				<button id="changepage">변경</button>
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;
				
				<button id="write">글쓰기</button>
				
			</td>
		</tr>
		<tr>
			<td align="right">
				<button id="latest">등록순</button>
				<button id="popular">인기순(조회수)</button>
			</td>
		</tr>
		<tr>
			<td align="center">
				<select id="category">
					<option value="writer">작성자</option>
					<option value="title">제목</option>
				</select>
				<input type="text" name="searchword" id="searchword"/>
				<button id="search">검색</button>
			</td>
		</tr>
		
		</c:if>
		
		<c:if test="${sessionScope.status eq 'write'}">
			<tr>
				<td align="center">글쓰기</td>
			</tr>
			
			<tr>
				<td align ="right" width="600">
				<button id="mainGo">목록으로</button>
				</td>
			</tr>
			
		</c:if>
		
		<c:if test="${sessionScope.status eq 'info'}">
			<tr>
				<td align="center" width="600">정보</td>
			</tr>
			<tr>
				<td align="right">
				<button id="mainGo2">목록으로</button>
				</td>
			</tr>
		</c:if>
		
		
		<c:if test="${sessionScope.status eq 'comment'}">
			<tr> 
				<td align="center" width="600">${writer}님에게 댓글쓰기</td>
			</tr>
			<tr>
				<td align="right">
				<button id="commentback">뒤로가기</button>
				</td>
			</tr>
		</c:if>
		
		<c:if test="${sessionScope.status eq 'update'}">
			<tr>
				<td align="center">수정</td>
			</tr>
			
			<tr>
				<td align ="right" width="600">
				<button id="mainGo">목록으로</button>
				<button id="back">뒤로가기</button>
				</td>
			</tr>
		</c:if>
	</table>
	
</body>
</html>