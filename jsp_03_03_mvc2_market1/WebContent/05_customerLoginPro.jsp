
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<c:if test="${ check eq 1 }">
		<script>
			alert("로그인되었습니다.");
			location.href='index.do';
		</script>
	</c:if>
	
	<c:if test="${ check ne 1 }">
		<script>
			alert("아이디와 비밀번호를 확인해주세요");
			location.href='login.do';
		</script>	
	</c:if>
