<%@page import="model.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<c:if test="${ pw ne null }">
		<script>
			alert("회원님의 패스워드는 ${ pw } 입니다.");
			location.href="login.do"
		</script>
	</c:if>
	<c:if test="${ pw eq null }">
		<script>
			alert("잘못된 회원 정보");
			history.go(-1);
		</script>
	</c:if>
