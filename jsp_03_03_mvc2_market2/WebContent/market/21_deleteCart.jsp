<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
		
		<c:if test="${buyer eq null}">
			<script>
				alert("로그인 후 이용 가능");
				location.href="${cp}/_00_shopMain.do";
			</script>
		</c:if>
		<c:if test="${buyer ne null}">
			<c:redirect url="/_00_shopMain.do"></c:redirect>
		</c:if>

