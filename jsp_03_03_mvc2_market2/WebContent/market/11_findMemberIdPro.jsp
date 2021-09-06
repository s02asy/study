<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
		
		<c:if test="${id ne null}">
			<script>
				alert("회원님의 아이디는  ${id} 입니다.");
				location.href="${cp}/_04_customerLogin.do?center=04_customerLogin.jsp";
			</script>
		</c:if>
		<c:if test="${id eq null}">
			<script>
				alert("잘못된 회원정보");
				history.go(-1);
			</script>
		</c:if>
