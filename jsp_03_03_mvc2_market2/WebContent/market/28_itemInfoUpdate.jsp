<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
	
	<table>
		<tr>
			<td width="1000" align="left">
				<button onclick="location.href='${cp}/_32_addNewItem.do?center=32_addNewItem.jsp'">신상품 추가</button>
			</td>
		</tr>
	</table>
	
	<table border="1" style="border-collapse:collapse;">
		<tr height="50">
			<td width = "50" align="center"><b>번호</b></td>
			<td width = "100" align = "center"><b>카테고리</b></td>
			<td width = "100" align = "center"><b>상품명</b></td>
			<td width = "100" align = "center"><b>가격</b></td>
			<td width = "50" align = "center"><b>재고</b></td>
			<td width = "50" align = "center"><b>이미지</b></td>
			<td width = "200" align = "center"><b>상품정보</b></td>
			<td width = "50" align = "center"><b>할인률</b></td>
			<td width = "100" align = "center"><b>등록일</b></td>
			<td width = "50" align = "center"><b>판매량</b></td>
			<td width = "100" align = "center" colspan="2"><b>수정/삭제</b></td>
		</tr>
		
		<c:forEach var="itemBean" items="${allItem}">
		<tr height="50">
			<td width="50" align="center">
				${itemBean.getItem_number()}
			</td>
			
			<td width="100" align="center">
				<c:out value="${kind }"/>
			</td>
						<td width = "100" align = "center">
				${itemBean.getItem_name()}
			</td>
			<td width = "100" align = "center">
				${itemBean.getItem_price()}
			</td>
			<td width = "50" align = "center" >
				${itemBean.getItem_stock()}
			</td>
			<td width = "50" align = "center">
				<img src="img/${itemBean.getItem_image()}" height="50">
			</td>
			<td width = "200" align = "center">
				${itemBean.getItem_info()}
			</td>
			<td width = "50" align = "center">
				${itemBean.getDiscount_rate()}%
			</td>
			<td width = "100" align = "center"><%--등록일--%>
				${itemBean.getReg_date()}
			</td>
			<td width = "50" align = "center"><%--판매량--%>
				${itemBean.getSold()}
			</td>
			<td width = "50" align = "center"><%--수정버튼--%>
				<a href="${cp}/_30_itemInfoUpdateForm.do?center=30_itemInfoUpdateForm.jsp&item_number=${itemBean.getItem_number()}">수정</a>
			</td>
			<td width="50" align="center"><%--삭제버튼--%>
				<a href="${cp}/_31_deleteItem.do?item_number=${itemBean.getItem_number()}">삭제</a>
			</td>
		</tr>
		</c:forEach>
	</table>
