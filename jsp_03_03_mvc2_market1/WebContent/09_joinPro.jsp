<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<c:if test="${ check eq 1 }">
		<script>
			alert("아이디 중복입니다.");
			location.href="join.do";
		</script>
	</c:if>
	<c:if test="${ check eq 2 }">
		<script>
			alert("이메일 중복입니다.");
			location.href="join.do";
		</script>
	</c:if>
	<c:if test="${ check ne 1 and check ne 2 }">
		<script>
			alert("회원가입 완료");
			location.href="index.do";
		</script>	
	</c:if>