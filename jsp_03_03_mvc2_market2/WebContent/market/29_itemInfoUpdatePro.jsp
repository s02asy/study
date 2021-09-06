<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />

	<script>
		alert("상품 정보 수정 완료");
		location.href="${cp}/_28_itemInfoUpdate.do?center=28_itemInfoUpdate.jsp";
	</script>
