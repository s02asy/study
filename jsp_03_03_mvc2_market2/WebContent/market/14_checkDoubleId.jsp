<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
	
	<c:if test="${check eq 1}">
		<script>
			alert("중복아이디");
			history.go(-1);
		</script>
	</c:if>
	<c:if test="${check ne 1}">
		<script>
			alert("사용가능한 아이디");
			location.href="${cp}/_08_join.do?center=08_join.jsp";
		</script>
	</c:if>
