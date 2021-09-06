<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />

<form method="post" action = "${cp}/_33_addNewItemPro.do">
	<table border="1"  style="border-collapse:collapse;">
	
		<tr height="30">
			<td width ="200">상품 카테고리</td>
			<td width = "500">
				<select name="category">
					<option value="채소">채소</option>
					<option value="해산물">해산물</option>
					<option value="육류">육류</option>
					<option value="전자제품">전자제품</option>
				</select>
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">상품명</td>
			<td width = "500">
				<input type="text" name="name">
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">상품가격</td>
			<td width = "500">
				<input type="text" name="price">원
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">상품재고</td>
			<td width = "500">
				<input type="text" name="stock">
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">이미지</td>
			<td width = "500">
				<input type="text" name="image">
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">상품정보</td>
			<td width = "500">
				<input type="text" name="info" size="50">
			</td>
		</tr>
		
		<tr height="30">
			<td width ="200">할인률</td>
			<td width = "500">
				<input type="text" name="discountRate">%
			</td>
		</tr>
	
	</table>
	<input type="submit" value="상품 추가하기">
</form>
