<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
		
		<c:if test ="${buyer eq null}">
			<script>
				alert("로그인 후 이용가능");
				history.go(-1);
			</script>
		</c:if>
		<c:if test ="${buyer ne null}">
			<c:if test="${item_stock ne 0}">
				<script>
					alert("상품을 장바구니에 담았습니다.");
					location.href="${cp}/_19_cartInfo.do?center=19_cartInfo.jsp";
				</script>
			</c:if>
			<c:if test="${item_stock eq 0}">
				<script>
					alert("품절된 상품입니다.");
					history.go(-1);
				</script>
			</c:if>
		</c:if>
		
