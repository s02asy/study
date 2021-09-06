<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
	
	<table border="1" style="border-collapse:collapse;">
		<tr height="50">
			<td width="50" align="center">번호</td>
			<td width="100" align="center">아이디</td>
			<td width="100" align="center">주문자명</td>
			<td width="100" align="center">상품명</td>
			<td width="100" align="center">가격</td>
			<td width="100" align="center">구매갯수</td>
			<td width="50" align="center">이미지</td>
			<td width="200" align="center">구매일자</td>
			<td width="100" align="center">결제수단</td>
			<td width="300" align="center">주소</td>
		</tr>
		
		<c:forEach var="bean" items="buyList">
			<tr height="30">
				<td width = "50" align="center">${num+=1}</td>
				<td width = "100" align="center">${bean.getCustomer_id()}</td>
				<td width = "100" align="center">${bean.getCustomer_name()}</td>
				<td width = "100" align="center">${bean.getItem_name()}</td>
				<td width = "100" align="center">${bean.getBuy_price() }원</td>
				<td width = "100" align="center">${bean.getBuy_count() }개</td>
				<td width = "50" align="center">
					<img src="img/${bean.getItem_image() }" height="50">
				</td>
				<td width = "200" align="center">${bean.getBuy_date() }</td>
				<td width = "100" align="center">${bean.getHowpay() }</td>
				<td width = "300" align="center">${bean.getAddress() }</td>
			</tr>
		</c:forEach>
	</table>
	
