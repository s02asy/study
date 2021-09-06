<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<script>
var contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));

$(document).ready(function(){
	$("#login").click(function(){
		var query = {
			id : $("#id").val(), 
			pw : $("#pw").val()
		};
		$.ajax({
			type : "POST",
			url : contextPath+"/managerLoginPro.do",
			data : query,
			success : function(data){
				var str = '<p id="check">';
				var loc = data.indexOf(str);
				var len = str.length;
				var check = data.substr(loc+len, 1);
				
				if(check == "1"){
					window.location.href=contextPath+"/managerMain.do";	
				}else {
					alert("아이디와 패스워드를 확인해주세요.");
					$("#id").val("");
					$("#pw").val("");
				}
			}
		});
	});
	
	$("#logout").click(function(){
		$.ajax({
		   type : "post",
		   url : contextPath+"/managerLogout.do",
		   success : function(data){
			   window.location.href=contextPath+"/managerMain.do";
		   }
		});
	});
 });

</script>


<style>
		ul li{
			list-style: none;
		}
</style>

<!-- ------------------------------------------------------------------------------------------ -->


	<c:if test="${empty sessionScope.id}">
		<ul>
			<li>
				아이디 <input type="email" id="id" name="id" placeholder="marketkurly">
				비밀번호 <input type="password" id="pw" name="pw" placeholder="6~16자 숫자/문자">
				<button id="login">로그인</button>
			</li>
		</ul>
	</c:if>
	<c:if test="${!empty sessionScope.id}">
		<ul>
			<li>관리자님 접속 중
				<button id="logout">로그아웃</button>
			</li>
		</ul>
	</c:if>
