<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />

	<h2>주문 내역 확인</h2>
	<hr size="2" color="purple" width = "300">
	<br><br>
	<table>
		<tr height="50">
			<td width="50" align="center">
				<font size = "3" color="purple">번호</font>
			</td>
			<td width="50" align="center">
				<font size = "3" color="purple">이미지</font>
			</td>
			<td width="100" align="center">
				<font size = "3" color="purple">상품명</font>
			</td>
			<td width="50" align="center">
				<font size = "3" color="purple">수량</font>
			</td>
			<td width="100" align="center">
				<font size = "3" color="purple">가격</font>
			</td>
			<td width="200" align="center">
				<font size = "3" color="purple">주문일</font>
			</td>
			<td width="150" align="center">
				<font size = "3" color="purple">결제수단</font>
			</td>
		</tr>
		
		<tr height="10">
			<td colspan="7">
				<hr size="2" color="gray" width="800">
			</td>
		</tr>
		<c:if test="${!empty  buyList}">
		<c:forEach var="buyBean" items="${buyList}">
		<c:set var="num" value="${num+1}"/>
		<tr height="50">
			<td width="50" align="center">
				<font size="2">${num}</font>
			</td>
			<td width="50" align="center">
				<img src="img/${buyBean.getItem_image()}" height="50">
			</td>
			<td width="100" align="center">
				<font size = "2">${buyBean.getItem_name()}</font>
			</td>
			<td width="50" align="center">
				<font size = "2">${buyBean.getBuy_count() }</font>
			</td>
			<td width="100" align="center">
				<font size = "2" >${buyBean.getBuy_price()*buyBean.getBuy_count()}</font>
			</td>
			<td width="200" align="center">
				<font size = "2">${buyBean.getBuy_date()}</font>
			</td>
			<td width="150" align="center">
				<font size = "2">${buyBean.getHowpay()}</font>
			</td>
		</tr>
		</c:forEach>
		</c:if>
	</table>
