<%@page import="model.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<c:if test="${ buyer eq null }">
		<script>
			alert("로그인 후 이용 가능");
			location.href="index.do";
		</script>
	</c:if>
	<c:if test="${ buyer ne null }">
		<script>
			location.href="cartInfo.do";
		</script>
	</c:if>

